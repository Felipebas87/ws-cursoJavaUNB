package lista2;

public class Circulo extends Forma {
    private double raio;

   

    public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}