
package control_aire_acondicionado;


public class Aire {
    
    private double temperatura, humedad;
    
    public Aire (double datempe, double dahum){
        this.temperatura = datempe;
        this.humedad = dahum;
    }
    
    public boolean activar(){
        if(temperatura > 28 && humedad > 60){
            return true;
        }
        
        return (temperatura > 28 && humedad > 60);
    }
    
    public boolean activar2(){
        if(temperatura > 30){
            return true;
        }
        
        return (temperatura > 30);
    }
}
