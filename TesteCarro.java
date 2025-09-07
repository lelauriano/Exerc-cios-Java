import java.util.ArrayList;

public class TesteCarro {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(new Carro("Toyota", "Corolla", 2020));
        carros.add(new Carro("Honda", "Civic", 2019));
        carros.add(new Carro("Ford", "Focus", 2018));

        for (Carro c : carros) {
            System.out.println(c);
            c.ligarMotor();
            c.acelerar();
            c.acelerar(20);
            c.frear();
            c.frear(15);
            c.desligarMotor();
            System.out.println(c);
            System.out.println("--------------------");
        }
    }
}