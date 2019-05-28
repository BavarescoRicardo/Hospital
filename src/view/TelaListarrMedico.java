/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.MedicoDao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Medico;

/**
 *
 * @author blank
 */
public class TelaListarrMedico extends javax.swing.JInternalFrame {
    private MedicoDao dao = new MedicoDao();
    private DefaultTableModel dtm;
    /**
     * Creates new form TelaListarrMedico
     */
    public TelaListarrMedico() {
        initComponents();
        dtm = (DefaultTableModel) tabela.getModel();
      
        
        for (Medico m : dao.listar()){
            dtm.addRow(new Object[]{m.getIdMedico(),m.getNOME(),m.getCRM(),m.getCPF(),m.getEMAIL(),m.getESPECIALIDADE()});
        }
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CRM", "CPF", "Email", "Especialidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(20);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabela.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void attLista(){
        dtm = (DefaultTableModel) tabela.getModel();
        dtm.setRowCount(0);
        
        for (Medico m : dao.listar()){
            dtm.addRow(new Object[]{m.getIdMedico(),m.getNOME(),m.getCRM(),m.getCPF(),m.getEMAIL(),m.getESPECIALIDADE()});
        }
    }
    
    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        //  conferir se uma lista esta selecionada
        if(!tabela.getSelectionModel().isSelectionEmpty()){
            // cria objeto medico
            int id = Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
            
            Medico medic;
            medic = dao.getById(id);
            // remove do bd
            dao.remove(medic);
            
            
            // mensagem de sucesso
            JOptionPane.showMessageDialog(rootPane, "Medico removido !");
            
            // atualizar lista
             attLista();
        }else{
            // mensagem de erro; ao nao selecionar a linha
            JOptionPane.showMessageDialog(rootPane, "Selecione um Medico da tabela !");
        }
        
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //  conferir se uma lista esta selecionada
        if(!tabela.getSelectionModel().isSelectionEmpty()){
            // cria objeto medico
            int id = Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
            
            Medico medic;
            medic = dao.getById(id);
            medic.setNOME(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            medic.setCRM(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            medic.setCPF(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            medic.setEMAIL(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
            medic.setESPECIALIDADE(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
            
            // altera no bd            
            
            dao.alterar(medic);
            
            
            // mensagem de sucesso
            JOptionPane.showMessageDialog(rootPane, "Medico alterado!");
            
            // atualizar lista
             attLista();
        }else{
            // mensagem de erro; ao nao selecionar a linha
            JOptionPane.showMessageDialog(rootPane, "Selecione um Medico da tabela !");
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
