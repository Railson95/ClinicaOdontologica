/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBdados;

import Classes.Assistente;
import Classes.Dentista;
import Classes.Fornecedor;
import Classes.Funcionario;
import Classes.Material;
import Classes.Paciente;
import Classes.Procedimento;
import Classes.Secretaria;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rails
 */
public class Dados {
    
    ArrayList<Dentista> d = new ArrayList();
    ArrayList<Paciente> p = new ArrayList();
    ArrayList<Assistente> a = new ArrayList();
    ArrayList<Secretaria> s = new ArrayList();
    ArrayList<Fornecedor> f = new ArrayList();
    
    
    public Dados() throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        Date date1 = formato.parse("25/03/2015");
        Date date2 = formato.parse("23/02/2015"); 
        Date date3 = formato.parse("22/03/2015");

        ArrayList<Date> date = new ArrayList();
        date.add(date1);
        date.add(date2);
        date.add(date3);
        
        
        d.add(new Dentista(1, "railson", "a", "Can", "Par", "1515", "1212", "Dentista", new Date(), "a@a", 1515, 2020, "1212", 3000, new Date(), date));
        a.add(new Assistente(1, "douglas", "a", "Can", "Par", "1515", "1212", "Assistente", new Date(), "a@a", 1515, 2020, "1212", 3000, new Date()));
        s.add(new Secretaria(1, "bruna", "a", "Can", "Par", "1515", "1212", "Assistente", new Date(), "a@a", 1515, 2020, "1212", 3000, new Date()));
    }
    
    //Funcionarios
    public boolean validaFuncionario(String nome, String senha){
        boolean flag = false;
        //verifica dentistas
        for(int i = 0; i < d.size(); i++){
            if(d.get(i).getNome().equals(nome) && d.get(i).getSenha().equals(senha)){
                flag = true;
            }
        }
        
        //verifica assistente
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).getNome().equals(nome) && a.get(i).getSenha().equals(senha)){
                flag = true;
            }
        }
        
        //verifica secretaria
        for(int i = 0; i < s.size(); i++){
            if(s.get(i).getNome().equals(nome) && s.get(i).getSenha().equals(senha)){
                flag = true;
            }
        }
       
        
        return flag;
    }
    
    
    //Dentista
    //verifica se dentista existe pelo id
    public boolean verificaSeDentistaExiste(int id){
        boolean flag = false;
        
        for(int i = 0; i < d.size(); i++){
            if(d.get(i).getId() == id){
                flag = true;
            }
        }
        
        return flag;
      
    }
    
    public void cadastraDentista(Dentista d1){
        d.add(d1);  
    }
    
    public void inserirDataDentista(Date data, int pos){
        d.get(pos).setDataConsulta(data);
    }
    
    public int retornaIndiceUltimoCadastro(){
        return d.size() - 1;
    }
    
    public ArrayList<Dentista> getDentistas(){
        
        return d;
    }
    
    public void editarDentista(int pos, Dentista x){
        d.add(pos, x);
    }
    
    public void removerDentista(int pos){
        d.remove(pos);
    }
    
    public int retornaPosDentista(int id){
        int pos = 0;
        
        for(int i = 0; i < d.size(); i++){
            if(d.get(i).getId() == id){
                pos = i;
            }
        }
        
        return pos;
    }
    
    
    //Paciente
      public boolean verificaSePacienteExiste(int id){
        boolean flag = false;
        
        if(p.size() == 0){
            return false;
        }
        
        for(int i = 0; i < p.size(); i++){
            if(p.get(i).getId() == id){
                flag = true;
            }
        }
        
        return flag;
      
    }
      
    public void cadastraParciente(Paciente p){
        this.p.add(p);  
    }
    
    public boolean verificaSeDataEstaOcupada(Date data){
        boolean flag = false;
        boolean inserirData = true;

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formato.format(data);

        //System.out.println("tam Data consulta: " + d.get(0).getDataConsulta().size());
        
        System.out.println("Qtd dentista: " + d.size());
        
        for(int i = 0; i < d.size(); i++){
            
            //trata a excessão, caso tenha mais de um dentista no banco de dados
            try{
               d.get(i).getDataConsulta().isEmpty(); 
            }catch(NullPointerException e){
               System.out.println("A data do próximo dentista esta nula, logo tem-se que tratar a exceção, inserindo a data");
               d.get(i).setDataConsulta(data);
               return false;
            }

            if (d.get(i).getDataConsulta().size() <= 4) {
                //verifica se data existe no banco de dados, se existir, pede pro usuario digitar outra data
                for (int j = 0; j < d.get(i).getDataConsulta().size(); j++) {
                    if (dataFormatada.equals(formato.format(d.get(i).getDataConsulta().get(j)))) {
                        inserirData = false;
                        flag = true;
                        //return flag;
                    }
                }

                if (inserirData) {
                    System.out.println("Entrou aq!");
                    inserirDataDentista(data, i);
                    //inserirData2 = true;
                    return flag;
                } 
            } else {
                
                if(d.size() == 1){
                    System.out.println("Não há mais datas para preencher.");
                    //return false;

                }
            }
 
        }

        return flag;
    }
    
    /*
    public boolean verificaSeDataEstaOcupada(Date data){
       
        //d.get(2).setDataConsulta(data);
        int x = 0;
        for(int i = 0; i < d.size(); i++){
            
            try{
               d.get(i).getDataConsulta().isEmpty(); 
            }catch(NullPointerException e){
               System.out.println("A data do próximo dentista esta nula, logo tem-se que tratar a exceção, inserindo a data");
               d.get(i).setDataConsulta(data);
               return false;
            }
            
            System.out.println("Esta vazio? " + d.get(i).getDataConsulta().isEmpty());

            System.out.println("qtd paciente dentista:  "+ i + ": " + d.get(i).getDataConsulta().size());

            if(d.get(i).getDataConsulta().size() <= 3){
               System.out.println("Entrou aq! ");
               d.get(i).setDataConsulta(data);
               return false;
            }
  
        }
        
        //System.out.println("Data inserida: " + d.get(2).getDataConsulta().isEmpty());
        
        return false;
        
    }
*/
    
    public String removerPaciente(int pos){
        
        if(p.size() == 0){
            return "Banco de paciente vazio";
        }
        
        p.remove(pos);
        return "Paciente removido com sucesso";
    }
    
    public int retornaPosPaciente(int id){
        int pos = 0;

        for(int i = 0; i < p.size(); i++){
            if(p.get(i).getId() == id){
                pos = i;
            }
        }
        
        return pos;
    }
    
    public void editarPaciente(int pos, Paciente x){
        p.add(pos, x);
    }
    
    public int retornaIndiceUltimoCadastroPaciente(){
        return p.size() - 1;
    }
    
    public ArrayList<Paciente> getPacientes(){
        
        return p;
    }
    
    public ArrayList<Procedimento> getProcedimentos(int indice){
        
        return p.get(indice).getProcedimento();
    }
    
    //Assistente
      public boolean verificaSeAssistenteExiste(int id){
        boolean flag = false;
        
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).getId() == id){
                flag = true;
            }
        }
        
        return flag;
      
    }
    
    public void cadastraAssistente(Assistente d1){
        a.add(d1);  
    }
    
    public int retornaIndiceUltimoCadastroAssistente(){
        return a.size() - 1;
    }
    
    public ArrayList<Assistente> getAssistentes(){
        
        return a;
    }
    
    public void editarAssistente(int pos, Assistente x){
        a.add(pos, x);
    }
    
    public void removerAssistente(int pos){
        a.remove(pos);
    }
    
    public int retornaPosAssistente(int id){
        int pos = 0;
        
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).getId() == id){
                pos = i;
            }
        }
        
        return pos;
    }
    
    
    //Secretaria
    public boolean verificaSeSecretariaExiste(int id){
        boolean flag = false;
        
        for(int i = 0; i < s.size(); i++){
            if(s.get(i).getId() == id){
                flag = true;
            }
        }
        
        return flag;
      
    }
    
    public void cadastraSecretaria(Secretaria d1){
        s.add(d1);  
    }
    
    public int retornaIndiceUltimoCadastroSecretaria(){
        return s.size() - 1;
    }
    
    public ArrayList<Secretaria> getSecretarias(){
        
        return s;
    }
    
    public void editarSecretaria(int pos, Secretaria x){
        s.add(pos, x);
    }
    
    public void removerSecretaria(int pos){
        s.remove(pos);
    }
    
    public int retornaPosSecretaria(int id){
        int pos = 0;
        
        for(int i = 0; i < s.size(); i++){
            if(s.get(i).getId() == id){
                pos = i;
            }
        }
        
        return pos;
    }
    
    //Fornecedor
    public boolean verificaSeFornecedorExiste(int id){
        boolean flag = false;
        
        for(int i = 0; i < f.size(); i++){
            if(f.get(i).getId() == id){
                flag = true;
            }
        }
        
        return flag;
      
    }
    
    public void cadastraFornecedor(Fornecedor d1){
        f.add(d1);  
    }
    
    public int retornaIndiceUltimoCadastroFornecedor(){
        return f.size() - 1;
    }
    
    public ArrayList<Fornecedor> getFornecedores(){
        
        return f;
    }
    
    public void editarFornecedor(int pos, Fornecedor x){
        f.add(pos, x);
    }
    
    public void removerFornecedor(int pos){
        f.remove(pos);
    }
    
    public int retornaPosFornecedor(int id){
        int pos = 0;
        
        for(int i = 0; i < f.size(); i++){
            if(f.get(i).getId() == id){
                pos = i;
            }
        }
        
        return pos;
    }
    
     public ArrayList<Material> getMateriais(int indice){
        
        return f.get(indice).getMaterial();
    }
    
    
    
}
