package com.galvanize;

public class Application {
    static boolean isActive(String status) {
        if(status.equals("active")){
            return true;
        } else {
            return false;
        }
    }

    static char grade(int score){
        if(score <= 59){
            return 'F';
        } else if(score <= 69){
            return 'D';
        } else if(score <= 79){
            return 'C';
        } else if(score <= 89){
            return 'B';
        } else {
            return 'A';
        }
    }





    public static void main(String[] args) {
        boolean result = isActive("activ");
        System.out.println("Result is " + result);

        char resultGrade = grade(80);
        System.out.println("Grade is " + resultGrade);

        int i = 45;
        while (i < 51){
            System.out.println(i);
            i++;
        }

        for(int j=2; j<=6; j++){
            if (j%2 == 0){
                System.out.println(j);
            }
        }
    }

}
