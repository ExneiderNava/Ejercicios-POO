
package sistemadereservas;


public class Asientos {
    
    private static int numeroAsiento;
    private static boolean reservado;
    
    
    public Asientos(int danumeroAsiento, boolean dareservado){
        
        Asientos.numeroAsiento = danumeroAsiento;
        Asientos.reservado = dareservado;
        
    }
    
    public void reservar(){
        Usuario metoreserva = new Usuario("exneidernava9@gmail.com", "12345");
        
        metoreserva.reservarAsiento();
        
        
    }
    
    public void liberar(){
        
    }
}
