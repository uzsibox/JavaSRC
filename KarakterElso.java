public class KarakterElso {

    public static void main(String[] args) {

        /*Döntsük el egy karakterről, hogy:
            - kisbetű-e
            - nagybetű-e
            - betű-e
            - számjegy-e
            - whitespace-e
        */

        char c = ' ';

        if( Character.isLowerCase(c)){
            System.out.println("A(z) " + c + " karakter kisbetűs!");
        }
        if( Character.isUpperCase(c)){
            System.out.println("A(z) " + c + " karakter nagybetűs!");
        }
        if( Character.isLetter(c)){
            System.out.println("A(z) " + c + " karakter betű!");
        }
        if( Character.isDigit(c)){
            System.out.println("A(z) " + c + " karakter számjegy!");
        }
        if( Character.isLetterOrDigit(c)){
            System.out.println("A(z) " + c + " karakter betű vagy számjegy!");
        }
        if( Character.isSpaceChar(c)){
            System.out.println("A(z) " + c + " karakter szóköz!");
        }
        if(Character.isWhitespace(c)){
            System.out.println("A(z) " + c + " karakter whitespace!");
        }


    }

}
