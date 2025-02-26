
package juego_fizzbuzz;
import java.util.Scanner;

public class Juego {
    Scanner sc = new Scanner(System.in);
    
    private int numero;
    
    public Juego(int daNumero){
        
       this.numero = daNumero;
        
    }
    
    private boolean fizz(){
        
        if(numero %3 == 0){
            return true;
        }
        
        return (numero %3 == 0);
    }
    
    private boolean buzz(){
         
        if(numero %5 == 0){
            return true;
        }
        
        return (numero %5 == 0);
    }
    
    public boolean ganar(){
        
        if(fizz() == true && buzz() == true){
            System.out.println("FIZZBUZZ");
            System.out.println("Haz ganado");
            return true;
        } else if (fizz()){
            System.out.println("FIZZ");
        } else if(buzz()){
            System.out.println("BUZZ");
        }
        
        return false;
    }
    
    public boolean esValido(){
        return fizz() || buzz();
    }
    
}
