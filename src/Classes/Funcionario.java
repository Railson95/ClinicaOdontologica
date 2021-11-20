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
public abstract class Funcionario {
    private int id;
    private String nome;
    private String endereco;
    private String cidade;
    private String bairro;
    private String rg;
    private String cpf;
    private String cargo;
    private Date dataContratacao;
    private String email;
    private int telFixo;
    private int telCel;
    private String senha;
    private double salario;
    private Date dataPagamento;
    //pagamentos

    public Funcionario(int id, String nome, String endereco, String cidade, String bairro, String rg, String cpf, String cargo, Date dataContratacao, String email, int telFixo, int telCel, String senha, double salario, Date dataPagamento) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rg = rg;
        this.cpf = cpf;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
        this.email = email;
        this.telFixo = telFixo;
        this.telCel = telCel;
        this.senha = senha;
        this.salario = salario;
        this.dataPagamento = dataPagamento;
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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(int telFixo) {
        this.telFixo = telFixo;
    }

    public int getTelCel() {
        return telCel;
    }

    public void setTelCel(int telCel) {
        this.telCel = telCel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void cadastrar(){
        
    }
    
    public void editar(){
        
    }
    
    public void excluir(){
        
    }
    
    public void pesquisar(){
        
    }
    
}
