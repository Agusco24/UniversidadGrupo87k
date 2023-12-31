/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevasVistas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import universidadgrupo87.accesoADatos.MateriaData;
import universidadgrupo87.entidades.Materia;

/**
 *
 * @author FamiliaSic
 */
public class GestionMateria extends javax.swing.JInternalFrame {
    
    MateriaData matData = new MateriaData();

    /**
     * Creates new form GestionMateria
     */
    public GestionMateria() {
        initComponents();
        validarBuscar();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtAnio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jrbEstado = new javax.swing.JRadioButton();
        jbBuscar = new javax.swing.JButton();

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MATERIA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(170, 450));

        jbNuevo.setText("NUEVO");
        jbNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setText("GUARDAR");
        jbGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setText("ELIMINAR");
        jbEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setText("SALIR");
        jbSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jbNuevo)
                .addGap(40, 40, 40)
                .addComponent(jbGuardar)
                .addGap(40, 40, 40)
                .addComponent(jbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(46, 46, 46))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 170, 410));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CÓDIGO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 50, 20));

        jtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(jtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 233, 30));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 72, 20));

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 233, 30));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("AÑO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, 20));

        jtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtAnioKeyTyped(evt);
            }
        });
        jPanel1.add(jtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 233, 30));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ESTADO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 20));
        jPanel1.add(jrbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, 30));

        jbBuscar.setText("BUSCAR");
        jbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jtCodigo.getText());
        Materia materia = matData.buscarMateria(id);
        if (materia != null) {
            jtCodigo.setText(materia.getIdMateria() + "");
            jtAnio.setText(materia.getAnioMateria() + "");
            jtNombre.setText(materia.getNombre());
            jrbEstado.setSelected(materia.isActivo());
        } else {
            JOptionPane.showMessageDialog(null, "La materia no existe en la base de datos");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        borrarCampos();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        
        if (validarCampos()) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else {
            if (jtCodigo.getText().isEmpty()) {
                int AnioMateria = Integer.parseInt(jtAnio.getText());
                String nombre = jtNombre.getText();
                boolean Activo = jrbEstado.isSelected();
                Materia materia = new Materia(nombre, AnioMateria, Activo);
                matData.guardarMateria(materia);
                
            } else {
                int codigo = Integer.parseInt(jtCodigo.getText());
                Materia mat = matData.buscarMateria(codigo);
                if (mat != null) {
                    int AnioMateria = Integer.parseInt(jtAnio.getText());
                    String nombre = jtNombre.getText();
                    boolean Activo = jrbEstado.isSelected();
                    Materia materia = new Materia(codigo, nombre, AnioMateria, Activo);
                    matData.modificarMateria(materia);
                }
            }
            borrarCampos();
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        if (validarCampos()) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else {
            int id = Integer.parseInt(jtCodigo.getText());
            matData.eliminarMateria(id);
            jrbEstado.setText("Inactiva");
            borrarCampos();
        }

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyTyped
        // TODO add your handling code here:
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        
        if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_jtCodigoKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        // TODO add your handling code here:
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAnioKeyTyped
        // TODO add your handling code here:
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (evt.getKeyChar() == KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_jtAnioKeyTyped

    private void jtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyReleased
        // TODO add your handling code here:
        validarBuscar();
    }//GEN-LAST:event_jtCodigoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
 private void borrarCampos() {
        jrbEstado.setSelected(false);
        jtAnio.setText("");
        jtCodigo.setText("");
        jtNombre.setText("");
    }
    
    private boolean validarCampos() {
        return jtAnio.getText().isEmpty() || jtNombre.getText().isEmpty();
    }
    
    private void validarBuscar() {
        if (jtCodigo.getText().isEmpty()) {
            jbBuscar.setEnabled(false);
        } else {
            jbBuscar.setEnabled(true);
        }        
    }
    
}
