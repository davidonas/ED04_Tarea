package Cuentas;
/**
 * Clase para objetos tipo cuentas.
 * @author David Orrillo Navas
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacio
     */
    public CCuenta() //Este comantario es para guardar otra versión.
    {
    }

    /**
     * Devuelve nombre
     * @return nombre de cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna nombre
     * @param nombre Recibe el nombre de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve cuenta
     * @return
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Asigna cuenta
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve Saldo
     * @return
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Asigna Saldo
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

/**
 * Devuelve interes
 * @return
 */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Asigna interes
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Constructor
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
     * Devuelve el saldo
     * @return 
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * 
     * @param cantidad Tipo Doubke
     * @throws Exception Genera excepcion si la cantidad es < 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * 
     * @param cantidad Tipo Double
     * @throws Exception Genera excepción si la cantidad es <= o o no hay saldo
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
