
package sistemadereservas;


public class Persona {
    
    private static String nombre, identificacion;
    private static int edad;
    
    public Persona(String daNombre, String daidentificacion, int daEdad){
        
        Persona.nombre = daNombre;
        Persona.identificacion = daidentificacion;
        Persona.edad = daEdad;
        
    }
}
