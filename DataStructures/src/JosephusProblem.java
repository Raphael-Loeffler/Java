import java.util.Scanner;
public class JosephusProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of players: ");
        int n = scanner.nextInt();
        String[] list = new String[n];
        //System.out.println("The winning seat is " + );
        /*
        //creating array with all the people with status alive or dead
        for (int i = 0; i < list.length; i++) {
            list[i] = "alive";
        }

        //initialising all the needed variables
        int aliveOnesCounter;
        int howMuchIncrement = 1;
        int winningSeat = -1;
        boolean allButOneDead = false;
        boolean exitInIf = false;

        //simulating the rounds
        while (!allButOneDead) {
            //one guy kills the next alive one next to him
            for (int i = 0; i < list.length; i++) {
                if (list[i].equals("alive")) {
                    while (exitInIf == false) {
                        if (list[i + howMuchIncrement].equals("alive")) {
                            list[i + howMuchIncrement] = "dead";
                            exitInIf = true;
                        } else {
                            howMuchIncrement++;
                        }
                        if (howMuchIncrement == n) {
                            howMuchIncrement = 1;
                        }
                    }
                }
            }
            howMuchIncrement = 1;
            exitInIf = false;

            //count how many people are still alive
            aliveOnesCounter = 0;
            for (String s : list) {
                if (s.equals("alive")) {
                    aliveOnesCounter++;
                }
            }

            //if only one guy is left, find out who and assign number
            if (aliveOnesCounter == 1) {
                allButOneDead = true;
                for (int i = 0; i < list.length; i++) {
                    if (list[i].equals("alive")) {
                        winningSeat = i + 1;
                    }
                }
            }
        }
        // end of while loop
         */
    }
}
