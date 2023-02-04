package com.company.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("Page count" +printer.getPagesPrinted()); // 0
        printer.printPages(4);
        System.out.println("Pages printed : " + printer.getPagesPrinted()); //2
    }
}
