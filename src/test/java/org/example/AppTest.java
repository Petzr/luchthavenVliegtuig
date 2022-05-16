package org.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void mcdc()
    {
        double weinigGewicht = 900;
        double veelGewicht = 1200;

        double hardeWind = 60;
        double zachteWind = 40;

        assertFalse(App.toestemmingVoorOpstijgen(false, weinigGewicht, hardeWind));
        assertFalse(App.toestemmingVoorOpstijgen(true, veelGewicht, zachteWind));
        assertFalse(App.toestemmingVoorOpstijgen(false, veelGewicht, zachteWind));
        assertTrue(App.toestemmingVoorOpstijgen(true, weinigGewicht, zachteWind));
        assertTrue(App.toestemmingVoorOpstijgen(true, veelGewicht, hardeWind));
    }

    @Test
    public void equivalentieklasse()
    {
        int betaal100 = 100;
        int betaal500 = 500;
        int betaal2500 = 2500;

        assertEquals(betaal100, App.prijsLandenOpSchiphol(999));
        assertEquals(betaal500, App.prijsLandenOpSchiphol(1000));
        assertEquals(betaal500, App.prijsLandenOpSchiphol(4999));
        assertEquals(betaal2500, App.prijsLandenOpSchiphol(5000));
    }

    @Test
    public void pairwise()
    {
        double expected1 = 1089;
        double expected2 = 150;
        double expected3 = 1300;
        double expected4 = 907.5;
        double expected5 = 5505.5;
        double expected6 = 2500;

        assertEquals(expected1, App.totaalPrijsLanden(999, 2, true, true), 0.001);
        assertEquals(expected2, App.totaalPrijsLanden(999, 3, false, false), 0.001);

        assertEquals(expected3, App.totaalPrijsLanden(1000, 2, true, false), 0.001);
        assertEquals(expected4, App.totaalPrijsLanden(1000, 3, false, true), 0.001);

        assertEquals(expected5, App.totaalPrijsLanden(5000, 3, true, true), 0.001);
        assertEquals(expected6, App.totaalPrijsLanden(5000, 2, false, false), 0.001);

    }

}
