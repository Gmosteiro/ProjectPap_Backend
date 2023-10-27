/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logic.Presentacion;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static java.lang.ProcessHandle.current;
import java.util.Base64;
import java.util.List;
import javax.swing.JOptionPane;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.ActividadDeportiva.controllers.ControllerModificarActividad;

/**
 *
 * @author santiagosaret
 */
public class ModificarActividad extends javax.swing.JInternalFrame {
    private ManejadorActividad manejadorActividades;
    /**
     * Creates new form ModificarActividad
     */
    private String imagenBase64;

    public ModificarActividad() {
        initComponents();
        manejadorActividades = new ManejadorActividad();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxActividadesM = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDescAct = new javax.swing.JTextField();
        jTextFieldDuracionAct = new javax.swing.JTextField();
        jTextFieldCosto = new javax.swing.JTextField();
        jButtonModificarActividad = new javax.swing.JButton();
        jButtonCanceloMA = new javax.swing.JButton();
        jFileChooserImgEact = new javax.swing.JFileChooser();

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

        jComboBoxActividadesM.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxActividadesM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActividadesMActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Actividad");

        jLabel2.setText("Descripcion");

        jLabel3.setText("Duracion");

        jLabel4.setText("Costo");

        jButtonModificarActividad.setText("Modificar");
        jButtonModificarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActividadActionPerformed(evt);
            }
        });

        jButtonCanceloMA.setText("CANCELO");
        jButtonCanceloMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanceloMAActionPerformed(evt);
            }
        });

        jFileChooserImgEact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooserImgEactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonCanceloMA)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextFieldCosto,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 254,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jTextFieldDuracionAct)
                                                        .addComponent(jTextFieldDescAct)
                                                        .addComponent(jComboBoxActividadesM, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(30, 30, 30)))
                                .addComponent(jFileChooserImgEact, javax.swing.GroupLayout.PREFERRED_SIZE, 319,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonModificarActividad)
                                .addGap(106, 106, 106)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jComboBoxActividadesM,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(31, 31, 31)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jTextFieldDescAct,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addComponent(jLabel3))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextFieldDuracionAct,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(27, 27, 27)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jTextFieldCosto,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jFileChooserImgEact,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 286,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCanceloMA)
                                .addGap(9, 9, 9)
                                .addComponent(jButtonModificarActividad)
                                .addGap(47, 47, 47)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {// GEN-FIRST:event_formInternalFrameOpened

        addActividadesToComboBox("Actividad");
    }// GEN-LAST:event_formInternalFrameOpened

    private void jComboBoxActividadesMActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxActividadesMActionPerformed
        // Cuando se seleccione una actividad en el JComboBox
        Object selectedItem = jComboBoxActividadesM.getSelectedItem();

        if (selectedItem != null) {
            String nombreActividadSeleccionada = selectedItem.toString();

            ActividadDeportiva actividadSeleccionada = manejadorActividades
                    .obtenerActividadPorNombre(nombreActividadSeleccionada);

            // Verificar si se encontró la actividad
            if (actividadSeleccionada != null) {
                // Cargar los datos de la actividad en los campos JTextField
                jTextFieldDescAct.setText(actividadSeleccionada.getDescripcion());
                jTextFieldDuracionAct.setText(Integer.toString(actividadSeleccionada.getDuracion()));
                jTextFieldCosto.setText(String.valueOf(actividadSeleccionada.getCosto()));
            } else {
                // Manejar el caso en el que no se encontró la actividad
                // Puedes mostrar un mensaje de error o realizar alguna otra acción
                JOptionPane.showMessageDialog(this, "No se encontró la actividad seleccionada.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }// GEN-LAST:event_jComboBoxActividadesMActionPerformed

    private void jButtonCanceloMAActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCanceloMAActionPerformed

        this.dispose();
    }// GEN-LAST:event_jButtonCanceloMAActionPerformed

    private void jButtonModificarActividadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonModificarActividadActionPerformed
        // Obtener los datos de los campos JTextField
        String nombreActividadSeleccionada = jComboBoxActividadesM.getSelectedItem().toString();
        String nuevaDescripcion = jTextFieldDescAct.getText();
        int nuevaDuracion = Integer.parseInt(jTextFieldDuracionAct.getText());
        float nuevoCosto = Float.parseFloat(jTextFieldCosto.getText());

        ControllerModificarActividad controller = new ControllerModificarActividad();
        String imgBase64 = imagenBase64;

        boolean modificacionExitosa = controller.modificarActividad(nombreActividadSeleccionada, nuevaDescripcion,
                nuevaDuracion, nuevoCosto, imgBase64);

        // Mostrar un mensaje al usuario
        if (modificacionExitosa) {
            JOptionPane.showMessageDialog(this, "Actividad modificada exitosamente.", "Éxito",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo modificar la actividad.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_jButtonModificarActividadActionPerformed

    private void jFileChooserImgEactActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jFileChooserImgEactActionPerformed
        try {
            File selectedFile = jFileChooserImgEact.getSelectedFile(); // Obtener el archivo seleccionado

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
    }// GEN-LAST:event_jFileChooserImgEactActionPerformed

    private void addActividadesToComboBox(String option) {
        // Obtener la lista de actividades y cargarlas en el JComboBox
        List<ActividadDeportiva> actividades = manejadorActividades.getActividades();

        if (actividades.isEmpty()) {
            // Manejar el caso en el que no hay actividades disponibles
            JOptionPane.showMessageDialog(this, "No hay actividades disponibles.", "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Limpiar el JComboBox antes de agregar las actividades
            jComboBoxActividadesM.removeAllItems();

            // Agregar las actividades al JComboBox
            for (ActividadDeportiva actividad : actividades) {
                jComboBoxActividadesM.addItem(actividad.getNombre());
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCanceloMA;
    private javax.swing.JButton jButtonModificarActividad;
    private javax.swing.JComboBox<String> jComboBoxActividadesM;
    private javax.swing.JFileChooser jFileChooserImgEact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldCosto;
    private javax.swing.JTextField jTextFieldDescAct;
    private javax.swing.JTextField jTextFieldDuracionAct;
    // End of variables declaration//GEN-END:variables
}
