﻿namespace GalacticGPS
{
    using System;

    public class Program
    {
        public static void Main(string[] args)
        {
            Location home = new Location(18.037986, 28.870097, Planet.Earth);
            Console.WriteLine(home);

        }
    }
}
