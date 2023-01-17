package curso;

public class Euro extends Moeda {

	Euro(double valor) {
		super(valor);
	}
	
	double cotacaoEuro = 5.1; //cotação da moeda com relação ao Real para podermos fazer a conversão
	
	@Override
	public double converter() {
		return valor*cotacaoEuro; //retorna o valor da moeda multiplicada pela cotação da mesma, totalizando o valor em Real
	}
	
	@Override
	public void info() {
		System.out.println("Euro: " + valor); //retorna o tipo da moeda e o valor da mesma depositado
	}

	@Override //sobrescrevemos o método "equals" para que possamos comparar os objetos na hora de remover as moedas da lista
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Euro other = (Euro) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
}

	
