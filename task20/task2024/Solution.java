package com.javarush.task.task20.task2024;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Знакомство с графами
*/

public class Solution implements Serializable{
    int node;
    List<Solution> edges = new LinkedList<>();
    public Solution(int node) {
        this.node = node;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution so11 = new Solution(1);
        Solution so12 = new Solution(2);
        Solution so13 = new Solution(3);
        Solution so14 = new Solution(4);
        Solution so15 = new Solution(5);
        Solution so16 = new Solution(6);
       so11.edges.add(so12);
       so12.edges.add(so12);
       so12.edges.add(so15);
       so12.edges.add(so14);
       so15.edges.add(so14);
       so14.edges.add(so15);
       so14.edges.add(so11);
       so16.edges.add(so13);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(so11);
        objectOutputStream.writeObject(so12);
        objectOutputStream.writeObject(so13);
        objectOutputStream.writeObject(so14);
        objectOutputStream.writeObject(so15);
        objectOutputStream.writeObject(so16);
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        Solution load11 = (Solution) objectInputStream.readObject();
        Solution load12 = (Solution) objectInputStream.readObject();
        Solution load13 = (Solution) objectInputStream.readObject();
        Solution load14 = (Solution) objectInputStream.readObject();
        Solution load15 = (Solution) objectInputStream.readObject();
        Solution load16 = (Solution) objectInputStream.readObject();
        byteArrayOutputStream.close();
        objectOutputStream.close();
        objectInputStream.close();

    }
}
