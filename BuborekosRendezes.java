public class BuborekosRendezes {

    public static void main(String[] args) {

        // http://anim.ide.sk/rendezesi_algoritmusok_1.php

        int[] tomb = {2,-1,0,4,10,7,9,15,1,3};

        System.out.println("A tömb elemei:");
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }

        for (int i = tomb.length-1; i >= 1; i--) {
            for (int j = 0; j <= i-1; j++) {

                if(tomb[j] > tomb[j+1]){

                    int seged = tomb[j]; //a seged nevű változóba elmentjük a tomb[j] értékét. Ezután tomb[j] értékét már felül tudjuk írni.
                    tomb[j] = tomb[j+1]; //a tomb[j+1] értéke átkerül a tomb[j]-be. Így már a cserélés fele megvan.
                    tomb[j+1] = seged;   //a tomb[j+1]-be pedig a tomb[j] eredeti értékét kellene beleírni. De a tomb[j]-ben is már a tomb[j+1] értéke van.
                                         //de mivel a seged változóba elmenettük a tomb[j] eredeti értékét, ezért ezt fogjuk beletenni.

                }

            }
        }

        System.out.println("\nA tömb elemei rendezve:");
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i] + " ");
        }
        

    }



}
