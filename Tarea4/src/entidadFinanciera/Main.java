package entidadFinanciera;

public class Main {
 
	
    public static void main(String[] args) {
    	probarIngresar(2500);
    	probarRetirar(500);
        
    }

	public static void probarRetirar(float cantidadEsperada) {
		try {
			CCuenta objetoCuenta;
			double saldoActual;
      
			objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidadEsperada,0);
			saldoActual = objetoCuenta.estado();
			System.out.println("El saldo actual es"+ saldoActual );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void probarIngresar(float cantidadEsperada) {
		try {
			CCuenta objetoCuenta;
			double saldoActual;
      
			objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidadEsperada,0);
			saldoActual = objetoCuenta.estado();
			System.out.println("El saldo actual es"+ saldoActual );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
