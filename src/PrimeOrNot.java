/* Prime or Not application

question
write an application that will show the number and indicate whether or not it is prime.
there are two ways that you must do to achieve this.
write a pseudo code and submit a text file


IPO
input - number from user
output - the number and whether it is prime or not
process - repetition


variables : counter, input, res, x;

*definition of prime number = is a number that has only two exact dividers
(1 And the number it self)

pseudocode for PN

pseudocode for PN

1. prompt user to give you a number to check if it is prime or not
2 store it in variable input and validate it(must be postive and greater than 1)
3 divide the input using modulos by x, where x starts from 1 and assign to res
4. if the result of the modulos or res is 0, incement the counter variable by 1,this time the x value has been incremented by 1
5. if result of modulos is differnt from 0 then go to step 3,
5.1 to avoid repetition break from loop when res is greater than 2
6. repeat the steps until input and x are the same (meaning you can use do while loop
7. now check the counter, if it is 2 display "prime"
8. else display" not prime"
9. end

 */

import java.util.Scanner;


public class PrimeOrNot {

    public static void main(String[] args) {

        Scanner keybd = new Scanner(System.in);
        int input, counter = 0, x = 1, res;

        System.out.println("Please enter a positive number greater than 2 that you want to check whether it is prime or not:");
        input = keybd.nextInt();
        keybd.nextLine();
        if (input <= 1 || input >= 1000000000)
            System.out.println("Invalid number");
        else
            do {
                res = input % x;
                if (res == 0)//no remainder
                    counter = counter + 1;
                x++;
                if (counter > 3)// this will stop the loop asa it checks if its a prime or not
                    break;
            } while (x <= input);//end of dowhile

        if (counter == 2)//prime definition
            System.out.println(input + " is a prime number ");
        else
            System.out.println(input + " is NOT a prime number ");
    }
}
