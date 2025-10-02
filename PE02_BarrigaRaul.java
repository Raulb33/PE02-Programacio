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
            System.out.println("");
            System.out.println("El teu company et retorna la pilota i com el porter no estaba pendent de tu marques");
            System.out.println("Per la emocio del gol en l'ultim minut et treus la samarreta");
            System.out.println("");
            if (tarjeta_groga) {
                System.out.println("Per reglament reps una altre tarjeta groga terminant en expulsio pero heu guanyat (Final)");
                
            }
            else {
                System.out.println("Reps una tarjeta groga pero heu guanyat (Final)");
            }
        } else {
            System.out.println("Continues la jugada tu mateix");
            System.out.println("");
            System.out.println("Arribes a certa distancia on podries xutar o aproparte mes");
            System.out.println("");
            System.out.println("Xutes desde lluny?: (true/false)");
            boolean xut = fc.nextBoolean();
            fc.nextLine();
            boolean xut_lluny = xut;
            if (xut_lluny) {
                System.out.println("Fots un gol desde fora de l'area marcant el gol de la victoria (Final)");
            }
            else {
                System.out.println("Decideixes aproparte pero ara els rivals han tingut temps per poder pressionar");
                System.out.println("");
                System.out.println("Ara tens l'opcio de xutar o regatejar");
                System.out.println("");
                System.out.println("Fas el xut sota pressió?: (true/false)");
                boolean xutp = fc.nextBoolean();
                fc.nextLine();
                boolean xut_pressio = xutp;
                boolean banquillo = xut_pressio || tarjeta_groga;

                if (xut_pressio) {
                    System.out.println("Per la pressió falles i el rival fa un contraatac que acaba en gol i perds (Final)");

                }
                else if (banquillo) {
                    System.out.println("Falles i per el teu rendiment el entrenador et treu del camp (Final)");
                    
                }
                else {
                    System.out.println("En el intent de regatejar un rival et comet falta i acabas lessionat (Final)");
                }
            }
        }
        
    }
}
