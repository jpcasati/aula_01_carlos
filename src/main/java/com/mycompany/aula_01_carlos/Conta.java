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
    
    protected Double tarifaMensal;
    
    protected Integer totalDepoitos;
    
    protected Integer totalSaques;
    
    protected Double valorDepoitos;
    
    protected Double valorSaques;
    
    
    
    protected Boolean possuiSaldoSuficiente(Double valorConferencia) {
        if(this.saldoAtual >= valorConferencia)
            return true;
        else
            return false;
    }
    
    protected void fazerDeposito(Double valorDeposito) {
        
        this.saldoAtual += valorDeposito;
        this.valorDepoitos += valorDeposito;
        this.totalDepoitos++;
        
    }
    
    
    
}
