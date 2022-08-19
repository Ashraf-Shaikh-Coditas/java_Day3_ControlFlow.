package Week1.Day3;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age for 'ABC' :: ");
        int age1 = scanner.nextInt();

        System.out.print("Enter the age for 'PQR' :: ");
        int age2 = scanner.nextInt();

        System.out.print("Enter the age for 'XYZ' :: ");
        int age3 = scanner.nextInt();

        if(age1 > age2 && age1 > age3) {
            System.out.println("'ABC' is elder.");
            if(age2 > age3) {
                System.out.println("'XYZ' is younger.");
            } else {
                System.out.println("'PQR' is younger.");

            }
        } else if (age2 > age1 && age2 > age3) {
            System.out.println("'PQR' is elder.");
            if(age1 > age3) {
                System.out.println("'XYZ' is younger.");
            } else {
                System.out.println("'ABC' is younger.");
            }
        } else  {
            System.out.println("'XYZ' is elder.");
            if(age1 > age2) {
                System.out.println("'PQR' is younger.");
            } else {
                System.out.println("'ABC' is younger.");

            }
        }
    }

}

/*

Enter the age for 'ABC' :: 22
Enter the age for 'PQR' :: 14
Enter the age for 'XYZ' :: 40

'XYZ' is elder.
'PQR' is younger.



* */