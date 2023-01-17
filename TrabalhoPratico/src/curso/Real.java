package curso;

public class Real extends Moeda{

	Real(double valor) {
		super(valor);	
	}

	double cotacaoReal = 1; //cotação da moeda com relação ao Real para podermos fazer a conversão
	
	@Override
	public double converter() {
		return valor*cotacaoReal; //retorna o valor da moeda multiplicada pela cotação da mesma, totalizando o valor em Real
	}

	@Override
	public void info() {
		System.out.println("Real: " + valor); //retorna o tipo da moeda e o valor da mesma depositado
	}

	@Override //sobrescrevemos o método "equals" para que possamos comparar os objetos na hora de remover as moedas da lista
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Real other = (Real) obj;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
			return false;
		return true;
	}
}
