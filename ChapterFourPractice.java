package practice;

import java.util.Scanner;

public class ChapterFourPractice {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        number = input.nextInt();

     //   if(number > 100){
       //     System.out.println("this number is greater than 100");
        //}else{
          //  System.out.println("this is less than 100");


 //       }
        if(number < 20){
            System.out.println("this number is less than 20");
        }else{
            if(number < 40){
                System.out.println("this number is less than 40");
            }else{
                if(number < 60){
                    System.out.println("this number is less than 60");
                }else {
                    if (number < 80) {
                        System.out.println("this number is less than 80");
                    } else {
                        if (number < 100) {
                            System.out.println("this number is less than 100");
                        } else {
                            System.out.println("this number is greater than 100");
                        }
                    }
                }
            }
        }
    }
}
