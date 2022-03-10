/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula_01_carlos;

import java.util.Scanner;

/**
 *
 * @author jpcasati
 */
public class MainClass {
    
    static void imprimeMenuPrincipal() {
        System.out.println("\n===========================");
        System.out.println("BANK MENU");
        System.out.println("A: Savings");
        System.out.println("B: Checking");
        System.out.println("C: Exit");
        System.out.println("===========================");
    }
    
    static void imprimeMenuSavings() {
        System.out.println("\n===========================");
        System.out.println("SAVINGS ACCOUNT:");
        System.out.println("A: Deposit");
        System.out.println("B: Withdrawal");
        System.out.println("C: Report");
        System.out.println("D: Return to Bank Menu");
        System.out.println("===========================");
    }
    
    static void imprimeMenuChecking() {
        System.out.println("\n===========================");
        System.out.println("\nCHECKING ACCOUNT:");
        System.out.println("A: Deposit");
        System.out.println("B: Withdrawal");
        System.out.println("C: Report");
        System.out.println("D: Return to Bank Menu");
        System.out.println("===========================");
    }
    
    static void saiDoPrograma() {
        System.out.println("TCHAU!");
    }
    
    public static void main(String[] args) {
        
        String r = "";
        Poupanca p = null;
        Corrente c = null;
        
        while(!r.equals("C")) {
            imprimeMenuPrincipal();
        
            Scanner sc = new Scanner(System.in);

            r =  sc.next();
            
            r = adequarEntrada(r);
            

            switch(r) {
                case "A": {
                    
                    if(p == null) {
                        System.out.println("\nNúmero da conta:");
                        int numero = sc.nextInt();
                        System.out.println("\nSaldo Inicial:");
                        double saldo = sc.nextDouble();
                        System.out.println("\nTaxa de Juros Anual:");
                        double taxa = sc.nextDouble();

                        p = new Poupanca(taxa, saldo, numero);
                    }
                    
                    while(!r.equals("D")) {
                        imprimeMenuSavings();
                        r =  sc.next();
                        r = adequarEntrada(r);
                        
                        if(r.equals("A")) {
                            System.out.println("\nValor do Depósito:");
                            double valor = sc.nextDouble();
                            p.fazerDeposito(valor);
                        } else if(r.equals("B")) {
                            System.out.println("\nValor do Saque:");
                            double valor = sc.nextDouble();
                            if(p.fazerSaque(valor))
                                System.out.println("\nSaque efetuado!");
                            else
                                System.out.println("\nSaldo insuficiente!");
                        } else if(r.equals("C")) {
                            printSavingsReport(p);
                        }
                    }
                    
                }
                break;
                case "B": {
                    if(c == null) {
                        System.out.println("\nNúmero da conta:");
                        int numero = sc.nextInt();
                        System.out.println("\nSaldo Inicial:");
                        double saldo = sc.nextDouble();
                        System.out.println("\nTarifa Mensal:");
                        double tarifa = sc.nextDouble();
                        
                        c = new Corrente(saldo, numero, tarifa);
                        
                    }
                    while(!r.equals("D")) {
                        imprimeMenuChecking();
                        
                        r =  sc.next();
                        r = adequarEntrada(r);
                        
                        if(r.equals("A")) {
                            System.out.println("\nValor do Depósito:");
                            double valor = sc.nextDouble();
                            c.fazerDeposito(valor);
                        } else if(r.equals("B")) {
                            System.out.println("\nValor do Saque:");
                            double valor = sc.nextDouble();
                            if(c.fazerSaque(valor))
                                System.out.println("\nSaque efetuado!");
                            else
                                System.out.println("\nSaldo insuficiente!");
                        } else if(r.equals("C")) {
                            //printCheckingReport(c);
                        }
                        
                    }
                }break;
                case "C": saiDoPrograma();break;
                default: System.out.println("Informação incorreta");
            }
        }
        
        
        
    }
    
    static String adequarEntrada(String entrada) {
        String saida = entrada.toUpperCase().substring(0,1);
        return saida;
    }
    
    static void printSavingsReport(Poupanca p) {
        System.out.println("\n == RELATÓRIO DE POUPANÇA ==");
        System.out.println("Número da conta: " + p.getNumero());
        System.out.println("Saldo inicial: " + p.getSaldoInicial());
        System.out.println("Saldo atual: " + p.getSaldoAtual());
        System.out.println("Quantidade de depósitos: " + p.getTotalDepositos());
        System.out.println("Valor total depositado: " + p.getValorDepositos());
        System.out.println("Quantidade de saques: " + p.getTotalSaques());
        System.out.println("Valor total de saques: " + p.getValorSaques());
        System.out.println("Taxa de juros: " + p.getTaxaJuros());
        System.out.println("Valor total de tarifas: " + p.getValorTotalTarifas());
        System.out.println("===========================");
        
    }
    
}
