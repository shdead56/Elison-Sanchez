/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author EPIS
 */
public class SistemaAcademico extends javax.swing.JFrame {

    /**
     * Creates new form SistemaAcademico
     */
    public SistemaAcademico() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menAlumno = new javax.swing.JMenuItem();
        menDocente = new javax.swing.JMenuItem();
        menAsignatura = new javax.swing.JMenuItem();
        menEscuela = new javax.swing.JMenuItem();
        menAmbiente = new javax.swing.JMenuItem();
        menNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaptionText);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_END);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("SISTEMA ACADEMICO");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        jMenu3.setText("Opciones");

        menAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alum.png"))); // NOI18N
        menAlumno.setText("Alumno");
        menAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAlumnoActionPerformed(evt);
            }
        });
        jMenu3.add(menAlumno);

        menDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/docent.jpg"))); // NOI18N
        menDocente.setText("Docente");
        menDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menDocenteActionPerformed(evt);
            }
        });
        jMenu3.add(menDocente);

        menAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/asig.png"))); // NOI18N
        menAsignatura.setText("Asignatura");
        menAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAsignaturaActionPerformed(evt);
            }
        });
        jMenu3.add(menAsignatura);

        menEscuela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escuela.jpg"))); // NOI18N
        menEscuela.setText("Escuela");
        menEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menEscuelaActionPerformed(evt);
            }
        });
        jMenu3.add(menEscuela);

        menAmbiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ambien.jpg"))); // NOI18N
        menAmbiente.setText("Ambiente");
        menAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menAmbienteActionPerformed(evt);
            }
        });
        jMenu3.add(menAmbiente);

        menNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/not.jpg"))); // NOI18N
        menNotas.setText("Notas");
        menNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menNotasActionPerformed(evt);
            }
        });
        jMenu3.add(menNotas);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("SALIR");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu4.add(Salir);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAlumnoActionPerformed
       frmAlumno frm= new frmAlumno();
       frm.setVisible(true);
       frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menAlumnoActionPerformed

    private void menDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menDocenteActionPerformed
        frmDocente frm= new frmDocente();
       frm.setVisible(true);
       frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menDocenteActionPerformed

    private void menAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAsignaturaActionPerformed
        frmAsignatura frm= new frmAsignatura();
       frm.setVisible(true);
       frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menAsignaturaActionPerformed

    private void menEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menEscuelaActionPerformed
        frmEscuela frm= new frmEscuela();
       frm.setVisible(true);
       frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menEscuelaActionPerformed

    private void menAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menAmbienteActionPerformed
      frmAmbiente frm= new frmAmbiente();
       frm.setVisible(true);
       frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menAmbienteActionPerformed

    private void menNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menNotasActionPerformed
        frmNotas frm= new frmNotas();
        frm.setVisible(true);
        frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menNotasActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemaAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaAcademico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaAcademico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JMenuItem menAlumno;
    private javax.swing.JMenuItem menAmbiente;
    private javax.swing.JMenuItem menAsignatura;
    private javax.swing.JMenuItem menDocente;
    private javax.swing.JMenuItem menEscuela;
    private javax.swing.JMenuItem menNotas;
    // End of variables declaration//GEN-END:variables
}
