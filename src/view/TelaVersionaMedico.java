/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Arrays;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Medico;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.hibernate.envers.query.AuditEntity;
import org.hibernate.envers.query.AuditQuery;
import servico.Gerenciador;
import servico.RevEntity;

/**
 *
 * @author blank
 */
public class TelaVersionaMedico extends javax.swing.JInternalFrame {

    private DefaultTableModel dtm;
    private int idMed;
    private EntityManager em;
    private AuditReader reader, auditReader;

    /**
     * Creates new form TelaListarrMedico
     */
    public TelaVersionaMedico() {
        initComponents();
        dtm = (DefaultTableModel) tabela.getModel();

        em = Gerenciador.getInstancia().getEm();

    }

    private void atualizarTabela() {
        String autor = "eu";
        reader = AuditReaderFactory.get(em);
        AuditQuery q = reader.createQuery().forRevisionsOfEntity(Medico.class, true, true);
        q.add(AuditEntity.id().eq(idMed));
        List<Medico> audit = q.getResultList();

        auditReader = AuditReaderFactory.get(em);

        RevEntity cRevEntity;
        String dia = "";
        String hora = "";
        int rev = 0;

        List<Number> numeros = auditReader.getRevisions(Medico.class, idMed);
        for (Medico m : audit) {

            cRevEntity = auditReader.findRevision(RevEntity.class, numeros.get(rev));

            autor = cRevEntity.getUsername();

            hora = String.valueOf(cRevEntity.getUtilD());
            dia = hora.substring(0, 16);
            dtm.addRow(new Object[]{m.getIdMedico(), m.getNOME(), m.getCRM(), m.getCPF(), m.getEMAIL(), m.getESPECIALIDADE(), autor, dia});

            if (rev < numeros.size() - 1) {
                rev++;
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTudo = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CRM", "CPF", "Email", "Especialidade", "Autor", "Data/Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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

        jLabel1.setFont(new java.awt.Font("TlwgMono", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Auditoria");

        btnTudo.setText("Todos os objetos");
        btnTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTudoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnTudo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTudoActionPerformed
        dtm.setRowCount(0);
        
        List listaMe = AuditReaderFactory.get(em)
                                   .createQuery()
                                   .forRevisionsOfEntity(Medico.class, true, true)
                                   .getResultList();
       
        RevEntity r;
        String dia,hora;
        int tamLista;
        for (tamLista = 0; tamLista < listaMe.size(); tamLista ++){
            Medico m = (Medico) listaMe.get(tamLista);
            
            //RevEntity r = (RevEntity) listaRev.get(tamLista);
            r = auditReader.findRevision(RevEntity.class, tamLista+1);
            hora = String.valueOf(r.getUtilD());
            dia = hora.substring(0, 16);
            dtm.addRow(new Object[]{m.getIdMedico(), m.getNOME(), m.getCRM(), m.getCPF(), m.getEMAIL(), m.getESPECIALIDADE(), r.getUsername(), dia});
        }
        


    }//GEN-LAST:event_btnTudoActionPerformed

    public void setIdMed(int idMed) {
        this.idMed = idMed;
        atualizarTabela();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTudo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
