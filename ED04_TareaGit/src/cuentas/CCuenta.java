package cuentas;

/**
 * Esta clase simula el funcionamiento de una cuenta bancaria, que guarda
 * datos personales de clientes y les permite realizar operaciones de 
 * ingreso y retirada con el saldo que tengan disponible.
 * 
 * @author pgago
 * @version 2.0.
 * @since 1
 */
public class CCuenta {
    private String nombre;
	private String cuenta;
    private double saldo;
    private double tipoInteres;
    
/**
 * Constructor sin parámetros, que inicializa los atributos a los valores
 * por defecto del tipo al que pertenezcan.  
 */
    public CCuenta()
    {
    }
/**
 * Constructor que inicializa los parámetros de la clase CCuenta al valor
 * que el método les pase.
 * @param nom nombre del cliente
 * @param cue número de la cuenta
 * @param sal saldo en cuenta
 * @param tipo tipo de interés de la cuenta
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
    
//Métodos accesores
    
    /**
     * Permite acceder al atributo encapsulado de la clase CCuenta 'nombre'.
     * No tiene parámetros porque es un getter para obtener información encapsulada.
     * @return devuelve nombre de cliente dueño de una cuenta
     */
    public String getNombre() {
		return nombre;
	}
/**
 * Permite establecer un nombre de cliente para una cuenta
 * No devuelve nada porque es un método de acceso setter y sirve 
 * para establecer un nuevo valor
 * @param nombre nombre del cliente
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Permite acceder al atributo encapsulado de la clase CCuenta 'cuenta'.
 * No tiene parámetros porque es un getter
 * @return devuelve el número de cuenta
 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Permite registrar un número de cuenta
	 * No devuelve nada porque es un método de acceso setter
	 * @param cuenta el número de cuenta a registrar
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Permite acceder al atributo encapsulado de la clase CCuenta 'saldo'.
	 * No tiene parámetros porque es un getter
	 * @return devuelve el saldo disponible en cuenta
	 */	
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Permite establecer o actualizar un saldo para una cuenta
	 * No devuelve nada porque es un método de acceso setter
	 * @param saldo nuevo saldo en cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * Permite acceder al atributo encapsulado de la clase CCuenta 'tipoInteres'.
	 * No tiene parámetros porque es un getter
	 * @return devuelve el tipo de interés que se aplica a la cuenta
	 */	
	public double getTipoInteres() {
		return tipoInteres;
	}
	/**
	 * Permite establecer o actualizar el tipo de interés que se aplica a 
	 * una cuenta
	 * No devuelve nada porque es un método de acceso setter
	 * @param tipoInteres, interés que se aplica a la cuenta
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

    
/**
 * Permite consultar el saldo disponible en cuenta       
 * @return saldo, devuelve el saldo diponible de una cuenta
 */
	public double estado()
    {
        return saldo;
    }
/**
 * Permite ingresar una cantidad de dinero en cuenta y actualiza el saldo 
 * sumándole la cantidad ingresada.
 * No devuelve nada
 * @param cantidad valor monetario a ingresar
 * @throws Exception lanza una excepción para evitar errores en el programa
 * cuando un usuario introduzca una cantidad negativa (menor a cero).
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * Permite retirar una cantidad de dinero de una cuenta, y actualiza el saldo
 * restando el valor retirado.
 * @param cantidad indica el valor monetario a retirar
 * @throws Exception lanza una excepción para evitar errores en el programa
 * cuando un usuario introduzca una cantidad negativa o superior al saldo disponible.
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}