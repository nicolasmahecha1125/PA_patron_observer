import interfaces.Observer;

public class InventarioService implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Inventario: Descuento de unidades por compra: " + message);
    }
}
