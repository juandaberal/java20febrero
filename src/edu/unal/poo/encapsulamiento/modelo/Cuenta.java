/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.encapsulamiento.modelo;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
    private int numero;
    private int clave;
    private String duenno;
    private double saldo;

    public Cuenta(int numero, int clave, String duenno, double saldo) {
        this.numero = numero;
        this.clave = clave;
        this.duenno = duenno;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getDuenno() {
        return duenno;
    }

    public void setDuenno(String duenno) {
        this.duenno = duenno;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean consignar(double valor){
        if (valor > 0){
            this.saldo=this.saldo + valor;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean retirar(double saldo){
        if (saldo < this.saldo){
            this.saldo=this.saldo - saldo;
            return true;
        }
        else{
            return false;
        }
    }
    
}
