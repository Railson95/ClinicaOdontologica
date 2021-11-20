/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import DBdados.Dados;
import java.util.ArrayList;

/**
 *
 * @author rails
 */
public class Fornecedor {
    private int id;
    private String nome;
    private String empresa;
    private int telCel;
    private String rg;
    private String cpf;
    private String pix;
    private ArrayList<Material> material;



    public Fornecedor(int id, String nome, String empresa, int telCel, String rg, String cpf, String pix, ArrayList<Material> x) {
        this.material = x;
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
        this.telCel = telCel;
        this.rg = rg;
        this.cpf = cpf;
        this.pix = pix; 
    }
    
    public ArrayList<Material> getMaterial() {
        return material;
    }

    public void setMaterial(ArrayList<Material> material) {
        this.material = material;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getTelCel() {
        return telCel;
    }

    public void setTelCel(int telCel) {
        this.telCel = telCel;
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

    public String getPix() {
        return pix;
    }

    public void setPix(String pix) {
        this.pix = pix;
    }


    public void cadastrar(Fornecedor d, Dados bd) {
        bd.cadastraFornecedor(d);
    }
    
   
    public void editar(int pos, Fornecedor x, Dados bd){
        bd.editarFornecedor(pos, x);
    }
    
    public void excluir(int pos, Dados bd){
        bd.removerFornecedor(pos);
    }
    
    public boolean pesquisar(int id, Dados bd){
        boolean flag = false;
        flag = bd.verificaSeFornecedorExiste(id);
        return flag;
    }
    
}
