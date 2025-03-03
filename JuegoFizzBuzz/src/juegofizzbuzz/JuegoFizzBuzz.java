
package juegofizzbuzz;
import java.util.Scanner;

public class JuegoFizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         int opcion;
        
       Juego play = new Juego();
        
        
        do{
            System.out.println("Bienvenido");
            System.out.println("vamos a jugar FIZZ BUZZ");
            System.out.println("1. jugar");
            System.out.println("2. Salir");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                play.bucle();
                break;
            case 2:
                System.out.println("Deteniendo programa");
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }
        } while(opcion != 2);
        
    }
    
}
