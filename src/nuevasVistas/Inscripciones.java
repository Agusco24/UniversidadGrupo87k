/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevasVistas;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import universidadgrupo87.accesoADatos.AlumnoData;
import universidadgrupo87.accesoADatos.InscripcionData;
import universidadgrupo87.accesoADatos.MateriaData;
import universidadgrupo87.entidades.Alumno;
import universidadgrupo87.entidades.Inscripcion;
import universidadgrupo87.entidades.Materia;

/**
 *
 * @author FamiliaSic
 */
public class Inscripciones extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private boolean validarBorrar = false;

    /**
     * Creates new form Inscripciones
     */
    public Inscripciones() {
        initComponents();
        llenarCombo();
        agruparJRB();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jrbNoCursadas = new javax.swing.JRadioButton();
        jrbCursadas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.inactiveBackground"));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FORMULARIO DE INSCRIPCIÓN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setAlignmentX(10.0F);
        jPanel1.setAlignmentY(10.0F);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("SELECCIONE UN ALUMNO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });
        jPanel1.add(jcbAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 290, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE MATERIAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrbNoCursadas.setText("Materias no inscriptas");
        jrbNoCursadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoCursadasActionPerformed(evt);
            }
        });
        jPanel2.add(jrbNoCursadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        jrbCursadas.setText("Materias inscriptas");
        jrbCursadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCursadasActionPerformed(evt);
            }
        });
        jPanel2.add(jrbCursadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ));
        jtMaterias.setEnabled(false);
        jScrollPane1.setViewportView(jtMaterias);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 690, 150));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel2.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });
        jPanel2.add(jbInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        jbAnular.setText("Anular inscripción");
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });
        jPanel2.add(jbAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 710, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        // TODO add your handling code here:
        recuperarAlumno();
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jrbCursadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCursadasActionPerformed
        // TODO add your handling code here:
        recuperarAlumno();
    }//GEN-LAST:event_jrbCursadasActionPerformed

    private void jrbNoCursadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoCursadasActionPerformed
        // TODO add your handling code here:
        recuperarAlumno();
    }//GEN-LAST:event_jrbNoCursadasActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // TODO add your handling code here:
        InscripcionData insData = new InscripcionData();
        MateriaData matData = new MateriaData();
        
        Alumno alum = new Alumno();
        Materia mat = new Materia();
        
        
        int fila = jtMaterias.getSelectedRow();
        int idMateriaTabla = (int) jtMaterias.getValueAt(fila, 0);
  
        alum = (Alumno) jcbAlumnos.getSelectedItem();
        mat = matData.buscarMateria(idMateriaTabla);
        
        Inscripcion ins = new Inscripcion(alum, mat, 0);
        insData.guardarInscripcion(ins);
        
        recuperarAlumno();
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        // TODO add your handling code here:
        Alumno alum = new Alumno();
        InscripcionData insData = new InscripcionData();
       
        
        int fila = jtMaterias.getSelectedRow();
        int idMateriaTabla = (int) jtMaterias.getValueAt(fila, 0);
        alum = (Alumno) jcbAlumnos.getSelectedItem();
        insData.borrarInscripcion(alum.getIdAlumno(), idMateriaTabla);
        recuperarAlumno();
    }//GEN-LAST:event_jbAnularActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JRadioButton jrbCursadas;
    private javax.swing.JRadioButton jrbNoCursadas;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables
  private void llenarCombo() {
        AlumnoData alum = new AlumnoData();
        ArrayList<Alumno> alumnos = (ArrayList<Alumno>) alum.listarAlumnos();

        jcbAlumnos.removeAllItems();
        for (Alumno alumno : alumnos) {
            jcbAlumnos.addItem(alumno);
        }
    }

    private void agruparJRB() {

        ButtonGroup botones = new ButtonGroup();
        botones.add(jrbCursadas);
        botones.add(jrbNoCursadas);

    }

    private void armarCabecera() {
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jtMaterias.setModel(modelo);
    }

    public void recuperarAlumno() {
        ArrayList<Materia> materias = new ArrayList<>();
        Alumno alum = (Alumno) jcbAlumnos.getSelectedItem();
        InscripcionData ins = new InscripcionData();

        if (jrbCursadas.isSelected()) {
            materias = (ArrayList<Materia>) ins.obtenerMateriasCursadas(alum.getIdAlumno());
            jbAnular.setEnabled(true);
            jbInscribir.setEnabled(false);
        } else {
            materias = (ArrayList<Materia>) ins.obetenerMateriasNoCursadas(alum.getIdAlumno());
            jbAnular.setEnabled(false);
            jbInscribir.setEnabled(true);
        }
        if (validarBorrar) {
            borrarFilas();
        }

        for (Materia materia : materias) {

            modelo.addRow(new Object[]{
                materia.getIdMateria(),
                materia.getNombre(),
                materia.getAnioMateria()});
        }
        validarBorrar = true;

    }

    private void borrarFilas() {
        int filas = jtMaterias.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

}
