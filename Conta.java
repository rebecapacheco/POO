package scndunit;

class Conta {

	private int codigo;
	private String nome;
	private double saldo;
	
	public Conta (int cod, String n, double sal) {              // construtor
		codigo = cod;
		nome = n;
		saldo = sal;
	}
	
	
	public int getCodigo () {
		return codigo;
	}
	public void setCodigo (int cod) {
		codigo = cod;
	}
	
	
	public String getNome () {
		return nome;
	}
	public void setNome (String n) {
		nome = n;
	}
	
	
	public double getSaldo () {
		return saldo;
	}
	public void setSaldo (double sal) {
		saldo = sal;
	}
	
	
	
	public static void main(String[] args) {  //metodo main
		Conta c = new Conta(1, "Rebeca Pacheco", 3000);
		System.out.println("código da conta:" + c.getCodigo());
        System.out.println("nome do cliente:" + c.getNome());
        System.out.println("saldo do cliente:" + c.getSaldo());
	}
	
	
}
