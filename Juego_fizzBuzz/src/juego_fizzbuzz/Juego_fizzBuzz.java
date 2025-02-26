
package juego_fizzbuzz;
import java.util.Scanner;

public class Juego_fizzBuzz {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        
        
        do{
            System.out.println("Bienvenido");
            System.out.println("vamos a jugar fizzBuzz");
            System.out.println("este juego consiste en ingresar un numero del 1 al 100");
            System.out.println("el jugador que consiga el numero fizzBuzz gana");
            System.out.println("1. Empezar juego");
            System.out.println("2. Salir");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                int numero;
                boolean gameover = false;
              
                
                while(!gameover){
                    System.out.println("ingrese el numero");
                    numero = sc.nextInt();
                    
                    if(numero > 100){
                        System.out.println("numero invalido");
                        break;
                    }
                    
                    Juego start = new Juego(numero);
                    
                    if(start.ganar()){
                        gameover = true;
                    } else if(!start.esValido()){
                        System.out.println("perdiste");
                        gameover = true;
                    }
                }
                
                System.out.println("juego terminado");
                
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
    

