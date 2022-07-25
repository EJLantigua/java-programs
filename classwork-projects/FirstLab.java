/*Emijoel Lantigua
* * Java Programming
* * Lab01
* * */

import java.util.Scanner;

public class FirstLab {
    public static void main(String args[]){
        Scanner inputs = new Scanner(System.in); // Create a Scanner object that is used for user input

        //Initializing variables
        int x, y;
        double q;

        // User input for x value
        System.out.println("Enter int value for x: ");
        x = inputs.nextInt();

        // Print value of x
        System.out.println("Value of the x before equation: " + x);
        
        // Plugging x in f(x) for y output
        y = 2 * ((int)Math.pow(x++,2)) + 5;

        // Print value of y
        System.out.println("Value of the y is: " + y);

        // Print value of x
        System.out.println("Value of the x after equation: " + x);

        // Equation to find quotient of y/x
        q = (double) y/x;
        System.out.printf("The quotient of y/x is: %.3f%n" , q);

        // Initialize variable(s)
        char letter;
        int digit=0;

        // User inputs letter
        System.out.println("Enter letter: ");
        letter = inputs.next().toUpperCase().charAt(0);

        // Switch Statement to letter/number map telephone
        switch(letter) {
            case 'A':
            case 'B':
            case 'C':digit = 2;
            break;
            case 'D':
            case 'E':
            case 'F':digit = 3;
            break;
            case 'G':
            case 'H':
            case 'I':digit = 4;
            break;
            case 'J':
            case 'K':
            case 'L':digit = 5;
            break;
            case 'M':
            case 'N':
            case 'O':digit = 6;
            break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':digit = 7;
            break;
            case 'T':
            case 'U':
            case 'V':digit = 8;
            break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':digit = 9;
            break;
            default:
        }
        System.out.println(digit);
    }
}
