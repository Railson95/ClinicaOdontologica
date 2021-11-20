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
public class Secretaria extends Funcionario{

    public Secretaria(int id, String nome, String endereco, String cidade, String bairro, String rg, String cpf, String cargo, Date dataContratacao, String email, int telFixo, int telCel, String senha, double salario, Date dataPagamento){
        super(id, nome, endereco, cidade, bairro, rg, cpf, cargo, dataContratacao, email, telFixo, telCel, senha, salario, dataPagamento);
        
    }

    public void cadastrar(Secretaria d, Dados bd) {
        bd.cadastraSecretaria(d);
    }
    
   
    public void editar(int pos, Secretaria x, Dados bd){
        bd.editarSecretaria(pos, x);
    }
    
    public void excluir(int pos, Dados bd){
        bd.removerSecretaria(pos);
    }
    
    public boolean pesquisar(int id, Dados bd){
        boolean flag = false;
        flag = bd.verificaSeSecretariaExiste(id);
        return flag;
    }
    
    public boolean validaSecretaria(String nome, String senha, Dados bd){
        boolean flag = false;
        flag = bd.validaFuncionario(nome, senha);
        return flag;
    }

}
