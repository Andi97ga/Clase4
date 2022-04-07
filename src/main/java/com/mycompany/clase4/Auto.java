/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase4;

/**
 *
 * @author User
 */
public class Auto {
    public double calcularMatricula(){
    String marca;
    String color;
    int year;
    double precio ;
    String placa;
    
    public boolean esTaxi(){
        var retorno = false;
         if(this.color=="amarillo"){
             retorno=true;
         }
        return retorno;
    }
    
    public int calcularTasaSolidaria(){
        var retorno= 1000000;
        if(this.precio>0 && this.precio<1000){
            retorno=0;
        }else{
            if(this.precio>=1001 && this.precio<10000){
                retorno=100;
            }  
            else{
                if(this.precio>=1001 && this.precio<25000){
                    retorno=250;
                } else{
                    retorno =370;
                }   
            }
         }
        return retorno;        
    }
    
     public double calcularMatricula(){
        var retorno= 10000d;
        if(this.year>=0 && this.year<=2010){
            if (this.precio>=0&&this.precio<=10000){
                
        }else{
            if(this.precio>=1001 && this.precio<10000){
                retorno=100;
            }  
            else{
                if(this.precio>=1001 && this.precio<25000){
                    retorno=250;
                } else{
                    retorno =370;
                }   
            }
            
            
         }
        
        
        return retorno;        
        }
     
            
     }
    
}

        
      