package practice;
import java.util.Scanner;
public class Grade {
    int grade;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        if (grade > 90) {
            System.out.println("you got an A");
        } else {
            System.out.println("you didnt get an A");
        }









    }
}
