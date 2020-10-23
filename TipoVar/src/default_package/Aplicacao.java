package default_package;

public class Aplicacao {
	public static void main(String[] args) {
		int x = 10;
		
		var x2 = 20;
		
		boolean y = false;
		var y2 = true;
		
		//var z; não é possível não atribuir valor a uma variavel utilizando o var. 
		//Também não é possível troca o tipo do valor de uma variavel usando o var após já ter especificado seu valor anteriormente.
		//Por exemplo, já definimos x2 anteriormente como um inteiro, então não posso atribuir um número que não seja interior posteriormente tal como o : x2 = 10.0;
	
		System.out.println(x);
		System.out.println(x2);
		System.out.println(y);
		System.out.println(y2);
	
	}
}
