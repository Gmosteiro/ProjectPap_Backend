/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logic.Presentacion;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.Clase.Clase;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;

/**
 *
 * @author Admin
 */
public class ConsultaDictadoClase extends javax.swing.JInternalFrame {

    private ManejadorActividad manejadorActividades;
    private ManejadorInstitucion manejadorInstitucion;

    /**
     * Creates new form ConsultaDictadoClase
     */
    public ConsultaDictadoClase() {
        initComponents();
        manejadorActividades = new ManejadorActividad();
        manejadorInstitucion = new ManejadorInstitucion();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoInstitucionD = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TextoActividadD = new javax.swing.JLabel();
        jComboBoxInstitucionesDictado = new javax.swing.JComboBox<>();
        jComboBoxActividadesD = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClases = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setTitle("ConsultarDictadoClase");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        TextoInstitucionD.setText("Institucion:");

        jLabel1.setText("Clases");

        TextoActividadD.setText("Actividad");

        jComboBoxInstitucionesDictado.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxInstitucionesDictado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxInstitucionesDictadoFocusGained(evt);
            }
        });

        jComboBoxActividadesD.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxActividadesD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxActividadesDFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxActividadesDFocusLost(evt);
            }
        });

        jTableClases.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Nombre", "Fecha Inicio", "Hora Inicio", "URL"
                }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        });
        jTableClases.setName("Informacion Asociada"); // NOI18N
        jTableClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClasesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableClases);

        jButton1.setText("Consultar");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(TextoInstitucionD)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBoxInstitucionesDictado,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 201,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(TextoActividadD)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton1)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jButtonCancelar))
                                                        .addComponent(jComboBoxActividadesD,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 191,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 603,
                                                                Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                layout.createSequentialGroup()
                                                                        .addComponent(jLabel1)
                                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                .addContainerGap()))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBoxInstitucionesDictado,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextoActividadD)
                                        .addComponent(jComboBoxActividadesD, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextoInstitucionD))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jButton1)
                                        .addComponent(jButtonCancelar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        getAccessibleContext().setAccessibleName("ConsultaDictadoClase");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addInstitucionesToComboBox() {

        List<InstitucionDeportiva> instituciones = manejadorInstitucion.getInstituciones();

        jComboBoxInstitucionesDictado.removeAllItems();

        for (InstitucionDeportiva institucion : instituciones) {
            jComboBoxInstitucionesDictado.addItem(institucion.getNombre());
        }

    }

    private void ClasesDeActividad() {
        Object selectedItem = jComboBoxActividadesD.getSelectedItem();

        // Realizar acciones basadas en el elemento seleccionado
        if (selectedItem != null) {
            String actividad = selectedItem.toString();

            ActividadDeportiva actividaddeportiva = manejadorActividades.obtenerActividadPorNombre(actividad);
            List<Clase> listaClases = actividaddeportiva.getClases();

            if (!listaClases.isEmpty() && listaClases.get(0) != null) {

                DefaultTableModel tableModel = (DefaultTableModel) jTableClases.getModel();

                tableModel.setRowCount(0);

                for (Clase clase : listaClases) {
                    Object[] rowData = { clase.getNombre(), clase.getFechaFormatted(), clase.getHora(),
                            clase.getUrl() };
                    tableModel.addRow(rowData);
                }

                tableModel.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(
                        null, // Parent component (null for default)
                        "Esta Actividad no tiene clases", // Message text
                        "Warnin", // Dialog title
                        JOptionPane.INFORMATION_MESSAGE // Message type merecuetengue dijo el juan
                );
                DefaultTableModel tableModel = (DefaultTableModel) jTableClases.getModel();

                tableModel.setRowCount(0);
                tableModel.fireTableDataChanged();
            }
        }
    }

    private void addActividadesToComboBox(String institucion) {
        InstitucionDeportiva instituto = manejadorInstitucion.getInstitucionesByName(institucion);
        List<ActividadDeportiva> actividades = instituto.getActividades();

        jComboBoxActividadesD.removeAllItems();

        for (ActividadDeportiva actividad : actividades) {
            jComboBoxActividadesD.addItem(actividad.getNombre());

        }

    }

    private void jComboBoxActividadesDFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jComboBoxActividadesDFocusGained
        String current = (String) jComboBoxInstitucionesDictado.getSelectedItem();
        if (current != null) {
            addActividadesToComboBox(current);
            // ClasesDeActividad();
        }
    }// GEN-LAST:event_jComboBoxActividadesDFocusGained

    private void jComboBoxActividadesDFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jComboBoxActividadesDFocusLost
        String actividad = null;
        String current = (String) jComboBoxActividadesD.getSelectedItem();
        if (actividad != current) {
            ClasesDeActividad();
            actividad = current;
        }
    }// GEN-LAST:event_jComboBoxActividadesDFocusLost

    private void jTableClasesMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableClasesMouseClicked

    }// GEN-LAST:event_jTableClasesMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {// GEN-FIRST:event_formInternalFrameOpened
        addInstitucionesToComboBox();
    }// GEN-LAST:event_formInternalFrameOpened

    private void jComboBoxInstitucionesDictadoFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jComboBoxInstitucionesDictadoFocusGained
        String current = (String) jComboBoxInstitucionesDictado.getSelectedItem();
        if (current != null) {
            addActividadesToComboBox(current);
        }
    }// GEN-LAST:event_jComboBoxInstitucionesDictadoFocusGained

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }// GEN-LAST:event_jButtonCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextoActividadD;
    private javax.swing.JLabel TextoInstitucionD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxActividadesD;
    private javax.swing.JComboBox<String> jComboBoxInstitucionesDictado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableClases;
    // End of variables declaration//GEN-END:variables
}
