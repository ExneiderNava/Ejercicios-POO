
package control_luces;


public class Luces {
    
    private boolean noche, movimiento;
    
    public Luces(boolean danoche, boolean damovimiento){
        this.noche = danoche;
        this.movimiento = damovimiento;
    }
    
    public void info(){
        
        if(noche && movimiento){
            System.out.println("encendiendo luces");
        } else {
            System.out.println("luces apagadas");
        }
    }
}
