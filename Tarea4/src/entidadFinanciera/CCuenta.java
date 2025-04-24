

package entidadFinanciera;

/**
 * Cuenta bancaria creada por la persona titular para 
 * poder ingresar y retirar dinero de esa cuenta.
 * @author maria jose
 */
public class CCuenta {
   
    private static final String ERRORCANTIDADNEGATIVA = "No se puede ingresar una cantidad negativa";
	/**
     * Metodos de clase de la persona titular. Nombre, cuenta, saldo y tipoInteres
     * 
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    //Constructor sin parametros que inicializa la clase cuenta
    public CCuenta()
    {
    }
    /**
     * Constructor que inicializa los parametros de la clase cuenta
     * @param nom nombre de la persona titular
     * @param cue 
     * @param sal cantidad de dinero que tiene la cuenta
     * @param tipo interes que tiene la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /*
     * Obtiene el valor nombre de la persona titular
     * @return nombre de la persona titular
     */
    
    public String getNombre() {
		return nombre;
	}
    /*
	 *Establece en nombre titular 
	 *@param nombre de la persona titular
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	 /*
     * Obtiene el saldo actual de la cuenta
     * @return el saldo actual 
     */
	public double getSaldo() {
		return saldo;
	}
	/*
	 *Establece un nuevo valor para el saldo de la cuenta
	 *@param saldo el nuevo saldo a asignar 
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	 /*
     * Obtiene el tipo de interes que tiene la cuenta
     * @return el interes contratado
     */
	public double getTipoInterés() {
		return tipoInterés;
	}
	/*
	 *Establece el tipo de interes de la cuenta
	 *@param interes establecido 
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	
	/*
	 * Devuelve el estado de la cuenta
	 * @return saldo de la cuenta
	 */
	public double estado(){
        return this.saldo;
    }
	/*
	 * Ingresa una cantidad en la cuenta
	 * @param cantidad cantidad a ingresas
	 * @throws Exception si la cantidad es negativa
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception(ERRORCANTIDADNEGATIVA);
        saldo = saldo + cantidad;
    }
    /*
     * Retira una cantidad
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad es 0 o negativa
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}


    
   