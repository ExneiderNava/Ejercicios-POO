
package control_acceso_tienda;


public class Tienda {
    
    private int hora;
    private int timeOpen = 6;
    private int timeClose = 21;
    
    public Tienda (int horaActual){
        this.hora = horaActual;
    }
    
    public boolean horario(){
        
        if(hora >= timeOpen && hora <= timeClose){
            return true;
        }
        
        return (hora >= timeOpen && hora <= timeClose);
    }
    
}
