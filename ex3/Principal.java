package ex3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {
	public static void main(String[] args) throws ParseException {
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		Funcionario func3 = new Funcionario();
		System.out.println(func1.getIdentificador());
		System.out.println(func2.getIdentificador());
		System.out.println(func3.getIdentificador());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println();
		
		func1.setSalario(120);
		func2.setSalario(1220);
		func3.setSalario(1240);
		
		System.out.println();
		
		func1.setDataAdmissao(sdf.parse("01/02/2017"));
		func2.setDataAdmissao(sdf.parse("02/04/2018"));
		func3.setDataAdmissao(sdf.parse("03/06/2019"));
		
		System.out.println();
		
		func1.setDataAdmissao(sdf.parse("02/02/2017"));
		func2.setDataAdmissao(sdf.parse("03/04/2018"));
		func3.setDataAdmissao(sdf.parse("04/06/2019"));
		
		
	}
}
