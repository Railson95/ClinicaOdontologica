/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import DBdados.Dados;
import Formularios.frmLogin;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rails
 */
public class Aplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        //int id, String nome, String endereco, String cidade, String bairro, String rg, String cpf, String cargo, Date dataContratacao, String email, int telFixo, int telCel
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        Date date1 = formato.parse("25/03/2015");
        
        
        Date date2 = formato.parse("23/02/2015"); 
        Date date3 = formato.parse("22/03/2015");
        
        ArrayList<Date> date = new ArrayList();
        date.add(date1);
        date.add(date2);
        date.add(date3);
        
        Procedimento p = new Procedimento("x", 10);
        
        ArrayList<Procedimento> proAuxiliar = new ArrayList();
        proAuxiliar.add(p);
        
        Material m = new Material("Faca", 10, 50);
        
        ArrayList<Material> matAuxiliar = new ArrayList();
        matAuxiliar.add(m);

        //Esses objetos foram criados, para que eu pudesse acessar os metodos que condizem com as operações 
        //do banco de dados, sem acessar o banco diretamente, e sim, os acessando com os métodos das classes.
        Dados bd = new Dados();   

        Dentista dAuxiliar = new Dentista(1, "railson", "a", "Can", "Par", "1515", "1212", "Dentista", new Date(), "a@a", 1515, 2020, "1212", 3000, new Date(), date);
        Paciente pAuxiliar = new Paciente(1, "tiago", "as", "as", "as","mg","123","123",12,122,new Date(),proAuxiliar);
        Assistente aAuxiliar = new Assistente(1, "railson", "a", "Can", "Par", "1515", "1212", "Dentista", new Date(), "a@a", 1515, 2020, "1212", 3000, new Date());
        Secretaria sAuxiliar = new Secretaria(1, "bruna", "a", "Can", "Par", "1515", "1212", "Dentista", new Date(), "a@a", 1515, 2020, "1212", 3000, new Date());
        Fornecedor fAuxiliar = new Fornecedor(1, "breno", "gudan", 121, "ka23", "as23", "asad2323", matAuxiliar);
        
        frmLogin Login = new frmLogin();
        Login.atualizarDados(bd, dAuxiliar, pAuxiliar, aAuxiliar,sAuxiliar, fAuxiliar);
        Login.setLocationRelativeTo(null);//Coloca o formulário no centro da janela
        Login.setVisible(true);//Deixa visivel o formulário
        
    }
    
}
