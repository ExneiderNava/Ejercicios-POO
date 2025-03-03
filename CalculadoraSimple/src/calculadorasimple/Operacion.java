
package calculadorasimple;


public class Operacion {
    
    private int numero1, numero2, operacion;
    
    public Operacion(int danum1, int danum2, int daOp){
        this.numero1 = danum1;
        this.numero2 = danum2;
        this.operacion = daOp;
    }
    
    public int sumar(){
        
       return numero1 + numero2;
       
    }
    
    public int restar(){
        
        return numero1 - numero2;
    }
    
    public int multiplicar(){
        return numero1 * numero2;
    }
    
    public int dividir(){
        return numero1 / numero2;
    }
}
