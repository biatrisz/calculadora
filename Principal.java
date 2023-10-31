package Calculo;

public class Principal {

	public static void main(String[] args) {
		Adicionar adicionar = new Adicionar();
		System.out.println( adicionar.somar(30,30));
		
		Subtrair subtrair = new Subtrair();
		System.out.println(subtrair.sub(54, 322));
		
		Calcular calcular = new Calcular ( );
		System.out.println(calcular.div(432, 043));
		System.out.println(calcular.multi(65, 85));
		
		Expoente expoente = new Expoente();
		System.out.println(expoente.exp(432, 44));
	}

}
