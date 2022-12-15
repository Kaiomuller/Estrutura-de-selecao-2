public class Funcionario{
    private String nome;
    private double salario;
    private Departamento departamento;

    public Funcionario(String nome, Departamento departamento, double salario){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }


	public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public Departamento getDepartamento(){
        return departamento;
    }

    public void reajustaSalario(int codigo){
        System.out.println("Salario atual: "+salario);

        switch (codigo) {
            case 1:
                salario = ((salario*20)/100) + salario;
                System.out.println("Reajuste aplicado de 20%");
                break;
            case 2:
                salario = ((salario*5)/100) + salario + 57;
                System.out.println("Reajuste aplicado de 5% + bonus de R$50");
                break;
            case 3:
                salario = ((salario*13)/100) + salario;
                System.out.println("Reajuste aplicado de 13%");
                break;
        }
        System.out.println("Novo salario: "+salario);
    }
}