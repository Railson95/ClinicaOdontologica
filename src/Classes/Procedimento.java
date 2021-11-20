/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author rails
 */
public class Procedimento {
    private String nomeProcedimento;
    private float valorProcedimento;

    public Procedimento(String nomeProcedimento, float valorProcedimento) {
        this.nomeProcedimento = nomeProcedimento;
        this.valorProcedimento = valorProcedimento;
    }

    public String getNomeProcedimento() {
        return nomeProcedimento;
    }

    public void setNomeProcedimento(String nomeProcedimento) {
        this.nomeProcedimento = nomeProcedimento;
    }

    public float getValorProcedimento() {
        return valorProcedimento;
    }

    public void setValorProcedimento(float valorProcedimento) {
        this.valorProcedimento = valorProcedimento;
    }
    
}
