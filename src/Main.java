import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static ArrayList<String> lines = new ArrayList<>();

    public static void main(String[] args) {



        String menuPrompt = "A – Add  D – Delete  P – Print  Q – Quit";
        String cmd = ""; // A D P or Q
        boolean done = false;


        do {
            showList();
            cmd = SafeInput.getRegExString(in, menuPrompt, "[AaDdPpQq]");
            cmd = cmd.toUpperCase();
            switch (cmd)
            {
                case "A":
                // case "a":
                add();
                break;

                case "D":
              //  case "d":
                   delete();
                    break;

                case "P":
              //  case "p":
                    showList();
                    break;

                case "Q":
             //   case "q":
                  quit();
                    break;
            }

        } while (!done);
    } // End of the Main method

    private static void showList()
    {
        System.out.println("-----------------------------------------------");
        if(lines.size() == 0)
        {
            System.out.println("\nThe list is currently empty.\n");
        }
        else
        {

            for(String l:lines)
                System.out.println("\t" + l);

        }
        System.out.println("-----------------------------------------------");

    }

    /**
     *  Quit function that checks for the user to confirm
     *
     */
    private static void quit()
    {
        boolean quitYN = false;

        quitYN = SafeInput.getYNConfirm(in, "Are you sure");

        if(quitYN)
        {
            System.exit(0);
        }

    }

    /**
     * Adds a line to the memo list
     *
     */
    private static void add()
    {
      // get an item from the user which is a line on the list
      // add it to the end of the list a s a new line
      String lineItem = "";
      lineItem = SafeInput.getNonZeroLengthString(in,"Enter the new line for the memo");
      lines.add(lineItem);

    }

    private static void delete()
    {
        // show the list with line numbers so the user can pick which one to delete
        // get the line to delete with safeInput
        // remove the line
        System.out.println("-----------------------------------------------");
        if(lines.size() == 0)
        {
            System.out.println("\nNothing to delete.\n");
            System.out.println("-----------------------------------------------");
            return;
        }
        else
        {
            int ln = 0;

            for(String l:lines) {
                ln++;
                System.out.printf("\t%3d  %-80s\n", ln, l);
            }

        }
        System.out.println("-----------------------------------------------");
        int low = 1;
        int high = lines.size();
        int target = SafeInput.getRangedInt(in, "Enter the number of the line you want to delete", low, high);

        target--;  // Adjust the display value to be a valid 0 based index for the arraylist

        // Delete the item
        lines.remove(target);

        return;

    }



} // End of the class NO Code After this!!!
