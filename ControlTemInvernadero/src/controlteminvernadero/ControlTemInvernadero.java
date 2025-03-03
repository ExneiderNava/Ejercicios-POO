
package controlteminvernadero;
import java.util.Scanner;

public class ControlTemInvernadero {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         int opcion;
        
        
       
        
        do{
            System.out.println("Bienvenido");
            System.out.println("este es el sensor de temperatura");
            System.out.println("1. Empezar");
            System.out.println("2. Salir");
            opcion = sc.nextInt();
       
        
        switch (opcion) {
            case 1:
               
                System.out.println("ingrese la temperatura actual");
                double temperatura = sc.nextDouble();
                
                Termometro termo = new Termometro(temperatura);
                
                for (int i=5; i>=0; i--){
                    System.out.println(i);
                }
                termo.calefactor();
                termo.ventilador();
                termo.inactivo();
                
                
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
