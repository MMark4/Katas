using System;
using System.Collections.Generic;

namespace netCore.Models
{
    public static class Beaker
    {
        public static List<Dice> Dices  = new List<Dice>();

        public static Random rand = new Random();

        public static void addDice(Dice dice)
        {
            Dices.Add(dice);
        }

        public static List<int> rollDices()
        {
            List<int> results = new List<int>();

            Dices.ForEach(dice =>
                            results.Add(rand.Next(dice.Faces) + 1));

            return results;
        }
    }
}