
package control_acceso_tienda;


public class Cliente {
    
   private String nombre, apellido;
   private int membresia;
    
    public Cliente (String danom, String daapellido, int damen){
        this.nombre = danom;
        this.apellido = daapellido;
        this.membresia = damen;
    }
}
