package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
 private AmigoOutputStream amigo;

   public QuestionFileOutputStream (AmigoOutputStream outAmigo){
this.amigo = outAmigo;
   }
    @Override
    public void flush() throws IOException {
amigo.flush();
    }

    @Override
    public void write(int b) throws IOException {
    amigo.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
    amigo.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
    amigo.write(b,off,len);
    }

    @Override
    public void close() throws IOException {
    System.out.println("Вы действительно хотите закрыть поток? Д/Н");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String str = bufferedReader.readLine();
    if (str.equals("Д")){
       amigo.close();
    }
    }


}

