package Week1.Day3;

import java.util.Scanner;

public class Greatest_Among_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for num 1 :: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the value for num 2 :: ");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println(num1+" is greater than "+num2);
        } else {
            System.out.println(num2+" is greater than "+num1);
        }


    }
}

/*

Enter the value for num 1 :: 10
Enter the value for num 2 :: 21

21 is greater than 10

* */