package edu.uttt.programacionCiclos.edu.uttt.conceptosBasicos;

public class PotenciaRecursiva {
     
     public static int potencia(int base, int exponente) {
        
        if (exponente == 0) {
            return 1;
        } else {
          
            return base * potencia(base, exponente - 1);
        }
    }
    public static void main(String[] args) {
       
        int base = 2 ;        
        int exponente = 8 ;   

        int resultado = potencia(base, exponente);
        System.out.println(base + " potencia de " + exponente + " es: " + resultado);
    }
}


