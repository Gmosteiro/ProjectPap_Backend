/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application;

import application.Ventana;
import javax.swing.JInternalFrame;
import logic.Presentacion.*;

/**
 *
 * @author Admin
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuRInstitucion = new javax.swing.JMenuItem();
        jMenuItemRCliente = new javax.swing.JMenuItem();
        jMenuItemRActividad = new javax.swing.JMenuItem();
        jMenuItemRClase = new javax.swing.JMenuItem();
        jMenuItemRDictado = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuConsultarUsuario = new javax.swing.JMenuItem();
        jMenuConsutaActividad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 720));
        setSize(new java.awt.Dimension(800, 720));

        jDesktopPane1.setMinimumSize(new java.awt.Dimension(790, 700));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jMenuInicio.setText("Inicio");
        jMenuInicio.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenuInicioMenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenuInicio);

        jMenuRegistro.setText("Registros");

        jMenuRInstitucion.setText("Registrar Institucion");
        jMenuRInstitucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRInstitucionActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuRInstitucion);

        jMenuItemRCliente.setText("Registrar Cliente");
        jMenuItemRCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRClienteActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemRCliente);

        jMenuItemRActividad.setText("Registrar Actividad");
        jMenuItemRActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRActividadActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemRActividad);

        jMenuItemRClase.setText("Registrar Clase");
        jMenuItemRClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRClaseActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemRClase);

        jMenuItemRDictado.setText("Registrar Dictado");
        jMenuItemRDictado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRDictadoActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemRDictado);

        jMenuBar1.add(jMenuRegistro);

        jMenuConsultas.setText("Consultas");

        jMenuConsultarUsuario.setText("Consultar Usuario");
        jMenuConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultarUsuarioActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsultarUsuario);

        jMenuConsutaActividad.setText("Consutar Actividad");
        jMenuConsutaActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsutaActividadActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuConsutaActividad);

        jMenuBar1.add(jMenuConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Ventanita");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jMenuInicioMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenuInicioMenuSelected
        JInternalFrame[] frames = jDesktopPane1.getAllFrames();
    for (JInternalFrame frame : frames) {
        frame.dispose();}
    }//GEN-LAST:event_jMenuInicioMenuSelected

    private void jMenuItemRDictadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRDictadoActionPerformed
        RegistrarDictadoClase diclase = new RegistrarDictadoClase();
        diclase.setSize(760, 500);
        diclase.setLocation(15, 50);
        diclase.setVisible(true);
        // internalFrame.setSize(300, 200);
        // internalFrame.setVisible(true);
        jDesktopPane1.add(diclase);
        diclase.toFront();
    }//GEN-LAST:event_jMenuItemRDictadoActionPerformed

    private void jMenuItemRClaseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemRClaseActionPerformed
        RegistrarClaseCU reclase = new RegistrarClaseCU();
        reclase.setSize(760, 500);
        reclase.setLocation(15, 50);
        reclase.setVisible(true);
        // internalFrame.setSize(300, 200);
        // internalFrame.setVisible(true);
        jDesktopPane1.add(reclase);
        reclase.toFront();
    }// GEN-LAST:event_jMenuItemRClaseActionPerformed

    private void jMenuConsutaActividadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuConsutaActividadActionPerformed
//        ConsultaActividades conactividad = new ConsultaActividades();
//        conactividad.setSize(760, 500);
//        conactividad.setLocation(15, 50);
//        conactividad.setVisible(true);
//        // internalFrame.setSize(300, 200);
//        // internalFrame.setVisible(true);
//        jDesktopPane1.add(conactividad);
//        conactividad.toFront();
        // Establecer ubicación centrada
    }// GEN-LAST:event_jMenuConsutaActividadActionPerformed

    // private void jTextFieldNombreCActionPerformed(java.awt.event.ActionEvent evt)
    // {// GEN-FIRST:event_jTextFieldNombreCActionPerformed
    // // TODO add your handling code here:
    // }// GEN-LAST:event_jTextFieldNombreCActionPerformed

    private void jMenuItemRActividadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemRActividadActionPerformed
        RegistrarActividadCU reactividad = new RegistrarActividadCU();
        reactividad.setSize(560, 500);
        reactividad.setLocation(50, 50);
        reactividad.setVisible(true);
        // internalFrame.setSize(300, 200);
        // internalFrame.setVisible(true);
        jDesktopPane1.add(reactividad);
        reactividad.toFront();// TODO add your handling code here:
    }// GEN-LAST:event_jMenuItemRActividadActionPerformed

    private void jMenuItemRClienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemRClienteActionPerformed
        RegistrarUsuarioCU reusuario = new RegistrarUsuarioCU();
        reusuario.setSize(560, 500);
        reusuario.setLocation(50, 50);
        reusuario.setVisible(true);
        jDesktopPane1.add(reusuario);
        reusuario.toFront();

    }// GEN-LAST:event_jMenuItemRClienteActionPerformed

    private void jMenuRInstitucionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuRInstitucionActionPerformed
        RegistrarInstitucionCU reginstitucion = new RegistrarInstitucionCU();
        reginstitucion.setSize(397, 250);
        reginstitucion.setLocation(180, 60);
        reginstitucion.setVisible(true);
        jDesktopPane1.add(reginstitucion);
        reginstitucion.toFront();
    }// GEN-LAST:event_jMenuRInstitucionActionPerformed

    private void jMenuConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuConsultarUsuarioActionPerformed
        ConsultaUsuario consulta = new ConsultaUsuario();
        consulta.setSize(750, 600); // Establecer el tamaño deseado

        // Obtener dimensiones del jDesktopPane1
        int desktopWidth = jDesktopPane1.getWidth();
        int desktopHeight = jDesktopPane1.getHeight();

        // Calcular coordenadas para centrar el JInternalFrame
        int x = (desktopWidth - consulta.getWidth()) / 2;
        int y = (desktopHeight - consulta.getHeight()) / 2;

        consulta.setLocation(x - 10, y - 20);
        consulta.setVisible(true);
        jDesktopPane1.add(consulta);
        consulta.toFront();
    }// GEN-LAST:event_jMenuConsultarUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuConsultarUsuario;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuConsutaActividad;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItemRActividad;
    private javax.swing.JMenuItem jMenuItemRClase;
    private javax.swing.JMenuItem jMenuItemRCliente;
    private javax.swing.JMenuItem jMenuItemRDictado;
    private javax.swing.JMenuItem jMenuRInstitucion;
    private javax.swing.JMenu jMenuRegistro;
    // End of variables declaration//GEN-END:variables

}
