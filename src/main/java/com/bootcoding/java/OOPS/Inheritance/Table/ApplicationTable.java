package com.bootcoding.java.OOPS.Inheritance.Table;

import com.bootcoding.java.OOPS.Inheritance.Table.ComputerTable;
import com.bootcoding.java.OOPS.Inheritance.Table.Material;

public class ApplicationTable {
    public static void main(String[] args) {
        ComputerTable ct = new ComputerTable();
        ct.legs =4;
        ct.tableTop=true;
        new Material();
        ct.tableType ="Computer";
        ct.createTable();
        ct.move();

    }
}
