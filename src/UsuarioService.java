import interfaces.Observer;

public class UsuarioService implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Usuario: Se ha realizado una compra de " + message);
    }
}
