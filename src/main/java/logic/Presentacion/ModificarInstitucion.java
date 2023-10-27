/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logic.Presentacion;

import java.util.List;
import logic.Fabrica;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;
import logic.Institucion.controllers.IControllerModificarInstitucion;

/**
 *
 * @author Admin
 */
public class ModificarInstitucion extends javax.swing.JInternalFrame {
    private ManejadorInstitucion manejadorInstitucion;

    /**
     * Creates new form ModificarInstitucion
     */
    public ModificarInstitucion() {
        initComponents();
        manejadorInstitucion = new ManejadorInstitucion();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxInstitucionesDictado = new javax.swing.JComboBox<>();
        TextoInstitucionD = new javax.swing.JLabel();
        jButtonMIA = new javax.swing.JButton();
        jButtonMIC = new javax.swing.JButton();
        TextoDescripcionMI = new javax.swing.JLabel();
        jTextFieldMIDesc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldMIURL = new javax.swing.JTextField();
        jButtonMISelect = new javax.swing.JButton();

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

        jComboBoxInstitucionesDictado.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxInstitucionesDictado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxInstitucionesDictadoFocusGained(evt);
            }
        });

        TextoInstitucionD.setText("Institucion:");

        jButtonMIA.setText("Aceptar");
        jButtonMIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMIAActionPerformed(evt);
            }
        });

        jButtonMIC.setText("Cancelar");
        jButtonMIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMICActionPerformed(evt);
            }
        });

        TextoDescripcionMI.setText("Descripción:");

        jTextFieldMIDesc.setEnabled(false);

        jLabel1.setText("URL:");

        jTextFieldMIURL.setEnabled(false);

        jButtonMISelect.setText("Seleccionar");
        jButtonMISelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMISelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TextoDescripcionMI, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TextoInstitucionD, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                        layout.createSequentialGroup()
                                                                .addComponent(jButtonMIC)
                                                                .addGap(53, 53, 53)
                                                                .addComponent(jButtonMIA))
                                                .addComponent(jTextFieldMIDesc,
                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jComboBoxInstitucionesDictado,
                                                        javax.swing.GroupLayout.Alignment.TRAILING, 0,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextFieldMIURL,
                                                        javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(jButtonMISelect))
                                .addContainerGap(52, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBoxInstitucionesDictado,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextoInstitucionD))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMISelect)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextoDescripcionMI, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldMIDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldMIURL, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonMIA)
                                        .addComponent(jButtonMIC))
                                .addGap(20, 20, 20)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addInstitucionesToComboBox() {

        List<InstitucionDeportiva> instituciones = manejadorInstitucion.getInstituciones();

        jComboBoxInstitucionesDictado.removeAllItems();

        for (InstitucionDeportiva institucion : instituciones) {
            jComboBoxInstitucionesDictado.addItem(institucion.getNombre());
        }

    }

    private void jComboBoxInstitucionesDictadoFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jComboBoxInstitucionesDictadoFocusGained

    }// GEN-LAST:event_jComboBoxInstitucionesDictadoFocusGained

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {// GEN-FIRST:event_formInternalFrameOpened
        addInstitucionesToComboBox();
        jTextFieldMIDesc.setEnabled(false);
        jTextFieldMIURL.setEnabled(false);
        jButtonMIA.setEnabled(false);
    }// GEN-LAST:event_formInternalFrameOpened

    private void jButtonMICActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMICActionPerformed
        jTextFieldMIDesc.setText("");
        jTextFieldMIURL.setText("");
        this.dispose();
    }// GEN-LAST:event_jButtonMICActionPerformed

    private void jButtonMISelectActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMISelectActionPerformed
        String institucion = jComboBoxInstitucionesDictado.getSelectedItem().toString();
        InstitucionDeportiva instituto = manejadorInstitucion.getInstitucionesByName(institucion);
        jTextFieldMIDesc.setText(instituto.getDescripcion());
        jTextFieldMIURL.setText(instituto.getUrl());
        jTextFieldMIDesc.setEnabled(true);
        jTextFieldMIURL.setEnabled(true);
        jButtonMIA.setEnabled(true);
    }// GEN-LAST:event_jButtonMISelectActionPerformed

    private void jButtonMIAActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonMIAActionPerformed
        Fabrica factory = new Fabrica();
        String institucion = jComboBoxInstitucionesDictado.getSelectedItem().toString();
        IControllerModificarInstitucion controller = factory.getControllerModificarInstitucion();

        String descInstitucion = jTextFieldMIDesc.getText();
        String urlInstitucion = jTextFieldMIURL.getText();
        controller.modificarInstitucion(institucion, descInstitucion, urlInstitucion);
        jTextFieldMIDesc.setText("");
        jTextFieldMIURL.setText("");
    }// GEN-LAST:event_jButtonMIAActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextoDescripcionMI;
    private javax.swing.JLabel TextoInstitucionD;
    private javax.swing.JButton jButtonMIA;
    private javax.swing.JButton jButtonMIC;
    private javax.swing.JButton jButtonMISelect;
    private javax.swing.JComboBox<String> jComboBoxInstitucionesDictado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldMIDesc;
    private javax.swing.JTextField jTextFieldMIURL;
    // End of variables declaration//GEN-END:variables
}
