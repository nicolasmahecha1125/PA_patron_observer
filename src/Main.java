public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = PaymentService.getInstance();

        //Crear instancias de los microservicios
        UsuarioService usuarioService = new UsuarioService();
        CarritoDeCompreaService carritoDeCompreaService = new CarritoDeCompreaService();
        InventarioService inventarioService = new InventarioService();

        // Registrar los microservicios com observadores del servicio de Payment
        paymentService.addObserver(usuarioService);
        paymentService.addObserver(carritoDeCompreaService);
        paymentService.addObserver(inventarioService);

        //Simular una compra
        paymentService.realizarCompra("arroz, huevos,panela");
        paymentService.realizarCompra("papel, carne, jamon");

    }
}