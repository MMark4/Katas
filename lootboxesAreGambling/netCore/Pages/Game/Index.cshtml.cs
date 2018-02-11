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
        [Required]
        [BindProperty]
        public Beaker Beaker {get; set;}

        [Required]
        [Display(Name = "SelectedPlayer")]
        public string SelectedPlayer { get; set; }
        public IEnumerable<SelectListItem> ExistantPlayers {get;set;}

        public void OnGet()
        {
        }

        public void OnPostBeaker()
        {
        }
    }
}