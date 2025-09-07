public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private boolean motorLigado;
    private double velocidade;

    public Carro() {
        this("Desconhecida", "Desconhecido", 0);
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motorLigado = false;
        this.velocidade = 0.0;
    }

    public void ligarMotor() {
        motorLigado = true;
        System.out.println(modelo + ": Motor ligado.");
    }

    public void desligarMotor() {
        motorLigado = false;
        velocidade = 0;
        System.out.println(modelo + ": Motor desligado.");
    }

    public void acelerar() { acelerar(10.0); }
    public void acelerar(double incremento) {
        if (motorLigado) {
            velocidade += incremento;
            System.out.println(modelo + " acelerou para " + velocidade + " km/h.");
        } else {
            System.out.println(modelo + ": Motor desligado, não pode acelerar.");
        }
    }

    public void frear() { frear(10.0); }
    public void frear(double decremento) {
        if (motorLigado && velocidade > 0) {
            velocidade = Math.max(0, velocidade - decremento);
            System.out.println(modelo + " reduziu para " + velocidade + " km/h.");
        } else {
            System.out.println(modelo + ": Não pode frear.");
        }
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + ano + ") - Motor: " +
                (motorLigado ? "Ligado" : "Desligado") +
                ", Velocidade: " + velocidade + " km/h";
    }
}

