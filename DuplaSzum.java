public class DuplaSzum {

    public static void main(String[] args) {
        
        double szum = 0;

        for (int i = 0; i < 11; i++) {
            for (int j = 1; j < 6; j++) {
                double v = Math.pow(i+j,2) / (double)2;
                System.out.println( "(" + i + "+" + j + ")^2/2 = " + v);
                szum += v;   //A matematikai függvények kimenete mindig double típusú
            }
        }

        System.out.println("A sor összege: "+szum);
        
    }
    
    
}
