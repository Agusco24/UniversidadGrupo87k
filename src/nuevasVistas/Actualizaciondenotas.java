/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevasVistas;

import java.util.ArrayList;
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
public class Actualizaciondenotas extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private boolean validarBorrar = false;

    /**
     * Creates new form Actualizaciondenotas
     */
    public Actualizaciondenotas() {
        initComponents();
        llenarCombo();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();

        jPanel1.setBackground(java.awt.Color.gray);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CARGA DE NOTAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setForeground(java.awt.Color.gray);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("SELECCIONE EL ALUMNO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });
        jPanel1.add(jcbAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 320, -1));

        jtMaterias.setBackground(new java.awt.Color(255, 255, 255));
        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtMaterias);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 690, 190));

        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 120, -1));

        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        // TODO add your handling code here:
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        Alumno alum = (Alumno) jcbAlumnos.getSelectedItem();
        InscripcionData ins = new InscripcionData();
        inscripciones = (ArrayList<Inscripcion>) ins.obtenerInscripcionesPorAlumno(alum.getIdAlumno());

        if (validarBorrar) {
            borrarFilas();
        }

        for (Inscripcion insc : inscripciones) {

            if (alum.getIdAlumno() == insc.getAlumno().getIdAlumno()) {
                modelo.addRow(new Object[]{
                    insc.getMateria().getIdMateria(),
                    insc.getMateria().getNombre(),
                    insc.getNota()});
            }
        }

        validarBorrar = true;
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        Alumno alum = new Alumno();
        Materia mat = new Materia();
        InscripcionData insc = new InscripcionData();
        MateriaData materiaData = new MateriaData();

        alum = (Alumno) jcbAlumnos.getSelectedItem();
        int fila = jtMaterias.getSelectedRow();
        int idMateriaTabla = (int) jtMaterias.getValueAt(fila, 0);
        mat = materiaData.buscarMateria(idMateriaTabla);

        double nota = Double.parseDouble(jtMaterias.getValueAt(fila, 2).toString());
        insc.guardarNota(alum.getIdAlumno(), mat.getIdMateria(), nota);
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables
private void llenarCombo() {
        Alumno a = new Alumno();
        AlumnoData alum = new AlumnoData();
        ArrayList<Alumno> alumnos = (ArrayList<Alumno>) alum.listarAlumnos();

        jcbAlumnos.removeAllItems();

        for (Alumno alumno : alumnos) {
            jcbAlumnos.addItem(alumno);
        }
    }

    private void armarCabecera() {

        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");

        jtMaterias.setModel(modelo);
        

    }

    private void borrarFilas() {
        int filas = jtMaterias.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

}
