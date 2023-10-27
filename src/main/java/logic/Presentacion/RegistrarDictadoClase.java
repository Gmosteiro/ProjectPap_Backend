/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logic.Presentacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.Clase.Clase;
import logic.Fabrica;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Usuario;
import logic.Usuario.controllers.IControllerRegistroDictado;

/**
 *
 * @author Admin
 */
public class RegistrarDictadoClase extends javax.swing.JInternalFrame {
    private ManejadorActividad manejadorActividades;
    private ManejadorInstitucion manejadorInstitucion;
    private ManejadorUsuarios manejadorUsuarios;

    /**
     * Creates new form RegistrarDictadoClase
     */
    public RegistrarDictadoClase() {
        initComponents();
        manejadorActividades = new ManejadorActividad();
        manejadorInstitucion = new ManejadorInstitucion();
        manejadorUsuarios = new ManejadorUsuarios();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoActividadD = new javax.swing.JLabel();
        jComboBoxActividadesD = new javax.swing.JComboBox<>();
        TextoInstitucionD = new javax.swing.JLabel();
        jComboBoxInstitucionesDictado = new javax.swing.JComboBox<>();
        jComboBoxSocioD = new javax.swing.JComboBox<>();
        jButtonRDA = new javax.swing.JButton();
        TextoSocioD = new javax.swing.JLabel();
        jButtonRDC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClases = new javax.swing.JTable();

        setTitle("Registrar Dictado de Clase");
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

        TextoActividadD.setText("Actividad");

        jComboBoxActividadesD
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Actividad" }));
        jComboBoxActividadesD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxActividadesDFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxActividadesDFocusLost(evt);
            }
        });

        TextoInstitucionD.setText("Institucion:");

        jComboBoxInstitucionesDictado
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Institucion" }));

        jComboBoxSocioD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Socio" }));
        jComboBoxSocioD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxSocioDFocusGained(evt);
            }
        });

        jButtonRDA.setText("Aceptar");
        jButtonRDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRDAActionPerformed(evt);
            }
        });

        TextoSocioD.setText("Socio:");

        jButtonRDC.setText("Cancelar");
        jButtonRDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRDCActionPerformed(evt);
            }
        });

        jLabel1.setText("Clases");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonRDA)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRDC)
                                .addGap(58, 58, 58))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(TextoSocioD, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(TextoInstitucionD,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31,
                                                        Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jComboBoxInstitucionesDictado,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 201,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(TextoActividadD)
                                                                .addGap(53, 53, 53)
                                                                .addComponent(jComboBoxActividadesD,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 156,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jComboBoxSocioD,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(66, 66, 66))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextoInstitucionD)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(TextoActividadD)
                                                .addComponent(jComboBoxInstitucionesDictado,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jComboBoxActividadesD, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextoSocioD, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxSocioD, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonRDC)
                                        .addComponent(jButtonRDA))
                                .addGap(29, 29, 29)));

        jButtonRDA.getAccessibleContext().setAccessibleName("jButtonRDA");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSociosToComboBox() {

        List<Usuario> Socios = manejadorUsuarios.getSocios();

        jComboBoxSocioD.removeAllItems();

        for (Usuario Socio : Socios) {
            jComboBoxSocioD.addItem(Socio.getNickname());

        }

    }

    private void addInstitucionesToComboBox() {

        List<InstitucionDeportiva> instituciones = manejadorInstitucion.getInstituciones();

        jComboBoxInstitucionesDictado.removeAllItems();

        for (InstitucionDeportiva institucion : instituciones) {
            jComboBoxInstitucionesDictado.addItem(institucion.getNombre());
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

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {// GEN-FIRST:event_formInternalFrameOpened
        addInstitucionesToComboBox();
        addSociosToComboBox();

    }// GEN-LAST:event_formInternalFrameOpened

    private void jTableClasesMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableClasesMouseClicked

    }// GEN-LAST:event_jTableClasesMouseClicked

    private void jButtonRDCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRDCActionPerformed
        this.dispose();
    }// GEN-LAST:event_jButtonRDCActionPerformed

    private void jButtonRDAActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRDAActionPerformed
        try {
            int viewRow = jTableClases.getSelectedRow();
            if (viewRow != -1) {
                int modelRow = jTableClases.convertRowIndexToModel(viewRow);

                Object modelvalue = jTableClases.getModel().getValueAt(modelRow, 0);
                Object modelvalue2 = jTableClases.getModel().getValueAt(modelRow, 1);
                String nombre = (String) modelvalue;

                String fechaStr = (String) modelvalue2;
                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate fecha = LocalDate.parse(fechaStr, inputFormatter);
                String fechaEnNuevoFormato = fecha.format(outputFormatter);
                LocalDate fechareg = LocalDate.parse(fechaEnNuevoFormato, outputFormatter);
                String socio = jComboBoxSocioD.getSelectedItem().toString();

                Fabrica factory = new Fabrica();
                IControllerRegistroDictado controllerDictado = factory.getControllerRegistroDictado();
                controllerDictado.addRegistroDictado(socio, nombre, fechareg);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }// GEN-LAST:event_jButtonRDAActionPerformed

    private void ClasesDeActividad() {
        Object selectedItem = jComboBoxActividadesD.getSelectedItem();

        // Realizar acciones basadas en el elemento seleccionado
        if (selectedItem != null) {
            String actividad = selectedItem.toString();

            ActividadDeportiva actividaddeportiva = manejadorActividades.obtenerActividadPorNombre(actividad);
            List<Clase> listaClases = actividaddeportiva.getClases();

            if (!listaClases.isEmpty() || listaClases.get(0) != null) {

                DefaultTableModel tableModel = (DefaultTableModel) jTableClases.getModel();

                tableModel.setRowCount(0);

                for (Clase clase : listaClases) {
                    Object[] rowData = { clase.getNombre(), clase.getFechaFormatted(), clase.getHora(),
                            clase.getUrl() };
                    tableModel.addRow(rowData);
                }

                tableModel.fireTableDataChanged();
            } else {
                DefaultTableModel tableModel = (DefaultTableModel) jTableClases.getModel();

                tableModel.setRowCount(0);
            }

        }

    }

    private void jComboBoxActividadesDFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jComboBoxActividadesDFocusGained
        String current = (String) jComboBoxInstitucionesDictado.getSelectedItem();
        if (current != null) {
            addActividadesToComboBox(current);
            ClasesDeActividad();
        }

    }// GEN-LAST:event_jComboBoxActividadesDFocusGained

    private void jComboBoxSocioDFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jComboBoxSocioDFocusGained

    }// GEN-LAST:event_jComboBoxSocioDFocusGained

    private void jComboBoxActividadesDFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jComboBoxActividadesDFocusLost
        String actividad = null;
        String current = (String) jComboBoxActividadesD.getSelectedItem();
        if (actividad != current) {
            ClasesDeActividad();
            actividad = current;
        }
    }// GEN-LAST:event_jComboBoxActividadesDFocusLost
    /**/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextoActividadD;
    private javax.swing.JLabel TextoInstitucionD;
    private javax.swing.JLabel TextoSocioD;
    private javax.swing.JButton jButtonRDA;
    private javax.swing.JButton jButtonRDC;
    private javax.swing.JComboBox<String> jComboBoxActividadesD;
    private javax.swing.JComboBox<String> jComboBoxInstitucionesDictado;
    private javax.swing.JComboBox<String> jComboBoxSocioD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableClases;
    // End of variables declaration//GEN-END:variables
}
