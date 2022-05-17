package org.example;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static boolean toestemmingVoorOpstijgen(boolean verkeerstoren, double gewichtInKG, double tegenwindInKMPerUur) {
        return verkeerstoren && (
                gewichtInKG <= 1000
                || tegenwindInKMPerUur > 50
                );
    }

    public static int prijsLandenOpSchiphol(double gewicht) {
        if (gewicht < 0) {
            return -1;
        }

        if (gewicht < 1000) {
            return 100;
        } else if (gewicht < 5000) {
            return 500;
        } else {
            return 2500;
        }
    }

    public static double totaalPrijsLanden(double gewicht, int passagiers, boolean bagage, boolean isNL) {
        double prijs = prijsLandenOpSchiphol(gewicht);

        if (passagiers > 2) {
            prijs *= 1.5;
        }
        if (bagage) {
            prijs += 800;
        }
        if (isNL) {
            prijs *= 1.21;
        }

        return prijs;
    }


}
