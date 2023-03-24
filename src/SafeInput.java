
import java.util.Scanner;

public class SafeInput {

    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        int retValue = 0;
        String trash = "";

        do {

            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextInt())
            {
                retValue = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid int not: " + trash);
            }

        }while(!done);

        return retValue;
    }
    /**
     * Gets an int from the user within the specified range of low to high
     *
     * @param pipe Scanner to use for input
     * @param prompt Prompt for the user to know what ot input
     * @param low the low value for the range
     * @param high the high value for the range
     * @return a valid int with no contraints
     */
    public static int getRangedInt( Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        int retValue = 0;
        String trash = "";

        do {

            System.out.print("\n" + prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                retValue = pipe.nextInt();
                pipe.nextLine();
                if (retValue >= low && retValue <= high)
                    done = true;
                else
                    System.out.println("YOu must enter a value in range ");
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid int [" + low + " - " + high + "] not: " + trash);
            }

        }while(!done);

        return retValue;
    }

    /**
     * Gets a double from the user with no contraints
     *
     * @param pipe Scanner to use for input
     * @param prompt Prompt for the user to know what ot input
     * @return a valid int with no contraints
     */
    public static double getDouble( Scanner pipe, String prompt)
    {
        boolean done = false;
        double retValue = 0;
        String trash = "";

        do {

            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retValue = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid int not: " + trash);
            }

        }while(!done);

        return retValue;
    }

    /**
     * Gets a double from the user within the specified range of low to high
     *
     * @param pipe Scanner to use for input
     * @param prompt Prompt for the user to know what ot input
     * @param low the low value for the range
     * @param high the high value for the range
     * @return a valid int with no contraints
     */
    public static double getRangedDouble( Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false;
        double retValue = 0;
        String trash = "";

        do {

            System.out.print("\n" + prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextDouble())
            {
                retValue = pipe.nextDouble();
                pipe.nextLine();
                if (retValue >= low && retValue <= high)
                    done = true;
                else
                    System.out.println("You must enter a value in range [" + low + " - " + high + "] not: "+ retValue);
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid int [" + low + " - " + high + "] not: " + trash);
            }

        }while(!done);

        return retValue;
    }

    /**
     * Get a Y or N from the user and return the true or false equivalent
     *
     * @param pipe The scanner to use for input on system.in
     * @param prompt Tells the user what you want
     * @return A boolean true false euivalent for Y and N
     */
    public static boolean getYNConfirm( Scanner pipe, String prompt)
    {
        String value = "";
        boolean retValue = false;
        boolean done = false;

        do {
            System.out.print("\n" + prompt + "[Y/N]: ");
            value = pipe.nextLine();

            if(value.equalsIgnoreCase("Y"))
            {
                retValue = true;
                done = true;
            } else if (value.equalsIgnoreCase("N")) {
                retValue = false;
                done = true;
            }else
                System.out.println("You must enter a Y or N not: " + value);

        }while (!done);

        return retValue;
    }

    /**
     * Get a String that matches a supplied Regular Expression
     *
     * @param pipe Scanner to use for input on System.in
     * @param prompt tell the user what we want
     * @param regEx the RegEx pattern to match
     * @return
     */
    public static String getRegExString( Scanner pipe, String prompt, String regEx)
    {
        String retValue = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " " + regEx + ": ");
            retValue = pipe.nextLine();

            if(retValue.matches(regEx))
            {
                done = true;
            }
            else
                System.out.println("You must enter a String that matches the pattern; " + regEx);


        }while(!done);

        return retValue;
    }


    /**
     * get a String from the user that must be at least one character
     *
     * @param pipe  Scanner to use for input on System.in
     * @param prompt tells user what is needed
     * @return a non=zero length String
     */
    public static String getNonZeroLengthString( Scanner pipe, String prompt)
    {
        String retValue = "";
        boolean done = false;


        do {
            System.out.print("\n" + prompt + ": ");
            retValue = pipe.nextLine();

            if(retValue.length() > 0)
                done = true;
            else
                System.out.println("You must enter some characters!");


        }while(!done);

        return retValue;
    }

} // End of CLass
