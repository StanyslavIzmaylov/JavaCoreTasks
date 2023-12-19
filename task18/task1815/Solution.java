package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{

        TableInterface tableInterface;
        public TableInterfaceWrapper(TableInterface tInterface) {
        this.tableInterface = tInterface;
        }

        @Override
        public void setModel(List rows) {
            int count = 0;
           for (int i =0; i< rows.size(); i++){
               count++;
            }
           System.out.println(count);
           tableInterface.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            System.out.println(tableInterface.getHeaderText().toUpperCase());
            return tableInterface.getHeaderText().toUpperCase();
        }


        @Override
        public void setHeaderText(String newHeaderText) {
               tableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}