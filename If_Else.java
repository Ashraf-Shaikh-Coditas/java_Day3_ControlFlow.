package Week1.Day3;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for m :: ");
        int m = scanner.nextInt();

        int x = 0;

        if(m == 0) {
            x = x + 2;
            System.out.println("X = "+x);
        } else if(m == 1) {
            x = x + 4;
            System.out.println("X = "+x);
        } else if(m == 2) {
            x = x + 6;
            System.out.println("X = "+x);
        }
    }
}

/*

Enter the value for m :: 0
X = 2

Enter the value for m :: 1
X = 4

Enter the value for m :: 2
X = 6





* */