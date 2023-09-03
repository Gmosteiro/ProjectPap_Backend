/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logic.Presentacion;

import static java.lang.ProcessHandle.current;
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

    /**
     * Creates new form ModificarActividad
     */
    public ModificarActividad() {
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

        jComboBoxActividadesM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCanceloMA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonModificarActividad)
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxActividadesM, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCosto)
                                    .addComponent(jTextFieldDuracionAct)
                                    .addComponent(jTextFieldDescAct))
                                .addGap(56, 56, 56)))
                        .addGap(125, 125, 125))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxActividadesM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDescAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDuracionAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificarActividad)
                    .addComponent(jButtonCanceloMA))
                .addGap(140, 140, 140))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
          addActividadesToComboBox("Actividad");
    }//GEN-LAST:event_formInternalFrameOpened

    private void jComboBoxActividadesMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActividadesMActionPerformed
           // Cuando se seleccione una actividad en el JComboBox
    Object selectedItem = jComboBoxActividadesM.getSelectedItem();

    if (selectedItem != null) {
        String nombreActividadSeleccionada = selectedItem.toString();

        // Obtener la actividad seleccionada del manejador de actividades
        ManejadorActividad manejador = new ManejadorActividad();
        ActividadDeportiva actividadSeleccionada = manejador.obtenerActividadPorNombre(nombreActividadSeleccionada);

        // Verificar si se encontró la actividad
        if (actividadSeleccionada != null) {
            // Cargar los datos de la actividad en los campos JTextField
            jTextFieldDescAct.setText(actividadSeleccionada.getDescripcion());
            jTextFieldDuracionAct.setText(Integer.toString(actividadSeleccionada.getDuracion()));
            jTextFieldCosto.setText(String.valueOf(actividadSeleccionada.getCosto()));
        } else {
            // Manejar el caso en el que no se encontró la actividad
            // Puedes mostrar un mensaje de error o realizar alguna otra acción
            JOptionPane.showMessageDialog(this, "No se encontró la actividad seleccionada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_jComboBoxActividadesMActionPerformed

    private void jButtonCanceloMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanceloMAActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCanceloMAActionPerformed

    private void jButtonModificarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActividadActionPerformed
      // Obtener los datos de los campos JTextField
    String nombreActividadSeleccionada = jComboBoxActividadesM.getSelectedItem().toString();
    String nuevaDescripcion = jTextFieldDescAct.getText();
    int nuevaDuracion = Integer.parseInt(jTextFieldDuracionAct.getText());
    float nuevoCosto = Float.parseFloat(jTextFieldCosto.getText());

    // Crear una instancia del controlador
    ControllerModificarActividad controller = new ControllerModificarActividad();

    // Llamar al método para modificar la actividad
    boolean modificacionExitosa = controller.modificarActividad(nombreActividadSeleccionada, nuevaDescripcion, nuevaDuracion, nuevoCosto);

    // Mostrar un mensaje al usuario
    if (modificacionExitosa) {
        JOptionPane.showMessageDialog(this, "Actividad modificada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo modificar la actividad.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButtonModificarActividadActionPerformed

    private void addActividadesToComboBox(String option) {
           // Obtener la lista de actividades y cargarlas en el JComboBox
    List<ActividadDeportiva> actividades = ManejadorActividad.getActividades();

    if (actividades.isEmpty()) {
        // Manejar el caso en el que no hay actividades disponibles
        JOptionPane.showMessageDialog(this, "No hay actividades disponibles.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldCosto;
    private javax.swing.JTextField jTextFieldDescAct;
    private javax.swing.JTextField jTextFieldDuracionAct;
    // End of variables declaration//GEN-END:variables
}
