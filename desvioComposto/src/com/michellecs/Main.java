package com.michellecs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double doacao, investimento;

        System.out.println("Digite o valor da doação");
        doacao=leitor.nextDouble();

        if (doacao<=1000){
            investimento = doacao*0.05;
        }
        else{
            investimento = doacao*0.15;
        }
        System.out.println("O investimento será de R$"+investimento);
    }
}
