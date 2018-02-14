namespace netCore.Pages
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.RazorPages;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using netCore.Models;

    public class IndexModel : PageModel
    {
        public IndexModel()
        {
            Dices = Beaker.Dices.Select(o => o.Faces).ToList();
            Results = new List<int>();
        }

        [Required]
        [BindProperty]
        public Dice Dice {get; set;}

         public IEnumerable<int> Results { get; set; }

        public IEnumerable<int> Dices {get; set;}

        public void OnPostPostDice ()
        {
            Beaker.addDice(Dice);
        }

        public void OnPostRoll()
        {
            Results = Beaker.rollDices();
        }


    }
}