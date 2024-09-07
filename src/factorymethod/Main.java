
package factorymethod;

public class Main {
    public static void main(String[] args) {
        Creador creadorA = new CreadorProductoA();
        creadorA.operacion();  
        
        Creador creadorB = new CreadorProductoB();
        creadorB.operacion();  
    }        
}

    

