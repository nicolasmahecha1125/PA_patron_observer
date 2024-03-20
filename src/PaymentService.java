import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class PaymentService implements Subject {
    private static PaymentService instance;
    private List<Observer> observers = new ArrayList<>();
    private  PaymentService(){}
    public static synchronized PaymentService getInstance(){
        if (instance == null){
            instance = new PaymentService();
        }
        return  instance;
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer : observers){
            observer.update(message);
        }

    }
    public  void realizarCompra(String productosComprados){
        System.out.println("Realizando compra de: "+ productosComprados);
        notifyObserver(productosComprados);
    }
}
