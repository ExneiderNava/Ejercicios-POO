
package control_acceso_tienda;


public class Empleado extends Cliente{
 
    private int esEmpleado;
    
    public Empleado (String danom, String daapellido, int damen, int daempleado){
        super(danom, daapellido, damen);
        
        this.esEmpleado = daempleado;
    }
    
}
