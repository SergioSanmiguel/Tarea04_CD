package banco;

public class CtaCorriente {
    public String nombre;
    public String cuenta;
    public double saldocuenta;
    public double interes;

    public CtaCorriente()
    {
    }
    public CtaCorriente(String nombre, String cuenta, double saldo, double interes)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldocuenta = saldo;
        this.interes = interes;
    }
    public double estado()
    {
        return saldocuenta;
    }
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldocuenta = saldocuenta + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldocuenta = saldocuenta - cantidad;
    }
}