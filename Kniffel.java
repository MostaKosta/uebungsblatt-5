import java.util.Arrays;

public class Kniffel {

    /**
     * Einser
     * @param dice gewürfelte Augenzahlen, aufsteigend sortiert
     * @return die Summe der Augenzahlen aller Würfel, die eine 1 zeigen
     */
    private static int aces(int[] dice) {
        int sum=0;
        for (int i:dice){
            if (dice[i]==1){
            return sum+=dice[i];  
            }
        }
    }

    /**
     * Zweier
     * @param dice gewürfelte Augenzahlen, aufsteigend sortiert
     * @return die Summe der Augenzahlen aller Würfel, die eine 2 zeigen
     */
    private static int twos(int[] dice) {
        int sum=0;
        for (int i:dice){
            if (dice[i]==2){
            return sum+=dice[i];
            }
    }

    /**
     * Dreier
     * @param dice gewürfelte Augenzahlen, aufsteigend sortiert
     * @return die Summe der Augenzahlen aller Würfel, die eine 3 zeigen
     */
    private static int threes(int[] dice) {
        int sum=0;
        for (int i:dice){
            if (dice[i]==3){
            return sum+=dice[i];
            }
    }

    /**
     * Vierer
     * @param dice gewürfelte Augenzahlen, aufsteigend sortiert
     * @return die Summe der Augenzahlen aller Würfel, die eine 4 zeigen
     */
    private static int fours(int[] dice) {
        int sum=0;
        for (int i:dice){
            if (dice[i]==4){
           return sum+=dice[i];  
            }
    }

    /**
     * Fünfer
     * @param dice gewürfelte Augenzahlen, aufsteigend sortiert
     * @return die Summe der Augenzahlen aller Würfel, die eine 5 zeigen
     */
    private static int fives(int[] dice) {
        int sum=0;
        for (int i:dice){
            if (dice[i]==5){
            return sum+=dice[i];  
            }
    }

    /**
     * Sechser
     * @param dice gewürfelte Augenzahlen, aufsteigend sortiert
     * @return die Summe der Augenzahlen aller Würfel, die eine 6 zeigen
     */
    private static int sixes(int[] dice) {
        int sum=0;
        for (int i:dice){
            if (dice[i]==6){
            return sum+=dice[i];
            }
    }

    /**
     * Dreierpasch
     * Anmerkung: Jeder Viererpasch ist auch ein Dreierpasch.
     * @param dice gewürfelte Augenzahlen, aufsteigend sortiert
     * @return Summe aller Augenzahlen, wenn mind. 3 gleiche Zahlen vorhanden, ansonsten 0 Punkte
     */
    private static int threeOfAKind(int[] dice) {
        int sum=dice[0];

        for (int i = 1; i < dice.length; i++) { 
          if (dice [i]==dice [i-1] && dice [i]==dice [i+1]){
            return sum+=dice[i];                 
          }
          else return 0;                                                            
        }
    }

    /**
     * Viererpasch
     * @param dice gewürfelte Augenzahlen, aufsteigend sortiert
     * @return Summe aller Augenzahlen, wenn mind. 4 gleiche Zahlen vorhanden, ansonsten 0 Punkte
     */
    private static int fourOfAKind(int[] dice) {
        int sum=dice[0];

        for (int i = 1; i < dice.length; i++) { 
          if (dice [i]==dice [i-1] && dice [i]==dice [i+1] && dice [i]==dice [i+2] ){
            return sum+=dice[i];                 
          }
          else return 0;                                                            

        }
    }

    /**
     * Full House
     * Anmerkung: Ein Kniffel zählt nicht als Full House.
     * @param dice gewürfelte Augenzahlen, aufsteigend sortiert
     * @return 25 Punkte bei drei gleichen und zwei gleichen Zahlen, ansonsten 0 Punkte
     */
    private static int fullHouse(int[] dice) {

        for (int i = 0; i < dice.length; i++) { 
            for (int j = 0; j < dice.length; j++){
              if (dice [i]==dice [i+1] && dice [i]==dice [i+2] && dice [j]==dice [j+1]&& dice[j]!=dice[i]){
              return 25;                 
              }
              else return 0;
            } 
        }
    }

    /**
     * Kleine Straße
     * Beispiel: Aus den Würfeln 1, 2, 2, 3, 4 lässt sich die kleine Straße 1, 2, 3, 4 bilden.
     * Gegenbsiepiel: Aus den Würfeln 1, 2, 4, 5, 6 und 1, 2, 2, 3, 5 lässt sich keine kleine Straße bauen.
     * @param dice gewürfelte Augenzahlen, aufsteigend sortiert
     * @return 30 Punkte, wenn vier (direkt) aufeinanderfolgenden Augenzahlen existieren (die fünfte Aufgenzahl ist beliebig), ansonsten 0 Punkte
     */
    private static int smallStraight(int[] dice) {
        int r=0;
        for (int i = 0; i <= dice.length; i++) {
             if (dice[i+1]==dice[i]+1){
               ++r;
               if (r==4){
                return 30;
               }
             }
             else return 0;            
        } 
    }

    /**
     * Große Straße
     * @param dice gewürfelte Augenzahlen, aufsteigend sortiert
     * @return 40 Punkte bei fünf (direkt) aufeinanderfolgenden Augenzahlen, ansonsten 0 Punkte
     */
    private static int largeStraight(int[] dice) {
        int r=0;
        for (int i = 0; i <= dice.length; i++) {
             if (dice[i+1]==dice[i]+1){
               ++r;
               if (r==5){
                return 40;
               }
             }
             else return 0;            
        } 
    }

    /**
     * Kniffel
     * @param dice gewürfelte Augenzahlen, aufsteigend sortiert
     * @return 50 Punkte bei fünf gleichen Zahlen, ansonsten 0 Punkte
     */
    private static int kniffel(int[] dice) {
        for (int i = 0; i < dice.length; i++) {
             if (dice[i+1]==dice[i]){
               ++r;
               if (r==5){
                return 50;
               }
             }
             else return 0;            
        } 
    }

    /**
     * Chance
     * @param dice gewürfelte Augenzahlen, aufsteigend sortiert
     * @return Summe aller Augenzahlen
     */
    private static int chance(int[] dice) {
        int sum=0;
        for (int i:dice){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Ausgabe zum Testen
        // (Sie dürfen die main-Methode verändern.)

        if(args.length != 5) {
            // diesen Fehlerfall müsse Ihre Methoden also nicht mehr behandeln
            System.out.println("ERROR: nicht genau 5 Zahlen übergeben");
            return;
        }

        // übergebene Zahlen einlesen
        int[] dice = new int[args.length];
        for(int i = 0; i < args.length; i++) {
            dice[i] = Integer.parseInt(args[i]);
            if(dice[i] < 1 || dice[i] > 6) {
                System.out.println("Error: ungültige Aufgenzahl " + dice[i]);
                return;
            }
        }

        // Array sortieren (machen wir noch später in der Vorlesung)
        Arrays.sort(dice);

        // Ausgaben zum Testen der Methoden
        System.out.println("Einser: " + aces(dice));
        System.out.println("Zweier: " + twos(dice));
        System.out.println("Dreier: " + threes(dice));
        System.out.println("Vierer: " + fours(dice));
        System.out.println("Fünfer: " + fives(dice));
        System.out.println("Sechser: " + sixes(dice));
        System.out.println("Dreierpasch: " + threeOfAKind(dice));
        System.out.println("Viererpasch: " + fourOfAKind(dice));
        System.out.println("Full House: " + fullHouse(dice));
        System.out.println("Kleine Straße: " + smallStraight(dice));
        System.out.println("Große Straße: " + largeStraight(dice));
        System.out.println("Kniffel: " + kniffel(dice));
        System.out.println("Chance: " + chance(dice));
    }
}
