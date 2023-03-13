// Criar uma aplicação que permita realizar funções
// matemáticas de formas geométricas distintas.
// Um exemplo: calcular área do triângulo e calcular
// raio de um cilindro

public class Main {
    public static void main(String[] args) {

        // Fazer um teste com a criação de um objeto
        // para calcular o volume do cilindro

        Forma cilindro2 = new Forma(6);

        Forma cilindro = new Forma();

        cilindro.setRaio(14);
        System.out.println("Volume do Cilindro:" +
                cilindro.calcular());

        Forma retangulo2 = new Forma (3,5);
        Forma retangulo = new Forma();

        retangulo.setLadoa(2);
        retangulo.setLadob(5);
        System.out.println("Área do Retângulo: " +
                retangulo.calcular(retangulo.getLadoa(), retangulo.getLadob()));

        Forma triangulo = new Forma();
        triangulo.setBase(4);
        triangulo.setAlt(5);
        System.out.println("Área do Triângulo: " +
                triangulo.calcular(triangulo.getBase(), triangulo.getAlt()));

    }
}