package logic.Presentacion;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Clase.controllers.ControllerRanking;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author santiagosaret
 */
public class RankingActividades extends javax.swing.JInternalFrame {

    /**
     * Creates new form RankingActividades
     */
    public RankingActividades() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRankingActividad = new javax.swing.JTable();
        Buscar = new javax.swing.JButton();
        Buscar1 = new javax.swing.JButton();
        jButtonCancelarRActividad = new javax.swing.JButton();

        jTableRankingActividad.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null }
                },
                new String[] {
                        "Nombre", "Costo", "Descripcion"
                }));
        jScrollPane1.setViewportView(jTableRankingActividad);

        Buscar.setText("Ranking");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Buscar1.setText("Ranking");
        Buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar1ActionPerformed(evt);
            }
        });

        jButtonCancelarRActividad.setText("Cancelar");
        jButtonCancelarRActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarRActividadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButtonCancelarRActividad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262,
                                        Short.MAX_VALUE)
                                .addComponent(Buscar1)
                                .addGap(55, 55, 55))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(22, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(340, 340, 340)
                                        .addComponent(Buscar)
                                        .addContainerGap(83, Short.MAX_VALUE))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(276, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCancelarRActividad))
                                .addGap(32, 32, 32))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(121, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(260, 260, 260)
                                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(87, Short.MAX_VALUE))));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BuscarActionPerformed

        // Crear una instancia del controlador
        ControllerRanking controllerRanking = new ControllerRanking();

        // Obtener el ranking de actividades
        List<ActividadDeportiva> rankingActividades = controllerRanking.obtenerRankingDeActividades();

        // Limpiar el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) jTableRankingActividad.getModel();
        model.setRowCount(0);

        // Llenar la tabla con los resultados del ranking
        for (ActividadDeportiva actividad : rankingActividades) {
            // Suponiendo que tienes un modelo de datos que coincida con la estructura de tu
            // JTable
            Object[] rowData = {
                    actividad.getNombre(), // Nombre de la actividad
                    actividad.getCosto(), // Costo de la actividad
                    actividad.getDescripcion() // Descripción de la actividad
            };

            // Agregar la fila al modelo de la tabla
            model.addRow(rowData);
        }

    }// GEN-LAST:event_BuscarActionPerformed

    private void Buscar1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Buscar1ActionPerformed

        // Crear una instancia del controlador
        ControllerRanking controllerRanking = new ControllerRanking();

        // Obtener el ranking de actividades
        List<ActividadDeportiva> rankingActividades = controllerRanking.obtenerRankingDeActividades();

        // Limpiar el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) jTableRankingActividad.getModel();
        model.setRowCount(0);

        // Llenar la tabla con los resultados del ranking
        for (ActividadDeportiva actividad : rankingActividades) {
            // Suponiendo que tienes un modelo de datos que coincida con la estructura de tu
            // JTable
            Object[] rowData = {
                    actividad.getNombre(), // Nombre de la actividad
                    actividad.getCosto(), // Costo de la actividad
                    actividad.getDescripcion() // Descripción de la actividad
            };

            // Agregar la fila al modelo de la tabla
            model.addRow(rowData);
        }

    }// GEN-LAST:event_Buscar1ActionPerformed

    private void jButtonCancelarRActividadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarRActividadActionPerformed

        this.dispose();
    }// GEN-LAST:event_jButtonCancelarRActividadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Buscar1;
    private javax.swing.JButton jButtonCancelarRActividad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRankingActividad;
    // End of variables declaration//GEN-END:variables
}
