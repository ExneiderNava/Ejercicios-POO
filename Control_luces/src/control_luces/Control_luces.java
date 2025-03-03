
package control_luces;
import java.util.Scanner;

public class Control_luces {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int continuar = 0;
        int menu = 0;
        boolean horariono, movimientono;
        
        while(menu != 2){
        
        System.out.println("Bienvenido");
        System.out.println("este es el ejercicio control de luces automatico");
        System.out.println("1. resolver");
        System.out.println("2. salir");
        menu = sc.nextInt();
        
        if(menu == 2){
            System.out.println("saliendo");
            break;
        }
        
        
        do{
        
        System.out.println("en que horario estamos?");
        System.out.println("1. es de dia");
        System.out.println("2. es de noche");
        int horario = sc.nextInt();
        if(horario == 2){
            horariono = true;
        } else {
            horariono = false;
        }
        
        System.out.println("se detectan movimientos en la habitacion?");
        System.out.println("1. si");
        System.out.println("2. no");
        int movimiento = sc.nextInt();
        if(movimiento == 1){
            movimientono = true;
        } else {
            movimientono = false;
        }
        
        Luces sistema = new Luces(horariono, movimientono);
        
        sistema.info();
        
        System.out.println("desea continuar");
        System.out.println("1. si");
        System.out.println("2. no");
        continuar = sc.nextInt();
        
        if(continuar == 2){
            System.out.println("deteniendo");
            break;
        }
        
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        
        }while(continuar != 2);
        

    }
   }
    
}
