import java.util.Scanner;
public class SquareInputStar {
        public static void main (String[]args) {
Scanner scanner = new Scanner (System.in) ;
            System.out.println("Number of rows to print :");
            int rows = scanner.nextInt();
            System.out.println("Number of column to print :");
            int column = scanner.nextInt();
            System.out.println("Star pattern is :");
            for (int i = 0; i < rows; i++) {
                for (int j = 0 ; j < column; j++){
                    System.out.print("*");
                            }
                System.out.println();

            }
        }
    }







