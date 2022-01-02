package BitManipulation;

import java.util.Scanner;

public class PowerOf2OrNot2 {
    // Find Whether a Number is Power of 2 or Not
    public static void main(String [] args){
        // Creating Scanner object for taking inputs from the USER
        System.out.print(" Enter Any Number: ");
        Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         // Fix for 0 Because0 is not a Power of two
        if(num == 0)
            System.out.println(" NO " + num + " is not a Power of Two");
        else if((num & (num-1)) == 0)
            System.out.println(" YES " + num + " is Power of Two");
        else
            System.out.println(" NO " + num + " is not a Power of Two");
    }
}

