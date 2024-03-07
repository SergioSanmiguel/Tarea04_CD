package banco;

import banco.CtaCorriente;

public class Main {

    public static void main(String[] args) {
        CtaCorriente miCuenta = new CtaCorriente("Koldo García Ábalos", "0001-2345-07-1234567890", 5000, 0);
        miCuenta.operativa_cuenta();
    }
}
package banco;

import java.util.Scanner;

public class CtaCorriente {
    private double saldo;
    private String titular;
    private String numeroCuenta;

    public CtaCorriente(String titular, String numeroCuenta, double saldoInicial, double interes) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void operativa_cuenta() {
        double saldoActual = estado();
        System.out.println("El saldo inicial es de " + saldoActual + " euros");

        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea retirar?");
            double importe = entrada.nextDouble();
            retirar(importe);
            System.out.println("El saldo actual de su cuenta es " + estado() + " euros");
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea ingresar en su cuenta?");
            double importe = entrada.nextDouble();
            ingresar(importe);
            System.out.println("El saldo actual de su cuenta es " + estado() + " euros");
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    public double estado() {
        return saldo;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }

    public void ingresar(double cantidad) {
        saldo += cantidad;
    }
}


 
