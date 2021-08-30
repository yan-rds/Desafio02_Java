package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Faça um programa que receba um conjunto de N números (Digitado pelo usuário) e mostre:
        // menor valor
        // maior valor
        // A soma dos valores.

        Scanner leitor = new Scanner(System.in);

        // Definindo Variáveis
        int quantidadeDeNumeros = 0;
        int contador = 0;
        double numeroInserido = 0;
        double maiorNumero = 0;
        double menorNumero = maiorNumero + 1;
        double soma = 0;


        // Primeira parte do console
        System.out.println("Este programa irá receber os números que você me informar e te dar as seguintes informações");
        System.out.println("O menor valor entre eles;");
        System.out.println("O maior valor entre eles;");
        System.out.println("A soma de todos os valores");
        System.out.println();
        System.out.println("Para começarmos, me informe quantos números você pretende digitar");
        quantidadeDeNumeros = leitor.nextInt();

        // Criando a estrutura de repetição
        while (contador < quantidadeDeNumeros) {
            System.out.println("Digite um número:");
            numeroInserido = leitor.nextDouble();
            soma = soma + numeroInserido;
            contador ++;

            // Utilizando condicional dentro da estrutura de repetição para definirmos o maior e menor número.
            if (numeroInserido > maiorNumero) {
                maiorNumero = numeroInserido;
            }
            else if(numeroInserido < menorNumero) {
                    menorNumero = numeroInserido;
            }
        }

        // Dando as respostas pro usuário
        System.out.println("O maior número inserido foi o " +maiorNumero);
        System.out.println("O menor número inserido foi o " +menorNumero);
        System.out.println("E a soma de todos esses números é: " +soma);

    }
}
