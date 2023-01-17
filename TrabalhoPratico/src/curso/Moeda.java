package curso;

public abstract class Moeda {
	double valor;
	
	Moeda (double valor) {
		this.valor = valor;
	}
	
	public abstract double converter(); //método que iremos utilizar nas classes filhas para converter cada moeda para Real
	public abstract void info(); //método que iremos utilizar nas classes filhas para listar o valor de cada moeda depositada daquele tipo
	
	@Override //sobrescrevemos o método "equals" para que possamos comparar os objetos na hora de remover as moedas da lista
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		if (valor != other.valor)
			return false;
		return true;
	}
}
