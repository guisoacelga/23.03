public class Uebung09 {
    public static void main(String[] args) {

        System.out.println("powerSimple 3,3: " + powerSimple(3,0));
    }
    public static void nextTickVaccination(){

    }
    
    public static int powerSimple(int x, int n){
        int elevado = 1;

        for (int i = 0; i < n ; i++) {
            elevado = elevado * x;
        }
        
        return elevado; 
    }

    public static int powerRecursion(int x, int n){
        int elevado = x;


        return elevado;
    }

}
