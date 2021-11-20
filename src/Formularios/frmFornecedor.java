/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Fornecedor;
import Classes.Material;
import Classes.Paciente;
import DBdados.Dados;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author rails
 */
public class frmFornecedor extends javax.swing.JInternalFrame {
    private Dados bd;
    private Fornecedor  fo;
    private int FornecedorAtual = 0;
    private boolean alterarFornecedor = false;
    private Paciente pAuxuliar;
    private frmFornecedor forn;
    private ArrayList<Material> mat;
        
    public void atualizarDados(Dados bd, Fornecedor fo, Paciente pAuxiliar){
        this.bd = bd;
        this.fo =  fo;
        this.pAuxuliar = pAuxiliar;
    }
    
    public void enviarFormularioFornecedor(frmFornecedor f){
        this.forn = f;
    }
    
    public void enviarDadosFornecedor(ArrayList<Material> m){
        this.mat = m;
    }
    
   
    public frmFornecedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtempresa = new javax.swing.JTextField();
        txtrg = new javax.swing.JTextField();
        txtcpf = new javax.swing.JTextField();
        txtpix = new javax.swing.JTextField();
        txttelcel = new javax.swing.JTextField();
        cmdsalvar = new javax.swing.JButton();
        cmdanterior = new javax.swing.JButton();
        cmdprimeiro = new javax.swing.JButton();
        cmdultimo = new javax.swing.JButton();
        cmdproximo = new javax.swing.JButton();
        cmdadicionar = new javax.swing.JButton();
        cmdalterar = new javax.swing.JButton();
        cmddeletar = new javax.swing.JButton();
        cmdcancelar = new javax.swing.JButton();
        cmdbuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmdcomprarmaterial = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Fornecedor");

        jLabel1.setText("Identificador:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Empresa:");

        jLabel6.setText("Rg:");

        jLabel7.setText("Cpf:");

        jLabel10.setText("Pix:");

