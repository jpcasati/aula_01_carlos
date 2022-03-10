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
        if(this.getTotalSaques() > 4) {
            double tarifa = 1;
            this.setSaldoAtual((Double) (this.getSaldoAtual() - tarifa));
            this.setValorTotalTarifas(this.getValorTotalTarifas() + tarifa);
        }
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

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    
    
}
