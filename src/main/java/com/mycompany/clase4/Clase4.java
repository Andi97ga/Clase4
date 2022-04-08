/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase4;

/**
 *
 * @author User
 */
public class Clase4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        var auto1 = new Auto();
        auto1.color="rojo";
        auto1.marca="Hyundai";
        auto1.year=2020;
        auto1.placa="AGH8001";
        auto1.precio= 20999d;
        ////////////////////////////////////////////
        System.out.println(auto1.color+ " / "+
                           auto1.marca+ " / "+
                           auto1.year+ " / "+
                           auto1.placa+ " / "+
                           auto1.precio+ " / ");
        //////////////////////////////////////////
        var esTaxi = false;
        esTaxi=auto1.esTaxi();
        if(esTaxi==true){
        System.out.println( "El auto de placa " + auto1.placa + " es un taxi.");
        }else{
              System.out.println( "El auto de placa " + auto1.placa + " No es un taxi.");
        }
        ////////////////////////////////////////////// 
        System.out.println( "El auto con precio " + auto1.precio + " debe pagar la tasa solidario de " 
                                + auto1.calcularTasaSolidaria());
        /////////////////////////////////////////////  
       // var costoMatricula=10000d;
         var costoMatricula= auto1.calcularMatricula(2010,10000);
          System.out.println("Debe pagar"+costoMatricula+"USD pro concepto de matricula");
          //////////////////////////////////////////
          System.out.println("El auto es de la provincia de: "+auto1.obtenerProvincia());
          
        var actualYear=2022;
        actualYear= auto1.calcularYear(actualYear);
          System.out.println("El auto tiene: " + actualYear+"años");
        /////////////////////////////////////////
        var auto2 = new Auto();
        auto2.color="amarillo";
        auto2.marca="Chevrolet";
        auto2.year=2021;
        auto2.placa="GBF8087";
        auto2.precio= 22808d;
        
        System.out.println(auto2.color+ " / "+
                           auto2.marca+ " / "+
                           auto2.year+ " / "+
                           auto2.placa+ " / "+
                           auto2.precio+ " / ");
 
        esTaxi=auto2.esTaxi();
        if(esTaxi==true){
            System.out.println( "El auto de placa " + auto2.placa + " es un taxi.");
        }else{
            System.out.println( "El auto de placa " + auto2.placa + " No es un taxi.");
         } 
          System.out.println( "El auto con precio " + auto2.precio + " debe pagar la tasa solidario de " 
                                + auto2.calcularTasaSolidaria());
        
          costoMatricula= auto2.calcularMatricula(2010,10000);
          System.out.println("Debe pagar"+costoMatricula+"USD pro concepto de matricula");
          
          System.out.println("El auto es de la provincia de: "+auto2.obtenerProvincia());
    }
}
