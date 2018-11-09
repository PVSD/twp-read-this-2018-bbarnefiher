package com.company;

public class Students {

    String name = "";
    int absentDays;
    double grade;


    public Students (String a){

        String[] info = a.split("\\s");
        this.absentDays = Integer.parseInt(info[info.length - 1]);

        if (info[info.length-2].substring(0,2).contains("%")){
            this.grade = Double.parseDouble(info[info.length-2].substring(0,1));
        }
        else{
            this.grade = Double.parseDouble(info[info.length-2].substring(0,2));
        }

        for(int i = 0; i <= info.length-3; i++){
            name += info[i] + " ";
        }

    }


}