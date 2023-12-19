package com.javarush.task.task18.task1813;

import java.io.*;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";

    private FileOutputStream outAmigo;

    public AmigoOutputStream(FileOutputStream file) throws FileNotFoundException {
        super(fileName);

    }
    @Override
    public void write(int b) throws IOException {
        outAmigo.write(b);
    }
    @Override
    public void write(byte[] b) throws IOException {
        outAmigo.write(b);
    }
    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        outAmigo.write(b,off,len);
    }
    @Override
    public void flush() throws IOException {
        outAmigo.flush();
    }
    @Override
    public void close() throws IOException {
    outAmigo.flush();
        write("JavaRush © All rights reserved.".getBytes());
        outAmigo.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
