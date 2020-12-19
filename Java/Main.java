public class Main
{
	public static void main(String[] args) // Estudado e contruido por Matheus HB Melo - ADS/SENAC 
	{
		String cpf = "123.456.789-09"; // Deve-se alterar valores desta string para receber os resultados
		String n1, n2, n3, n4, n5, n6, n7, n8, n9, confere = ""; // variavel do tipo real para os 9 first's numbers
		int s1, s2, s3, s4, s5, s6, s7, s8, s9, digito1, digito2; // variavel cpfcompleto, tipo real sem ponto/traço
		
		n1 = cpf.substring(0,1); s1 = Integer.parseInt(n1);  // Posições de cada numero na subclass da var:cpf
		n2 = cpf.substring(1,2); s2 = Integer.parseInt(n2);
		n3 = cpf.substring(2,3); s3 = Integer.parseInt(n3);
		n4 = cpf.substring(4,5); s4 = Integer.parseInt(n4);
		n5 = cpf.substring(5,6); s5 = Integer.parseInt(n5);
		n6 = cpf.substring(6,7); s6 = Integer.parseInt(n6);
		n7 = cpf.substring(8,9); s7 = Integer.parseInt(n7);
		n8 = cpf.substring(9,10); s8 = Integer.parseInt(n8);
		n9 = cpf.substring(10,11); s9 = Integer.parseInt(n9);
		
		digito1 = (s1 * 10 + s2 * 9 + s3 * 8 + s4 * 7 + s5 * 6 + s6 * 5 + s7 * 4 + s8 * 3 + s9 * 2); 
		if ((digito1 % 11) < 2) // Formula para calculo do digito um
		    digito1 = 0;
		else
		    digito1 = 11 - (digito1 % 11);
		    
		digito2 = (s1 * 11 + s2 * 10 + s3 * 9 + s4 * 8 + s5 * 7 + s6 * 6 + s7 * 5 + s8 * 4 + s9 * 3 + digito1 * 2);
		if ((digito2 % 11) < 2) // formula para calculo do digito dois
		    digito2 = 0;
		else
		    digito2 = 11 - (digito2 % 11);
		
		confere = ( n1 + n2 + n3 + "." + n4 + n5 + n6 + "." + n7 + n8 + n9 + "-" + digito1 + "" + digito2);
		
		if (confere.equals(cpf))
		    System.out.println("CPF válido!"); // Mensagem caso o cpf esteja de acordo com a formula
		else
		    System.out.println("CPF inválido! VERIFIQUE!"); // Mensagem caso o cpf não esteja de acordo com a formula
	}
}
