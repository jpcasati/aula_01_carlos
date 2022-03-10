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
public class Corrente extends Conta {
    
    protected Double tarifaMensal;
    
    
    public Corrente(Double saldoInicial, Integer numero, Double tarifaMensal) {
        super(saldoInicial, numero);
        this.tarifaMensal = tarifaMensal;
    }
    
    public void cobrarTarifaSaque() {

        double tarifa = 0.5;
        this.setSaldoAtual((Double) (this.getSaldoAtual() - tarifa));
        this.setValorTotalTarifas(this.getValorTotalTarifas() + tarifa);
        
    }
    
    public Boolean fazerSaque(Double valorSaque) {
        
        if(possuiSaldoSuficiente(valorSaque)) {
            
            this.setSaldoAtual((Double) (this.getSaldoAtual() - valorSaque));
            this.setValorSaques((Double) (this.getValorSaques() + valorSaque));
            this.setTotalSaques((Integer) (this.getTotalSaques() + 1));
            
            cobrarTarifaSaque();
            
            return true;
        } else {
            return false;
        }
        
    }
    
}
