package practice;
import java.util.Scanner;
public class Score {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int numberOfStudents = 0;

        for (int count = 0; count < 3; count += 1) {
            System.out.println("Enter Score" + count + ":");
            int score = input.nextInt();

            total = total + score;
            numberOfStudents = numberOfStudents + 1;

        }


        int average = total / numberOfStudents;
        System.out.println("this is the total"  +total);
        System.out.println("this is the average" + average);

    }

    }

