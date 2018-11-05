package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException{
	    Scanner textFile = new Scanner(new File("Users\\"));

        int maxIndx = -1;
        String text[] = new String[1000];

        while(textFile.hasNext()){
            maxIndx++;
            text[maxIndx] = textFile.nextLine();
        }

        textFile.close();
        System.out.println(text.length);



    }
}
