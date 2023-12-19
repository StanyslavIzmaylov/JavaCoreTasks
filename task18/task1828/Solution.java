package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static class Product {
        int id;
        String productName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getProductName() {
            return productName;
        }

        public String getPrice() {
            return price;
        }

        public String getQuantity() {
            return quantity;
        }

        String price;
        String quantity;

        public Product(int id, String productName, String price, String quantity) {
            this.id = id;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, productName, price, quantity);
        }
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        List<Product> products = new ArrayList();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        while (fileReader.ready()) {
            Product product = getProduct(fileReader.readLine());
            products.add(product);
        }
        switch (args[0]) {
            case "-u":
                int id = Integer.parseInt(args[1]);

                String name = "";
                for (int i = 2; i < args.length - 2; i++) {
                    name += args[i] + " ";
                }
                if (name.length() > 30) {
                    name = name.substring(0, 30);
                }
                String price = args[args.length - 2];
                if (price.length() > 8) {
                    price = price.substring(0, 8);
                }
                String quantity = args[args.length - 1];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0, 4);
                }
                com.javarush.task.task18.task1828.Solution.Product productToUpdate = null;
                for (com.javarush.task.task18.task1828.Solution.Product product : products) {
                    if (product.id == id) productToUpdate = product;
                }
                if (productToUpdate != null) {
                    productToUpdate.productName = name;
                    productToUpdate.price = price;
                    productToUpdate.quantity = quantity;
                }
                break;

            case "-d": {
                id = Integer.parseInt(args[1]);
                Product productToDelete = null;
                for (Product product : products) {
                    if (product.id == id) productToDelete = product;
                }
                if (productToDelete != null) products.remove(productToDelete);
                break;
            }
        }
            FileWriter fileWriter =new FileWriter(fileName);
            for (Product product : products) {
                fileWriter.write(product.toString());
                fileWriter.write("\n");
                fileWriter.close();
            }
            fileReader.close();

            bufferedReader.close();
        }

        public static Product getProduct (String string){
            String id = string.substring(0, 8).trim();
            String poductName = string.substring(8, 38).trim();
            String price = string.substring(38, 46).trim();
            String quantity = string.substring(46, 50).trim();
            return new Product(Integer.parseInt(id), poductName, price, quantity);
        }

}