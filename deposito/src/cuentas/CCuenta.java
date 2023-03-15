package cuentas;

/**
 * Esta clase simula el comportamiento de un cajero automático
 * @author reiuqs
 */
public class CCuenta {

    /**
     * Atributo privado que hace referencia al nombre de usuario, tipo string
     */
    private String nombre;
    /**
     * Atributo privado que hace referencia al nombre de cuenta tipo string
     */
    private String cuenta;
    /**
     * Atributo privado que hace referencia al saldo tipo double
     */
    private double saldo;
    /**
     * Atributo privado que hace referencia al tipo de interes, tipo double
     */
    private double tipoInterés;

    public CCuenta()
    {
    }
    
    /**
     * Añadimos los parámetros de entrada
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método que devuelve el saldo
     * @return Saldo
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Revisamos que la cantidad a ingresar no es negativa
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Revisamos la cantidad a ingresar que no sea negativa ni insuficiente
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método que devuelve el nombre tipo string
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que define el nombre
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el nombre de cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método que define la cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método que devuelve el saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método que define el saldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método que devuelve el tipo de interés
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método que define el tipo de interés
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
