package com.example.lib;

public class MyClass {
    public static void main ( String[] args ) {
        for(char i = 65;i<123;i++){
            System.out.println(i);
            if(i==90)
                i+=6;
        }
    }
}