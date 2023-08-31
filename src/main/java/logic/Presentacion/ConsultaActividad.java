/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package logic.Presentacion;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import javassist.expr.NewArray;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.controllers.IControllerConsultaActividad;
import logic.Fabrica;

/**
 *
 * @author santiagosaret
 */
public class ConsultaActividad extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaActividad
     */
    public ConsultaActividad() {
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

        jTextFieldBuscarActividad = new javax.swing.JTextField();
        jButtonBuscarActividad = new javax.swing.JButton();
        jScrollPaneConsultaUsuario = new javax.swing.JScrollPane();
        jTableListaActividad = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInformacionAsociadaa = new javax.swing.JTable();
        jButtonCancelarConsultaActividad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta Actividad");

        jButtonBuscarActividad.setText("Buscar");
        jButtonBuscarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActividadActionPerformed(evt);
            }
        });

        jTableListaActividad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Nickname", "Nombre", "Apellido", "Email","Fecha de Nacimiento"
            }
        ){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }});
            jTableListaActividad.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableListaActividadMouseClicked(evt);
                }
            });
            jScrollPaneConsultaUsuario.setViewportView(jTableListaActividad);

            jTableInformacionAsociadaa.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                    "Clase", "URL", "Actividad Deportiva", "Descripcion"
                }
            ){
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Make all cells non-editable
                }});
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
                        .addGap(66, 66, 66)
                        .addComponent(jTextFieldBuscarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscarActividad)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPaneConsultaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarConsultaActividad)
                        .addGap(31, 31, 31))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBuscarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscarActividad))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPaneConsultaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelarConsultaActividad)
                        .addContainerGap(20, Short.MAX_VALUE))
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActividadActionPerformed
        String input = jTextFieldBuscarActividad.getText();

        if (input.length() > 3) {
            Fabrica factory = new Fabrica();
            IControllerConsultaActividad consultaActividad = factory.getControllerConsultaActividad();
            ActividadDeportiva ActividadDep =  consultaActividad.obtenerActividadPorNombre(input);
            List<ActividadDeportiva> searchResult = NewArrayList[];
            searchResult.add(ActividadDep);
            

            if (!searchResult.isEmpty() || searchResult.get(0) != null) {

                DefaultTableModel tableModel = (DefaultTableModel) jTableListaActividad.getModel();

                tableModel.setRowCount(0);

                for (ActividadDeportiva fila : searchResult) {
                    Object[] rowData = { fila.getNombre(), fila.getDescripcion(),
                        fila.getDuracion(),
                        fila.getCosto(),fila.getFechaReg()};
                    tableModel.addRow(rowData);
                }
                // private String nombre;
                // private String descripcion;
                // private int duracion;
                //  private float costo;
                // private LocalDate fechaReg;

                // Notificar al modelo de la tabla que se han realizado cambios
                tableModel.fireTableDataChanged();
            }

        }
    }//GEN-LAST:event_jButtonBuscarActividadActionPerformed

    private void jTableListaActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaActividadMouseClicked
        System.out.println("In event");
        int viewRow = jTableListaActividad.getSelectedRow();

        if (viewRow != -1) {

            // Better to access table row using modelRow rather than viewRow
            int modelRow = jTableListaActividad.convertRowIndexToModel(viewRow);

            // Access value at selected row at the second column (columnIndex = 1)
            Object modelvalue = jTableListaActividad.getModel().getValueAt(modelRow, 0);

            // Print cell value
            System.out.println(modelvalue);
            Fabrica factory = new Fabrica();

            IControllerConsultaActividad consultaActividad = factory.getControllerConsultaActividad();

            String nickname = (String) modelvalue;

            ActividadDeportiva selectedUser = consultaActividad.getNombre(Nombre).get(0);

            List<ActividadDeportiva> searchResult = NewArrayList[];
            searchResult.add(ActividadDep);

    }//GEN-LAST:event_jTableListaActividadMouseClicked

    private void jTableInformacionAsociadaaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInformacionAsociadaaMouseClicked
        int selectedRow = jTableInformacionAsociadaa.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) jTableInformacionAsociadaa.getModel();

            String nickname = model.getValueAt(selectedRow, 0).toString();
            String nombre = model.getValueAt(selectedRow, 1).toString();
            String apellido = model.getValueAt(selectedRow, 2).toString();
            String email = model.getValueAt(selectedRow, 3).toString();
            String fechaNacimiento = model.getValueAt(selectedRow, 4).toString();

            // Now you can use the extracted data for further processing or display
            System.out.println("Nickname: " + nickname);
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Email: " + email);
            System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        }
    }//GEN-LAST:event_jTableInformacionAsociadaaMouseClicked

    private void jButtonCancelarConsultaActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarConsultaActividadActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) jTableInformacionAsociadaa.getModel();

        tableModel.setRowCount(0);

        tableModel = (DefaultTableModel) jTableListaActividad.getModel();

        tableModel.setRowCount(0);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarConsultaActividadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaActividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaActividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarActividad;
    private javax.swing.JButton jButtonCancelarConsultaActividad;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneConsultaUsuario;
    private javax.swing.JTable jTableInformacionAsociadaa;
    private javax.swing.JTable jTableListaActividad;
    private javax.swing.JTextField jTextFieldBuscarActividad;
    // End of variables declaration//GEN-END:variables
}
