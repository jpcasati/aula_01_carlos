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
public class Poupanca extends Conta {
    
    private Double taxaJuros;
    
    public Poupanca(Double taxaJuros, Double saldoInicial, Integer numero) {
        super(saldoInicial, numero);
        this.taxaJuros = taxaJuros;
        
        
    }
    
    public void cobrarTarifaSaque() {
        if(this.totalSaques > 4) {
            this.saldoAtual -= 1;
        }
    }
    
    public Boolean fazerSaque(Double valorSaque) {
        
        if(possuiSaldoSuficiente(valorSaque)) {
            
            this.saldoAtual -= valorSaque;
            this.valorSaques += valorSaque;
            this.totalSaques++;
            
            cobrarTarifaSaque();
            
            return true;
        } else {
            return false;
        }
        
    }
    
}
