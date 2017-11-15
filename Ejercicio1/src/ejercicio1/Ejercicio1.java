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
        
        ArrayList<Long> resultados = new ArrayList<Long>();
        ArrayList<Long> resultadosF = new ArrayList<Long>();
        ArrayList<String> divisiones = new ArrayList<String>();
        ArrayList<String> multi = new ArrayList<String>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Ejercicio1 e = new Ejercicio1();
        int t, k, n;
        String num;
        //Entrada de datos
        try {
            t = teclado.nextInt();
            if(t < 1 || t>100){
                System.out.println("1 <= t <=100");
                t = teclado.nextInt();
                if(t < 1 || t>100) System.exit(0);
            }
            for (int i = 0; i < t; i++) {
                n = teclado.nextInt();
                k = teclado.nextInt();
                if((n < k || n > 1000) || (k < 1 || k > 7)){
                    System.out.println("1 <= K <= 7\n" + "K <= N <= 1000");
                    n = teclado.nextInt();
                    k = teclado.nextInt();
                    if((n < k || n > 1000) || (k < 1 || k > 7)) System.exit(0);
                }
                num = teclado.next();
                e.resultadosF.add(e.calcularMaximo(num,k));
            }
            e.imprimir();
        } catch (Exception ex) {
            System.out.println("Introducción errónea de datos");
        } 
        
    }
    
    Long calcularMaximo(String num, int k){
            String[] parts = num.split("");
            //División del numero en N fragmentos de K digitos
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
            //Generación de productos de cada numero de K digitos
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
            //Ordenar de forma descendente para obtener el mayor en la posicion 0
            Collections.sort(resultados, Collections.reverseOrder());
            Long r = resultados.get(0);
            resultados.clear();
            divisiones.clear();
            return r;
    }
    
    void imprimir(){
        for (int i = 0; i < resultadosF.size() ; i++) {
            System.out.println(resultadosF.get(i));
        }
    }
}
