package com.sealcia.baitap.BT3;

public class Main {
    public static void main(String[] args) throws Exception {
        TamGiac t1 = new TamGiacCan(5, 2);
        TamGiac t2 = new TamGiac(2, 3, 4);
        TamGiac t3 = new TamGiacDeu(4);
        System.out.println(t1);
        System.out.println("==============");
        System.out.println(t2);
        System.out.println("==============");
        System.out.println(t3);
    }
}
