
package factorymethod;

class CreadorProductoA extends Creador {
    @Override
    public Producto crearProducto() {
        return new ProductoA();
    }
}
