
package controlteminvernadero;


public class Termometro {
    
    private double temperatura;
    
    public Termometro(double datoTem){
        
        this.temperatura = datoTem;
        
    }
    
    public void calefactor(){
        
        if(temperatura < 10){
            System.out.println("activando calefactor");
            
        }
        
    }
    
    public void ventilador(){
        
        if(temperatura > 25){
            System.out.println("activando ventilador");
            
        }
        
       
    }
    
    public void inactivo(){
        if(temperatura <= 25 && temperatura >= 10){
            System.out.println("Inactivo");
        }
    }
            
            
}
