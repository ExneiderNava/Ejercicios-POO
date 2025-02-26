
package sistemadereservas;


public class Usuario {
    
    private static String correo, contraseña;
    
    public Usuario(String daCorreo, String daContraseña){
        Usuario.correo = daCorreo;
        Usuario.contraseña = daContraseña;
    }
    
    public void reservarAsiento(){
        
        Sala apartar = new Sala(1, 60);
        
        apartar.agregarAsientos();

        
        
        
    }
}
