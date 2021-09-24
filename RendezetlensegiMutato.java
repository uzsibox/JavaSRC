public class RendezetlensegiMutato {

    /*
    Rendezetlenségi mutató
    Írjon programot, amely tömbök rendezetlenségi értékét határozza meg és írja a standard kimenetre!
    Egy tömb rendezetlenségi értékének meghatározását a tömbelemek összehasonlításával végezzük:
    növekvő rendezettséget feltételezve az A tömb i-edik és j-edik eleme egymáshoz képest rendezetlen,
    ha i < j esetén A[i] > A[j]. A teljes tömbre vonatkozó értéket az összes tömbelem összes többivel történő összehasonlításával
    és a rendezetlen esetek összeszámolásával kapjuk meg.

    Példa bemenet
    4 2 1 3
    3 4 1

    A példa bemenethez tartozó kimenet
    4
    2

    Magyarázat:
    tömb: 4 2 1 3

    4>2
    4>1
    4>3
    2>1

    tömb: 3 4 1

    3>1
    4>1

     */
    public static void main(String[] args) {

        int[] tomb = {4,2,1,3};
        int db = 0;

        for (int i = 0; i < tomb.length-1; i++) {
            for (int j = i+1; j < tomb.length; j++) {

                if(tomb[i] > tomb[j]){
                    db++;
                }

            }
        }

        System.out.println("A tömb rendezetlenségi mutatója: "+db);

    }




}
