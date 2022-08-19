package Week1.Day3;

public class PatternProblem {
    public static void main(String[] args) {
        int n = 6;

        for (int i =1;i<n;i++) {
            int j=1;
            int counter = 65;
            for(;j<=i;j++) {
                char c = (char) counter;
                System.out.print(c);
                counter++;
            }

            if(counter > 66) {
                counter = counter -2;
                for(int k=0; k< i-1;k++) {
                    char c = (char) counter;
                    System.out.print(c);
                    counter--;
                }
            }




            System.out.println();
        }
    }
}

/*

A
ABA
ABCBA
ABCDCBA
ABCDEDCBA

* */