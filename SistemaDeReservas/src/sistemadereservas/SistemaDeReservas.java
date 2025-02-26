
package sistemadereservas;
import java.util.Scanner;

public class SistemaDeReservas {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        
        Sala resolver = new Sala(1, 60);
        
        do{
            System.out.println("Bienvenido");
            System.out.println("vamos a resolver el problema del sistema de reservas");
            System.out.println("1. Resolver Ejercicio");
            System.out.println("2. Salir");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                resolver.agregarAsientos();
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

