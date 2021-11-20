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
public class Dentista extends Funcionario{

    //private Dados bd = new Dados(); 
    
    private ArrayList<Date> dataConsulta = new ArrayList();

    public Dentista(int id, String nome, String endereco, String cidade, String bairro, String rg, String cpf, String cargo, Date dataContratacao, String email, int telFixo, int telCel, String senha, double salario, Date dataPagamento, ArrayList<Date> data){
        super(id, nome, endereco, cidade, bairro, rg, cpf, cargo, dataContratacao, email, telFixo, telCel, senha, salario, dataPagamento);
        this.dataConsulta = data;
    }
    
    public ArrayList<Date> getDataConsulta() {
       return this.dataConsulta;
    } 

    public void setDataConsulta(Date dataConsulta) {
        //this.dataConsulta = new ArrayList();
        try{
            this.dataConsulta.add(dataConsulta);
        }catch(NullPointerException e){ 
            this.dataConsulta = new ArrayList();
            this.dataConsulta.add(dataConsulta);
        } 
    }

    public void cadastrar(Dentista d, Dados bd) {
        bd.cadastraDentista(d);
    }
    
   
    public void editar(int pos, Dentista x, Dados bd){
        bd.editarDentista(pos, x);
    }
    
    public void excluir(int pos, Dados bd){
        bd.removerDentista(pos);
    }
    
    public boolean pesquisar(int id, Dados bd){
        boolean flag = false;
        flag = bd.verificaSeDentistaExiste(id);
        return flag;
    }
    
    public boolean validaDentista(String nome, String senha, Dados bd){
        boolean flag = false;
        flag = bd.validaFuncionario(nome, senha);
        return flag;
    }
 
    public boolean pesquisarSeDataOcupada(Date data, Dados bd){
        boolean flag = false;
        flag = bd.verificaSeDataEstaOcupada(data);
        return flag;
    }
    
}
