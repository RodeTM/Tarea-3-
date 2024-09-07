
package factorymethod;

class CreadorProductoB extends Creador {
    @Override
    public Producto crearProducto() {
        return new ProductoB();
    }
}


