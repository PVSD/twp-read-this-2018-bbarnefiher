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

        double classAverage = 0;
        for (int i = 1; i < studentList.length ; i++){
            classAverage += studentList[i].grade;
        }
        classAverage = classAverage / studentList.length;
        System.out.println("The class average is " + classAverage + ".\n");

        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        int numF = 0;

        for (int i = 1; i < studentList.length ; i++){
            if (studentList[i].grade >= 90.0){
                numA++;
            }
            else if (studentList[i].grade >= 80.0){
                numB++;
            }
            else if (studentList[i].grade >= 70.0){
                numC++;
            }
            else if (studentList[i].grade >= 60.0){
                numD++;
            }
            else{
                numF++;
            }
        }

        System.out.println("The number of students with A's is " + numA + ".");
        System.out.println("The number of students with B's is " + numB + ".");
        System.out.println("The number of students with C's is " + numC + ".");
        System.out.println("The number of students with D's is " + numD + ".");
        System.out.println("The number of students with F's is " + numF + ".\n");



        while(true){
            System.out.println("Please enter the name of the student you want to view information on. Type 'exit' to exit the program.");
            Scanner stringReader = new Scanner(System.in);
            String userInput = stringReader.nextLine();

            if (userInput.equalsIgnoreCase("exit")){
                System.out.println("Goodbye");
                System.exit(0);
            }
            else{
                for (int i = 1; i < studentList.length; i++){

                    String nameCheck = (studentList[i].name).trim();
                    userInput = userInput.trim();

                    if (userInput.equals(nameCheck)){
                        System.out.println("Student name: " + studentList[i].name + ".");
                        System.out.println("Grade: " + studentList[i].grade + "%");
                        System.out.println("Days absent: " + studentList[i].absentDays);
                        if (studentList[i].absentDays > 5 && studentList[i].grade < 70){
                            System.out.println("This student should probably start showing up to class more if they want to improve their grade.");
                        }
                        break;
                    }
                }
            }
        }


    }
}
