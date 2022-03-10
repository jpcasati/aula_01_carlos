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
    
    private Integer numero;
    
    private Double saldoInicial;
    
    private Double saldoAtual;
    
    private Integer totalDepositos;
    
    private Integer totalSaques;
    
    private Double valorDepositos;
    
    private Double valorSaques;
    
    private Double valorTotalTarifas;
    
    public Conta(Double saldoInicial, Integer numero) {
        this.saldoInicial = saldoInicial;
        this.numero = numero;
        this.saldoAtual = saldoInicial;
        this.totalDepositos = 0;
        this.valorDepositos = 0.0;
        this.totalSaques = 0;
        this.valorSaques = 0.0;
        this.valorTotalTarifas = 0.0;
        
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public Integer getTotalDepositos() {
        return totalDepositos;
    }

    public void setTotalDepositos(Integer totalDepositos) {
        this.totalDepositos = totalDepositos;
    }

    public Integer getTotalSaques() {
        return totalSaques;
    }

    public void setTotalSaques(Integer totalSaques) {
        this.totalSaques = totalSaques;
    }

    public Double getValorDepositos() {
        return valorDepositos;
    }

    public void setValorDepositos(Double valorDepositos) {
        this.valorDepositos = valorDepositos;
    }

    public Double getValorSaques() {
        return valorSaques;
    }

    public void setValorSaques(Double valorSaques) {
        this.valorSaques = valorSaques;
    }

    public Double getValorTotalTarifas() {
        return valorTotalTarifas;
    }

    public void setValorTotalTarifas(Double valorTotalTarifas) {
        this.valorTotalTarifas = valorTotalTarifas;
    }
    
}
