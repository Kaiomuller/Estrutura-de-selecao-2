	public class Departamento{
	    private int numero;
	    private String nome;

	    public Departamento (int numero, String nome){
	        setNumero(numero);
	        setnome(nome);
	    }


		public void setNumero(int n){
	        if(n > 0) 
	        numero = n;
	    }

	    public void setnome(String n){
	        if(n.length()>0) nome = n;
	    }

	    public int getNumero(){
	        return numero;
	    }

	    public String getNome(){
	        return nome;
	    }
	}