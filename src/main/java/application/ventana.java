/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import application.Ventana;
import logic.Fabrica;
import logic.ActividadDeportiva.controllers.IControllerAltaActividad;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Profesor;
import logic.Usuario.Socio;
import logic.Usuario.Usuario;
import logic.Usuario.controllers.ControllerConsultaUsuario;
import logic.Usuario.controllers.IControllerAltaUsuario;
import logic.Usuario.controllers.IControllerConsultaUsuario;
import logic.Clase.controllers.IControllerAltaClase;
import logic.Clase.controllers.IControllerDictadoClase;
import logic.Institucion.InstitucionDeportiva;

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
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jDesktopPane1 = new javax.swing.JDesktopPane();
                RegistrarClienteCU = new javax.swing.JInternalFrame();
                jTextField2 = new javax.swing.JTextField();
                jButton3 = new javax.swing.JButton();
                jTextField3 = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jTextField4 = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jSpinner1 = new javax.swing.JSpinner();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jSpinner2 = new javax.swing.JSpinner();
                jLabel7 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jSpinner3 = new javax.swing.JSpinner();
                jButton2 = new javax.swing.JButton();
                jComboBox1 = new javax.swing.JComboBox<>();
                jComboBox2 = new javax.swing.JComboBox<>();
                jComboBox3 = new javax.swing.JComboBox<>();
                jComboBox4 = new javax.swing.JComboBox<>();
                jLabel2 = new javax.swing.JLabel();
                jTextField5 = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                jTextField6 = new javax.swing.JTextField();
                jLabel9 = new javax.swing.JLabel();
                jTextField7 = new javax.swing.JTextField();
                jCheckBox1 = new javax.swing.JCheckBox();
                RegistrarClaseCU = new javax.swing.JInternalFrame();
                jButtonRCC = new javax.swing.JButton();
                jLabel15 = new javax.swing.JLabel();
                jLabel16 = new javax.swing.JLabel();
                jLabel17 = new javax.swing.JLabel();
                jLabel18 = new javax.swing.JLabel();
                jTextField12 = new javax.swing.JTextField();
                jTextField14 = new javax.swing.JTextField();
                jLabel19 = new javax.swing.JLabel();
                jSpinner4 = new javax.swing.JSpinner();
                jLabel20 = new javax.swing.JLabel();
                jLabel21 = new javax.swing.JLabel();
                jSpinner5 = new javax.swing.JSpinner();
                jLabel22 = new javax.swing.JLabel();
                jTextField15 = new javax.swing.JTextField();
                jSpinner6 = new javax.swing.JSpinner();
                jSpinner10 = new javax.swing.JSpinner();
                jSpinner11 = new javax.swing.JSpinner();
                jLabel23 = new javax.swing.JLabel();
                jSpinner13 = new javax.swing.JSpinner();
                jSpinner14 = new javax.swing.JSpinner();
                jSpinner12 = new javax.swing.JSpinner();
                jButtonRCA = new javax.swing.JButton();
                jComboBox7 = new javax.swing.JComboBox<>();
                jComboBox8 = new javax.swing.JComboBox<>();
                jComboBox9 = new javax.swing.JComboBox<>();
                RegistrarActividadCU = new javax.swing.JInternalFrame();
                jButton4 = new javax.swing.JButton();
                jButton5 = new javax.swing.JButton();
                jTextField8 = new javax.swing.JTextField();
                jSpinner7 = new javax.swing.JSpinner();
                jSpinner8 = new javax.swing.JSpinner();
                jSpinner9 = new javax.swing.JSpinner();
                jTextField9 = new javax.swing.JTextField();
                jTextField10 = new javax.swing.JTextField();
                jLabel10 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jTextField11 = new javax.swing.JTextField();
                jLabel14 = new javax.swing.JLabel();
                jComboBox5 = new javax.swing.JComboBox<>();
                jInternalFrame1 = new javax.swing.JInternalFrame();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                ConsultarUsuarioCU = new javax.swing.JInternalFrame();
                jScrollPaneConsultaUsuario = new javax.swing.JScrollPane();
                jTable2 = new javax.swing.JTable();
                jTextFieldBuscarUsuario = new javax.swing.JTextField();
                jButtonBuscarUsuario = new javax.swing.JButton();
                jButtonCancelarConsultaUsuario = new javax.swing.JButton();
                jScrollPane2 = new javax.swing.JScrollPane();
                jTableInformacionAsociada = new javax.swing.JTable();
                jMenuBar1 = new javax.swing.JMenuBar();
                jMenu1 = new javax.swing.JMenu();
                jMenu2 = new javax.swing.JMenu();
                jMenuItem1 = new javax.swing.JMenuItem();
                jMenuItem2 = new javax.swing.JMenuItem();
                jMenuItem3 = new javax.swing.JMenuItem();
                jMenuItem4 = new javax.swing.JMenuItem();
                jMenu4 = new javax.swing.JMenu();
                jMenuConsultarUsuario = new javax.swing.JMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setPreferredSize(new java.awt.Dimension(800, 720));
                setSize(new java.awt.Dimension(800, 720));

                jDesktopPane1.setMinimumSize(new java.awt.Dimension(790, 700));

                javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
                jDesktopPane1.setLayout(jDesktopPane1Layout);
                jDesktopPane1Layout.setHorizontalGroup(
                                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 804, Short.MAX_VALUE));
                jDesktopPane1Layout.setVerticalGroup(
                                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 700, Short.MAX_VALUE));

                RegistrarClienteCU.setResizable(true);
                RegistrarClienteCU.setTitle("Registrar Usuario");
                RegistrarClienteCU.setToolTipText("");
                RegistrarClienteCU.setName("RegistrarClienteCU"); // NOI18N
                try {
                        RegistrarClienteCU.setSelected(true);
                } catch (java.beans.PropertyVetoException e1) {
                        e1.printStackTrace();
                }
                RegistrarClienteCU.setVisible(false);

                jButton3.setText("Cancelar");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jLabel1.setText("Nombre:");

                jLabel3.setText("Apellido:");

                jLabel4.setText("Nickname:");

                jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

                jLabel5.setText("Correo electrónico:");

                jLabel6.setText("Fecha de nacimiento:");

                jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

                jLabel7.setText("Ingrese los siguientes datos:");

                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1ActionPerformed(evt);
                        }
                });

                jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2023, 1));

                jButton2.setText("Aceptar");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox1ActionPerformed(evt);
                        }
                });

                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                jComboBox2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox2ActionPerformed(evt);
                        }
                });

                jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                jComboBox3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox3ActionPerformed(evt);
                        }
                });

                jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                jComboBox4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox4ActionPerformed(evt);
                        }
                });

                jLabel2.setText("Descripción:");

                jLabel8.setText("Biografia:");

                jLabel9.setText("Sitio web:");

                jCheckBox1.setText("Profesor?");
                jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout RegistrarClienteCULayout = new javax.swing.GroupLayout(
                                RegistrarClienteCU.getContentPane());
                RegistrarClienteCU.getContentPane().setLayout(RegistrarClienteCULayout);
                RegistrarClienteCULayout.setHorizontalGroup(
                                RegistrarClienteCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(RegistrarClienteCULayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(RegistrarClienteCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                RegistrarClienteCULayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                                                .addComponent(jButton2)
                                                                                                                .addGap(44, 44, 44)
                                                                                                                .addComponent(jButton3)
                                                                                                                .addGap(131, 131,
                                                                                                                                131))
                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(155, 155,
                                                                                                                                                155)
                                                                                                                                .addComponent(jLabel7))
                                                                                                                .addComponent(jCheckBox1)
                                                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                false)
                                                                                                                                                .addComponent(jLabel1,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                67,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                67,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel4,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                67,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel5)
                                                                                                                                                .addComponent(jLabel6,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel2,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel8,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel9,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                .addGap(145, 145,
                                                                                                                                                145)
                                                                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jTextField7,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                201,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jTextField5,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                201,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jTextField3,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                201,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(jComboBox3,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jTextField1,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                201,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(jComboBox1,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jTextField2,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                201,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(jComboBox2,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jSpinner1,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                53,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(38, 38, 38)
                                                                                                                                                                .addComponent(jSpinner2,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                57,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(jSpinner3,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                81,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jTextField4,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                201,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(jComboBox4,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addComponent(jTextField6,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                201,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))));
                RegistrarClienteCULayout.setVerticalGroup(
                                RegistrarClienteCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(RegistrarClienteCULayout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addComponent(jLabel7)
                                                                .addGap(14, 14, 14)
                                                                .addGroup(RegistrarClienteCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jTextField1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBox1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(RegistrarClienteCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jLabel3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jTextField2,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                32,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jComboBox2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(RegistrarClienteCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jLabel4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jTextField3,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                32,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jComboBox3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(RegistrarClienteCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jLabel5,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jTextField4,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                31,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jComboBox4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(RegistrarClienteCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jSpinner1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jSpinner2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jSpinner3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(RegistrarClienteCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(19, 19, 19)
                                                                                                .addComponent(jTextField5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                31,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(RegistrarClienteCULayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel2,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))
                                                                .addGap(6, 6, 6)
                                                                .addGroup(RegistrarClienteCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel8,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField6,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(13, 13, 13)
                                                                .addGroup(RegistrarClienteCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel9,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jTextField7,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                31,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jCheckBox1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(RegistrarClienteCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton2)
                                                                                .addComponent(jButton3))
                                                                .addGap(25, 25, 25)));

                RegistrarClaseCU.setResizable(true);
                RegistrarClaseCU.setTitle("Registrar Clase");
                RegistrarClaseCU.setName("RegistrarClaseCU"); // NOI18N
                RegistrarClaseCU.setPreferredSize(new java.awt.Dimension(555, 471));
                try {
                        RegistrarClaseCU.setSelected(true);
                } catch (java.beans.PropertyVetoException e1) {
                        e1.printStackTrace();
                }
                RegistrarClaseCU.setVisible(false);

                jButtonRCC.setText("Cancelar");
                jButtonRCC.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonRCCActionPerformed(evt);
                        }
                });

                jLabel15.setText("Ingresar Datos de Clase:");

                jLabel16.setText("Nombre de Clase:");

                jLabel17.setText("Profesor:");

                jLabel18.setText("Fecha de inicio:");

                jTextField14.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField14ActionPerformed(evt);
                        }
                });

                jLabel19.setText("Hora de Inicio:");

                jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

                jLabel20.setText("Hora:");

                jLabel21.setText("Minutos:");

                jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

                jLabel22.setText("URL:");

                jTextField15.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField15ActionPerformed(evt);
                        }
                });

                jSpinner6.setModel(new javax.swing.SpinnerNumberModel());

                jSpinner10.setModel(new javax.swing.SpinnerNumberModel());

                jSpinner11.setModel(new javax.swing.SpinnerNumberModel());

                jLabel23.setText("Fecha de Alta");

                jButtonRCA.setText("Aceptar");
                jButtonRCA.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonRCAActionPerformed(evt);
                        }
                });

                jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                jComboBox7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox7ActionPerformed(evt);
                        }
                });

                jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                jComboBox8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox8ActionPerformed(evt);
                        }
                });

                jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                jComboBox9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox9ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout RegistrarClaseCULayout = new javax.swing.GroupLayout(
                                RegistrarClaseCU.getContentPane());
                RegistrarClaseCU.getContentPane().setLayout(RegistrarClaseCULayout);
                RegistrarClaseCULayout.setHorizontalGroup(
                                RegistrarClaseCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(RegistrarClaseCULayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(RegistrarClaseCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jLabel23,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel19,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel17,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel22,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel16,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel18,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(57, 57, 57)
                                                                .addGroup(RegistrarClaseCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel15)
                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel20,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                52,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(jSpinner4,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(jLabel21))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                RegistrarClaseCULayout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addComponent(jButtonRCA)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jButtonRCC))
                                                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jSpinner6,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                64,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(43, 43, 43)
                                                                                                                                .addComponent(jSpinner10,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addComponent(jTextField15,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                201,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jSpinner11)
                                                                                                                .addComponent(jSpinner5)
                                                                                                                .addComponent(jSpinner14)
                                                                                                                .addComponent(jComboBox7,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jSpinner12,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                64,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(39, 39, 39)
                                                                                                .addComponent(jSpinner13,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                64,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jTextField14)
                                                                                                                .addComponent(jTextField12,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                201,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jComboBox8,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jComboBox9,
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                RegistrarClaseCULayout.setVerticalGroup(
                                RegistrarClaseCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                RegistrarClaseCULayout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addComponent(jLabel15)
                                                                                .addGap(15, 15, 15)
                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jTextField12,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel16,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jComboBox9,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel17,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jTextField14,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jComboBox8,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel18,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jSpinner6,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jSpinner10,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jSpinner11,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jSpinner5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel19,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jSpinner4,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel20,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel21,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                30,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel22,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jTextField15,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jComboBox7,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel23,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jSpinner13,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jSpinner14,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jSpinner12,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, Short.MAX_VALUE)
                                                                                .addGroup(RegistrarClaseCULayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jButtonRCC)
                                                                                                .addComponent(jButtonRCA))
                                                                                .addContainerGap()));

                try {
                        RegistrarActividadCU.setSelected(true);
                } catch (java.beans.PropertyVetoException e1) {
                        e1.printStackTrace();
                }
                RegistrarActividadCU.setVisible(false);

                jButton4.setText("OKAY");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jButton5.setText("CANCELO");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                jTextField8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField8ActionPerformed(evt);
                        }
                });

                jSpinner7.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

                jSpinner8.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

                jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2023, 1));

                jTextField10.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField10ActionPerformed(evt);
                        }
                });

                jLabel10.setText("Nombre:");

                jLabel11.setText("Descripcion:");

                jLabel12.setText("Duracion:");

                jLabel13.setText("Costo:");

                jTextField11.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField11ActionPerformed(evt);
                        }
                });

                jLabel14.setText("Fecha:");

                jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                jComboBox5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox5ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout RegistrarActividadCULayout = new javax.swing.GroupLayout(
                                RegistrarActividadCU.getContentPane());
                RegistrarActividadCU.getContentPane().setLayout(RegistrarActividadCULayout);
                RegistrarActividadCULayout.setHorizontalGroup(
                                RegistrarActividadCULayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(RegistrarActividadCULayout.createSequentialGroup()
                                                                .addGroup(RegistrarActividadCULayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                RegistrarActividadCULayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGap(20, 20, 20)
                                                                                                                .addComponent(jButton4)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jButton5))
                                                                                .addGroup(RegistrarActividadCULayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(34, 34, 34)
                                                                                                .addGroup(RegistrarActividadCULayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(RegistrarActividadCULayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jLabel14)
                                                                                                                                .addGap(47, 47, 47)
                                                                                                                                .addComponent(jSpinner7,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                53,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(38, 38, 38)
                                                                                                                                .addComponent(jSpinner8,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                57,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jSpinner9,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                81,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                                                .addGroup(RegistrarActividadCULayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(RegistrarActividadCULayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel13)
                                                                                                                                                .addComponent(jLabel12)
                                                                                                                                                .addComponent(jLabel11)
                                                                                                                                                .addComponent(jLabel10))
                                                                                                                                .addGap(62, 62, 62)
                                                                                                                                .addGroup(RegistrarActividadCULayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                false)
                                                                                                                                                .addComponent(jTextField10)
                                                                                                                                                .addComponent(jTextField9)
                                                                                                                                                .addComponent(jTextField8)
                                                                                                                                                .addComponent(jTextField11,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                198,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(jComboBox5,
                                                                                                                                                0,
                                                                                                                                                1,
                                                                                                                                                Short.MAX_VALUE)))))
                                                                .addContainerGap()));
                RegistrarActividadCULayout.setVerticalGroup(
                                RegistrarActividadCULayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                RegistrarActividadCULayout.createSequentialGroup()
                                                                                .addGap(24, 24, 24)
                                                                                .addGroup(RegistrarActividadCULayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(RegistrarActividadCULayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(RegistrarActividadCULayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                .addComponent(jTextField8,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jComboBox5,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jTextField9,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jTextField10,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jTextField11,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(RegistrarActividadCULayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel10)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jLabel11)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jLabel12)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addComponent(jLabel13)))
                                                                                .addGap(10, 10, 10)
                                                                                .addGroup(RegistrarActividadCULayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jSpinner7,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jSpinner8,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jSpinner9,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel14))
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(RegistrarActividadCULayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jButton4)
                                                                                                .addComponent(jButton5))
                                                                                .addContainerGap()));

                jInternalFrame1.setVisible(false);

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null }
                                },
                                new String[] {
                                                "Nombre", "Descripción", "URL", "Title 4"
                                }));
                jScrollPane1.setViewportView(jTable1);

                javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(
                                jInternalFrame1.getContentPane());
                jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
                jInternalFrame1Layout.setHorizontalGroup(
                                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                                Short.MAX_VALUE));
                jInternalFrame1Layout.setVerticalGroup(
                                jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                                Short.MAX_VALUE));

                ConsultarUsuarioCU.setClosable(true);
                ConsultarUsuarioCU.setTitle("Consultar Usuario");
                ConsultarUsuarioCU.setMaximumSize(new java.awt.Dimension(750, 450));
                ConsultarUsuarioCU.setMinimumSize(new java.awt.Dimension(700, 400));
                ConsultarUsuarioCU.setVisible(false);

                jTable2.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null }
                                },
                                new String[] {
                                                "Nombre", "Descripción", "URL", "Accion"
                                }));
                jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jTable2MouseClicked(evt);
                        }
                });
                jScrollPaneConsultaUsuario.setViewportView(jTable2);

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
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null }
                                },
                                new String[] {
                                                "Title 1", "Title 2", "Title 3", "Title 4"
                                }));
                jTableInformacionAsociada.setEnabled(false);
                jTableInformacionAsociada.setName("Informacion Asociada"); // NOI18N
                jTableInformacionAsociada.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jTableInformacionAsociadaMouseClicked(evt);
                        }
                });
                jScrollPane2.setViewportView(jTableInformacionAsociada);

                javax.swing.GroupLayout ConsultarUsuarioCULayout = new javax.swing.GroupLayout(
                                ConsultarUsuarioCU.getContentPane());
                ConsultarUsuarioCU.getContentPane().setLayout(ConsultarUsuarioCULayout);
                ConsultarUsuarioCULayout.setHorizontalGroup(
                                ConsultarUsuarioCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                ConsultarUsuarioCULayout.createSequentialGroup()
                                                                                .addContainerGap(
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jTextFieldBuscarUsuario,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                247,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jButtonBuscarUsuario)
                                                                                .addGap(28, 28, 28))
                                                .addGroup(ConsultarUsuarioCULayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(ConsultarUsuarioCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(ConsultarUsuarioCULayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jButtonCancelarConsultaUsuario)
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                .addGroup(ConsultarUsuarioCULayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(ConsultarUsuarioCULayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jScrollPaneConsultaUsuario,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                0,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jScrollPane2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                0,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addContainerGap()))));
                ConsultarUsuarioCULayout.setVerticalGroup(
                                ConsultarUsuarioCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ConsultarUsuarioCULayout.createSequentialGroup()
                                                                .addGap(8, 8, 8)
                                                                .addGroup(ConsultarUsuarioCULayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jTextFieldBuscarUsuario,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButtonBuscarUsuario))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jScrollPaneConsultaUsuario,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                144,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                205,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButtonCancelarConsultaUsuario)
                                                                .addGap(20, 20, 20)));

                jMenu1.setText("Inicio");
                jMenuBar1.add(jMenu1);

                jMenu2.setText("Registros");

                jMenuItem1.setText("Registrar Cliente");
                jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jMenuItem1ActionPerformed(evt);
                        }
                });
                jMenu2.add(jMenuItem1);

                jMenuItem2.setText("Registrar Actividad");
                jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jMenuItem2ActionPerformed(evt);
                        }
                });
                jMenu2.add(jMenuItem2);

                jMenuItem3.setText("Registrar Clase");
                jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jMenuItem3ActionPerformed(evt);
                        }
                });
                jMenu2.add(jMenuItem3);

                jMenuItem4.setText("jMenuItem4");
                jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jMenuItem4ActionPerformed(evt);
                        }
                });
                jMenu2.add(jMenuItem4);

                jMenuBar1.add(jMenu2);

                jMenu4.setText("Consultas");

                jMenuConsultarUsuario.setText("Consultar Usuario");
                jMenuConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jMenuConsultarUsuarioActionPerformed(evt);
                        }
                });
                jMenu4.add(jMenuConsultarUsuario);

                jMenuBar1.add(jMenu4);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(324, 324, 324)
                                                                                .addComponent(RegistrarClienteCU,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap(480, Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(218, 218, 218)
                                                                                .addComponent(RegistrarActividadCU,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap(586, Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                layout.createSequentialGroup()
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(RegistrarClaseCU,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                0,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(254, 254, 254)
                                                                                .addComponent(jInternalFrame1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap(550, Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(41, 41, 41)
                                                                                .addComponent(ConsultarUsuarioCU,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap(763,
                                                                                                Short.MAX_VALUE))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(227, 227, 227)
                                                                                .addComponent(RegistrarClienteCU,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap(473, Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(229, 229, 229)
                                                                                .addComponent(RegistrarActividadCU,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap(471, Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                layout.createSequentialGroup()
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(RegistrarClaseCU,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                0,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(238, 238, 238)
                                                                                .addComponent(jInternalFrame1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap(462, Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(54, 54, 54)
                                                                                .addComponent(ConsultarUsuarioCU,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                0,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addContainerGap(646,
                                                                                                Short.MAX_VALUE))));

                getAccessibleContext().setAccessibleName("Ventanita");

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButtonCancelarConsultaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarConsultaUsuarioActionPerformed

                ConsultarUsuarioCU.dispose();
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

        private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable2MouseClicked
                System.out.println("In event");
                int viewRow = jTable2.getSelectedRow();

                if (viewRow != -1) {

                        // Better to access table row using modelRow rather than viewRow
                        int modelRow = jTable2.convertRowIndexToModel(viewRow);

                        // Access value at selected row at the second column (columnIndex = 1)
                        Object modelvalue = jTable2.getModel().getValueAt(modelRow, 0);

                        // Print cell value
                        System.out.println(modelvalue);

                        String nickname = (String) modelvalue;

                        Usuario selectedUser = ManejadorUsuarios.getUser(nickname);

                        if (selectedUser instanceof Profesor) {
                                // Profesor profesor = (Profesor) selectedUser; // Puedes hacer un casting a
                                // Profesor
                                System.out.println("El usuario seleccionado es un Profesor.");

                        } else if (selectedUser instanceof Socio) {
                                // Socio socio = (Socio) selectedUser; // Puedes hacer un casting a Socio
                                System.out.println("El usuario seleccionado es un Socio.");

                        }

                        // nickname, email,nombre, apellido, fechaNac

                }

        }// GEN-LAST:event_jTable2MouseClicked

        private void jButtonBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonBuscarUsuarioActionPerformed
                String input = jTextFieldBuscarUsuario.getText();

                if (input.length() > 3) {
                        Fabrica factory = new Fabrica();
                        IControllerConsultaUsuario consultaUsuario = factory.getControladorConsultaUsuario();
                        List<Usuario> searchResult = consultaUsuario.getUsuarios(input);

                        if (!searchResult.isEmpty() || searchResult.get(0) != null) {

                                DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();

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

        private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox5ActionPerformed
                jComboBox5.removeAllItems();

                // Obtiene la lista de instituciones utilizando el controlador
                Fabrica factory = new Fabrica();
                IControllerAltaActividad ControllerAltaActividad = factory.getControladorAltaActividad();
                List<InstitucionDeportiva> instituciones = ControllerAltaActividad.getInstituciones();

                // Agrega los nombres de las instituciones al JComboBox
                for (InstitucionDeportiva institucion : instituciones) {
                        jComboBox5.addItem(institucion.getNombre());
                }

                Object selectedItem = jComboBox5.getSelectedItem();

                // Realizar acciones basadas en el elemento seleccionado
                if (selectedItem != null) {
                        String selectedText = selectedItem.toString(); // Convertir el elemento a String
                        jTextField8.setText(selectedText); // Establecer el texto en el JTextField
                }
        }// GEN-LAST:event_jComboBox5ActionPerformed

        private void jMenuConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuConsultarUsuarioActionPerformed
                ConsultarUsuarioCU.setSize(750, 600); // Establecer el tamaño deseado

                // Obtener dimensiones del jDesktopPane1
                int desktopWidth = jDesktopPane1.getWidth();
                int desktopHeight = jDesktopPane1.getHeight();

                // Calcular coordenadas para centrar el JInternalFrame
                int x = (desktopWidth - ConsultarUsuarioCU.getWidth()) / 2;
                int y = (desktopHeight - ConsultarUsuarioCU.getHeight()) / 2;

                ConsultarUsuarioCU.setLocation(x - 10, y - 20); // Establecer ubicación centrada

                ConsultarUsuarioCU.setVisible(true);
                jDesktopPane1.add(ConsultarUsuarioCU);
                ConsultarUsuarioCU.toFront();

                Fabrica factory = new Fabrica();
                IControllerConsultaUsuario controllerConsultaUsuario = factory.getControladorConsultaUsuario();
                List<Usuario> resultados = controllerConsultaUsuario.getUsuarios();

                // Obtener el modelo de la tabla jTable2
                DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();

                // Iterar a través de los resultados y agregar cada fila a la tabla
                for (Usuario fila : resultados) {
                        Object[] rowData = { fila.getNickname(), fila.getNombre(), fila.getApellido(), fila.getEmail(),
                                        fila.getFechaNacFromatted() /*
                                                                     * Otros
                                                                     * atributos
                                                                     */ };
                        tableModel.addRow(rowData);
                }

                // Notificar al modelo de la tabla que se han realizado cambios
                tableModel.fireTableDataChanged();

        }// GEN-LAST:event_jMenuConsultarUsuarioActionPerformed

        private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem3ActionPerformed
                RegistrarClaseCU.setSize(560, 500);
                RegistrarClaseCU.setLocation(50, 50);
                RegistrarClaseCU.setVisible(true);
                // internalFrame.setSize(300, 200);
                // internalFrame.setVisible(true);
                jDesktopPane1.add(RegistrarClaseCU);
                RegistrarClaseCU.toFront();
        }// GEN-LAST:event_jMenuItem3ActionPerformed

        private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField15ActionPerformed

        }// GEN-LAST:event_jTextField15ActionPerformed

        private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField14ActionPerformed

        }// GEN-LAST:event_jTextField14ActionPerformed

        private void jButtonRCCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRCCActionPerformed
                RegistrarClaseCU.dispose();
                jTextField12.setText("");
                jTextField14.setText("");
                jTextField15.setText("");
        }// GEN-LAST:event_jButtonRCCActionPerformed

        private void jButtonRCAActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRCAActionPerformed
                Fabrica factory = new Fabrica();
                IControllerAltaClase controllerAltaClase = factory.getControladorAltaClase();

                final LocalDate fechaInicio = LocalDate.of((int) jSpinner11.getValue(), (int) jSpinner10.getValue(),
                                (int) jSpinner6.getValue());
                final LocalDate fechaAlta = LocalDate.of((int) jSpinner14.getValue(), (int) jSpinner13.getValue(),
                                (int) jSpinner12.getValue());
                final LocalTime horaInicio = LocalTime.of((int) jSpinner4.getValue(), (int) jSpinner5.getValue());

                String nombre = jTextField12.getText();
                // String profesor = jTextField14.getText();
                String url = jTextField15.getText();

                controllerAltaClase.addClase(nombre, fechaInicio, horaInicio, url, fechaAlta);
                jTextField12.setText("");
                jTextField14.setText("");
                jTextField15.setText("");
        }// GEN-LAST:event_jButtonRCAActionPerformed

        private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox9ActionPerformed
                Object selectedItem = jComboBox9.getSelectedItem();

                // Realizar acciones basadas en el elemento seleccionado
                if (selectedItem != null) {
                        String selectedText = selectedItem.toString(); // Convertir el elemento a String
                        jTextField12.setText(selectedText); // Establecer el texto en el JTextField
                }
        }// GEN-LAST:event_jComboBox9ActionPerformed

        private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox8ActionPerformed
                Object selectedItem = jComboBox8.getSelectedItem();

                // Realizar acciones basadas en el elemento seleccionado
                if (selectedItem != null) {
                        String selectedText = selectedItem.toString(); // Convertir el elemento a String
                        jTextField14.setText(selectedText); // Establecer el texto en el JTextField
                }
        }// GEN-LAST:event_jComboBox8ActionPerformed

        private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox7ActionPerformed
                Object selectedItem = jComboBox7.getSelectedItem();

                // Realizar acciones basadas en el elemento seleccionado
                if (selectedItem != null) {
                        String selectedText = selectedItem.toString(); // Convertir el elemento a String
                        jTextField15.setText(selectedText); // Establecer el texto en el JTextField
                }
        }// GEN-LAST:event_jComboBox7ActionPerformed

        private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem4ActionPerformed
                jInternalFrame1.setSize(560, 500);
                jInternalFrame1.setLocation(50, 50);
                jInternalFrame1.setVisible(true);
                // internalFrame.setSize(300, 200);
                // internalFrame.setVisible(true);
                jDesktopPane1.add(jInternalFrame1);
                RegistrarClienteCU.toFront();

                Fabrica factory = new Fabrica();
                IControllerDictadoClase controllerAltaClase = factory.getControladorDictadoClase();
                List<InstitucionDeportiva> resultados = controllerAltaClase.getInstituciones();

                // Obtener el modelo de la tabla jTable1
                DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();

                // Iterar a través de los resultados y agregar cada fila a la tabla
                for (InstitucionDeportiva fila : resultados) {
                        Object[] rowData = { fila.getNombre(), fila.getDescripcion(), fila.getUrl(), /*
                                                                                                      * Otros atributos
                                                                                                      */ };
                        tableModel.addRow(rowData);
                }

                // Notificar al modelo de la tabla que se han realizado cambios
                tableModel.fireTableDataChanged();
        }// GEN-LAST:event_jMenuItem4ActionPerformed

        private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField10ActionPerformed

        }// GEN-LAST:event_jTextField10ActionPerformed

        private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField8ActionPerformed

        }// GEN-LAST:event_jTextField8ActionPerformed

        private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField11ActionPerformed

        }// GEN-LAST:event_jTextField11ActionPerformed

        private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem2ActionPerformed
                RegistrarActividadCU.setSize(560, 500);
                RegistrarActividadCU.setLocation(50, 50);
                RegistrarActividadCU.setVisible(true);
                // internalFrame.setSize(300, 200);
                // internalFrame.setVisible(true);
                jDesktopPane1.add(RegistrarActividadCU);
                RegistrarActividadCU.toFront();
        }// GEN-LAST:event_jMenuItem2ActionPerformed

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
                RegistrarActividadCU.dispose();
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
        }// GEN-LAST:event_jButton5ActionPerformed

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
                Fabrica factory = new Fabrica();
                IControllerAltaActividad controllerAltaActividad = factory.getControladorAltaActividad();

                final LocalDate fecha = LocalDate.of((int) jSpinner9.getValue(), (int) jSpinner8.getValue(),
                                (int) jSpinner7.getValue());

                String nombre = jTextField8.getText();
                String costoStr = jTextField11.getText();
                String descripcion = jTextField9.getText();
                String duracionStr = jTextField10.getText();
                int duracion = Integer.parseInt(duracionStr);
                int costo = Integer.parseInt(costoStr);
                controllerAltaActividad.altaActividad(nombre, descripcion, duracion, costo, fecha);
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
        }// GEN-LAST:event_jButton4ActionPerformed

        private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox4ActionPerformed
                // Obtener el elemento seleccionado del JComboBox
                Object selectedItem = jComboBox4.getSelectedItem();

                // Realizar acciones basadas en el elemento seleccionado
                if (selectedItem != null) {
                        String selectedText = selectedItem.toString(); // Convertir el elemento a String
                        jTextField4.setText(selectedText); // Establecer el texto en el JTextField
                }
        }// GEN-LAST:event_jComboBox4ActionPerformed

        private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox3ActionPerformed
                // Obtener el elemento seleccionado del JComboBox
                Object selectedItem = jComboBox3.getSelectedItem();

                // Realizar acciones basadas en el elemento seleccionado
                if (selectedItem != null) {
                        String selectedText = selectedItem.toString(); // Convertir el elemento a String
                        jTextField3.setText(selectedText); // Establecer el texto en el JTextField
                }
        }// GEN-LAST:event_jComboBox3ActionPerformed

        private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox2ActionPerformed
                // Obtener el elemento seleccionado del JComboBox
                Object selectedItem = jComboBox2.getSelectedItem();

                // Realizar acciones basadas en el elemento seleccionado
                if (selectedItem != null) {
                        String selectedText = selectedItem.toString(); // Convertir el elemento a String
                        jTextField2.setText(selectedText); // Establecer el texto en el JTextField
                }
        }// GEN-LAST:event_jComboBox2ActionPerformed

        private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1ActionPerformed
                // Obtener el elemento seleccionado del JComboBox
                Object selectedItem = jComboBox1.getSelectedItem();

                // Realizar acciones basadas en el elemento seleccionado
                if (selectedItem != null) {
                        String selectedText = selectedItem.toString(); // Convertir el elemento a String
                        jTextField1.setText(selectedText); // Establecer el texto en el JTextField
                }
        }// GEN-LAST:event_jComboBox1ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        }// GEN-LAST:event_jButton1ActionPerformed

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed

        }// GEN-LAST:event_jTextField1ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
                RegistrarClienteCU.dispose();
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
        }// GEN-LAST:event_jButton3ActionPerformed

        private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBox1ActionPerformed
                if (jCheckBox1.isSelected()) {
                        jTextField5.setEnabled(true);
                        jTextField6.setEnabled(true);
                        jTextField7.setEnabled(true);
                } else {
                        jTextField5.setEnabled(false);
                        jTextField6.setEnabled(false);
                        jTextField7.setEnabled(false);
                } // GEN-LAST:event_jCheckBox1ActionPerformed
        }

        private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
                // JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true,
                // true, true, true);
                RegistrarClienteCU.setSize(560, 500);
                RegistrarClienteCU.setLocation(50, 50);
                RegistrarClienteCU.setVisible(true);
                jTextField5.setEnabled(false);
                jTextField6.setEnabled(false);
                jTextField7.setEnabled(false);
                // internalFrame.setSize(300, 200);
                // internalFrame.setVisible(true);
                jDesktopPane1.add(RegistrarClienteCU);
                RegistrarClienteCU.toFront();
        }// GEN-LAST:event_jMenuItem1ActionPerformed
         // GEN-LAST:event_jComboBox1ActionPerformed

        /**
         * @param args the command line arguments
         */
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                        Fabrica factory = new Fabrica();

                        IControllerAltaUsuario controllerAltaUsuario = factory.getControladorAltaUsuario();

                        final LocalDate fechaNacimiento = LocalDate.of((int) jSpinner3.getValue(),
                                        (int) jSpinner2.getValue(),
                                        (int) jSpinner1.getValue());

                        String nickname = jTextField3.getText();
                        String nombre = jTextField1.getText();
                        String apellido = jTextField2.getText();
                        String email = jTextField4.getText();
                        String descripcion = jTextField5.getText();
                        String biografia = jTextField6.getText();
                        String sitioweb = jTextField7.getText();
                        boolean action;
                        // Llamar a tu función pasando la variable como argumento
                        if (jCheckBox1.isSelected()) {
                                action = controllerAltaUsuario.addProfesor(nickname, nombre, apellido, email,
                                                fechaNacimiento,
                                                descripcion,
                                                biografia, sitioweb);
                        } else {
                                action = controllerAltaUsuario.addSocio(nickname, nombre, apellido, email,
                                                fechaNacimiento);
                        }

                        if (action) {
                                jTextField1.setText("");
                                jTextField2.setText("");
                                jTextField3.setText("");
                                jTextField4.setText("");
                                jTextField5.setText("");
                                jTextField6.setText("");
                                jTextField7.setText("");
                        }

                } catch (NumberFormatException e) {
                        // Manejar una excepción si no se puede convertir el texto a un número
                        System.out.println("El texto no es un número válido");
                }
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JInternalFrame ConsultarUsuarioCU;
        private javax.swing.JInternalFrame RegistrarActividadCU;
        private javax.swing.JInternalFrame RegistrarClaseCU;
        private javax.swing.JInternalFrame RegistrarClienteCU;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButtonBuscarUsuario;
        private javax.swing.JButton jButtonCancelarConsultaUsuario;
        private javax.swing.JButton jButtonRCA;
        private javax.swing.JButton jButtonRCC;
        private javax.swing.JCheckBox jCheckBox1;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JComboBox<String> jComboBox2;
        private javax.swing.JComboBox<String> jComboBox3;
        private javax.swing.JComboBox<String> jComboBox4;
        private javax.swing.JComboBox<String> jComboBox5;
        private javax.swing.JComboBox<String> jComboBox7;
        private javax.swing.JComboBox<String> jComboBox8;
        private javax.swing.JComboBox<String> jComboBox9;
        private javax.swing.JDesktopPane jDesktopPane1;
        private javax.swing.JInternalFrame jInternalFrame1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenu jMenu2;
        private javax.swing.JMenu jMenu4;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JMenuItem jMenuConsultarUsuario;
        private javax.swing.JMenuItem jMenuItem1;
        private javax.swing.JMenuItem jMenuItem2;
        private javax.swing.JMenuItem jMenuItem3;
        private javax.swing.JMenuItem jMenuItem4;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPaneConsultaUsuario;
        private javax.swing.JSpinner jSpinner1;
        private javax.swing.JSpinner jSpinner10;
        private javax.swing.JSpinner jSpinner11;
        private javax.swing.JSpinner jSpinner12;
        private javax.swing.JSpinner jSpinner13;
        private javax.swing.JSpinner jSpinner14;
        private javax.swing.JSpinner jSpinner2;
        private javax.swing.JSpinner jSpinner3;
        private javax.swing.JSpinner jSpinner4;
        private javax.swing.JSpinner jSpinner5;
        private javax.swing.JSpinner jSpinner6;
        private javax.swing.JSpinner jSpinner7;
        private javax.swing.JSpinner jSpinner8;
        private javax.swing.JSpinner jSpinner9;
        private javax.swing.JTable jTable1;
        private javax.swing.JTable jTable2;
        private javax.swing.JTable jTableInformacionAsociada;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField10;
        private javax.swing.JTextField jTextField11;
        private javax.swing.JTextField jTextField12;
        private javax.swing.JTextField jTextField14;
        private javax.swing.JTextField jTextField15;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField5;
        private javax.swing.JTextField jTextField6;
        private javax.swing.JTextField jTextField7;
        private javax.swing.JTextField jTextField8;
        private javax.swing.JTextField jTextField9;
        private javax.swing.JTextField jTextFieldBuscarUsuario;
        // End of variables declaration//GEN-END:variables

}
