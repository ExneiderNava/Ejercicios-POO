
package sistemadereservas;
import java.util.ArrayList;
import java.util.Scanner;

public class Sala {
    Scanner sc = new Scanner(System.in);
    
    ArrayList<Integer> asientos = new ArrayList<>();
    
    private int numeroSala, asientosOcupar, capacidadmaxima;
    
    public Sala(int datonumeroSala, int datocapacidadmaxima){
        
        this.numeroSala = datonumeroSala;
        this.capacidadmaxima = datocapacidadmaxima;
                
    }
    
    
    public boolean hayAsientosDisponibles(){
        
        
        if(capacidadmaxima > 0){
            System.out.println("todavia hay asientos disponibles");
        } else {
            System.out.println("se acabaron los asientos");
           
        }
        
        return capacidadmaxima > 0;
    }
    
    public void agregarAsientos(){
        
        
        do{
            
         System.out.println("cuantos asientos desea apartar");
        asientosOcupar = sc.nextInt();
        
        if(asientosOcupar > capacidadmaxima){
            System.out.println("no puede apartar mas asientos");
            break;
        }
        
        asientos.add(asientosOcupar);
        
        capacidadmaxima -= asientosOcupar;
        
        if(capacidadmaxima > 0){
        
        hayAsientosDisponibles();
        
        } 
        
        
        } while(capacidadmaxima > 0);
        
        System.out.println("operacion terminada");
        
    }
    
}
