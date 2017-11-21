/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo01;

/**
 *
 * @author Diego
 */
public class Circulo {   
    int cantLados;
    float pi;
    char letra;
    boolean recto;
    int radios[]; //extiendo Circulo a Ovalo
    
    //metodo constructor
    public Circulo(){
    cantLados = 0;
    pi = 3.14f;
    recto = false;
    radios = new int[2]; //tamaño del arreglo es 3 elementos
    radios[0] =5;
    radios[1] = 5;
    }

}
