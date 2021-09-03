package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
/*
Crie um programa para gerenciar uma lista de funcionários de uma empresa,
cada funcionário tem nome, telefone, email e CPF. No final do programa deve ser
exibida a lista de funcionários cadastrados.
Entrega Média: O sistema permite adicionar mais de um funcionário e apresenta
um menu para decidir se deverá:
1. Adicionar mais funcionários.
2. Exibir a lista de todos os funcionários cadastrados.
3. Encerrar o programa.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        String nomeFuncionarix = null, telefoneFuncionarix = null, emailFuncionarix = null, cpfFuncionarix = null, menuInicial;
        Map<String, String> funcionarixs = new HashMap<String, String>();
        int opcaoEscolhida;
        boolean opcao = true;

        System.out.println("** Bem vinde ao sistema de funcionárixs **");
//        Menu Inicial
        menuInicial = "O que você gostaria de fazer?\n1- Adicionar funcionárixs\n2- Exibir lista de funcionárixs cadastradxs\n3- Encerrar o programa";

//        Para reutilizar Menu Inicial
        System.out.println(menuInicial);
        opcaoEscolhida = leitor.nextInt();
        leitor.nextLine();

        while (opcao) {

            switch (opcaoEscolhida) {
                case 1:
                //        Cadastrando funcionárixs
                    System.out.println("Informe o nome: ");
                    nomeFuncionarix = leitor.nextLine();
                    System.out.println("Informe o telefone: ");
                    telefoneFuncionarix = leitor.nextLine();
                    System.out.println("Informe o e-mail: ");
                    emailFuncionarix = leitor.nextLine();
                    System.out.println("Informe o CPF: ");
                    cpfFuncionarix = leitor.nextLine();
                    funcionarixs.put(cpfFuncionarix, " Nome: " + nomeFuncionarix + " Telefone: " + telefoneFuncionarix + " E-mail: " + emailFuncionarix);

                    //        Confirmação de cadastro
                    System.out.println("Cadastro realizado!");

                    System.out.println(menuInicial);
                    opcaoEscolhida = leitor.nextInt();
                    leitor.nextLine();

                    break;

                case 2:

                    if (funcionarixs.size() != 0) {

                        for (String chaveFuncionario : funcionarixs.keySet()) {
                            System.out.println("Funcionário: " + funcionarixs.get(chaveFuncionario) + " CPF:" + chaveFuncionario);
                        }
                    } else {
                        System.out.println("Lista está vazia! Cadastre funcionárixs.");
                    }

                    System.out.println(menuInicial);
                    opcaoEscolhida = leitor.nextInt();
                    leitor.nextLine();

                    break;

                case 3:
                    System.out.println("Cadastro encerrado.");
                    opcao = false;
                    break;

                default:
                    System.out.println("Digite uma opção válida.");
                    System.out.println(menuInicial);
                    opcaoEscolhida = leitor.nextInt();
                    leitor.nextLine();
                    break;


            }
        }
    }
}
