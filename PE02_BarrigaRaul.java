import java.util.Scanner;

public class PE02_BarrigaRaul {
    public static void main(String[] args) {
        Scanner fc = new Scanner(System.in);
        System.out.println("Ets un futbolista en un partit decisiu per guanyar la champions i en un atac del rival existeix el risc de que marquin.");
        System.out.println("");
        System.out.println("Fas falta? (true/false): ");
        Boolean falta = fc.nextBoolean();
        fc.nextLine();
        boolean tarjeta_groga = falta;
        if (tarjeta_groga) {
            System.out.println("Has rebut tarjeta groga");
            
        }
        else {
            System.out.println("El rival ha fallat");
        }
        System.out.println("Ara el qui puja al atac es el teu equip i un company et demana la pilota");
        System.out.println("");
        System.out.println("Li passes la pilota al teu company?: (true/false)");
        boolean passar = fc.nextBoolean();
        fc.nextLine();
        boolean pase = passar;
        if (pase) {
            System.out.println("La jugada la feu conjunta");
        }
        else {
            System.out.println("Continues la jugada tu mateix");
        }
    }
}
