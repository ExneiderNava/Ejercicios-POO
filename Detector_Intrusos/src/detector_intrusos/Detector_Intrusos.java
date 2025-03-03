
package detector_intrusos;
import java.util.Scanner;

public class Detector_Intrusos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int activar;
        int opcion = 0;
        
        while(opcion != 2){
        
        System.out.println("Bienvenido");
        System.out.println("vamos a resolver el ejercico");
        System.out.println("Deteccion de intrusos con sensores de movimiento");
        System.out.println("1. empezar");
        System.out.println("2. salir");
        opcion = sc.nextInt();
        
        if(opcion == 2){
            System.out.println("terminado");
            break;
        }
        
        
        
            
        boolean alarma = true;
        
        while(alarma == true){
        System.out.println("quiere verificar las alarmas");
        System.out.println("1. si");
        System.out.println("2. no");
        activar = sc.nextInt();
       
        
        
        if(activar == 1){
            alarma = true;
        } else {
            alarma = false;
            break;

        }
        
        
        
        
       System.out.println("Scaneando sensor 1");
       System.out.println("hay algun movimiento?");
       System.out.println("1. si");
       System.out.println("2. no");
       int movimiento = sc.nextInt();
       boolean siono;
       
       if(movimiento == 1){
           siono = true;
       } else {
           siono = false;
       }
       
       Sensor1 decteccion1 = new Sensor1(siono);
       decteccion1.detectar();
       
       System.out.println("Scaneando sensor 2");
       System.out.println("hay algun movimiento?");
       System.out.println("1. si");
       System.out.println("2. no");
       int movimiento2 = sc.nextInt();
       boolean siono2;
       
       if(movimiento2 == 1){
           siono2 = true;
       } else {
           siono2 = false;
       }
       
       Sensor2 deteccion2 = new Sensor2(siono2);
       deteccion2.detectar();
       
       System.out.println("Scaneando sensor 3");
       System.out.println("hay algun movimiento?");
       System.out.println("1. si");
       System.out.println("2. no");
       int movimiento3 = sc.nextInt();
       boolean siono3;
       
       if(movimiento3 == 1){
           siono3 = true;
       } else {
           siono3 = false;
       }
       
       Sensor3 deteccion3 = new Sensor3(siono3);
       deteccion3.detectar();
       
       
       if(siono && siono2){
           System.out.println("encendiendo alarma");
           alarma = true;
       } else if (siono && siono3){
           System.out.println("encendiendo alarma");
           alarma = true;
       } else if (siono2 && siono3){
           System.out.println("encendiendo alamrma");
           alarma = true;
       } else {
           System.out.println("no hay peligro aún");
           alarma = false;
       }
       
       
       if(alarma){
           System.out.println("alarma encendida");
       } else {
           System.out.println("alarma apagada");
       }
       
        }
        
        }
       

        
        
    }
    
    
    
}
