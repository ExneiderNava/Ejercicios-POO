
package control_acceso_tienda;
import java.util.Scanner;

public class Control_Acceso_Tienda {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean entrada;
        int empezar = 0;
        
        do{
        System.out.println("Bienvenido");
        System.out.println("vamos a resolver el ejercicio");
        System.out.println("Control de acceso a una tienda");
        System.out.println("1. empezar");
        System.out.println("2. salir");
        empezar = sc.nextInt();
        
        if(empezar == 2){
            System.out.println("saliendo");
            break;
        }
        
        sc.nextLine();
        
        
        System.out.println("Acceder a la tienda");
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        
        System.out.println("Ingrese su apellido");
        String apellido = sc.nextLine();
        
        System.out.println("tiene valida la membresia");
        System.out.println("1. si");
        System.out.println("2. no");
        int menbresia = sc.nextInt();
        
        Cliente clientes = new Cliente(nombre, apellido, menbresia);
        
        System.out.println("hora de ingreso, solo digite la hora en formato militar");
        int hora = sc.nextInt();
        
        Tienda tiendas = new Tienda(hora);
        
        System.out.println("es usted uno de nuestros empleados?");
        System.out.println("1. si");
        System.out.println("2. no");
        int empleado = sc.nextInt();
        
        Empleado empleados = new Empleado(nombre, apellido, hora, empleado);
        
        if(menbresia == 1 && tiendas.horario()){
            entrada = true;
        } else if(empleado == 1){
            entrada = true;
        } else {
            entrada = false;
        }
        
        if(entrada){
            System.out.println("acceso permitido");
            System.out.println("puede entrar");
        } else {
            System.out.println("acceso denegado");
            System.out.println("no puede entrar");
        }
        
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("hora de ingreso: " + hora);
        if(menbresia == 1){
            System.out.println("membresia valida");       
        } else {
            System.out.println("membresia vencida");
        }
        if(empleado == 1){
            System.out.println("es empleado");
        } else {
            System.out.println("no es empleado");
        }
        
        }while(empezar != 2);
    }
    
}
