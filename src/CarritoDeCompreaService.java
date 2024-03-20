import interfaces.Observer;

public class CarritoDeCompreaService implements Observer {
    @Override
    public void update(String message) {
        System.out.println("CarritoDeCompras: Eliminando productos del carrito: " + message);
    }
}
