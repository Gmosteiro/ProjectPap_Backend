/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package logic.Presentacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.table.DefaultTableModel;

import logic.Fabrica;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.Usuario.Profesor;
import logic.Usuario.Socio;
import logic.Usuario.Usuario;
import logic.Usuario.controllers.IControllerConsultaUsuario;
import logic.Clase.Clase;

/**
 *
 * @author Admin
 */
public class ConsultaUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaActividad
     */
    public ConsultaUsuario() {
        initComponents();
        Fabrica factory = new Fabrica();
        IControllerConsultaUsuario controllerConsultaUsuario = factory.getControladorConsultaUsuario();
        List<Usuario> resultados = controllerConsultaUsuario.getUsuarios();

        // Obtener el modelo de la tabla jTableListaUsuario
        DefaultTableModel tableModel = (DefaultTableModel) jTableListaUsuario.getModel();

        // Iterar a través de los resultados y agregar cada fila a la tabla
        for (Usuario fila : resultados) {
            Object[] rowData = { fila.getNickname(), fila.getNombre(), fila.getApellido(), fila.getEmail(),
                    fila.getFechaNacFromatted() /*
                                                 * Otros
                                                 * atributos
                                                 */ };
            tableModel.addRow(rowData);
        }
        tableModel.fireTableDataChanged();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneConsultaUsuario = new javax.swing.JScrollPane();
        jTableListaUsuario = new javax.swing.JTable();
        jTextFieldBuscarUsuario = new javax.swing.JTextField();
        jButtonBuscarUsuario = new javax.swing.JButton();
        jButtonCancelarConsultaUsuario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInformacionAsociada = new javax.swing.JTable();
        LabelClasesAsociadas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableActividadesAsociadas = new javax.swing.JTable();
        LabelActividadesAsociadas = new javax.swing.JLabel();

        setTitle("Consultar Usuario");
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jTableListaUsuario.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Nickname", "Nombre", "Apellido", "Email", "Fecha de Nacimiento"
                }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        });
        jTableListaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaUsuarioMouseClicked(evt);
            }
        });
        jScrollPaneConsultaUsuario.setViewportView(jTableListaUsuario);

        jButtonBuscarUsuario.setText("Buscar");
        jButtonBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarUsuarioActionPerformed(evt);
            }
        });

        jButtonCancelarConsultaUsuario.setText("Cancelar");
        jButtonCancelarConsultaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarConsultaUsuarioActionPerformed(evt);
            }
        });

        jTableInformacionAsociada.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Clase", "Fecha", "Fecha Registro", "Hora", "URL", "Profesor"
                }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        });
        jTableInformacionAsociada.setEnabled(false);
        jTableInformacionAsociada.setName("Informacion Asociada"); // NOI18N
        jTableInformacionAsociada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInformacionAsociadaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableInformacionAsociada);

        LabelClasesAsociadas.setText("Clases Asociadas:");

        jTableActividadesAsociadas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                },
                new String[] {
                        "Nombre", "Costo", "Descripcion", "Duracion", "Fecha"
                }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        });
        jTableActividadesAsociadas.setEnabled(false);
        jTableActividadesAsociadas.setName("Informacion Asociada"); // NOI18N
        jTableActividadesAsociadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableActividadesAsociadasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableActividadesAsociadas);

        LabelActividadesAsociadas.setText("Actividades Asociadas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(jTextFieldBuscarUsuario,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 247,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonBuscarUsuario)
                                                .addGap(22, 22, 22))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButtonCancelarConsultaUsuario)
                                                .addGap(277, 277, 277))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 392,
                                                Short.MAX_VALUE)
                                        .addComponent(jScrollPaneConsultaUsuario,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(LabelClasesAsociadas)
                                                        .addComponent(LabelActividadesAsociadas))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonBuscarUsuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneConsultaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 144,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelClasesAsociadas)
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelActividadesAsociadas)
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 88,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jButtonCancelarConsultaUsuario)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableActividadesAsociadasMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableActividadesAsociadasMouseClicked

    }// GEN-LAST:event_jTableActividadesAsociadasMouseClicked

    public String getFechaFormatted(LocalDate fecha) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Convert LocalDate to LocalDateTime to enable formatting
        String formattedDate = fecha.atStartOfDay().format(formatter);
        return formattedDate;
    }

    private void jTableListaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableListaUsuarioMouseClicked
        int viewRow = jTableListaUsuario.getSelectedRow();

        if (viewRow != -1) {

            int modelRow = jTableListaUsuario.convertRowIndexToModel(viewRow);

            Object modelvalue = jTableListaUsuario.getModel().getValueAt(modelRow, 0);

            System.out.println(modelvalue);
            Fabrica factory = new Fabrica();

            IControllerConsultaUsuario consultaUsuario = factory.getControladorConsultaUsuario();

            String nickname = (String) modelvalue;

            Usuario selectedUser = consultaUsuario.getUsuarios(nickname).get(0);

            if (selectedUser instanceof Profesor) {

                List<Clase> searchResult = consultaUsuario.getClasesAsociadasByProfe((Profesor) selectedUser);

                if (!searchResult.isEmpty() || searchResult.get(0) != null) {

                    DefaultTableModel tableModel = (DefaultTableModel) jTableInformacionAsociada
                            .getModel();

                    tableModel.setRowCount(0);

                    for (Clase fila : searchResult) {
                        Object[] rowData = { fila.getNombre(), fila.getFechaFormatted(),
                                getFechaFormatted(fila.getFechaReg()),
                                fila.getHora(),
                                fila.getUrl(), fila.getProfesor().getNickname() };
                        tableModel.addRow(rowData);
                    }

                    // Notificar al modelo de la tabla que se han realizado cambios
                    tableModel.fireTableDataChanged();
                }

                List<ActividadDeportiva> actividadesList1 = consultaUsuario
                        .getActividadesAsociadas((Profesor) selectedUser);

                Set<ActividadDeportiva> actividadesSet = new HashSet<>(actividadesList1);

                List<ActividadDeportiva> Actividades = new ArrayList<>(actividadesSet);

                DefaultTableModel tableModelActividades = (DefaultTableModel) jTableActividadesAsociadas.getModel();

                tableModelActividades.setRowCount(0);

                if (!Actividades.isEmpty() || Actividades.get(0) != null) {

                    for (ActividadDeportiva actividad : Actividades) {
                        Object[] rowData = { actividad.getNombre(), "$" + actividad.getCosto(),
                                actividad.getDescripcion(), actividad.getDuracion(),
                                getFechaFormatted(actividad.getFechaReg()) };
                        tableModelActividades.addRow(rowData);
                    }

                    tableModelActividades.fireTableDataChanged();
                }

            } else if (selectedUser instanceof Socio) {

                DefaultTableModel tableModelActividades = (DefaultTableModel) jTableActividadesAsociadas.getModel();

                tableModelActividades.setRowCount(0);
                tableModelActividades.fireTableDataChanged();

                List<Clase> listaClasesSocio = consultaUsuario.getClasesAsociadasBySocio((Socio) selectedUser);
                DefaultTableModel tableModel = (DefaultTableModel) jTableInformacionAsociada.getModel();

                tableModel.setRowCount(0);

                if (!listaClasesSocio.isEmpty() || listaClasesSocio.get(0) != null) {

                    for (Clase clase : listaClasesSocio) {
                        Object[] rowData = { clase.getNombre(), clase.getFechaFormatted(),
                                getFechaFormatted(clase.getFechaReg()),
                                clase.getHora(),
                                clase.getUrl(), clase.getProfesor().getNickname() };
                        tableModel.addRow(rowData);
                    }

                    tableModel.fireTableDataChanged();
                }

                jTableActividadesAsociadas.removeAll();

            }

        }
    }// GEN-LAST:event_jTableListaUsuarioMouseClicked

    private void jButtonBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonBuscarUsuarioActionPerformed
        String input = jTextFieldBuscarUsuario.getText();

        if (input.length() > 3) {
            Fabrica factory = new Fabrica();
            IControllerConsultaUsuario consultaUsuario = factory.getControladorConsultaUsuario();
            List<Usuario> searchResult = consultaUsuario.getUsuarios(input);

            if (!searchResult.isEmpty() || searchResult.get(0) != null) {

                DefaultTableModel tableModel = (DefaultTableModel) jTableListaUsuario.getModel();

                tableModel.setRowCount(0);

                for (Usuario fila : searchResult) {
                    Object[] rowData = { fila.getNickname(), fila.getNombre(), fila.getApellido(),
                            fila.getEmail(),
                            fila.getFechaNacFromatted() };
                    tableModel.addRow(rowData);
                }

                // Notificar al modelo de la tabla que se han realizado cambios
                tableModel.fireTableDataChanged();
            }

        }

    }// GEN-LAST:event_jButtonBuscarUsuarioActionPerformed

    private void jButtonCancelarConsultaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarConsultaUsuarioActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) jTableInformacionAsociada.getModel();

        tableModel.setRowCount(0);

        tableModel = (DefaultTableModel) jTableListaUsuario.getModel();

        tableModel.setRowCount(0);
        this.dispose();
    }// GEN-LAST:event_jButtonCancelarConsultaUsuarioActionPerformed

    private void jTableInformacionAsociadaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableInformacionAsociadaMouseClicked
        int selectedRow = jTableInformacionAsociada.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) jTableInformacionAsociada.getModel();

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
    }// GEN-LAST:event_jTableInformacionAsociadaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelActividadesAsociadas;
    private javax.swing.JLabel LabelClasesAsociadas;
    private javax.swing.JButton jButtonBuscarUsuario;
    private javax.swing.JButton jButtonCancelarConsultaUsuario;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneConsultaUsuario;
    private javax.swing.JTable jTableActividadesAsociadas;
    private javax.swing.JTable jTableInformacionAsociada;
    private javax.swing.JTable jTableListaUsuario;
    private javax.swing.JTextField jTextFieldBuscarUsuario;
    // End of variables declaration//GEN-END:variables
}
