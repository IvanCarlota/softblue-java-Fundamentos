package default_package;

public class Aplicacao {
	public static void main(String[] args) {
		int x = 10;
		
		var x2 = 20;
		
		boolean y = false;
		var y2 = true;
		
		//var z; n�o � poss�vel n�o atribuir valor a uma variavel utilizando o var. 
		//Tamb�m n�o � poss�vel troca o tipo do valor de uma variavel usando o var ap�s j� ter especificado seu valor anteriormente.
		//Por exemplo, j� definimos x2 anteriormente como um inteiro, ent�o n�o posso atribuir um n�mero que n�o seja interior posteriormente tal como o : x2 = 10.0;
	
		System.out.println(x);
		System.out.println(x2);
		System.out.println(y);
		System.out.println(y2);
	
	}
}
