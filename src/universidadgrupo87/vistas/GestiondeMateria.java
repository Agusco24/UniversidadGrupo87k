/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo87.vistas;

import javax.swing.JOptionPane;
import universidadgrupo87.accesoADatos.*;
import universidadgrupo87.entidades.Materia;

/**
 *
 * @author FamiliaSic
 */
public class GestiondeMateria extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestiondeMateria
     */
    private MateriaData materiaData;

    public GestiondeMateria() {
        initComponents();
        materiaData = new MateriaData();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();
        jBbuscarmateria = new javax.swing.JButton();
        jTnombre = new javax.swing.JTextField();
        jTanio = new javax.swing.JTextField();
        jBnuevamateria = new javax.swing.JButton();
        jBeliminarmateria = new javax.swing.JButton();
        jBguardarmateria = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jRestado = new javax.swing.JRadioButton();

        jDesktopPane1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));

        jLabel1.setText("Materia");

        jLabel2.setText("Código:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Año:");

        jLabel5.setText("Estado:");

        jBbuscarmateria.setText("Buscar");
        jBbuscarmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarmateriaActionPerformed(evt);
            }
        });

        jBnuevamateria.setText("Nuevo");
        jBnuevamateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevamateriaActionPerformed(evt);
            }
        });

        jBeliminarmateria.setText("Eliminar");
        jBeliminarmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarmateriaActionPerformed(evt);
            }
        });

        jBguardarmateria.setText("Guardar");
        jBguardarmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarmateriaActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTcodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBbuscarmateria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTanio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBnuevamateria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBeliminarmateria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBguardarmateria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBsalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jRestado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(28, 28, 28)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jTnombre)
                                .addGap(28, 28, 28))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(jBbuscarmateria)
                                .addGap(20, 20, 20))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTanio, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRestado))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jBnuevamateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBeliminarmateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBguardarmateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscarmateria))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBnuevamateria)
                            .addComponent(jBeliminarmateria)
                            .addComponent(jBguardarmateria)
                            .addComponent(jBsalir)))
                    .addComponent(jRestado))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBbuscarmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarmateriaActionPerformed
        int id = Integer.parseInt(jTcodigo.getText());
        Materia materia = materiaData.buscarMateria(id);
        if (materia != null) {
            jTcodigo.setText(materia.getIdMateria() + "");
            jTanio.setText(materia.getAnioMateria() + "");
            jTnombre.setText(materia.getNombre());
            jRestado.setSelected(materia.isActivo());
        } else {
            JOptionPane.showMessageDialog(null, "La materia no existe en la base de datos");
        }


    }//GEN-LAST:event_jBbuscarmateriaActionPerformed

    private void jBguardarmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarmateriaActionPerformed
        MateriaData matData = new MateriaData();

        int codigo = Integer.parseInt(jTcodigo.getText());
        Materia mat = matData.buscarMateria(codigo);

        int AnioMateria = Integer.parseInt(jTanio.getText());
        String nombre = jTnombre.getText();
        boolean Activo = jRestado.isSelected();
        Materia materia = new Materia(nombre, AnioMateria, Activo);
        if (mat == null) {
            matData.guardarMateria(materia);

        } else {
            matData.modificarMateria(materia);
        }

        borrarCampos();

        // TODO add your handling code here:
    }//GEN-LAST:event_jBguardarmateriaActionPerformed

    private void jBeliminarmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarmateriaActionPerformed
        int id = Integer.parseInt(jTcodigo.getText());
        materiaData.eliminarMateria(id);
        jRestado.setText("Inactiva");

// TODO add your handling code here:
    }//GEN-LAST:event_jBeliminarmateriaActionPerformed

    private void jBnuevamateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevamateriaActionPerformed
        borrarCampos();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBnuevamateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarmateria;
    private javax.swing.JButton jBeliminarmateria;
    private javax.swing.JButton jBguardarmateria;
    private javax.swing.JButton jBnuevamateria;
    private javax.swing.JButton jBsalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JTextField jTanio;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables

    private void borrarCampos() {

        jRestado.setSelected(false);
        jTanio.setText("");
        jTcodigo.setText("");
        jTnombre.setText("");
    }
}
