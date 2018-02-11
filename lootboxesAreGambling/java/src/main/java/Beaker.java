import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Beaker {

    private List<Dice> Dices;

    private Random rand;

    public Beaker()
    {
        rand = new Random();
        Dices = new ArrayList<Dice>();
    }

    public Beaker(ArrayList<Dice> dices)
    {
        rand = new Random();
        Dices = dices;
    }

    public void addDice(Dice dice)
    {
        Dices.add(dice);
    }

    public ArrayList<Integer> rollDices()
    {
        ArrayList<Integer> results = new ArrayList<>();

        Dices.forEach(dice ->
                        results.add(rand.nextInt(dice.getFaces()) + 1));

        return results;
    }

    public void removeDicesByLoadedStatus(Boolean isLoaded)
    {
        Dices.removeIf(dice -> dice.getIsLoaded().equals(isLoaded));
    }

    public void removeDiceByFaceQuantity(Integer quantity)
    {
        Dices.removeIf(dice -> dice.getFaces().equals(quantity));
    }

    public void removeAll()
    {
        Dices.clear();
    }
}
