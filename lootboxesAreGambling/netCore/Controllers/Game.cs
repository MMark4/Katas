namespace netCore.Controllers
{
    using System;
    using System.Collections.Generic;
    using Microsoft.AspNetCore.Mvc;
    using netCore.Models;

    public class Game : Controller
    {
        public IActionResult AddDice(Dice dice)
        {
            Beaker.addDice(dice);

            return Ok();
        } 

        public List<int> Roll()
        {
            return Beaker.rollDices();
        } 
    }
}