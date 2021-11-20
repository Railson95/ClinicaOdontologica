/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import DBdados.Dados;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rails
 */
public class Paciente {
    private int id;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String rg;
    private String cpf;
    private int telCel;
    private int telFixo;
    private Date dataConsulta;
    private ArrayList<Procedimento> procedimento;

    public Paciente(int id, String nome, String endereco, String bairro, String cidade, String uf, String rg, String cpf, int telCel, int telFixo, Date dataConsulta, ArrayList<Procedimento> p) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.rg = rg;
        this.cpf = cpf;
        this.telCel = telCel;
        this.telFixo = telFixo;
        this.dataConsulta = dataConsulta;
        this.procedimento = p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelCel() {
        return telCel;
    }

    public void setTelCel(int telCel) {
        this.telCel = telCel;
    }

    public int getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(int telFixo) {
        this.telFixo = telFixo;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public ArrayList<Procedimento> getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(ArrayList<Procedimento> procedimento) {
        this.procedimento = procedimento;
    }

    public boolean pesquisar(int id, Dados bd){
        boolean flag = false;
        flag = bd.verificaSePacienteExiste(id);
        return flag;
    }
    
    public void cadastrar(Paciente p, Dados bd){
        bd.cadastraParciente(p);
    }
    
    public String excluir(int pos, Dados bd){
        String flag = "";
        flag = bd.removerPaciente(pos);
        return flag;
    }
    
    public void editar(int pacienteAtual, Paciente p, Dados bd){
        bd.editarPaciente(pacienteAtual, p);
    }
    
    
}
