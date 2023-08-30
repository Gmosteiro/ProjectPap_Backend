/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logic.Presentacion;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import logic.Fabrica;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.ActividadDeportiva.controllers.IControllerAltaActividad;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;
/**
 *
 * @author Admin
 */
public class RegistrarActividadCU extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistrarActividadCU
     */
    public RegistrarActividadCU() {
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

        jButtonAceptarActividad = new javax.swing.JButton();
        jComboBoxInstituciones = new javax.swing.JComboBox<>();
        jButtonCancelarActividad = new javax.swing.JButton();
        jLabelInstituciones = new javax.swing.JLabel();
        jTextFieldNombreA = new javax.swing.JTextField();
        jDateChooserFActividad = new com.toedter.calendar.JDateChooser();
        jTextFieldDescA = new javax.swing.JTextField();
        jTextFieldDuracionA = new javax.swing.JTextField();
        TextoNombreA = new javax.swing.JLabel();
        TextoDescA = new javax.swing.JLabel();
        TextoDuracionA = new javax.swing.JLabel();
        TextoCostoA = new javax.swing.JLabel();
        jTextFieldCostoA = new javax.swing.JTextField();
        TextoFechaA = new javax.swing.JLabel();

        setTitle("Registrar Actividad");
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

        jButtonAceptarActividad.setText("Aceptar");
        jButtonAceptarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActividadActionPerformed(evt);
            }
        });

        jComboBoxInstituciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxInstituciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInstitucionesActionPerformed(evt);
            }
        });

        jButtonCancelarActividad.setText("Cancelar");
        jButtonCancelarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActividadActionPerformed(evt);
            }
        });

        jLabelInstituciones.setText("Instituciones");

        TextoNombreA.setText("Nombre:");

        TextoDescA.setText("Descripcion:");

        TextoDuracionA.setText("Duracion:");

        TextoCostoA.setText("Costo:");

        TextoFechaA.setText("Fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoCostoA)
                            .addComponent(TextoDuracionA)
                            .addComponent(TextoDescA)
                            .addComponent(TextoNombreA)
                            .addComponent(TextoFechaA)
                            .addComponent(jLabelInstituciones))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldDescA)
                            .addComponent(jTextFieldNombreA)
                            .addComponent(jComboBoxInstituciones, 0, 198, Short.MAX_VALUE)
                            .addComponent(jTextFieldDuracionA)
                            .addComponent(jTextFieldCostoA, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(jDateChooserFActividad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAceptarActividad, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButtonCancelarActividad)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxInstituciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInstituciones))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoNombreA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoDescA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDuracionA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoDuracionA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCostoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCostoA))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoFechaA)
                    .addComponent(jDateChooserFActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarActividad)
                    .addComponent(jButtonAceptarActividad))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActividadActionPerformed
        try {
            Date selectedDate = jDateChooserFActividad.getDate();
            LocalDate localDate = selectedDate.toInstant()
                    .atZone(jDateChooserFActividad.getCalendar().getTimeZone().toZoneId()).toLocalDate();
            Fabrica factory = new Fabrica();
            IControllerAltaActividad controllerAltaActividad = factory.getControladorAltaActividad();
            String nombre = jTextFieldNombreA.getText();
            String desc = jTextFieldDescA.getText();
            int duracion = Integer.parseInt(jTextFieldDuracionA.getText());
            float costo = Float.parseFloat(jTextFieldCostoA.getText());
            Object instituciones = jComboBoxInstituciones.getSelectedItem();
            String institucion = instituciones.toString();
            controllerAltaActividad.altaActividad(nombre, desc, duracion, costo, localDate, institucion);
            jTextFieldNombreA.setText("");
            //jTextFieldURL.setText("");
        } catch (NumberFormatException e) {
            // Manejar la excepción si el valor ingresado no es un número válido
            System.out.println("Error: El valor no es un número válido.");
        }
    }//GEN-LAST:event_jButtonAceptarActividadActionPerformed

    private void addActividadesToComboBox(String option, String institucion) {

        List<ActividadDeportiva> actividades = ManejadorActividad.getActividades();
        // Object selectedItem;

        switch (option) {
            case "Actividad":

                 jComboBoxInstituciones.removeAllItems();

//                 for (InstitucionDeportiva institucion : actividades) {
//                 jComboBoxInstituciones.addItem(institucion.getNombre());
//                 }
//
//                 selectedItem = jComboBoxInstituciones.getSelectedItem();
//
//                 if (selectedItem != null) {
//                 String selectedText = selectedItem.toString(); // Convertir el elemento a
//                 String
//                 }

                 break;
            default:
                break;
        }
    }
     private void addInstitucionesToComboBox(String option) {

        List<InstitucionDeportiva> instituciones = ManejadorInstitucion.getInstituciones();
        // Object selectedItem;

        switch (option) {
            case "Actividad":

                jComboBoxInstituciones.removeAllItems();

                for (InstitucionDeportiva institucion : instituciones) {
                    jComboBoxInstituciones.addItem(institucion.getNombre());
                }

                // selectedItem = jComboBoxInstituciones.getSelectedItem();

                // if (selectedItem != null) {
                // String selectedText = selectedItem.toString(); // Convertir el elemento a
                // String
                // }

                break;
            default:
                break;
        }
    }
    
    private void jComboBoxInstitucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxInstitucionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxInstitucionesActionPerformed

    private void jButtonCancelarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActividadActionPerformed
        jTextFieldNombreA.setText("");
        jTextFieldDescA.setText("");
        jTextFieldDuracionA.setText("");
        jTextFieldCostoA.setText("");
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActividadActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        addInstitucionesToComboBox("Actividad");
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextoCostoA;
    private javax.swing.JLabel TextoDescA;
    private javax.swing.JLabel TextoDuracionA;
    private javax.swing.JLabel TextoFechaA;
    private javax.swing.JLabel TextoNombreA;
    private javax.swing.JButton jButtonAceptarActividad;
    private javax.swing.JButton jButtonCancelarActividad;
    private javax.swing.JComboBox<String> jComboBoxInstituciones;
    private com.toedter.calendar.JDateChooser jDateChooserFActividad;
    private javax.swing.JLabel jLabelInstituciones;
    private javax.swing.JTextField jTextFieldCostoA;
    private javax.swing.JTextField jTextFieldDescA;
    private javax.swing.JTextField jTextFieldDuracionA;
    private javax.swing.JTextField jTextFieldNombreA;
    // End of variables declaration//GEN-END:variables
}
