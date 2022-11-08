package main;

import excepciones.OverFlowSale;
public class Cuenta {
    private final String numero;
    private final String titular;
    private float saldo;

    public Cuenta(String numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Cuenta(String numero, String titular){
        this(numero, titular, 0.0f);
    }

    public void extraer(float monto) throws OverFlowSale {
        if(monto < this.saldo){
            this.saldo -= monto;
        } else
            throw new OverFlowSale("No hay suficiente Saldo en la cuenta");
    }
    public void deposito(float monto){
        this.saldo += monto;
    }

    public float getSaldo(){ return saldo; }
    public String getNumero() { return numero; }
    public String getTitular() { return titular; }
}