        jLabel12.setText("TelCel:");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrgActionPerformed(evt);
            }
        });

        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
            }
        });

        cmdsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/script_save.png"))); // NOI18N
        cmdsalvar.setToolTipText("salvar");
        cmdsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsalvarActionPerformed(evt);
            }
        });

        cmdanterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Proximo.png"))); // NOI18N
        cmdanterior.setToolTipText("anterior");
        cmdanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdanteriorActionPerformed(evt);
            }
        });

        cmdprimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Primeiro.png"))); // NOI18N
        cmdprimeiro.setToolTipText("primeiro");
        cmdprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdprimeiroActionPerformed(evt);
            }
        });

        cmdultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ultimo.png"))); // NOI18N
        cmdultimo.setToolTipText("ultimo");
        cmdultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdultimoActionPerformed(evt);
            }
        });

        cmdproximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Anterior.png"))); // NOI18N
        cmdproximo.setToolTipText("proximo");
        cmdproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdproximoActionPerformed(evt);
            }
        });

        cmdadicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_add.png"))); // NOI18N
        cmdadicionar.setToolTipText("adicionar");
        cmdadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdadicionarActionPerformed(evt);
            }
        });

        cmdalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_edit.png"))); // NOI18N
        cmdalterar.setToolTipText("editar");
        cmdalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdalterarActionPerformed(evt);
            }
        });

        cmddeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_delete.png"))); // NOI18N
        cmddeletar.setToolTipText("excluir");
        cmddeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmddeletarActionPerformed(evt);
            }
        });

        cmdcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        cmdcancelar.setToolTipText("cancelar");
        cmdcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancelarActionPerformed(evt);
            }
        });

        cmdbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/find.png"))); // NOI18N
        cmdbuscar.setToolTipText("pesquisar");
        cmdbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdbuscarActionPerformed(evt);
            }
        });

        jLabel4.setText("Material:");

        cmdcomprarmaterial.setText("Comprar");
        cmdcomprarmaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcomprarmaterialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcpf)
                            .addComponent(txtempresa)
                            .addComponent(txtnome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 174, Short.MAX_VALUE))
                            .addComponent(txtrg, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel10)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txttelcel, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                .addComponent(txtpix))
                            .addComponent(cmdcomprarmaterial))
                        .addGap(158, 158, 158))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdproximo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(cmdadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmddeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttelcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmdcomprarmaterial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdadicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdalterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmddeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cmdsalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdcancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmdanterior, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdproximo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdultimo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmdprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void cmdsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsalvarActionPerformed
       
        //validação dos campos digitados pelo usuário
        if(txtid.getText().equals("")){
            JOptionPane.showMessageDialog((rootPane), "Favor digitar o id para realizar o cadastro");
            txtid.requestFocusInWindow();//posicionar o cursor na barra
            return;
        }
        

        if(txtnome.getText().equals("")){
            JOptionPane.showMessageDialog((rootPane), "Favor digitar o nome para realizar o cadastro");
            txtnome.requestFocusInWindow();
            return;
        }

   
        if(txtempresa.equals("")){
            JOptionPane.showMessageDialog((rootPane), "Favor digitar o endereco para realizar o cadastro");
            txtempresa.requestFocusInWindow();
            return;
        }
 
        if(txtrg.equals("")){
            JOptionPane.showMessageDialog((rootPane), "Favor digitar o rg para realizar o cadastro");
            txtrg.requestFocusInWindow();
            return;
        }
        
        if(txtcpf.equals("")){
            JOptionPane.showMessageDialog((rootPane), "Favor digitar o cpf para realizar o cadastro");
            txtcpf.requestFocusInWindow();
            return;
        }

        if(txtpix.equals("")){
            JOptionPane.showMessageDialog((rootPane), "Favor selecionar o email para realizar o cadastro");
            txtpix.requestFocusInWindow();
            return;
        }

        if(txttelcel.equals("")){
            JOptionPane.showMessageDialog((rootPane), "Favor selecionar o telefone celular para realizar o cadastro");
            txttelcel.requestFocusInWindow();
            return;
        }
        
        System.out.println("Material: " + mat.get(0).getNome());

        //Salvando Fornecedor no banco de dados

       Fornecedor d = new Fornecedor(Integer.parseInt(txtid.getText()),
                                 txtnome.getText(),
                                 txtempresa.getText(),
                                 Integer.parseInt(txttelcel.getText()),
                                 txtrg.getText(),
                                 txtcpf.getText(),
                                 txtpix.getText(),
                                 mat);
       
       
       
       
       boolean FornecedorExiste =   fo.pesquisar(Integer.parseInt(txtid.getText()), bd);
       
        if(FornecedorExiste && this.alterarFornecedor){
           this.alterarFornecedor = false;
            fo.editar(FornecedorAtual, d, bd);
           JOptionPane.showMessageDialog(rootPane, "Fornecedor editado com sucesso");
           return;
       }
       
       if(FornecedorExiste){
           JOptionPane.showMessageDialog(rootPane, "Fornecedor já cadastratdo no sistema");
           return;
       } else {
            fo.cadastrar(d, bd);
          JOptionPane.showMessageDialog(rootPane, "Fornecedor cadastratdo com sucesso");
          //return;
       }

        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdadicionar.setEnabled(true);
        cmdalterar.setEnabled(true);
        cmddeletar.setEnabled(true);
        cmdcancelar.setEnabled(true);
        cmdsalvar.setEnabled(false);
        cmdbuscar.setEnabled(true);
        txtid.setEnabled(false);
        txtnome.setEnabled(false);
        txtempresa.setEnabled(false);
        txtrg.setEnabled(false);
        txtcpf.setEnabled(false);
        txtrg.setEnabled(false);
        txtpix.setEnabled(false);
        txttelcel.setEnabled(false);
      

    }//GEN-LAST:event_cmdsalvarActionPerformed

    private void cmdadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdadicionarActionPerformed
        
        cmdprimeiro.setEnabled(false);
        cmdanterior.setEnabled(false);
        cmdproximo.setEnabled(false);
        cmdultimo.setEnabled(false);
        cmdadicionar.setEnabled(false);
        cmdalterar.setEnabled(false);
        cmddeletar.setEnabled(false);
        cmdsalvar.setEnabled(true);
        cmdcancelar.setEnabled(true);
        cmdbuscar.setEnabled(false);
        
        txtid.setEnabled(true);
        txtnome.setEnabled(true);
        txtempresa.setEnabled(true);
        txtrg.setEnabled(true);
        txtcpf.setEnabled(true);
        txtrg.setEnabled(true);
        txtpix.setEnabled(true);
        txttelcel.setEnabled(true);
        
        
        txtid.setText("");
        txtnome.setText("");

        txtpix.setText("");
        txtempresa.setText("");
        txtrg.setText("");
        txtcpf.setText("");
        txttelcel.setText("");
        
        
        //cmdnovo = true;
        txtid.requestFocusInWindow();
    }//GEN-LAST:event_cmdadicionarActionPerformed

    private void cmdcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancelarActionPerformed
        
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdadicionar.setEnabled(true);
        cmdalterar.setEnabled(true);
        cmddeletar.setEnabled(true);
        cmdsalvar.setEnabled(false);
        cmdcancelar.setEnabled(false);
        cmdbuscar.setEnabled(true);
    }//GEN-LAST:event_cmdcancelarActionPerformed

    private void cmdprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdprimeiroActionPerformed
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdadicionar.setEnabled(true);
        cmdalterar.setEnabled(true);
        cmddeletar.setEnabled(true);
        cmdsalvar.setEnabled(false);
        cmdcancelar.setEnabled(true);
        cmdbuscar.setEnabled(true);
           if(bd.getFornecedores().size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Não existe dados no banco! ");
            return;
        }
        vizualizarFornecedors(0);
        this.FornecedorAtual = 0;
        
    }//GEN-LAST:event_cmdprimeiroActionPerformed

    private void cmdultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdultimoActionPerformed
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdadicionar.setEnabled(true);
        cmdalterar.setEnabled(true);
        cmddeletar.setEnabled(true);
        cmdsalvar.setEnabled(false);
        cmdcancelar.setEnabled(true);
        cmdbuscar.setEnabled(true);
        if(bd.getFornecedores().size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Não existe dados no banco! ");
            return;
        }
        vizualizarFornecedors(bd.retornaIndiceUltimoCadastroFornecedor());
        this.FornecedorAtual = bd.retornaIndiceUltimoCadastroFornecedor();
    }//GEN-LAST:event_cmdultimoActionPerformed

    private void cmdanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdanteriorActionPerformed
        
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdadicionar.setEnabled(true);
        cmdalterar.setEnabled(true);
        cmddeletar.setEnabled(true);
        cmdsalvar.setEnabled(false);
        cmdcancelar.setEnabled(true);
        cmdbuscar.setEnabled(true);
        if(bd.getFornecedores().size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Não existe dados no banco! ");
            return;
        }
        this.FornecedorAtual = this.FornecedorAtual - 1;
        
        //Usado para mostrar os dados do Fornecedor para o usuário
        //se ao clicar no botão anterior e o Fornecedor atual valer -1 que é uma posição fora do Array
        //para não ocorrer erro, deve entrar nesse if
        if(this.FornecedorAtual < 0){
            this.FornecedorAtual = 0;
            vizualizarFornecedors(this.FornecedorAtual);
            return;
        }
        
        vizualizarFornecedors(this.FornecedorAtual);
        
    }//GEN-LAST:event_cmdanteriorActionPerformed

    private void cmdproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdproximoActionPerformed
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdadicionar.setEnabled(true);
        cmdalterar.setEnabled(true);
        cmddeletar.setEnabled(true);
        cmdsalvar.setEnabled(false);
        cmdcancelar.setEnabled(true);
        cmdbuscar.setEnabled(true);
        if(bd.getFornecedores().size() == 0){
            JOptionPane.showMessageDialog(rootPane, "Não existe dados no banco! ");
            return;
        }
        
        this.FornecedorAtual = this.FornecedorAtual + 1;
        
        //Usado para mostrar os dados do Fornecedor para o usuário
        //se ao clicar no botão proximo e o Fornecedor atual exceder o valor do array criado
        //para não ocorrer erro, deve entrar nesse if
        if(this.FornecedorAtual > bd.retornaIndiceUltimoCadastroFornecedor()){
           vizualizarFornecedors(bd.retornaIndiceUltimoCadastroFornecedor()); 
           this.FornecedorAtual = bd.retornaIndiceUltimoCadastroFornecedor();
           return;
        }
        
        vizualizarFornecedors(this.FornecedorAtual);
    }//GEN-LAST:event_cmdproximoActionPerformed

    private void cmdalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdalterarActionPerformed
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdadicionar.setEnabled(false);
        cmdalterar.setEnabled(true);
        cmddeletar.setEnabled(false);
        cmdsalvar.setEnabled(true);
        cmdcancelar.setEnabled(true);
        cmdbuscar.setEnabled(false);
        alterarFornecedor = true;
    }//GEN-LAST:event_cmdalterarActionPerformed

    private void cmddeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmddeletarActionPerformed
        fo.excluir(FornecedorAtual, bd);
        JOptionPane.showMessageDialog(rootPane, "Fornecedor excluido com sucesso");
    }//GEN-LAST:event_cmddeletarActionPerformed

    private void cmdbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdbuscarActionPerformed
        
        String codFornecedor = JOptionPane.showInputDialog("Favor digitar o código do Fornecedor: ");
        
        if(codFornecedor.equals("")){
            return;
        }
        
        boolean flag = bd.verificaSeFornecedorExiste(Integer.valueOf(codFornecedor));
        
        if(!flag){
            JOptionPane.showMessageDialog(rootPane, "Fornecedor não encontrado");
            return;
        }

        FornecedorAtual = bd.retornaPosFornecedor(Integer.valueOf(codFornecedor));
        vizualizarFornecedors(FornecedorAtual);
    }//GEN-LAST:event_cmdbuscarActionPerformed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfActionPerformed

    private void txtrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrgActionPerformed

    private void cmdcomprarmaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcomprarmaterialActionPerformed
        frmMaterial frmmaterial = new frmMaterial();
        frmmaterial.enviarFormularioFornecedor(this.forn);
        //this.setVisible(false);//fecha a tela de login e deixa apenas a de menu aberta
        //frprocedimento.atualizarDados(bd, den);
        //String usuario = txtusuario.getText();
        //clsdados.setUsuarioLogado(usuario);
        //frmprocedimento.setExtendedState(JFrame.M);//aumenta a tela para ajustar a janela
        frmmaterial.setVisible(true);
    }//GEN-LAST:event_cmdcomprarmaterialActionPerformed

    //mostra os dados do Fornecedor no formulario
    private void vizualizarFornecedors(int indice){
        txtid.setText(Integer.toString(bd.getFornecedores().get(indice).getId()));
        txtnome.setText(bd.getFornecedores().get(indice).getNome());
        txtempresa.setText(bd.getFornecedores().get(indice).getEmpresa());
        txtrg.setText(bd.getFornecedores().get(indice).getRg());
        txtcpf.setText(bd.getFornecedores().get(indice).getCpf());
        txtpix.setText(bd.getFornecedores().get(indice).getPix());
        txttelcel.setText(Integer.toString(bd.getFornecedores().get(indice).getTelCel()));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdadicionar;
    private javax.swing.JButton cmdalterar;
    private javax.swing.JButton cmdanterior;
    private javax.swing.JButton cmdbuscar;
    private javax.swing.JButton cmdcancelar;
    private javax.swing.JButton cmdcomprarmaterial;
    private javax.swing.JButton cmddeletar;
    private javax.swing.JButton cmdprimeiro;
    private javax.swing.JButton cmdproximo;
    private javax.swing.JButton cmdsalvar;
    private javax.swing.JButton cmdultimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtempresa;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpix;
    private javax.swing.JTextField txtrg;
    private javax.swing.JTextField txttelcel;
    // End of variables declaration//GEN-END:variables
}
