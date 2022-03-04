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
    
    public void cobrarTarifaSaque() {

        this.saldoAtual -= 0.5;
        
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
