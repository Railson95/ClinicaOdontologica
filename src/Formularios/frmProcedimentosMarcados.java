/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Dentista;
import Classes.Paciente;
import DBdados.Dados;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rails
 */
public class frmProcedimentosMarcados extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmProcedimentosMarcados
     */
    
    private Dados bd;
    private DefaultTableModel Usertable; 
    
    public void atualizarDados(Dados bd,Dentista den,Paciente pAuxiliar){
       this.bd = bd;
    }
    
    public frmProcedimentosMarcados() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Mtable = new javax.swing.JTable();
        cmdvisualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Procedimentos marcados");

        Mtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Mtable);

        cmdvisualizar.setText("Ver");
        cmdvisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdvisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cmdvisualizar)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(cmdvisualizar)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdvisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdvisualizarActionPerformed
       CarregarTable();
    }//GEN-LAST:event_cmdvisualizarActionPerformed
    
    private void CarregarTable(){
       String titulocabecalho[] = {"cod Paciente","nome", "Procedimento", "Valor"};
       String RegCadastro[] = new String[4];
       Usertable = new DefaultTableModel(null, titulocabecalho);
       
        for (int i = 0; i < bd.getPacientes().size(); i++) {
            for(int j = 0; j < bd.getProcedimentos(i).size(); j++){
                RegCadastro[0] = Integer.toString(bd.getPacientes().get(i).getId());
                RegCadastro[1] = bd.getPacientes().get(i).getNome();
                RegCadastro[2] = bd.getPacientes().get(i).getProcedimento().get(j).getNomeProcedimento();
                RegCadastro[3] = Float.toString(bd.getPacientes().get(i).getProcedimento().get(j).getValorProcedimento());
                Usertable.addRow(RegCadastro);
            }

        }
       
       Mtable.setModel(Usertable);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mtable;
    private javax.swing.JButton cmdvisualizar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
