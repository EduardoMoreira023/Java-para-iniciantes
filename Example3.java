/*
	Esse programa ilustra a diferen�a entre int e double.

	Chame esse arquivo de Example3.java.
*/

class Example3 {
	public static void main (String args []) {

	   int var; // esta intru��o atribui 1024 a var1 <-- Atribui um valor a uma vari�vel.

	   double x; // essa instru��o declara uma vari�vel  de ponto flutuante

	    var = 10; // atrubui a var o valor de 10

	    x = 10.0; // atribui a "x" o valor de 10,0
	    
	    System.out.println("Original value of var: " + var);
	    System.out.println("Original value of x: " + x);
	    System.out.println(); // exibe uma linha em branco.

	    
	    // agora divide as duas por 4

	    var = var / 4;
	    x = x / 4;
	    System.out.println("var after division:  " + var);
	    System.out.println("x after division: " + x);
	}
}