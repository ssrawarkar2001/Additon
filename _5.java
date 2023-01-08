package SumofTwoNumber;

import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        int A;
        int B;
        int sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");

        A= sc.nextInt();
        B= sc.nextInt();

        sum = A+B;
        System.out.println("Ans is " + sum);
    }
}
