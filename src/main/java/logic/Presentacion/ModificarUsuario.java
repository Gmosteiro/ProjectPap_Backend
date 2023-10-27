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
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Usuario;
import logic.Usuario.controllers.IControllerModificarUsuario;

/**
 *
 * @author xSanPrax
 */

public class ModificarUsuario extends javax.swing.JInternalFrame {
        private ManejadorUsuarios manejadorUsuarios;

        /**
         * Creates new form ModificarUsuario
         */
        private String imagenBase64;

        public ModificarUsuario() {
                initComponents();
                manejadorUsuarios = new ManejadorUsuarios();
        }

        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jComboBoxMUusuarios = new javax.swing.JComboBox<>();
                jLabel1 = new javax.swing.JLabel();
                TextoNombreMU = new javax.swing.JLabel();
                jTextFieldMUnombre = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jTextFieldMUapellido = new javax.swing.JTextField();
                TextoMUFnacimiento = new javax.swing.JLabel();
                jDateChooserMUFnacimiento = new com.toedter.calendar.JDateChooser();
                jButtonMUA = new javax.swing.JButton();
                jButtonMUC = new javax.swing.JButton();
                jButtonMUS = new javax.swing.JButton();
                jFileChooserImgEuser = new javax.swing.JFileChooser();

                setTitle("Modificar Cliente");
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

                jComboBoxMUusuarios.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                jComboBoxMUusuarios.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jComboBoxMUusuariosFocusGained(evt);
                        }
                });

                jLabel1.setText("Usuarios:");

                TextoNombreMU.setText("Nombre:");

                jLabel2.setText("Apellido:");

                TextoMUFnacimiento.setText("Fecha de Nacimiento:");

                jButtonMUA.setText("Aceptar");
                jButtonMUA.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonMUAActionPerformed(evt);
                        }
                });

                jButtonMUC.setText("Cancelar");
                jButtonMUC.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonMUCActionPerformed(evt);
                        }
                });

                jButtonMUS.setText("Seleccionar");
                jButtonMUS.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonMUSActionPerformed(evt);
                        }
                });

                jFileChooserImgEuser.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jFileChooserImgEuserActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(131, 131, 131)
                                                                .addComponent(jButtonMUA)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButtonMUC)
                                                                .addGap(50, 50, 50))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(TextoNombreMU)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                78,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(TextoMUFnacimiento,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                115,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel1))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jButtonMUS)
                                                                                .addComponent(jComboBoxMUusuarios,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                190,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextFieldMUnombre,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                190,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextFieldMUapellido,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                190,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jDateChooserMUFnacimiento,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                190,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jFileChooserImgEuser,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                365,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(23, 23, 23)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(13, 13, 13)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                21,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jComboBoxMUusuarios,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jButtonMUS)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(TextoNombreMU,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                26,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jTextFieldMUnombre))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                26,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jTextFieldMUapellido))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(TextoMUFnacimiento,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jDateChooserMUFnacimiento,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                26,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addContainerGap())
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jFileChooserImgEuser,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                262,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jButtonMUC)
                                                                                                                .addComponent(jButtonMUA))
                                                                                                .addGap(26, 26, 26)))));

                pack();
        }// </editor-fold>//GEN-END:initComponents
         // controllerUsuario.modificarUsuario(nickname, nuevoNombre, nuevoApellido,
         // nuevafecha);

        private void jComboBoxMUusuariosFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jComboBoxMUusuariosFocusGained

        }// GEN-LAST:event_jComboBoxMUusuariosFocusGained

        private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {// GEN-FIRST:event_formInternalFrameOpened
                addUsuariosToComboBox();
                jTextFieldMUnombre.setEnabled(false);
                jTextFieldMUapellido.setEnabled(false);
                jDateChooserMUFnacimiento.setEnabled(false);

        }// GEN-LAST:event_formInternalFrameOpened

        private void jButtonMUSActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMUSActionPerformed
                String usuario = jComboBoxMUusuarios.getSelectedItem().toString();
                Usuario user = manejadorUsuarios.getUser(usuario);
                jTextFieldMUnombre.setText(user.getNombre());
                jTextFieldMUapellido.setText(user.getApellido());
                // jDateChooserMUFnacimiento.setDateFormatString(user.getFechaNacFromatted());

                jTextFieldMUnombre.setEnabled(true);
                jTextFieldMUapellido.setEnabled(true);
                jDateChooserMUFnacimiento.setEnabled(true);
        }// GEN-LAST:event_jButtonMUSActionPerformed

        private void jButtonMUCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMUCActionPerformed
                jTextFieldMUnombre.setText("");
                jTextFieldMUapellido.setText("");
                this.dispose();
        }// GEN-LAST:event_jButtonMUCActionPerformed

        private void jButtonMUAActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMUAActionPerformed
                Fabrica factory = new Fabrica();
                String usuario = jComboBoxMUusuarios.getSelectedItem().toString();
                IControllerModificarUsuario controller = factory.getControllerModificarUsuario();

                String nuevonombre = jTextFieldMUnombre.getText();
                String nuevoapellido = jTextFieldMUapellido.getText();

                Date selectedDate = jDateChooserMUFnacimiento.getDate();
                LocalDate nuevafecha = selectedDate.toInstant()
                                .atZone(jDateChooserMUFnacimiento.getCalendar().getTimeZone().toZoneId()).toLocalDate();
                String imgBase64 = imagenBase64;

                controller.modificarUsuario(usuario, nuevonombre, nuevoapellido, nuevafecha, imgBase64);
                jTextFieldMUnombre.setText("");
                jTextFieldMUapellido.setText("");
        }// GEN-LAST:event_jButtonMUAActionPerformed

        private void jFileChooserImgEuserActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jFileChooserImgEuserActionPerformed
                try {
                        File selectedFile = jFileChooserImgEuser.getSelectedFile(); // Obtener el archivo seleccionado

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
        }// GEN-LAST:event_jFileChooserImgEuserActionPerformed

        private void addUsuariosToComboBox() {
                List<Usuario> usuarios = manejadorUsuarios.getUsuarios();

                jComboBoxMUusuarios.removeAllItems();

                for (Usuario usuario : usuarios) {
                        jComboBoxMUusuarios.addItem(usuario.getNickname());
                }
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel TextoMUFnacimiento;
        private javax.swing.JLabel TextoNombreMU;
        private javax.swing.JButton jButtonMUA;
        private javax.swing.JButton jButtonMUC;
        private javax.swing.JButton jButtonMUS;
        private javax.swing.JComboBox<String> jComboBoxMUusuarios;
        private com.toedter.calendar.JDateChooser jDateChooserMUFnacimiento;
        private javax.swing.JFileChooser jFileChooserImgEuser;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JTextField jTextFieldMUapellido;
        private javax.swing.JTextField jTextFieldMUnombre;
        // End of variables declaration//GEN-END:variables
}
