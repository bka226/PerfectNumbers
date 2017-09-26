
/******************
 Name: Binod Katwal
 Date: 09/07/2017
 Purpose: To understand basic java program as well as to compute a value  that's below 1000 to display a perfect number or possible to test above 1000 also by increasing size of search.
 EXAMPLE: 6 is a perfect number, because 6 = 1 + 2 + 3.
 *******************/

package com.company;

public class perfectNumbers  //  Public Class
{
    public static boolean ValuePerfect (int val)
    {
        int result = 0; // initialized variable
        for (int i = 1; i < val; i++)
        {
            if (val % i == 0)
            {
                result = result + i;
            }
        }
        if (val == result) {
            //System.out.println("Prime Number");
            return true;
        }
        else
        {
            //System.out.println("Not a prime Number");
            return false;
        }
    }


    //Main Function contains for loop that holds numbers 1 to 1000
    public static void main(String[] args)
    {
        int nums = 0;
        for (int val = 1; val <= 1000; val++) // you may change size of output limitation
        {
            // Displays Result
            if ( ValuePerfect(val))
            {
                //Display the Result
                System.out.println ( " ");
                System.out.println ( "A Perfect number is: " + val);
                System.out.println ( "  ");

                System.out.println ( "It's divisors are: ");
                for (int i = 1; i < val; i++)
                {
                    if (val % i == 0)
                    {
                        System.out.println(i);

                    }
                }
                System.out.println( "************************ ");
            }
        }
        //return 0;
    }



}
