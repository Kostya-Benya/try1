package com.benjamin.try1;
import java.io.*;

public class attempt1_3 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println("Enter your name and than press button <Enter>");
            String name = br.readLine();
            System.out.println("Hello, " + name);
        }catch (IOException e){
            System.err.print("Ups! It's mistake" + e);
        }
    }
}