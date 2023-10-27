/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logic.Presentacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.Clase.Clase;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;

/**
 *
 * @author gasto
 */
public class ConsultarActividades extends javax.swing.JInternalFrame {
    private ManejadorActividad manejadorActividades;
    private ManejadorInstitucion manejadorInstitucion;

    /**
     * Creates new form ConsultarActividades
     */
    public ConsultarActividades() {
        manejadorActividades = new ManejadorActividad();
        manejadorInstitucion = new ManejadorInstitucion();
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxInstituciones = new javax.swing.JComboBox<>();
        jLabelInstituciones = new javax.swing.JLabel();
        jLabelActividades = new javax.swing.JLabel();
        jComboBoxActividades = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableActividades = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClasesAsociadas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonBuscarActividades = new javax.swing.JButton();

        setTitle("Consultar Actividad");
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

        jComboBoxInstituciones.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxInstituciones.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxInstitucionesFocusGained(evt);
            }
        });

        jLabelInstituciones.setText("Instituciones");

        jLabelActividades.setText("Actividades");

        jComboBoxActividades.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Seleccionar", "Seleccionar", "Seleccionar", "Seleccionar", "Seleccionar" }));
        jComboBoxActividades.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxActividadesFocusGained(evt);
            }
        });

        jTableActividades.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {
                        "Nombre", "Costo", "Descripcion", "Duracion", "Fecha de Registro"
                }));
        jScrollPane1.setViewportView(jTableActividades);

        jTableClasesAsociadas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {},
                new String[] {
                        "Nombre", "Fecha", "Fecha Registro", "Hora", "URL", "Profesor"
                }));
        jTableClasesAsociadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClasesAsociadasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableClasesAsociadas);

        jLabel2.setText("Datos de la Actividad:");

        jLabel3.setText("Clases Asociadas:");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonBuscarActividades.setText("Buscar");
        jButtonBuscarActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActividadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabelInstituciones)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBoxInstituciones,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelActividades)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBoxActividades,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42,
                                                        Short.MAX_VALUE)
                                                .addComponent(jButtonBuscarActividades)
                                                .addGap(11, 11, 11))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(41, 41, 41)
                                                                .addComponent(jButtonCancelar))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBoxInstituciones, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelInstituciones)
                                        .addComponent(jLabelActividades)
                                        .addComponent(jComboBoxActividades, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonBuscarActividades))
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButtonCancelar)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getFechaFormatted(LocalDate fecha) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Convert LocalDate to LocalDateTime to enable formatting
        String formattedDate = fecha.atStartOfDay().format(formatter);
        return formattedDate;
    }

    private void jComboBoxInstitucionesFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jComboBoxInstitucionesFocusGained

    }// GEN-LAST:event_jComboBoxInstitucionesFocusGained

    private void jTableClasesAsociadasMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableClasesAsociadasMouseClicked
        // lamar al CONSULTA CLASE
    }// GEN-LAST:event_jTableClasesAsociadasMouseClicked

    private void jButtonBuscarActividadesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonBuscarActividadesActionPerformed

        Object selectedItem = jComboBoxActividades.getSelectedItem();

        // Realizar acciones basadas en el elemento seleccionado
        if (selectedItem != null) {
            String selectedActividad = selectedItem.toString();

            List<ActividadDeportiva> listaActividades = new ArrayList<>();

            listaActividades.add(manejadorActividades.obtenerActividadPorNombre(selectedActividad));

            if (!listaActividades.isEmpty() || listaActividades.get(0) != null) {

                DefaultTableModel tableModel = (DefaultTableModel) jTableActividades.getModel();

                tableModel.setRowCount(0);

                for (ActividadDeportiva actividad : listaActividades) {
                    Object[] rowData = { actividad.getNombre(), "$" + actividad.getCosto(), actividad.getDescripcion(),
                            actividad.getDuracion(), getFechaFormatted(actividad.getFechaReg()) };
                    tableModel.addRow(rowData);
                }

                tableModel.fireTableDataChanged();
            }

            ClasesDeActividad(selectedActividad);
        }

    }// GEN-LAST:event_jButtonBuscarActividadesActionPerformed

    private void jComboBoxActividadesFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jComboBoxActividadesFocusGained

        String currentInstitucion = (String) jComboBoxInstituciones.getSelectedItem();

        addActividadesToComboBox(currentInstitucion);

    }// GEN-LAST:event_jComboBoxActividadesFocusGained

    private void ClasesDeActividad(String actividad) {

        ActividadDeportiva actividaddeportiva = manejadorActividades.obtenerActividadPorNombre(actividad);
        List<Clase> listaClases = actividaddeportiva.getClases();

        if (!listaClases.isEmpty() && listaClases.get(0) != null) {

            DefaultTableModel tableModel = (DefaultTableModel) jTableClasesAsociadas.getModel();

            tableModel.setRowCount(0);

            for (Clase clase : listaClases) {
                Object[] rowData = { clase.getNombre(), clase.getFechaFormatted(),
                        getFechaFormatted(clase.getFechaReg()),
                        clase.getHora(),
                        clase.getUrl(), clase.getProfesor().getNickname() };
                tableModel.addRow(rowData);
            }

            tableModel.fireTableDataChanged();
        } else {
            DefaultTableModel tableModel = (DefaultTableModel) jTableClasesAsociadas.getModel();

            tableModel.setRowCount(0);
        }

    }

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
        // boton cancelar
    }// GEN-LAST:event_jButtonCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {// GEN-FIRST:event_formInternalFrameOpened
        addInstitucionesToComboBox();
        // opened
    }// GEN-LAST:event_formInternalFrameOpened

    private void addInstitucionesToComboBox() {

        List<InstitucionDeportiva> instituciones = manejadorInstitucion.getInstituciones();
        // Object selectedItem;

        jComboBoxInstituciones.removeAllItems();

        for (InstitucionDeportiva institucion : instituciones) {
            jComboBoxInstituciones.addItem(institucion.getNombre());
        }

    }

    private void addActividadesToComboBox(String institucion) {

        List<ActividadDeportiva> actividades = manejadorActividades
                .getActividadesByInstitucion(manejadorInstitucion.getInstitucionesByName(institucion));

        jComboBoxActividades.removeAllItems();

        for (ActividadDeportiva actividad : actividades) {
            jComboBoxActividades.addItem(actividad.getNombre());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarActividades;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxActividades;
    private javax.swing.JComboBox<String> jComboBoxInstituciones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelActividades;
    private javax.swing.JLabel jLabelInstituciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableActividades;
    private javax.swing.JTable jTableClasesAsociadas;
    // End of variables declaration//GEN-END:variables
}
