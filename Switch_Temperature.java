package Week1.Day3;

import java.util.Scanner;

public class Switch_Temperature {
    public static void main(String[] args) {
        System.out.print("Enter the value for var : ");
        Scanner scanner = new Scanner(System.in);
        int var = scanner.nextInt();

        switch (var) {
            case 1 :
                System.out.println("Low");
                break;
            case 2 :
                System.out.println("Medium");
                break;
            case 3 :
                System.out.println("High");
                break;
            default :
                System.out.println("Abnormal");

        }
    }
}


/* OUTPUT

Enter the value for var : 1
Low

Enter the value for var : 2
Medium

Enter the value for var : 3
High

Enter the value for var : 4
Abnormal


* */