package com.example;
import java.util.*;

public class SelfDestructTimer
{
    // Constants that determine if Self-Destruct Sequence is correct
    public static final String selfDestructSeqCodes[] = {"13DG4", "12345", "ABCDE"};

    public static void main(String[] args)
    {
        // Variable declarations
        Scanner myCode = new Scanner(System.in);
        Boolean destructFlag = true;
        String userCode;
        String userCodeUpper;
        int i = 0;

        // A do...while loop is used because it is guaranteed to activate at least one time
        do {

            System.out.println("Enter user Destruct-Sequence:\n");
            userCode = myCode.nextLine(); //user inputs self destruct sequence
            userCodeUpper = userCode.toUpperCase(); //user's code is converted to uppercase for easy comparison

            if(userCodeUpper.equals(selfDestructSeqCodes[i])) //compares the user inputted code to the self destruct code
            {
                System.out.println("User Destruct Sequence Accepted.");
                i++; //increments code once if the code is correct
            }
            else //this executes if the user inputted code is incorrect
            {
                System.out.println("Erroneous Destruct Sequence Detected. Self-Destruct Sequence Aborted.");
                destructFlag = false; // This flag is used in another if statement to determine if self-destruct sequence occurs or not
                break; //if the user inputted code is erroneous, then the loop is broken out of
            }


        }while(i < selfDestructSeqCodes.length); //This loop continues for all three codes

        if(destructFlag == true) //the self destruct sequence does not occur if the codes aren't the same. This determines if they are all correct
        {
            System.out.println("\nSelf-Destruct Sequence Activated");

                for (int j = 5; j >= 0; j--)
                {
                    System.out.println("\n" + j);
                    try {
                        Thread.sleep(2000);
                    }
                    catch(InterruptedException ex)
                    {


                    }
                }


            System.out.println("\nBOOM!!!!!!!!!!!!!!!");


        }

    }
}