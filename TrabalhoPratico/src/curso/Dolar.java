package curso;

public class Dolar extends Moeda {

	Dolar(double valor) {
		super(valor);
	}

	double cotacaoDolar = 5.27; //cotação da moeda com relação ao Real para podermos fazer a conversão
	
	@Override
	public double converter() {
		return valor*cotacaoDolar; //retorna o valor da moeda multiplicada pela cotação da mesma, totalizando o valor em Real
	}

	@Override
	public void info() {
		System.out.println("Dolar: " + valor); //retorna o tipo da moeda e o valor da mesma depositado
	}
	
	@Override //sobrescrevemos o método "equals" para que possamos comparar os objetos na hora de remover as moedas da lista
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dolar other = (Dolar) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
}
