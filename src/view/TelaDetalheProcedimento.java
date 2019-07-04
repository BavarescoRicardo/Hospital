
package view;

import dao.ProntuarioDao;
import dao.ProcedimentoDao;
import javax.swing.table.DefaultTableModel;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import modelo.Procedimento;
import modelo.Prontuario;

public class TelaDetalheProcedimento extends javax.swing.JInternalFrame {

    private int idPaciente;
    private DefaultTableModel dtm;
    private ProcedimentoDao procedimentoDao = new ProcedimentoDao();
    private int idProntuario;
     private JDesktopPane painel;
      private ProntuarioDao prontuarioDao = new ProntuarioDao();
    private boolean procedimento;
    private TelaProcedimento telaProcedimento = new TelaProcedimento();
    
   
    public TelaDetalheProcedimento() {
        initComponents();
        
        dtm = (DefaultTableModel) tabela.getModel();
    }
    
    public void setProcedimento(boolean procedimento) {
        this.procedimento = procedimento;
    }

    public void setTelaProcedimento(TelaProcedimento telaProcedimento) {
    //    this.btnProcedimento.setEnabled(true);
        this.telaProcedimento = telaProcedimento;
    }
    
         public void attTabela(){
        for (Procedimento proc : procedimentoDao.listar()){
              for (Prontuario prontuario : prontuarioDao.listar()) {
                    if (prontuario.getPaciente().getIdPaciente() == idPaciente) {
                          dtm.addRow(new Object[]{proc.getIdProcedimento(),
                          proc.getDataInicial(),proc.getDataFinal(),proc.getDescricao(),proc.getObservacao(),proc.getProntuario().getPaciente().getNOME(),
                          proc.getMedicamento().getNome(),proc.getFuncionario().getNOME()});
                    }
                }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data Inicial", "Data Final", "Descrição", "Observação", "Prontuario", "Medicamento", "Funcionario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
            tabela.getColumnModel().getColumn(5).setResizable(false);
            tabela.getColumnModel().getColumn(6).setResizable(false);
            tabela.getColumnModel().getColumn(7).setResizable(false);
        }

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
  public void setPainel(JDesktopPane painel) {
        
        this.painel = painel;
    }
  
   public void setIdPaciente(int idP) {
        this.idPaciente = idP;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
