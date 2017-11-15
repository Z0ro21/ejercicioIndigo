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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio2 e = new Ejercicio2();
        ArrayList<Long> palindromo = new ArrayList<Long>();
        ArrayList<Integer> limite = new ArrayList<Integer>();
        
        //generar lista de palindromos
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                if((i*j) >= 101101 && (i*j)<1000000){
                    if(e.ispalindromo(i*j)){
                            palindromo.add(Integer.toUnsignedLong(i*j));
                            //System.out.println("El palindromo: "+ (i*j) + " "+ i + "x"+ j );
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
        Scanner teclado = new Scanner (System.in);
        int t, n;
        System.out.println("Introduce el numero de test");
        t = teclado.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Introduce el limite del numero");
            n = teclado.nextInt();
            limite.add(n);
        }
        //imprimir el mayor palindromo que sea inferior a N
        System.out.println("Resultados: ");
        for (int i = 0; i < limite.size(); i++) {
            int aux = 0;
            for (int j = 0; j < palindromo.size(); j++) {
                if(aux < 1){
                    if(limite.get(i) > palindromo.get(j)){
                        System.out.println(palindromo.get(j));
                        aux++;
                    }
                }               
            }
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
    
    
}

