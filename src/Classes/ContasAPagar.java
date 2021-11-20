/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author rails
 */
public class ContasAPagar {
    private int id;
    private Date dataPagamento;
    private double valorPagamento;
    private double totalPagar;

    public ContasAPagar(int id, Date dataPagamento, double valorPagamento, double totalPagar) {
        this.id = id;
        this.dataPagamento = dataPagamento;
        this.valorPagamento = valorPagamento;
        this.totalPagar = totalPagar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    

    
  
}
