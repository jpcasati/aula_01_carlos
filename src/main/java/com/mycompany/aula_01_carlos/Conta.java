/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula_01_carlos;

/**
 *
 * @author jpcasati
 */
public class Conta {
    
    protected Integer numero;
    
    protected Double saldoInicial;
    
    protected Double saldoAtual;
    
    protected Integer totalDepositos;
    
    protected Integer totalSaques;
    
    protected Double valorDepositos;
    
    protected Double valorSaques;
    
    public Conta(Double saldoInicial, Integer numero) {
        this.saldoInicial = saldoInicial;
        this.numero = numero;
        this.saldoAtual = saldoInicial;
        this.totalDepositos = 0;
        this.valorDepositos = 0.0;
        this.totalSaques = 0;
        this.valorSaques = 0.0;
        
    }
    
    protected Boolean possuiSaldoSuficiente(Double valorConferencia) {
        if(this.saldoAtual >= valorConferencia)
            return true;
        else
            return false;
    }
    
    protected void fazerDeposito(Double valorDeposito) {
        
        this.saldoAtual += valorDeposito;
        this.valorDepositos += valorDeposito;
        this.totalDepositos++;
        
    }
    
    
    
}
