/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Secretaria;
import Classes.Dentista;
import DBdados.Dados;

/**
 *
 * @author rails
 */
public class frmContasAPagarSecretaria extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmContasAPagar
     */
    
    
    private Dados bd;
    private Secretaria aAuxiliar;
    private int contadorSecretaria = 0;
    
    
    public void atualizarDados(Dados bd, Secretaria aAuxiliar){
        this.bd = bd;
        this.aAuxiliar = aAuxiliar;
    }
    public frmContasAPagarSecretaria() {
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

        jdadatapagamento = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtvalorpagamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txttotalpagar = new javax.swing.JTextField();
        cmdvizualizar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Contas a pagar:");
        setToolTipText("");

        jLabel3.setText("Valor do Pagamento:");

        jLabel4.setText("Total a Pagar:");

        jLabel1.setText("id:");

        cmdvizualizar.setText("ver");
        cmdvizualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdvizualizarActionPerformed(evt);
            }
        });

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jLabel2.setText("Data do Pagamento:");

        jLabel5.setText("Nome:");

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdvizualizar)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdadatapagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtvalorpagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttotalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jdadatapagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtvalorpagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttotalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(cmdvizualizar)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdvizualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdvizualizarActionPerformed

        if(contadorSecretaria > bd.retornaIndiceUltimoCadastroSecretaria()){
            contadorSecretaria--;
        }
        
        vizualizarContasSecretaria(contadorSecretaria);
        contadorSecretaria++;
        
    }//GEN-LAST:event_cmdvizualizarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    public void vizualizarContasSecretaria(int indice){
           
        //mostrar contas dentistas   
        txtid.setText(Integer.toString(bd.getSecretarias().get(indice).getId()));
        txtnome.setText(bd.getSecretarias().get(indice).getNome());
        jdadatapagamento.setDate(bd.getSecretarias().get(indice).getDataPagamento());
        txtvalorpagamento.setText(Double.toString(bd.getSecretarias().get(indice).getSalario()));
        
        double totalpagamento = 0;
        
        for(int i = 0; i < bd.getSecretarias().size(); i++){
            totalpagamento = totalpagamento + bd.getSecretarias().get(i).getSalario();
        }
        
        txttotalpagar.setText(String.valueOf(totalpagamento));
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdvizualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.toedter.calendar.JDateChooser jdadatapagamento;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txttotalpagar;
    private javax.swing.JTextField txtvalorpagamento;
    // End of variables declaration//GEN-END:variables
}
