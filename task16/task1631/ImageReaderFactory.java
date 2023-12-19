package com.javarush.task.task16.task1631;


import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

  private  ImageReaderFactory(){
  }

    public static ImageReader getImageReader(ImageTypes types){
        if (types == null){
         throw new IllegalArgumentException("Неизвестный тип картинки");
        }
      ImageReader imageReader;
        switch (types) {
            case BMP:
                imageReader = new BmpReader();
                break;
            case JPG:
                imageReader = new JpgReader();
                break;
            case PNG:
                imageReader = new PngReader();
                break;
            default:
                throw new IllegalArgumentException("Неизвестный тип картинки");
        }

        return imageReader;
    }
    }

