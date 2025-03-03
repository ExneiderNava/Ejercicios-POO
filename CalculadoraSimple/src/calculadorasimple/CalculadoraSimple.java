
package calculadorasimple;
import java.util.Scanner;

public class CalculadoraSimple {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        
        
        
        do{
            System.out.println("Bienvenido");
            System.out.println("Esto es una calculadora");
            System.out.println("1. Calcular");
            System.out.println("2. Salir");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("ingrese el primer numero");
                int num1 = sc.nextInt();
                System.out.println("ingrese el segundo numero");
                int num2 = sc.nextInt();
                System.out.println("que operacion desea realizar");
                System.out.println("1. suma");
                System.out.println("2. resta");
                System.out.println("3. multiplicacion");
                System.out.println("4. division");
                int ope = sc.nextInt();
                
                Operacion aritmeica = new Operacion(num1, num2, ope);
                
                switch (ope) {
                    case 1:                        
                        System.out.println("el resultado es: " + aritmeica.sumar());
                        break;
                    case 2:                       
                        System.out.println("el resultado es: " + aritmeica.restar());
                        break;
                    case 3:                       
                        System.out.println("el resultado es: " + aritmeica.multiplicar());
                        break;
                    case 4:                        
                        System.out.println("el resultado es: " + aritmeica.dividir());
                    default:
                        System.out.println("opcion incorrecta");
                }
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
