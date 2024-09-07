
package factorymethod;


abstract class Creador {
    public abstract Producto crearProducto();
    
    public void operacion() {
        Producto producto = crearProducto();
        producto.operacion();
    }
}


