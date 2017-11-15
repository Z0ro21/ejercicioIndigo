/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author adees
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int t, k, n;
        String num;
        ArrayList<Long> resultados = new ArrayList<Long>();
        ArrayList<Long> resultadosF = new ArrayList<Long>();
        ArrayList<String> divisiones = new ArrayList<String>();
        ArrayList<String> multi = new ArrayList<String>(); 
        
        System.out.println("Ingresa la cantidad de test a realizar");
        t = teclado.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Longitud de numero: ");
            n = teclado.nextInt();
            System.out.println("Numero de caracteres a dividir ");
            k = teclado.nextInt();
            System.out.println("Numero a prueba");
            num = teclado.next();
            String[] parts = num.split("");
            for (int j = 0; j < parts.length; j++) {
                String aux="";
                for (int l = 0; l < k; l++) {
                    if(j+l < parts.length){
                        aux = aux + parts[j+l];
                    }                    
                }
                if(aux.length() == k){
                    divisiones.add(aux);
                }                 
            }
            for (int x = 0; x < divisiones.size() ; x++) {
                num = divisiones.get(x);
                String[] parts2 = num.split("");
                long aux = 0;
                for (int y = 0; y < parts2.length; y++) {
                    if(y == 0){
                        aux = Long.valueOf(parts2[0]);
                    }else{
                        aux = aux * Long.valueOf(parts2[y]);
                    }
                }
                resultados.add(aux);
            }
            Collections.sort(resultados, Collections.reverseOrder());
            resultadosF.add(resultados.get(0));
            resultados.clear();
            divisiones.clear();
        }
        
        System.out.println("Resultados: ");
        for (int i = 0; i < resultadosF.size() ; i++) {
            System.out.println(resultadosF.get(i));
        }
        
    }
    
}
