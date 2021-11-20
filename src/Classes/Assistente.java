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
public class Assistente extends Funcionario{

    public Assistente(int id, String nome, String endereco, String cidade, String bairro, String rg, String cpf, String cargo, Date dataContratacao, String email, int telFixo, int telCel, String senha, double salario, Date dataPagamento){
        super(id, nome, endereco, cidade, bairro, rg, cpf, cargo, dataContratacao, email, telFixo, telCel, senha, salario, dataPagamento);
        
    }

    public void cadastrar(Assistente d, Dados bd) {
        bd.cadastraAssistente(d);
    }
    
   
    public void editar(int pos, Assistente x, Dados bd){
        bd.editarAssistente(pos, x);
    }
    
    public void excluir(int pos, Dados bd){
        bd.removerAssistente(pos);
    }
    
    public boolean pesquisar(int id, Dados bd){
        boolean flag = false;
        flag = bd.verificaSeAssistenteExiste(id);
        return flag;
    }
    
    public boolean validaAssistente(String nome, String senha, Dados bd){
        boolean flag = false;
        flag = bd.validaFuncionario(nome, senha);
        return flag;
    }

}
