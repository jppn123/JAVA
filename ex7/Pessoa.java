
package teste;

public class Pessoa {
	public String nome;
	public String endereco;
	public int idade;
	public String cpf;
	public String sexo;
	public boolean canWalk;
	Pessoa(){
		imprimirValores();
	}
	void imprimirValores() {
		System.out.println("Pessoa:");
		System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n\n",
				this.nome,this.endereco,this.idade,this.cpf,this.sexo,this.canWalk);
	}
}
class Paciente extends Pessoa{
	public String doenca;
	public String medicacao;
	public boolean WithDor;
	public boolean isAlta;
	
	Paciente(){
		super();
		
		
	}
	void imprimirValores() {
		System.out.println("Paciente:");
		System.out.printf("%s\n%s\n%s\n%s\n\n", this.doenca, this.medicacao, this.WithDor, this.isAlta);
	}
}
class Medico extends Pessoa{
	public String crm;
	public double salario;
	public String especializacao;
	public boolean isPlantao;
	
	Medico(){
		super();
		
	}
	void imprimirValores() {
		System.out.println("Medico:");
		System.out.printf("%s\n%s\n%s\n%s\n\n", this.crm, this.salario, this.especializacao, this.isPlantao);
	}
}
class Hospital{
	public String nome;
	public String endereco;
	
	Hospital(){
		
		imprimirValores();
	}
	
	void imprimirValores() {
		System.out.println("Hospital:");
		System.out.printf("%s\n%s\n\n", this.nome, this.endereco);
		System.out.println("--------------");
	}
}
class m{
	public static void main(String[] args) {
		new Pessoa();
		new Paciente();
		new Medico();
		new Hospital();
	}
}