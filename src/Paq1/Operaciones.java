package Paq1;

public enum Operaciones {
	SUMA("+"), RESTA("-"), MULTIPLICACION("*"), DIVISION("/");
	
	private String valor;
	
	Operaciones(String valor){
		this.valor=valor;
	}
	
	public String getValor(){
		return valor;
	}
}
