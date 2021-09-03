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
Entrega Máxima: O Sistema permite excluir um funcionário usando como
parâmetro o CPF e não permite inserir um funcionário com o CPF repetido.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        String nomeFuncionarix = "", telefoneFuncionarix = "", emailFuncionarix = "", cpfFuncionarix = "", menuInicial;
        Map<String, String> funcionarixs = new HashMap<String, String>();
        int opcaoEscolhida;
        boolean opcao = true;

        System.out.println("** Bem vinde ao sistema de funcionárixs **");
//        Menu Inicial
        menuInicial = "O que você gostaria de fazer?\n1- Adicionar funcionárixs\n2- Exibir lista de funcionárixs cadastradxs\n3- Excluir funcionárixs\n4- Encerrar o programa";

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
                    System.out.println("Para excluir um funcionárix, informe o CPF delx: ");
                    cpfFuncionarix = leitor.next();

                    if (funcionarixs.containsKey(cpfFuncionarix)) {
                        funcionarixs.remove(cpfFuncionarix);
                        System.out.println("Funcionárix deletadx do cadastro com sucesso!");
                    } else {
                        System.out.println("CPF não está cadastrado.");
                    }

                    System.out.println(menuInicial);
                    opcaoEscolhida = leitor.nextInt();
                    leitor.nextLine();

                    break;

                case 4:
                    System.out.println("Cadastro encerrado.");
                    if (funcionarixs.size() != 0) {

                        for (String chaveFuncionario : funcionarixs.keySet()) {
                            System.out.println("Funcionário: " + funcionarixs.get(chaveFuncionario) + " CPF:" + chaveFuncionario);
                        }
                    } else {
                        System.out.println("Lista está vazia!");
                    }
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
