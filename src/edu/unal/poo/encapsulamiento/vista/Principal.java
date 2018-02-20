/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.encapsulamiento.vista;

import java.util.Scanner;
import edu.unal.poo.encapsulamiento.modelo.Cuenta;
/**
 *
 * @author Estudiante
 */
public class Principal {
    public static void main(String [] args){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Creacion de cuentas");
        
        System.out.println("Ingrese numero");
        int numero = lectura.nextInt();
        
        System.out.println("Ingrese Clave");
        int clave = lectura.nextInt();
        
        System.out.println("Ingrese el  dueño");
        String duenno = lectura.next();
        
        System.out.println("Ingrese Saldo");
        double saldo = lectura.nextDouble();
     
        // creación de objeto
        Cuenta c1 = new Cuenta(numero, clave, duenno, saldo);
        
        System.out.println("Valor a consignar");
        double valor = lectura.nextDouble();
        boolean resultado = c1.consignar(valor);
        if(resultado == true){
            System.out.println("Consignación exitosa");
            System.out.println("Nuevo Saldo" + c1.getSaldo());
        }
        else{
            System.out.println("Consignación fallida");
        }    
        
        
    }
}
