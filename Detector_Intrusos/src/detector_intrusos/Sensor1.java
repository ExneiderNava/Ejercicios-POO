
package detector_intrusos;
import java.util.Scanner;

public class Sensor1 {
    Scanner sc = new Scanner(System.in);
    
    private boolean detectado;
    
    public Sensor1 (boolean detec){
        this.detectado = detec;
    }
    
    
    public void detectar(){
        
        
        if (detectado){
            System.out.println("Movimiento detectado");
        } else {
            System.out.println("no se han detectado movimientos");
        }
    }
    
}
