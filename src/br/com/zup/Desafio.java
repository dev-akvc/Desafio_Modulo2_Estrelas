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
Entrega Mínima: O sistema permite, via terminal, inserir pelo menos 1 funcionário
em uma lista e retornar o mesmo na tela.
 */
//        Instanciando Scanner
        Scanner leitor = new Scanner(System.in);

//        Declarando variáveis
        String nomeFuncionarix, telefoneFuncionarix, emailFuncionarix, cpfFuncionarix;
        Map<String, String> funcionarixs = new HashMap<String, String>();

//        Cadastrando funcionárixs
        System.out.println("** Bem vinde ao sistema de funcionárixs **");
        System.out.println("Para cadastrar funcionárix, informe os dados a seguir: ");
        System.out.println("Nome: ");
        nomeFuncionarix = leitor.nextLine();
        System.out.println("Telefone: ");
        telefoneFuncionarix = leitor.nextLine();
        System.out.println("E-mail: ");
        emailFuncionarix = leitor.nextLine();
        System.out.println("CPF: ");
        cpfFuncionarix = leitor.nextLine();

        funcionarixs.put(cpfFuncionarix, " Nome: " +nomeFuncionarix+ " Telefone: " +telefoneFuncionarix+ " E-mail: " +emailFuncionarix);
        System.out.println(funcionarixs);




    }
}
