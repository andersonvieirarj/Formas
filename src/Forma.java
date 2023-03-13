/*
O contrutor é um método de "inicialização da classe. Toda
classe é inicializada, geralmente "vazia"

Em Java, o construtor é definido como um método
cujo nome deve ser o mesmo nome da classe e sem
indicação do tipo de retorno -- nem mesmo void.

O construtor é unicamente invocado no
momento da criação do objeto através do operador new.
O retorno do operador new é uma referência para o
objeto recém-criado

*/

public class Forma extends Geometria{
    private double ladoa;
    private double ladob;
    private float base;
    private float alt;
    // Construtor vazio - é o construtor padrão da classe
    public Forma() {
    }
    public Forma (double raio){
        super.raio = raio;
    }
    // Construtor "cheio", parcial: utiliza dois atributos
    // para a inicialização de um objeto da classe
    public Forma(double ladoa, double ladob) {
        this.ladoa = ladoa;
        this.ladob = ladob;
    }
    // Construtor cheio, inicializando todos os atributos
    // inclusive incluindo o atributo da super classe
    // chamado através da palavra "super"
    public Forma(double raio, double ladoa, double ladob, float base, float alt) {
        super.raio = raio;
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.base = base;
        this.alt = alt;
    }
     public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getAlt() {
        return alt;
    }
    public void setAlt(float alt) {
        this.alt = alt;
    }
    public double getLadoa() {
        return ladoa;
    }
    public void setLadoa(double ladoa) {
        this.ladoa = ladoa;
    }
    public double getLadob() {
        return ladob;
    }
    public void setLadob(double ladob) {
        this.ladob = ladob;
    }
    // Criar um método para calcular o área de um cilindro
    // area = 3.14 * raio ao quadrado
    public double calcular (){
       double area = 3.14 * (this.raio * this.raio);
       return area;
    }
    // Criar um método de sobrecarga para calcular
    // a área de um rêtângulo, sabendo que a formula é
    // area = ladoa * ladob
    public double calcular (double ladoa,double ladob){
        this.ladoa = ladoa;
        this.ladob = ladob;
        double area = this.ladoa * this.ladob;
        return area;
    }
    // Criar um método de sobrecarga que calcule a
    // área de um triângulo, sabendo que a fórmula é
    // area = base * altura dividido por 2.
    // PODE-SE CRIAR NOVOS ATRIBUTOS
    public float calcular (float base, float altura){
        this.base = base;
        this.alt = altura;

        float area = (this.base * this.alt) /2;
        return area;
    }
}
