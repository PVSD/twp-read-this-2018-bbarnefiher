package com.company;

public class Students {

    String name;
    int absentDays;
    String grade;

    public Students (String a){

        String[] split = a.split("\\s");
        this.absentDays = Integer.parseInt(split[split.length - 1]);
        this.grade = (split[split.length-2]);

    }
}
