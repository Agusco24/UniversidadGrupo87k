/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevasVistas;

import javax.swing.JInternalFrame;

/**
 *
 * @author FamiliaSic
 */
public class Menuvistas extends javax.swing.JFrame {

    /**
     * Creates new form Menuvistas
     */
    public Menuvistas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMformularioalumno = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMformulariomateria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMmanejodeinscripciones = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMalumnospormateria = new javax.swing.JMenuItem();
        jMmanipulaciondenotas = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selectedButtonForeground"));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevasVistas/logo_ULP.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 230, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 770));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevasVistas/Banner 2.JPG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -10, 840, 110));

        escritorio.setBackground(java.awt.SystemColor.activeCaption);
        escritorio.setPreferredSize(new java.awt.Dimension(741, 571));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 790, 600));

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu4.setText("Alumno");

        jMformularioalumno.setText("Formulario de alumno");
        jMformularioalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMformularioalumnoActionPerformed(evt);
            }
        });
        jMenu4.add(jMformularioalumno);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Materia");

        jMformulariomateria.setText("Formulario Materia");
        jMformulariomateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMformulariomateriaActionPerformed(evt);
            }
        });
        jMenu3.add(jMformulariomateria);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Administración");

        jMmanejodeinscripciones.setText("Manejo de inscripciones");
        jMmanejodeinscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmanejodeinscripcionesActionPerformed(evt);
            }
        });
        jMenu5.add(jMmanejodeinscripciones);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Consultas");

        jMalumnospormateria.setText("Alumnos por materia");
        jMalumnospormateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMalumnospormateriaActionPerformed(evt);
            }
        });
        jMenu6.add(jMalumnospormateria);

        jMmanipulaciondenotas.setText("Manipulación de notas");
        jMmanipulaciondenotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmanipulaciondenotasActionPerformed(evt);
            }
        });
        jMenu6.add(jMmanipulaciondenotas);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMformularioalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMformularioalumnoActionPerformed
        GestionDeAlumnos gda = new GestionDeAlumnos();
        gda.setVisible(true);
        cargarPanel(gda);

// TODO add your handling code here:
    }//GEN-LAST:event_jMformularioalumnoActionPerformed

    private void jMformulariomateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMformulariomateriaActionPerformed
        GestionMateria gdm = new GestionMateria();
        gdm.setVisible(true);
        cargarPanel(gdm);

// TODO add your handling code here:
    }//GEN-LAST:event_jMformulariomateriaActionPerformed

    private void jMmanejodeinscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmanejodeinscripcionesActionPerformed
        Inscripciones ins = new Inscripciones();
        ins.setVisible(true);
        cargarPanel(ins);

// TODO add your handling code here:
    }//GEN-LAST:event_jMmanejodeinscripcionesActionPerformed

    private void jMalumnospormateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMalumnospormateriaActionPerformed
        Alumnospormateria apm = new Alumnospormateria();
        apm.setVisible(true);
        cargarPanel(apm);
    }//GEN-LAST:event_jMalumnospormateriaActionPerformed

    private void jMmanipulaciondenotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmanipulaciondenotasActionPerformed
        // TODO add your handling code here:
        Actualizaciondenotas adn = new Actualizaciondenotas();
        adn.setVisible(true);
        cargarPanel(adn);
    }//GEN-LAST:event_jMmanipulaciondenotasActionPerformed

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
            java.util.logging.Logger.getLogger(Menuvistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuvistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuvistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuvistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuvistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMalumnospormateria;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMformularioalumno;
    private javax.swing.JMenuItem jMformulariomateria;
    private javax.swing.JMenuItem jMmanejodeinscripciones;
    private javax.swing.JMenuItem jMmanipulaciondenotas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
private void cargarPanel(JInternalFrame panel) {
        escritorio.removeAll();
        escritorio.repaint();
        panel.setVisible(true);
        escritorio.add(panel);
        escritorio.moveToFront(panel);
    }

}
