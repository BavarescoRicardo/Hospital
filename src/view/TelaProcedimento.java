/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ProcedimentoDao;
import dao.FuncionarioDao;
import dao.MedicamentoDao;
import dao.ProntuarioDao;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Procedimento;
import modelo.Funcionario;
import modelo.Medicamento;
import modelo.Prontuario;

/**
 *
 * @author blank
 */
public class TelaProcedimento extends javax.swing.JInternalFrame {

    private JDesktopPane painel;
      
      
    public TelaProcedimento() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dataFim = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dataInicio1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldObservacao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDescricao1 = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnMedicamento = new javax.swing.JButton();
        jLabelMedicamento = new javax.swing.JLabel();
        btnFuncionario = new javax.swing.JButton();
        lblfuncionario = new javax.swing.JLabel();
        btnProntuario = new javax.swing.JButton();
        lblProntuario = new javax.swing.JLabel();
        lblIdMedicamento = new javax.swing.JLabel();
        lblIdProntuario = new javax.swing.JLabel();
        lblIdFuncionario = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Procedimento");

        jLabel2.setText("Data Inicial");

        jLabel3.setText("Data Final");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Descrição");

        jTextFieldObservacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldObservacaoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Observação");

        jTextFieldDescricao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricao1ActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnMedicamento.setText("Seleciona Medicamento");
        btnMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicamentoActionPerformed(evt);
            }
        });

        jLabelMedicamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMedicamento.setText("Nenhum medicamento selecionado");

        btnFuncionario.setText("Seleciona Funcionário");
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });

        lblfuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfuncionario.setText("Nenhum funcionario selecionado");

        btnProntuario.setText("Seleciona Protuário");
        btnProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProntuarioActionPerformed(evt);
            }
        });

        lblProntuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProntuario.setText("Nenhum prontuário foi selecionado");

        lblIdMedicamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIdMedicamento.setText("0");

        lblIdProntuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIdProntuario.setText("0");

        lblIdFuncionario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIdFuncionario.setText("0");

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDescricao1)
                            .addComponent(jTextFieldObservacao)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dataInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblfuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(btnProntuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblIdMedicamento)
                                            .addComponent(lblIdProntuario)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblIdFuncionario)
                                        .addGap(1, 1, 1)))
                                .addGap(33, 33, 33)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdFuncionario))
                .addGap(18, 18, 18)
                .addComponent(btnProntuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProntuario, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(lblIdProntuario))
                .addGap(18, 18, 18)
                .addComponent(btnMedicamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdMedicamento))
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInserir, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

     public void defineProntuario(String dataEntrada, String idProntuario){
        lblProntuario.setText(dataEntrada);
        lblIdProntuario.setText(idProntuario);
    }
    
    public void defineMedicamento(String medicamento, String idMedicamento){
        jLabelMedicamento.setText(medicamento);
        lblIdMedicamento.setText(idMedicamento);
    }
      
    public void setLbPfuncionario(String lbText) {
        this.lblfuncionario.setText(lbText);
    }
    
     public void setLbIdFuncionario(String idPaciente){
        lblIdFuncionario.setText(idPaciente);
    }
    
    private void jTextFieldObservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldObservacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldObservacaoActionPerformed

    private void jTextFieldDescricao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricao1ActionPerformed

    private void btnProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProntuarioActionPerformed
        
        TelaListarPacient telaPaciente = new TelaListarPacient();
        telaPaciente.setVisible(true);
        telaPaciente.mudarNomeBtn();
        telaPaciente.setPainel(painel);
       
        telaPaciente.setProcedimento(true);
        telaPaciente.setTelaProcedimento(this);
        telaPaciente.setLocation(painel.getWidth() / 2 - telaPaciente.getWidth() / 2,
        painel.getHeight() / 2 - telaPaciente.getHeight() / 2);
        painel.add(telaPaciente);        
    }//GEN-LAST:event_btnProntuarioActionPerformed

    private void btnMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicamentoActionPerformed
       
        TelaMedicamento telaMedicamento = new TelaMedicamento();
        telaMedicamento.setTelaProcedimento(this);
        telaMedicamento.habilitarBtn();
        telaMedicamento.setVisible(true);
        telaMedicamento.setLocation(painel.getWidth() / 2 - telaMedicamento.getWidth() / 2,
        painel.getHeight() / 2 - telaMedicamento.getHeight() / 2);
        painel.add(telaMedicamento);
    }//GEN-LAST:event_btnMedicamentoActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        TelaListarFuncionario listaFuncionario = new TelaListarFuncionario();
        listaFuncionario.setVisible(true);
        listaFuncionario.setNovoProcedimento(this);
        listaFuncionario.procedimentoBtn();
        listaFuncionario.setLocation(painel.getWidth() / 2 - listaFuncionario.getWidth() / 2,
        painel.getHeight() / 2 - listaFuncionario.getHeight() / 2);
        painel.add(listaFuncionario);
        
        
        
        
        
        
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        JOptionPane.showMessageDialog(rootPane,"Executa ate aqui  !");
        ProcedimentoDao procedientoDao = new ProcedimentoDao();
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        MedicamentoDao medicamentoDao = new MedicamentoDao();
        ProntuarioDao prontuarioDao= new ProntuarioDao();
        
        
        // conferir se todos os campos foram selecionados
        int idP = Integer.parseInt(lblIdProntuario.getText());
        int idL = Integer.parseInt(lblIdProntuario.getText());
        int idM = Integer.parseInt(lblIdMedicamento.getText());
        if ( idP  > 0 & idL > 0 && idM > 0 ){ 
            // data d entrada é a data indicada no jdateChoose
            java.sql.Date dataIni = new java.sql.Date(dataInicio1.getDate().getTime());
            java.sql.Date datafim = new java.sql.Date(dataFim.getDate().getTime());
             
             
            Funcionario funcionario = funcionarioDao.getById(idP);
            Prontuario prontuario = prontuarioDao.getById(idL);
            Medicamento medicamento = medicamentoDao.getById(idM);
            String descricao = jTextFieldDescricao1.getText();
            String observacao = jTextFieldObservacao.getText();
            
            Procedimento procedimento = new Procedimento(medicamento,prontuario,funcionario,dataIni,datafim,descricao,observacao );
           
            
            // verifica se ja existe um prontuario para o paciente escolhido
            boolean existente = false;
            int idAntigo;
            for (Procedimento p : procedientoDao.listar()){
                if (p.getFuncionario().getIdFuncionario()== idP){
                    existente = true;
                    idAntigo = p.getIdProcedimento();
                    
                    procedimento =  procedientoDao.getById(idAntigo);
                    procedimento.setMedicamento(medicamento);
                    procedimento.setProntuario(prontuario);
                    procedimento.setFuncionario(funcionario);
                    procedimento.setDataInicial(dataIni);
                    procedimento.setDataFinal(datafim);
                    procedimento.setDescricao(descricao);
                    procedimento.setObservacao(observacao);
                
                
                }
            }
            
            
            if (existente){
                procedientoDao.alterar(procedimento);
                
                JOptionPane.showMessageDialog(rootPane,"Procedimento atualizado !");
            }else{
                procedientoDao.salvar(procedimento);
                
                JOptionPane.showMessageDialog(rootPane,"Novo procedimento salvo !");
            }
            
            
        }else
            JOptionPane.showMessageDialog(rootPane, "Selecione todos os campos !!");
        
        
    }//GEN-LAST:event_btnInserirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnMedicamento;
    private javax.swing.JButton btnProntuario;
    private javax.swing.JButton btnVoltar;
    private com.toedter.calendar.JDateChooser dataFim;
    private com.toedter.calendar.JDateChooser dataInicio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelMedicamento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDescricao1;
    private javax.swing.JTextField jTextFieldObservacao;
    private javax.swing.JLabel lblIdFuncionario;
    private javax.swing.JLabel lblIdMedicamento;
    private javax.swing.JLabel lblIdProntuario;
    private javax.swing.JLabel lblProntuario;
    private javax.swing.JLabel lblfuncionario;
    // End of variables declaration//GEN-END:variables

      public void setPainel(JDesktopPane painel) {
        this.painel = painel;
    }


    
}
