/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author eduar
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);*/
    
        /*int numero = 5;
        numero++;
        System.out.println(numero);
        System.out.println(Math.PI);*/
        
        float valor = 8.9f;
        int arredondar = (int) Math.floor(valor);
        System.out.println(arredondar);
        
        float valor2 = 8.9f;
        int arredondar2 = (int) Math.ceil(valor2);
        System.out.println(arredondar2);
        
        float valor3 = 8.5f;
        int arredondar3 = (int) Math.round(valor3);
        System.out.println(arredondar3);
        
        double aleatorio = Math.random();
        System.out.println(aleatorio);
        
        double aleatorio2 = Math.random();
        int n = (int) (5 + aleatorio2 * (10-5));
        System.out.println(n);
        
        double aleatorio3 = Math.random();
        int n2 = (int) (10 + aleatorio2 * (100-10));
        System.out.println(n2);
    }
}
    
  

