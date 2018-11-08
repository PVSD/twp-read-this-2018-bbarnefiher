package com.company;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException{
	    Scanner textFile = new Scanner(new File("Imports.txt"));

        int maxIndx = -1;
        String docLine[] = new String[1000];

        while(textFile.hasNext()){
            maxIndx++;
            docLine[maxIndx] = textFile.nextLine();
        }

        Students[] studentList = new Students[maxIndx];
        for (int i = 1; i < studentList.length; i++){
            studentList[i] = new Students(docLine[i]);
        }
        textFile.close();

        System.out.println(studentList[1].grade);
        System.out.println(studentList[1].gradeString);

    }
}
