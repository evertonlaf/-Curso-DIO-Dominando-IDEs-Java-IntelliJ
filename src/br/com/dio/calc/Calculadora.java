package br.com.dio.calc;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x, y;
        System.out.println("Digite o primeiro numero:");
        x = scn.nextInt();
        System.out.println("Digite o segundo numero:");
        y = scn.nextInt();

        System.out.println("Result Adição:"+somar(x,y));

        System.out.println("Result Multiplicação:"+multiplicar(x,y));

        System.out.println("Result Divisão:"+dividir(x,y));

        System.out.println("Result Subtração:"+subtrair(x,y));
    }

    public static int somar (int a,int b ){
        return a+b;
    }

    public static int multiplicar (int a,int b ){
        return a*b;
    }

    public static int subtrair (int a,int b ){
        return a-b;
    }

    public static int dividir (int a,int b ){
        return a/b;
    }
}
