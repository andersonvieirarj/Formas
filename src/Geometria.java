// Criar uma classe base para armazenar dados básicos de
// uma figura geométrica
public class Geometria {
    protected double raio;

    public Geometria() {
    }
    public Geometria(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
}
