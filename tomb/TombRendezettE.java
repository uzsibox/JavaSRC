package tomb;

public class TombRendezettE {

    public static void main(String[] args) {

        //Írjon programot, mely egy bemenetként kapott tömbről eldönti, hogy rendezett-e (csökkenő/növekvő)

        //Ha igaz minden elemre, hogy az adott elem nagyobb, mint a rákövetkező akkor csökkenő.
        //Ha igaz minden elemre, hogy az adott elem kisebb, mint a rákövetkező akkor növekvő.

        //Ha van olyan, eset, hogy az egyik elem kisebb, mint a rákövetkező és olyan is, hogy nagyobb, mint a rákövetkező, akkor nem rendezett.

        int[] tomb = {1,2,3,7,5,6};

        boolean no = false; //van-e növekedés a tömbben
        boolean csokken = false; //van-e csökkenés

        for (int i = 0; i < tomb.length-1; i++) {
            if(tomb[i] > tomb[i+1]){
                no = true;
            }
            if(tomb[i] < tomb[i+1]){
                csokken = true;
            }
        }

        //if(no == true && csokken == true)

        if(no && csokken){
            System.out.println("A tömb rendezetlen!");
        }
        else{
            System.out.println("A tömb rendezett!");
        }





    }


}
