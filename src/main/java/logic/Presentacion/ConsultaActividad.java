/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logic.Presentacion;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import logic.Fabrica;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.controllers.IControllerConsultaActividad;
import logic.Clase.Clase;


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneConsultaActividad = new javax.swing.JScrollPane();
        jTableListaActividad = new javax.swing.JTable();
        jTextFieldBuscarActividad = new javax.swing.JTextField();
        jButtonBuscarActividad = new javax.swing.JButton();
        jButtonCancelarConsultaActividad = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableInformacionAsociadaa = new javax.swing.JTable();

        setTitle("Consultar Usuario");
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

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
            jScrollPaneConsultaActividad.setViewportView(jTableListaActividad);

            jButtonBuscarActividad.setText("Buscar");
            jButtonBuscarActividad.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonBuscarActividadActionPerformed(evt);
                }
            });

            jButtonCancelarConsultaActividad.setText("Cancelar");
            jButtonCancelarConsultaActividad.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonCancelarConsultaActividadActionPerformed(evt);
                }
            });

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
                jScrollPane3.setViewportView(jTableInformacionAsociadaa);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextFieldBuscarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonBuscarActividad)
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCancelarConsultaActividad)
                                .addGap(327, 327, 327))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPaneConsultaActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBuscarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscarActividad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneConsultaActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarConsultaActividad))
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents




private ControllerConsultaActividad consultaActividadController;
    
    public class ConsultaActividad extends javax.swing.JInternalFrame {
   
    private void jTableListaActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaActividadMouseClicked

         int selectedRow = jTableListaActividad.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) jTableListaActividad.getModel();
            String nombreActividad = model.getValueAt(selectedRow, 1).toString();

            ActividadDeportiva actividad = consultaActividadController.obtenerActividadPorNombre(nombreActividad);

            if (actividad != null) {
                List<Clase> clasesAsociadas = consultaActividadController.obtenerClasesPorActividad(actividad);

                DefaultTableModel tableModel = (DefaultTableModel) jTableInformacionAsociadaa.getModel();
                tableModel.setRowCount(0);

                for (Clase clase : clasesAsociadas) {
                    Object[] rowData = { clase.getNombre(), clase.getUrl(), actividad.getNombre(), actividad.getDescripcion() };
                    tableModel.addRow(rowData);
                }

                tableModel.fireTableDataChanged();
            }
        }
        
    }//GEN-LAST:event_jTableListaActividadMouseClicked

    private void jButtonBuscarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActividadActionPerformed
        
      String input = jTextFieldBuscarActividad.getText();

        if (input.length() > 3) {
            List<ActividadDeportiva> searchResult = consultaActividadController.obtenerActividadesPorNombre(input);

            DefaultTableModel tableModel = (DefaultTableModel) jTableListaActividad.getModel();
            tableModel.setRowCount(0);

            for (ActividadDeportiva actividad : searchResult) {
                Object[] rowData = { actividad.getInstitucion().getNombre(), actividad.getNombre() };
                tableModel.addRow(rowData);
            }

            tableModel.fireTableDataChanged();
        }
    }
        

//GEN-LAST:event_jButtonBuscarActividadActionPerformed

    private void jButtonCancelarConsultaActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarConsultaActividadActionPerformed
        
      consultaActividadController.closeEntityManagerFactory();

    DefaultTableModel tableModel = (DefaultTableModel) jTableInformacionAsociadaa.getModel();
    tableModel.setRowCount(0);

    tableModel = (DefaultTableModel) jTableListaActividad.getModel();
    tableModel.setRowCount(0);

    this.dispose();
        
    }//GEN-LAST:event_jButtonCancelarConsultaActividadActionPerformed

    private void jTableInformacionAsociadaaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInformacionAsociadaaMouseClicked
       
      consultaActividadController.closeEntityManagerFactory();

        DefaultTableModel tableModel = (DefaultTableModel) jTableInformacionAsociadaa.getModel();
        tableModel.setRowCount(0);

        tableModel = (DefaultTableModel) jTableListaActividad.getModel();
        tableModel.setRowCount(0);

        this.dispose();
    }


//GEN-LAST:event_jTableInformacionAsociadaaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarActividad;
    private javax.swing.JButton jButtonCancelarConsultaActividad;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneConsultaActividad;
    private javax.swing.JTable jTableInformacionAsociadaa;
    private javax.swing.JTable jTableListaActividad;
    private javax.swing.JTextField jTextFieldBuscarActividad;
    // End of variables declaration//GEN-END:variables
}
