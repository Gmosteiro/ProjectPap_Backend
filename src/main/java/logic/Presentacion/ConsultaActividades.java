/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logic.Presentacion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.ActividadDeportiva.controllers.IControllerConsultaActividad;
import logic.Clase.Clase;
import logic.Fabrica;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;

/**
 *
 * @author santi
 */
public class ConsultaActividades extends javax.swing.JInternalFrame {
    private ManejadorActividad manejadorActividades;
    private ManejadorInstitucion manejadorInstitucion;

    /**
     * Creates new form ConsultaActividades
     */
    public ConsultaActividades() {
        initComponents();
        manejadorActividades = new ManejadorActividad();
        manejadorInstitucion = new ManejadorInstitucion();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxInstitucionesActividad = new javax.swing.JComboBox<>();
        jButtonBuscarActividad = new javax.swing.JButton();
        jScrollPaneConsultaUsuario = new javax.swing.JScrollPane();
        jTableListaActividad = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInformacionAsociadaa = new javax.swing.JTable();
        jButtonCancelarConsultaActividad = new javax.swing.JButton();

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

        jComboBoxInstitucionesActividad.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxInstitucionesActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInstitucionesActividadActionPerformed(evt);
            }
        });

        jButtonBuscarActividad.setText("Buscar");
        jButtonBuscarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActividadActionPerformed(evt);
            }
        });

        jTableListaActividad.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Nombre", "Descripcion", "Duracion", "Costo", "Fecha de Registro"
                }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        });
        jTableListaActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaActividadMouseClicked(evt);
            }
        });
        jScrollPaneConsultaUsuario.setViewportView(jTableListaActividad);

        jTableInformacionAsociadaa.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Clase", "URL", "Actividad Deportiva", "Descripcion"
                }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        });
        jTableInformacionAsociadaa.setEnabled(false);
        jTableInformacionAsociadaa.setName("Informacion Asociada"); // NOI18N
        jTableInformacionAsociadaa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInformacionAsociadaaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableInformacionAsociadaa);

        jButtonCancelarConsultaActividad.setText("Cancelar");
        jButtonCancelarConsultaActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarConsultaActividadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                Short.MAX_VALUE)
                                        .addComponent(jScrollPaneConsultaUsuario))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(196, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(jComboBoxInstitucionesActividad,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 201,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(77, 77, 77)
                                                        .addComponent(jButtonBuscarActividad)
                                                        .addGap(288, 288, 288))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(jButtonCancelarConsultaActividad)
                                                        .addGap(32, 32, 32)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBoxInstitucionesActividad,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonBuscarActividad))
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPaneConsultaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 144,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelarConsultaActividad)
                                .addContainerGap(13, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addInstitucionesToComboBox(String option) {

        List<InstitucionDeportiva> instituciones = manejadorInstitucion.getInstituciones();

        switch (option) {
            case "Clase":

                jComboBoxInstitucionesActividad.removeAllItems();

                for (InstitucionDeportiva institucion : instituciones) {
                    jComboBoxInstitucionesActividad.addItem(institucion.getNombre());

                }

                break;
            default:
                break;
        }
    }

    private void jComboBoxActividadesCFocusGained(java.awt.event.FocusEvent evt) {
        // String current = (String) jComboBoxInstitucionesActividad.getSelectedItem();
        // never used

    }

    private void jComboBoxInstitucionesActividadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxInstitucionesActividadActionPerformed

    }// GEN-LAST:event_jComboBoxInstitucionesActividadActionPerformed

    private void jButtonBuscarActividadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonBuscarActividadActionPerformed

        String nombreInstitucion = jComboBoxInstitucionesActividad.getSelectedItem().toString();

        if (nombreInstitucion != null && !nombreInstitucion.isEmpty()) {

            InstitucionDeportiva instituto = manejadorInstitucion.getInstitucionesByName(nombreInstitucion);
            List<ActividadDeportiva> actividades = manejadorActividades.getActividadesByInstitucion(instituto);

            // Obtener el modelo de datos de jTableListaActividad
            DefaultTableModel model = (DefaultTableModel) jTableListaActividad.getModel();

            // Limpiar cualquier dato existente en la tabla
            model.setRowCount(0);

            // Agregar cada actividad a la tabla
            for (ActividadDeportiva actividad : actividades) {
                model.addRow(new Object[] {
                        actividad.getNombre(),
                        actividad.getDescripcion(),
                        actividad.getDuracion(),
                        actividad.getCosto()
                });
            }
        } else {
            // Mostrar un mensaje de error o manejar el caso en el que no se seleccionó una
            // institución válida
        }
    }// GEN-LAST:event_jButtonBuscarActividadActionPerformed

    private void jTableListaActividadMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableListaActividadMouseClicked

        int viewRow = jTableListaActividad.getSelectedRow();

        if (viewRow != -1) {
            int modelRow = jTableListaActividad.convertRowIndexToModel(viewRow);
            Object modelValue = jTableListaActividad.getModel().getValueAt(modelRow, 0);

            String nombre = (String) modelValue;

            Fabrica factory = new Fabrica();
            IControllerConsultaActividad consultaActividad = factory.getControllerConsultaActividad();

            ActividadDeportiva actividadDep = consultaActividad.obtenerActividadPorNombre(nombre);

            // Aquí se llama a la función del controlador para obtener la lista de clases
            // por actividad
            List<Clase> clases = consultaActividad.obtenerClasesPorActividad(actividadDep);

            List<ActividadDeportiva> searchResult = new ArrayList<>();
            searchResult.add(actividadDep);

            System.out.println("Información de la actividad: " + actividadDep);

            for (Clase clase : clases) {
                System.out.println("Información de la clase: " + clase);
            }
        }
    }// GEN-LAST:event_jTableListaActividadMouseClicked

    private void jTableInformacionAsociadaaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableInformacionAsociadaaMouseClicked
        // int selectedRow = jTableInformacionAsociadaa.getSelectedRow();
        //
        // if (selectedRow != -1) {
        // DefaultTableModel model = (DefaultTableModel)
        // jTableInformacionAsociadaa.getModel();
        //
        // // private String nombre;
        // // private String descripcion;
        // // private int duracion;
        // // private float costo;
        // // private LocalDate fechaReg;
        // String nombre = model.getValueAt(selectedRow, 0).toString();
        // String descripcion = model.getValueAt(selectedRow, 1).toString();
        // String duracion = model.getValueAt(selectedRow, 2).toString();
        // String costo = model.getValueAt(selectedRow, 3).toString();
        // String fechaReg = model.getValueAt(selectedRow, 4).toString();
        //
        // // Now you can use the extracted data for further processing or display
        // System.out.println("nombre: " + nombre);
        // System.out.println("descripcion: " + descripcion);
        // System.out.println("duracion: " + duracion);
        // System.out.println("costo: " + costo);
        // System.out.println("Fecha de registro: " + fechaReg);
        // }
        int selectedRow = jTableInformacionAsociadaa.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) jTableInformacionAsociadaa.getModel();

            // Obtener los valores de la fila seleccionada
            String nombre = model.getValueAt(selectedRow, 0).toString();

            // Ahora, puedes utilizar la función del controlador para obtener los detalles
            // de la clase
            Fabrica factory = new Fabrica();
            IControllerConsultaActividad consultaActividad = factory.getControllerConsultaActividad();

            // Aquí se debe llamar a la función para obtener los detalles de la clase
            ActividadDeportiva actividadDep = consultaActividad.obtenerActividadPorNombre(nombre);

            // Aquí se llama a la función del controlador para obtener la lista de clases
            // por actividad
            List<Clase> clases = consultaActividad.obtenerClasesPorActividad(actividadDep);

            List<ActividadDeportiva> searchResult = new ArrayList<>();
            searchResult.add(actividadDep);

            // Ahora puedes mostrar los detalles de la clase en la interfaz gráfica
            // Por ejemplo, podrías asignar los valores a etiquetas o campos de texto

            // También puedes imprimir información en la consola para verificar
            // System.out.println("Detalles de la clase seleccionada: " + clase);
        }
    }// GEN-LAST:event_jTableInformacionAsociadaaMouseClicked

    private void jButtonCancelarConsultaActividadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarConsultaActividadActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) jTableInformacionAsociadaa.getModel();

        tableModel.setRowCount(0);

        tableModel = (DefaultTableModel) jTableListaActividad.getModel();

        tableModel.setRowCount(0);
        this.dispose();// TODO add your handling code here:
    }// GEN-LAST:event_jButtonCancelarConsultaActividadActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {// GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        addInstitucionesToComboBox("Clase");
    }// GEN-LAST:event_formInternalFrameOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarActividad;
    private javax.swing.JButton jButtonCancelarConsultaActividad;
    private javax.swing.JComboBox<String> jComboBoxInstitucionesActividad;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneConsultaUsuario;
    private javax.swing.JTable jTableInformacionAsociadaa;
    private javax.swing.JTable jTableListaActividad;
    // End of variables declaration//GEN-END:variables
}
