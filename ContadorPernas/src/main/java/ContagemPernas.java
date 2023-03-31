import java.util.Scanner;
public class ContagemPernas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantidade de pernas: ");
        int perna = teclado.nextInt();
        String tipo;
        System.out.println("Isto è:");
        switch (perna){
            case 1:
                tipo ="Saci";
                break;
            case 2: 
                tipo ="Bípede";
                break;
            case 3:
                tipo ="Tripé";
                break;
            case 4:
                tipo ="Qudrúpede";
            case 6:
                tipo ="Aranha";
                break;
            default:
                tipo ="ET";
                break;
                    
        }
        System.out.println(tipo);
    }
}
