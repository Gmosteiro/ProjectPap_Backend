/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logic.Presentacion;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.time.LocalTime;
import logic.Fabrica;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Usuario;
import logic.Clase.controllers.IControllerAltaClase;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;

/**
 *
 * @author Admin
 */
public class RegistrarClaseCU extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistrarClaseCU
     */
    
    public RegistrarClaseCU() {
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

        jButtonRCC = new javax.swing.JButton();
        jComboBoxURLC = new javax.swing.JComboBox<>();
        TextoIngreseDatosC = new javax.swing.JLabel();
        jComboBoxProfesorC = new javax.swing.JComboBox<>();
        TextoNombreC = new javax.swing.JLabel();
        jComboBoxNombreC = new javax.swing.JComboBox<>();
        TextoProfesorC = new javax.swing.JLabel();
        jComboBoxInstitucionesClase = new javax.swing.JComboBox<>();
        TextoFIC = new javax.swing.JLabel();
        TextoActividadC = new javax.swing.JLabel();
        jTextFieldNombreC = new javax.swing.JTextField();
        jComboBoxActividadesC = new javax.swing.JComboBox<>();
        TextoHIC = new javax.swing.JLabel();
        jDateChooserFechaInicio = new com.toedter.calendar.JDateChooser();
        TextoURLC = new javax.swing.JLabel();
        jDateChooserFechaAlta = new com.toedter.calendar.JDateChooser();
        jTextFieldURLC = new javax.swing.JTextField();
        jSpinnerRCHinicio = new javax.swing.JSpinner();
        TextoFAC = new javax.swing.JLabel();
        jSpinnerRCMinicio = new javax.swing.JSpinner();
        jButtonRCA = new javax.swing.JButton();

        setTitle("Registrar Clase");
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

        jButtonRCC.setText("Cancelar");
        jButtonRCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRCCActionPerformed(evt);
            }
        });

        jComboBoxURLC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxURLC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxURLCActionPerformed(evt);
            }
        });

        TextoIngreseDatosC.setText("Institucion:");

        jComboBoxProfesorC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProfesorC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProfesorCActionPerformed(evt);
            }
        });

        TextoNombreC.setText("Nombre de Clase:");

        jComboBoxNombreC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNombreCActionPerformed(evt);
            }
        });

        TextoProfesorC.setText("Profesor:");

        jComboBoxInstitucionesClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        TextoFIC.setText("Fecha de inicio:");

        TextoActividadC.setText("Actividad");

        jTextFieldNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreCActionPerformed(evt);
            }
        });

        jComboBoxActividadesC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxActividadesC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxActividadesCFocusGained(evt);
            }
        });

        TextoHIC.setText("Hora de Inicio:");

        TextoURLC.setText("URL:");

        jTextFieldURLC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldURLCActionPerformed(evt);
            }
        });

        TextoFAC.setText("Fecha de Alta");

        jButtonRCA.setText("Aceptar");
        jButtonRCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRCAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(TextoIngreseDatosC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxInstitucionesClase, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(TextoProfesorC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxProfesorC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoNombreC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextoFIC)
                            .addComponent(TextoFAC))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonRCC)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jDateChooserFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChooserFechaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jButtonRCA)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(TextoActividadC)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(TextoHIC)
                                        .addGap(4, 4, 4)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxActividadesC, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jSpinnerRCHinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSpinnerRCMinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextFieldURLC, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(TextoURLC, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxURLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoIngreseDatosC)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextoProfesorC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxProfesorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jComboBoxInstitucionesClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextoURLC)
                            .addComponent(jTextFieldURLC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxURLC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextoActividadC)
                            .addComponent(jComboBoxActividadesC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextoHIC)
                            .addComponent(jSpinnerRCHinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerRCMinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoFIC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoFAC)
                    .addComponent(jDateChooserFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRCC)
                    .addComponent(jButtonRCA))
                .addGap(53, 53, 53))
        );

        getAccessibleContext().setAccessibleName("Registrar Clase");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRCCActionPerformed
        jTextFieldNombreC.setText("");
        jTextFieldURLC.setText("");
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonRCCActionPerformed

    private void jComboBoxURLCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxURLCActionPerformed
        Object selectedItem = jComboBoxURLC.getSelectedItem();

        // Realizar acciones basadas en el elemento seleccionado
        if (selectedItem != null) {
            String selectedText = selectedItem.toString(); // Convertir el elemento a String
            jTextFieldURLC.setText(selectedText); // Establecer el texto en el JTextField
        }
    }//GEN-LAST:event_jComboBoxURLCActionPerformed

    private void jComboBoxProfesorCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProfesorCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxProfesorCActionPerformed

    private void jComboBoxNombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNombreCActionPerformed
        Object selectedItem = jComboBoxNombreC.getSelectedItem();

        // Realizar acciones basadas en el elemento seleccionado
        if (selectedItem != null) {
            String selectedText = selectedItem.toString(); // Convertir el elemento a String
            jTextFieldNombreC.setText(selectedText); // Establecer el texto en el JTextField
        }
    }//GEN-LAST:event_jComboBoxNombreCActionPerformed

    private void jTextFieldNombreCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreCActionPerformed

    private void addActividadesToComboBox(String option, String institucion) {

        List<ActividadDeportiva> actividades = ManejadorActividad.getActividades();
        // Object selectedItem;

        switch (option) {
            case "Actividad":

                // jComboBoxInstituciones.removeAllItems();

                // for (InstitucionDeportiva institucion : actividades) {
                // jComboBoxInstituciones.addItem(institucion.getNombre());
                // }

                // // selectedItem = jComboBoxInstituciones.getSelectedItem();

                // // if (selectedItem != null) {
                // // String selectedText = selectedItem.toString(); // Convertir el elemento a
                // // String
                // // }

                // break;
            case "Clase":

                jComboBoxActividadesC.removeAllItems();

                for (ActividadDeportiva actividad : actividades) {
                    jComboBoxActividadesC.addItem(actividad.getNombre());

                }

                // selectedItem = jComboBoxInstitucionesClase.getSelectedItem();

                // if (selectedItem != null) {
                // String selectedText = selectedItem.toString(); // Convertir el elemento a
                // String
                // }

                break;

            default:
                break;
        }
    }
    
    private void jComboBoxActividadesCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxActividadesCFocusGained
        String current = (String) jComboBoxInstitucionesClase.getSelectedItem();
        addActividadesToComboBox("Clase", current);
    }//GEN-LAST:event_jComboBoxActividadesCFocusGained

    private void jTextFieldURLCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldURLCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldURLCActionPerformed

    private void jButtonRCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRCAActionPerformed
        Fabrica factory = new Fabrica();
        IControllerAltaClase controllerAltaClase = factory.getControladorAltaClase();
        Date selectedDate = jDateChooserFechaInicio.getDate();
            LocalDate fechaInicio = selectedDate.toInstant()
                    .atZone(jDateChooserFechaInicio.getCalendar().getTimeZone().toZoneId()).toLocalDate();
            
        Date selectedDate2 = jDateChooserFechaAlta.getDate();
            LocalDate fechareg = selectedDate2.toInstant()
                    .atZone(jDateChooserFechaAlta.getCalendar().getTimeZone().toZoneId()).toLocalDate();
         final LocalTime horaInicio = LocalTime.of((int) jSpinnerRCHinicio.getValue(), (int) jSpinnerRCMinicio.getValue());
         
         Object actividades = jComboBoxActividadesC.getSelectedItem();
            String actividad = actividades.toString();
            
         Object profesores = jComboBoxProfesorC.getSelectedItem();
            String profesor = profesores.toString();
            
        String nombre = jTextFieldNombreC.getText();
        String url = jTextFieldURLC.getText();

          controllerAltaClase.addClase(nombre, fechaInicio, horaInicio, url, fechareg, profesor, actividad);
        jTextFieldNombreC.setText("");
        jTextFieldURLC.setText("");
    }//GEN-LAST:event_jButtonRCAActionPerformed

    private void addInstitucionesToComboBox(String option) {

        List<InstitucionDeportiva> instituciones = ManejadorInstitucion.getInstituciones();
        // Object selectedItem;

        switch (option) {
            case "Clase":

                jComboBoxInstitucionesClase.removeAllItems();

                for (InstitucionDeportiva institucion : instituciones) {
                    jComboBoxInstitucionesClase.addItem(institucion.getNombre());

                }

                // selectedItem = jComboBoxInstitucionesClase.getSelectedItem();

                // if (selectedItem != null) {
                // String selectedText = selectedItem.toString(); // Convertir el elemento a
                // String
                // }

                break;
            default:
                break;
        }
    }
    
    private void addProfesoresToComboBox() {

        List<Usuario> profesores = ManejadorUsuarios.getProfesores();

        jComboBoxProfesorC.removeAllItems();

        for (Usuario profesor : profesores) {
            jComboBoxProfesorC.addItem(profesor.getNickname());

        }

    }
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        addInstitucionesToComboBox("Clase");
        addProfesoresToComboBox();
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextoActividadC;
    private javax.swing.JLabel TextoFAC;
    private javax.swing.JLabel TextoFIC;
    private javax.swing.JLabel TextoHIC;
    private javax.swing.JLabel TextoIngreseDatosC;
    private javax.swing.JLabel TextoNombreC;
    private javax.swing.JLabel TextoProfesorC;
    private javax.swing.JLabel TextoURLC;
    private javax.swing.JButton jButtonRCA;
    private javax.swing.JButton jButtonRCC;
    private javax.swing.JComboBox<String> jComboBoxActividadesC;
    private javax.swing.JComboBox<String> jComboBoxInstitucionesClase;
    private javax.swing.JComboBox<String> jComboBoxNombreC;
    private javax.swing.JComboBox<String> jComboBoxProfesorC;
    private javax.swing.JComboBox<String> jComboBoxURLC;
    private com.toedter.calendar.JDateChooser jDateChooserFechaAlta;
    private com.toedter.calendar.JDateChooser jDateChooserFechaInicio;
    private javax.swing.JSpinner jSpinnerRCHinicio;
    private javax.swing.JSpinner jSpinnerRCMinicio;
    private javax.swing.JTextField jTextFieldNombreC;
    private javax.swing.JTextField jTextFieldURLC;
    // End of variables declaration//GEN-END:variables
}
