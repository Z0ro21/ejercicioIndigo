/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author adees
 */
public class Ejercicio2 {
    ArrayList<Long> palindromo = new ArrayList<Long>();
    ArrayList<Integer> limite = new ArrayList<Integer>();
    ArrayList<Long> resultados = new ArrayList<Long>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio2 e = new Ejercicio2();
        Scanner teclado = new Scanner (System.in);
        int t, n;
        //lectura de datos
        try {
            t = teclado.nextInt();
            if(t < 1 || t>100){
                System.out.println("1 <= T <=100");
                t = teclado.nextInt();
                if(t < 1 || t>100) System.exit(0);
            }
            for (int i = 0; i < t; i++) {
                n = teclado.nextInt();
                if(n < 101101 || n > 1000000){
                    System.out.println("101101 < N < 1000000");
                    n = teclado.nextInt();     
                    if(n < 101101 || n > 1000000) System.exit(0);
                }
                e.resultados.add(e.maximoPalindromo(n));
            }
            e.imprimirResultados();
        } catch (Exception ex) {
            System.out.println("Introducción errónea de datos");
        }
        
    }
    
    public String reverse(String num){
        if(num.length() == 1){
            return num;
        }else{
            return reverse(num.substring(1)) + num.charAt(0);
        }
        
    }
    
    public boolean ispalindromo(int numero){
        String aux = Integer.toString(numero);
        String[] parts = aux.split("");
        aux = parts[0] + parts[1] + parts[2];
        aux = aux + reverse(aux);
        if(numero == Integer.parseInt(aux)){
            return true;
        }else{
            return false;
        }
    }
    
    public Long maximoPalindromo(int limite){
        Long maximo=null;
        //generar lista de palindromos
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                if((i*j) >= 101101 && (i*j)<1000000){
                    if(ispalindromo(i*j)){
                            palindromo.add(Integer.toUnsignedLong(i*j));
                    }
                }
            }
        }
        //eliminar repetidos
        HashSet hs = new HashSet();
        hs.addAll(palindromo);
        palindromo.clear();
        palindromo.addAll(hs);
        //Ordenar de forma descendente
        Collections.sort(palindromo, Collections.reverseOrder());   
        
        int aux = 0;
        for (int j = 0; j < palindromo.size(); j++) {
            if(aux < 1){
                if(limite > palindromo.get(j)){
                    maximo = palindromo.get(j);
                    aux++;
                }
            }               
        }
        return maximo;
    }
    
    public void imprimirResultados(){
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println(resultados.get(i));
        }        
    }
}

