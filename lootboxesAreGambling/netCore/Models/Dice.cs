namespace netCore.Models
{
    using System;
    using System.Collections.Generic;

    public class Dice
    {
        public int Faces {get; set;}

        public bool IsLoaded {get; set;}

        public Dice()
        {
        }

        public Dice(int faces, Boolean isLoaded)
        {
            Faces = faces;
            IsLoaded = isLoaded;
        }
    }
}