package SpringTest02.SpringUDF2.model;

public class FuncionarioDependente {
	private int codigo;
	private String funcionarioNome;
	private String dependenteNome;
	private double funcionarioSal;
	private double dependenteSal;
	public String getFuncionarioNome() {
		return funcionarioNome;
	}
	public void setFuncionarioNome(String funcionarioNome) {
		this.funcionarioNome = funcionarioNome;
	}
	public String getDependenteNome() {
		return dependenteNome;
	}
	public void setDependenteNome(String dependenteNome) {
		this.dependenteNome = dependenteNome;
	}
	public double getFuncionarioSal() {
		return funcionarioSal;
	}
	public void setFuncionarioSal(double funcionarioSal) {
		this.funcionarioSal = funcionarioSal;
	}
	public double getDependenteSal() {
		return dependenteSal;
	}
	public void setDependenteSal(double dependenteSal) {
		this.dependenteSal = dependenteSal;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
