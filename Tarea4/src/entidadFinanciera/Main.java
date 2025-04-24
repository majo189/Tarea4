
package entidadFinanciera;

/*
 * Clase principal que prueba las operaciones basicas sobre una cuenta bancaria
 * utilizando la clase CCuenta. Se realizan operaciones de consulta, ingreso y 
 * retirada de saldo.
 * @author Maria Jose Gonzalez Campos
 */

public class Main {
 
	/*
	 * Metodo principal que crea una cuenta, muestra el saldo inicial e invoca
	 * metodos para probar ingresos y retiradas de dinero
	 * @param args los argumentos de la linea de comandos
	 */
    public static void main(String[] args) {
    	probarIngresar(2500);
    	probarRetirar(500);
        
    }
    
       
    /*
     * Realiza una retirada de dinero de la cuenta especificada y muestra el saldo resultante.
     * Si ocurre un error (por ejemplo, fondos insuficientes), se captura
     * y muestra el mensaje de error.
     * 
     * @param cantidadEsperada la cantidad a retirar a la prueba.
     */
	public static void probarRetirar(float cantidadEsperada) {
		CCuenta objetoCuenta;
        double saldoActual;
       

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidadEsperada,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
	}

	/*
	 * Realiza un ingreso en la cuenta especificada y muestra el saldo resultante.
     * Si ocurre un error (por ejemplo, ingreso de una cantidad negativa), se captura
     * y muestra el mensaje de error.
	 * @param cantidadEsperada la cantidad a ingresar en la prueba
	 */
	
	public static void probarIngresar(float cantidadEsperada) {
		CCuenta objetoCuenta;
        double saldoActual;
       

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidadEsperada,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
	}
	
	

}
