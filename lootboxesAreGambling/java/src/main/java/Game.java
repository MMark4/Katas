import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public static void main(String args[])
    {
        System.out.println("type the 'newDice: n' where n is an Integer of the number of faces to load a dice");
        System.out.println("type 'roll' to roll the dices");
        System.out.println("type 'delete all' to clean beaker");
        System.out.println("type 'delete loaded dices' to clean beaker of loaded dices");
        System.out.println("type 'delete dice n' where n is an Integer to delete dices with n number of faces from the beaker");
        System.out.println("type 'escape' to quit game");
        Beaker beaker = new Beaker();

        while (true)
        {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Ready for a new command sir.");
            String input = userInput.nextLine();

            if (!input.isEmpty() || !input.equals(input.equals("escape"))) {

                if (input.contains("delete all")) {
                    beaker.removeAll();

                } else if(input.contains("delete loaded dices")) {
                    beaker.removeDicesByLoadedStatus(true);

                }else if(input.contains("delete dice")) {
                    Integer diceFaces = Integer.parseInt(input.replaceAll("[^\\.0123456789]",""));
                    beaker.removeDiceByFaceQuantity(diceFaces);

                }else if(input.contains("roll")) {
                    ArrayList results = beaker.rollDices();
                    results.forEach( result -> System.out.println(result));

                }else if(input.contains("newDice:")){
                    Integer diceFaces = Integer.parseInt(input.replaceAll("[^\\.0123456789]",""));
                    beaker.addDice(new Dice(diceFaces, false));
                } else {
                    System.out.println("COMMAND " + input + " NOT RECOGNIZED");
                }
            }
        }
    }
}
