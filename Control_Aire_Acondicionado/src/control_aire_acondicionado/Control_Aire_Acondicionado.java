
package control_aire_acondicionado;
import java.util.Scanner;

public class Control_Aire_Acondicionado {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        do{
        
        System.out.println("Bienvenido");
        System.out.println("Vamos a resolver");
        System.out.println("Control de Aire Acondicionado");
        System.out.println("1. Empezar");
        System.out.println("2. Salir");
        opcion = sc.nextInt();
        
        if(opcion == 2){
            System.out.println("saliendo");
            break;
        }
        
        boolean aireon = false;
        
        System.out.println("ingrese la temperatura");
        double temperatura = sc.nextDouble();
        System.out.println("ingrese el porcentaje de la humedad");
        double humedad = sc.nextDouble();
        
        Aire acondicionado = new Aire(temperatura, humedad);
        
        acondicionado.activar();
        acondicionado.activar2();
        
        if(acondicionado.activar()){
            aireon = true;
            System.out.println("el aire esta encendido");
        } else if(acondicionado.activar2()){
            aireon = true;
            System.out.println("el aire esta encendido");
        } else {
            System.out.println("el aire esta apagado");
        }
        
        
        }while(opcion != 2);
    }
    
}
