/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logic.Presentacion;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import logic.Fabrica;
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
    private String imagenBase64;
    private ManejadorInstitucion manejadorInstitucion;

    public RegistrarActividadCU() {
        initComponents();
        manejadorInstitucion = new ManejadorInstitucion();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
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
        jFileChooserImgActividad = new javax.swing.JFileChooser();

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
                try {
                    jButtonAceptarActividadActionPerformed(evt);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        jComboBoxInstituciones.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        jFileChooserImgActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooserImgActividadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonCancelarActividad)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        473, Short.MAX_VALUE)
                                                .addComponent(jButtonAceptarActividad))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TextoCostoA)
                                                        .addComponent(TextoDuracionA)
                                                        .addComponent(TextoDescA)
                                                        .addComponent(TextoNombreA)
                                                        .addComponent(TextoFechaA)
                                                        .addComponent(jLabelInstituciones))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(jFileChooserImgActividad,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 399,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jTextFieldDescA)
                                                        .addComponent(jTextFieldNombreA)
                                                        .addComponent(jComboBoxInstituciones, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldDuracionA)
                                                        .addComponent(jTextFieldCostoA)
                                                        .addComponent(jDateChooserFActividad,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE))))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(445, 445, 445)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonCancelarActividad)
                                                        .addComponent(jButtonAceptarActividad)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelInstituciones)
                                                                .addGap(38, 38, 38)
                                                                .addComponent(TextoNombreA)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(TextoDescA)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(TextoDuracionA)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(TextoCostoA)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(TextoFechaA))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jComboBoxInstituciones,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(jTextFieldNombreA,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTextFieldDescA,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTextFieldDuracionA,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTextFieldCostoA,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jDateChooserFActividad,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jFileChooserImgActividad,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 228,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(23, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooserImgActividadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jFileChooserImgActividadActionPerformed
        try {
            File selectedFile = jFileChooserImgActividad.getSelectedFile(); // Obtener el archivo seleccionado

            FileInputStream fis = new FileInputStream(selectedFile);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            imagenBase64 = Base64.getEncoder().encodeToString(bos.toByteArray());

            fis.close();
            bos.close();

            JOptionPane.showMessageDialog(this, "Foto seleccionada correctamente", "Confirmación",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }// GEN-LAST:event_jFileChooserImgActividadActionPerformed

    private void jButtonAceptarActividadActionPerformed(java.awt.event.ActionEvent evt) throws IOException {// GEN-FIRST:event_jButtonAceptarActividadActionPerformed
        try {
            Date selectedDate = jDateChooserFActividad.getDate();
            LocalDate localDate = selectedDate.toInstant()
                    .atZone(jDateChooserFActividad.getCalendar().getTimeZone().toZoneId())
                    .toLocalDate();
            Fabrica factory = new Fabrica();
            IControllerAltaActividad controllerAltaActividad = factory.getControladorAltaActividad();
            String nombre = jTextFieldNombreA.getText();
            String desc = jTextFieldDescA.getText();
            int duracion = Integer.parseInt(jTextFieldDuracionA.getText());
            float costo = Float.parseFloat(jTextFieldCostoA.getText());
            Object instituciones = jComboBoxInstituciones.getSelectedItem();
            String institucion = instituciones.toString();

            String imgBase64 = imagenBase64;
            controllerAltaActividad.altaActividad(nombre, desc, duracion, costo, localDate, imgBase64,
                    institucion);

            jTextFieldNombreA.setText("");
            jTextFieldDescA.setText("");
            jTextFieldDuracionA.setText("");
            jTextFieldCostoA.setText("");
        } catch (NumberFormatException e) {
            // Manejar la excepción si el valor ingresado no es un número válido
            System.out.println("Error: El valor no es un número válido.");
        }

    }// GEN-LAST:event_jButtonAceptarActividadActionPerformed

    private void addInstitucionesToComboBox(String option) {

        List<InstitucionDeportiva> instituciones = manejadorInstitucion.getInstituciones();
        // Object selectedItem;

        switch (option) {
            case "Actividad":

                jComboBoxInstituciones.removeAllItems();

                for (InstitucionDeportiva institucion : instituciones) {
                    jComboBoxInstituciones.addItem(institucion.getNombre());
                }

                break;
            default:
                break;
        }
    }

    private void jComboBoxInstitucionesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxInstitucionesActionPerformed

    }// GEN-LAST:event_jComboBoxInstitucionesActionPerformed

    private void jButtonCancelarActividadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarActividadActionPerformed
        jTextFieldNombreA.setText("");
        jTextFieldDescA.setText("");
        jTextFieldDuracionA.setText("");
        jTextFieldCostoA.setText("");
        this.dispose();

    }// GEN-LAST:event_jButtonCancelarActividadActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {// GEN-FIRST:event_formInternalFrameOpened
        addInstitucionesToComboBox("Actividad");
    }// GEN-LAST:event_formInternalFrameOpened

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
    private javax.swing.JFileChooser jFileChooserImgActividad;
    private javax.swing.JLabel jLabelInstituciones;
    private javax.swing.JTextField jTextFieldCostoA;
    private javax.swing.JTextField jTextFieldDescA;
    private javax.swing.JTextField jTextFieldDuracionA;
    private javax.swing.JTextField jTextFieldNombreA;
    // End of variables declaration//GEN-END:variables
}
