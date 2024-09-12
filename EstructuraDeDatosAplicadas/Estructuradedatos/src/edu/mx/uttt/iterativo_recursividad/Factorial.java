package edu.mx.uttt.iterativo_recursividad;

import javax.swing.*;

public class Factorial {

    private int  n;

    private  Factorial(){}



    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = (n>0)?n:1;
        this.n = n;
    }
}

public long CalcularIterativo(){
    long resp=0;

    {
        switch(opcion) {
            case"1":
                resp = FactorialFor();
                break;
            case"2":
                resp = FactorialWhile();
                break;
            case"3":
                resp = factorialDoWhile();
                break;
            default:
                JOptionPane.showMessageDialog(null,"opcion no valida");

        }


    }
    return 0;

}

private long FactorialFor(){

    long fact =1;
    for (int i =0 ; i<=this.n; i++){
        fact*=i;
    }
    return fact;
}

private long FactorialWhile(){
    long fact =1;
    int i=1;
    while (i<=this.n) {
        fact *= i;
        i++;
    }
        return fact;
}
    private long factorialDoWhile(){

    long fact =1;
    int i=1;


    public long calcularR(int n){

        //caso base
            if (n==1){
                return n;

            }
            else {
                return calcularR(n-1)*n;
            }
        }
    }
