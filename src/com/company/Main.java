package com.company;

public class Main {

    public static void main(String[] args) {
        boolean b = true ? false : true == true == true ? false : true;
        System.out.println(b);

        boolean a = false ? false :false;
        System.out.println(a);

        boolean c = false ? false:true == true ? false:true;
        System.out.println(c);

        int i = 5;
        int j = 10;
        System.out.println(~i + ~j);
    }
}
