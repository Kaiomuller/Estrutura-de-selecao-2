

public class Teste {

	public static void main(String[] args) throws Exception {
        System.out.println(" ------- CRIA O FUNCIONARIO --------- ");
        System.out.println("");
        
        Funcionario func = new Funcionario( Teclado.leString("Digite o nome do Funcionario: "),
                new Departamento(   Teclado.leInt("Digite o codigo do Departamento do Funcionario: "),
                    Teclado.leString("Digite a descricao do Departamento do funcionario: ")
                ),
                Teclado.leDouble("Digite o salário do Funcionario: ")
            );
        System.out.println("REAJUSTE O SALARIO DO FUNCIONARIO");
        
        int codigoReajuste;
        codigoReajuste = Teclado.leInt("Informe um codigo de reajuste (1,2 ou 3):");
        if (codigoReajuste >= 1 && codigoReajuste <= 3) {
        	double salarioAnterior = func.getSalario();
        	
        	func.reajustaSalario(codigoReajuste);
        	
        	System.out.println("APRESENTA OS DADOS DO FUNCIONARIO");
        	System.out.println(" ");
        	
        	System.out.println("Nome do funcionario: "+func.getNome());
        	System.out.println("Departamento do funcionario: "+(func.getDepartamento()).getNumero() + "-" + (func.getDepartamento()).getNome());
        	System.out.println("Salario anterior do funcionario: " + salarioAnterior);      	
        	System.out.println("Salario do funcionario com reajuste: " + func.getSalario());
        }else {
        	System.out.println("Codigo de reajuste invalido! Encerarando...");
        }
    }
}