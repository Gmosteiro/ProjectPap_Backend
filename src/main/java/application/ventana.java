/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

import application.Ventana;
import logic.Fabrica;
import logic.ActividadDeportiva.ActividadDeportiva;
import logic.ActividadDeportiva.ManejadorActividad;
import logic.ActividadDeportiva.controllers.IControllerAltaActividad;
import logic.Usuario.ManejadorUsuarios;
import logic.Usuario.Profesor;
import logic.Usuario.Socio;
import logic.Usuario.Usuario;
import logic.Usuario.controllers.IControllerAltaUsuario;
import logic.Usuario.controllers.IControllerConsultaUsuario;
import logic.Clase.Clase;
import logic.Clase.controllers.IControllerAltaClase;
import logic.Institucion.InstitucionDeportiva;
import logic.Institucion.ManejadorInstitucion;

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
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        RegistrarClienteCU = new javax.swing.JInternalFrame();
        jTextFieldApellidoU = new javax.swing.JTextField();
        jButtonRUC = new javax.swing.JButton();
        jTextFieldNicknameU = new javax.swing.JTextField();
        TextoNombreU = new javax.swing.JLabel();
        jTextFieldEmailU = new javax.swing.JTextField();
        TextoApellidoU = new javax.swing.JLabel();
        TextoNicknameU = new javax.swing.JLabel();
        jSpinnerFNdia = new javax.swing.JSpinner();
        TextoEmailU = new javax.swing.JLabel();
        TextoFNU = new javax.swing.JLabel();
        jSpinnerFNmes = new javax.swing.JSpinner();
        TextoIngresedatosU = new javax.swing.JLabel();
        jTextFieldNombreU = new javax.swing.JTextField();
        jSpinnerFNanio = new javax.swing.JSpinner();
        jButtonRUA = new javax.swing.JButton();
        jComboBoxNombreU = new javax.swing.JComboBox<>();
        jComboBoxApellidoU = new javax.swing.JComboBox<>();
        jComboBoxNicknameU = new javax.swing.JComboBox<>();
        jComboBoxEmailU = new javax.swing.JComboBox<>();
        TextoDescProf = new javax.swing.JLabel();
        jTextFieldDescProf = new javax.swing.JTextField();
        TextoBioProf = new javax.swing.JLabel();
        jTextFieldBioProf = new javax.swing.JTextField();
        TextoWebProf = new javax.swing.JLabel();
        jTextFieldWebProf = new javax.swing.JTextField();
        jCheckBoxPROF = new javax.swing.JCheckBox();
        RegistrarClaseCU = new javax.swing.JInternalFrame();
        jButtonRCC = new javax.swing.JButton();
        TextoIngreseDatosC = new javax.swing.JLabel();
        TextoNombreC = new javax.swing.JLabel();
        TextoProfesorC = new javax.swing.JLabel();
        TextoFIC = new javax.swing.JLabel();
        jTextFieldNombreC = new javax.swing.JTextField();
        TextoHIC = new javax.swing.JLabel();
        TextoURLC = new javax.swing.JLabel();
        jTextFieldURLC = new javax.swing.JTextField();
        TextoFAC = new javax.swing.JLabel();
        jButtonRCA = new javax.swing.JButton();
        jComboBoxURLC = new javax.swing.JComboBox<>();
        jComboBoxProfesorC = new javax.swing.JComboBox<>();
        jComboBoxNombreC = new javax.swing.JComboBox<>();
        jComboBoxInstitucionesClase = new javax.swing.JComboBox<>();
        TextoActividadC = new javax.swing.JLabel();
        jComboBoxActividadesC = new javax.swing.JComboBox<>();
        jDateChooserFechaInicio = new com.toedter.calendar.JDateChooser();
        jDateChooserFechaAlta = new com.toedter.calendar.JDateChooser();
        jSpinner1 = new javax.swing.JSpinner();
        RegistrarActividadCU = new javax.swing.JInternalFrame();
        jButtonAceptarActividad = new javax.swing.JButton();
        jButtonCancelarActividad = new javax.swing.JButton();
        jTextFieldNombreA = new javax.swing.JTextField();
        jTextFieldDescA = new javax.swing.JTextField();
        jTextFieldDuracionA = new javax.swing.JTextField();
        TextoNombreA = new javax.swing.JLabel();
        TextoDescA = new javax.swing.JLabel();
        TextoDuracionA = new javax.swing.JLabel();
        TextoCostoA = new javax.swing.JLabel();
        jTextFieldCostoA = new javax.swing.JTextField();
        TextoFechaA = new javax.swing.JLabel();
        jComboBoxInstituciones = new javax.swing.JComboBox<>();
        jLabelInstituciones = new javax.swing.JLabel();
        jDateChooserFActividad = new com.toedter.calendar.JDateChooser();
        ConsultarUsuarioCU = new javax.swing.JInternalFrame();
        jScrollPaneConsultaUsuario = new javax.swing.JScrollPane();
        jTableListaUsuario = new javax.swing.JTable();
        jTextFieldBuscarUsuario = new javax.swing.JTextField();
        jButtonBuscarUsuario = new javax.swing.JButton();
        jButtonCancelarConsultaUsuario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInformacionAsociada = new javax.swing.JTable();
        RegistrarInstitucionCU = new javax.swing.JInternalFrame();
        jLabelNombreInstitucion = new javax.swing.JLabel();
        jTextFieldNombreInstitucion = new javax.swing.JTextField();
        jLabelDescInstitucion = new javax.swing.JLabel();
        jTextFieldDescInstitucion = new javax.swing.JTextField();
        jLabelurlInstitucion = new javax.swing.JLabel();
        jTextFieldUrl = new javax.swing.JTextField();
        jButtonCancelarInst = new javax.swing.JButton();
        jButtonAceptarInt = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuRInstitucion = new javax.swing.JMenuItem();
        jMenuItemRCliente = new javax.swing.JMenuItem();
        jMenuItemRActividad = new javax.swing.JMenuItem();
        jMenuItemRClase = new javax.swing.JMenuItem();
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

        jButtonRUC.setText("Cancelar");
        jButtonRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRUCActionPerformed(evt);
            }
        });

        TextoNombreU.setText("Nombre:");

        TextoApellidoU.setText("Apellido:");

        TextoNicknameU.setText("Nickname:");

        jSpinnerFNdia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        TextoEmailU.setText("Correo electrónico:");

        TextoFNU.setText("Fecha de nacimiento:");

        jSpinnerFNmes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        TextoIngresedatosU.setText("Ingrese los siguientes datos:");

        jSpinnerFNanio.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2023, 1));

        jButtonRUA.setText("Aceptar");
        jButtonRUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRUAActionPerformed(evt);
            }
        });

        jComboBoxNombreU.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNombreU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNombreUActionPerformed(evt);
            }
        });

        jComboBoxApellidoU.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxApellidoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxApellidoUActionPerformed(evt);
            }
        });

        jComboBoxNicknameU.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNicknameU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNicknameUActionPerformed(evt);
            }
        });

        jComboBoxEmailU.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEmailU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEmailUActionPerformed(evt);
            }
        });

        TextoDescProf.setText("Descripción:");

        TextoBioProf.setText("Biografia:");

        TextoWebProf.setText("Sitio web:");

        jCheckBoxPROF.setText("Profesor?");
        jCheckBoxPROF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPROFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistrarClienteCULayout = new javax.swing.GroupLayout(
                RegistrarClienteCU.getContentPane());
        RegistrarClienteCU.getContentPane().setLayout(RegistrarClienteCULayout);
        RegistrarClienteCULayout.setHorizontalGroup(
                RegistrarClienteCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RegistrarClienteCULayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(RegistrarClienteCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                RegistrarClienteCULayout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(jButtonRUA)
                                                        .addGap(44, 44, 44)
                                                        .addComponent(jButtonRUC)
                                                        .addGap(131, 131, 131))
                                        .addGroup(RegistrarClienteCULayout.createSequentialGroup()
                                                .addGroup(RegistrarClienteCULayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(RegistrarClienteCULayout.createSequentialGroup()
                                                                .addGap(155, 155, 155)
                                                                .addComponent(TextoIngresedatosU))
                                                        .addComponent(jCheckBoxPROF)
                                                        .addGroup(RegistrarClienteCULayout.createSequentialGroup()
                                                                .addGroup(RegistrarClienteCULayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(TextoNombreU,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                67,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TextoApellidoU,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                67,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TextoNicknameU,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                67,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TextoEmailU)
                                                                        .addComponent(TextoFNU,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(TextoDescProf,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(TextoBioProf,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(TextoWebProf,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addGap(145, 145, 145)
                                                                .addGroup(RegistrarClienteCULayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextFieldWebProf,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                201,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextFieldDescProf,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                201,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(RegistrarClienteCULayout
                                                                                .createSequentialGroup()
                                                                                .addComponent(jTextFieldNicknameU,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        201,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jComboBoxNicknameU,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(RegistrarClienteCULayout
                                                                                .createSequentialGroup()
                                                                                .addComponent(jTextFieldNombreU,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        201,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jComboBoxNombreU,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(RegistrarClienteCULayout
                                                                                .createSequentialGroup()
                                                                                .addComponent(jTextFieldApellidoU,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        201,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jComboBoxApellidoU,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(RegistrarClienteCULayout
                                                                                .createSequentialGroup()
                                                                                .addComponent(jSpinnerFNdia,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        53,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(38, 38, 38)
                                                                                .addComponent(jSpinnerFNmes,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        57,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jSpinnerFNanio,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        81,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(RegistrarClienteCULayout
                                                                                .createSequentialGroup()
                                                                                .addComponent(jTextFieldEmailU,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        201,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jComboBoxEmailU,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jTextFieldBioProf,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                201,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 0, Short.MAX_VALUE)))));
        RegistrarClienteCULayout.setVerticalGroup(
                RegistrarClienteCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RegistrarClienteCULayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(TextoIngresedatosU)
                                .addGap(14, 14, 14)
                                .addGroup(RegistrarClienteCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBoxNombreU, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextoNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(RegistrarClienteCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TextoApellidoU, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(RegistrarClienteCULayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextFieldApellidoU, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        32, Short.MAX_VALUE)
                                                .addComponent(jComboBoxApellidoU,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrarClienteCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TextoNicknameU, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(RegistrarClienteCULayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextFieldNicknameU, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        32, Short.MAX_VALUE)
                                                .addComponent(jComboBoxNicknameU,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistrarClienteCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TextoEmailU, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(RegistrarClienteCULayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextFieldEmailU, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        31, Short.MAX_VALUE)
                                                .addComponent(jComboBoxEmailU, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(RegistrarClienteCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextoFNU)
                                        .addComponent(jSpinnerFNdia, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSpinnerFNmes, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSpinnerFNanio, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(RegistrarClienteCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(RegistrarClienteCULayout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jTextFieldDescProf,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(RegistrarClienteCULayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(TextoDescProf, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(6, 6, 6)
                                .addGroup(RegistrarClienteCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextoBioProf, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldBioProf, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(RegistrarClienteCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextoWebProf, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldWebProf, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxPROF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(RegistrarClienteCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonRUA)
                                        .addComponent(jButtonRUC))
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
        RegistrarClaseCU.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
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
                RegistrarClaseCUInternalFrameOpened(evt);
            }
        });

        jButtonRCC.setText("Cancelar");
        jButtonRCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRCCActionPerformed(evt);
            }
        });

        TextoIngreseDatosC.setText("Institucion:");

        TextoNombreC.setText("Nombre de Clase:");

        TextoProfesorC.setText("Profesor:");

        TextoFIC.setText("Fecha de inicio:");

        jTextFieldNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreCActionPerformed(evt);
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

        jComboBoxURLC.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxURLC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxURLCActionPerformed(evt);
            }
        });

        jComboBoxProfesorC.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Profesor" }));
        jComboBoxProfesorC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProfesorCActionPerformed(evt);
            }
        });

        jComboBoxNombreC.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNombreC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNombreCActionPerformed(evt);
            }
        });

        jComboBoxInstitucionesClase.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Institucion" }));

        TextoActividadC.setText("Actividad");

        jComboBoxActividadesC.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Actividad"}));
        jComboBoxActividadesC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxActividadesCFocusGained(evt);
            }
        });

        javax.swing.GroupLayout RegistrarClaseCULayout = new javax.swing.GroupLayout(RegistrarClaseCU.getContentPane());
        RegistrarClaseCU.getContentPane().setLayout(RegistrarClaseCULayout);
        RegistrarClaseCULayout.setHorizontalGroup(
                RegistrarClaseCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RegistrarClaseCULayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(RegistrarClaseCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistrarClaseCULayout
                                                .createSequentialGroup()
                                                .addComponent(TextoIngreseDatosC)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBoxInstitucionesClase,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 201,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistrarClaseCULayout
                                                .createSequentialGroup()
                                                .addComponent(TextoProfesorC, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxProfesorC,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistrarClaseCULayout
                                                .createSequentialGroup()
                                                .addGroup(RegistrarClaseCULayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TextoNombreC,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(TextoFIC)
                                                        .addComponent(TextoFAC))
                                                .addGroup(RegistrarClaseCULayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(RegistrarClaseCULayout.createSequentialGroup()
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jTextFieldNombreC,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 201,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(RegistrarClaseCULayout.createSequentialGroup()
                                                                .addGap(52, 52, 52)
                                                                .addGroup(RegistrarClaseCULayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(RegistrarClaseCULayout
                                                                                .createSequentialGroup()
                                                                                .addComponent(jButtonRCC)
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addComponent(jDateChooserFechaInicio,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(jDateChooserFechaAlta,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))))))
                                .addGap(31, 31, 31)
                                .addGroup(RegistrarClaseCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(RegistrarClaseCULayout.createSequentialGroup()
                                                .addGroup(RegistrarClaseCULayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                RegistrarClaseCULayout.createSequentialGroup()
                                                                        .addComponent(TextoActividadC)
                                                                        .addGap(27, 27, 27))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                RegistrarClaseCULayout.createSequentialGroup()
                                                                        .addComponent(TextoHIC)
                                                                        .addGap(4, 4, 4)))
                                                .addGap(26, 26, 26)
                                                .addGroup(RegistrarClaseCULayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxActividadesC,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 156,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(RegistrarClaseCULayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jButtonRCA)
                                                                .addComponent(jTextFieldURLC,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 154,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(25, 25, 25)
                                                .addGroup(RegistrarClaseCULayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jComboBoxURLC,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBoxNombreC,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(TextoURLC, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)));
        RegistrarClaseCULayout.setVerticalGroup(
                RegistrarClaseCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarClaseCULayout
                                .createSequentialGroup()
                                .addContainerGap()
                                .addGroup(RegistrarClaseCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(RegistrarClaseCULayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jComboBoxURLC, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(431, 431, 431))
                                        .addGroup(RegistrarClaseCULayout.createSequentialGroup()
                                                .addGroup(RegistrarClaseCULayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(RegistrarClaseCULayout.createSequentialGroup()
                                                                .addComponent(TextoIngreseDatosC)
                                                                .addGap(16, 16, 16)
                                                                .addGroup(RegistrarClaseCULayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTextFieldNombreC,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TextoNombreC,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(RegistrarClaseCULayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(TextoProfesorC,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBoxProfesorC,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(TextoURLC)
                                                                        .addComponent(jTextFieldURLC,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(RegistrarClaseCULayout.createSequentialGroup()
                                                                .addGroup(RegistrarClaseCULayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(RegistrarClaseCULayout
                                                                                .createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(TextoActividadC)
                                                                                .addComponent(
                                                                                        jComboBoxInstitucionesClase,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(RegistrarClaseCULayout
                                                                                .createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jComboBoxNombreC,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jComboBoxActividadesC,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(RegistrarClaseCULayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(TextoHIC)
                                                                        .addComponent(jSpinner1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(RegistrarClaseCULayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jDateChooserFechaInicio,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(TextoFIC))
                                                .addGap(18, 18, 18)
                                                .addGroup(RegistrarClaseCULayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TextoFAC)
                                                        .addComponent(jDateChooserFechaAlta,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(51, 51, 51)
                                                .addGroup(RegistrarClaseCULayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButtonRCC)
                                                        .addComponent(jButtonRCA))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)))));

        RegistrarActividadCU.setTitle("Registrar Actividad");
        try {
            RegistrarActividadCU.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        RegistrarActividadCU.setVisible(false);
        RegistrarActividadCU.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
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
                RegistrarActividadCUInternalFrameOpened(evt);
            }
        });

        jButtonAceptarActividad.setText("Aceptar");
        jButtonAceptarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActividadActionPerformed(evt);
            }
        });

        jButtonCancelarActividad.setText("Cancelar");
        jButtonCancelarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActividadActionPerformed(evt);
            }
        });

        TextoNombreA.setText("Nombre:");

        TextoDescA.setText("Descripcion:");

        TextoDuracionA.setText("Duracion:");

        TextoCostoA.setText("Costo:");

        TextoFechaA.setText("Fecha:");

        jComboBoxInstituciones.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxInstituciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInstitucionesActionPerformed(evt);
            }
        });

        jLabelInstituciones.setText("Instituciones");

        javax.swing.GroupLayout RegistrarActividadCULayout = new javax.swing.GroupLayout(
                RegistrarActividadCU.getContentPane());
        RegistrarActividadCU.getContentPane().setLayout(RegistrarActividadCULayout);
        RegistrarActividadCULayout.setHorizontalGroup(
                RegistrarActividadCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RegistrarActividadCULayout.createSequentialGroup()
                                .addGroup(RegistrarActividadCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(RegistrarActividadCULayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(RegistrarActividadCULayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(TextoCostoA)
                                                        .addComponent(TextoDuracionA)
                                                        .addComponent(TextoDescA)
                                                        .addComponent(TextoNombreA)
                                                        .addComponent(TextoFechaA)
                                                        .addComponent(jLabelInstituciones))
                                                .addGap(48, 48, 48)
                                                .addGroup(RegistrarActividadCULayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jTextFieldDescA)
                                                        .addComponent(jTextFieldNombreA)
                                                        .addComponent(jComboBoxInstituciones, 0, 197, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldDuracionA)
                                                        .addComponent(jTextFieldCostoA,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 198,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jDateChooserFActividad,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonAceptarActividad,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(RegistrarActividadCULayout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jButtonCancelarActividad)))
                                .addGap(11, 11, 11)));
        RegistrarActividadCULayout.setVerticalGroup(
                RegistrarActividadCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarActividadCULayout
                                .createSequentialGroup()
                                .addContainerGap()
                                .addGroup(RegistrarActividadCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBoxInstituciones, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelInstituciones))
                                .addGap(32, 32, 32)
                                .addGroup(RegistrarActividadCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldNombreA, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextoNombreA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(RegistrarActividadCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldDescA, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextoDescA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(RegistrarActividadCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldDuracionA, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextoDuracionA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(RegistrarActividadCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldCostoA, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextoCostoA))
                                .addGap(32, 32, 32)
                                .addGroup(RegistrarActividadCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextoFechaA)
                                        .addComponent(jDateChooserFActividad, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(RegistrarActividadCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonCancelarActividad)
                                        .addComponent(jButtonAceptarActividad))
                                .addGap(17, 17, 17)));

        ConsultarUsuarioCU.setClosable(true);
        ConsultarUsuarioCU.setTitle("Consultar Usuario");
        ConsultarUsuarioCU.setMaximumSize(new java.awt.Dimension(750, 450));
        ConsultarUsuarioCU.setMinimumSize(new java.awt.Dimension(700, 400));
        ConsultarUsuarioCU.setVisible(false);

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
                        "Clase", "URL", "Actividad Deportiva", "Descripcion"
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

        javax.swing.GroupLayout ConsultarUsuarioCULayout = new javax.swing.GroupLayout(
                ConsultarUsuarioCU.getContentPane());
        ConsultarUsuarioCU.getContentPane().setLayout(ConsultarUsuarioCULayout);
        ConsultarUsuarioCULayout.setHorizontalGroup(
                ConsultarUsuarioCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                ConsultarUsuarioCULayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonBuscarUsuario)
                                        .addGap(28, 28, 28))
                        .addGroup(ConsultarUsuarioCULayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ConsultarUsuarioCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ConsultarUsuarioCULayout.createSequentialGroup()
                                                .addComponent(jButtonCancelarConsultaUsuario)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(ConsultarUsuarioCULayout.createSequentialGroup()
                                                .addGroup(ConsultarUsuarioCULayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jScrollPaneConsultaUsuario,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                                Short.MAX_VALUE))
                                                .addContainerGap()))));
        ConsultarUsuarioCULayout.setVerticalGroup(
                ConsultarUsuarioCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ConsultarUsuarioCULayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(ConsultarUsuarioCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonBuscarUsuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneConsultaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 144,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCancelarConsultaUsuario)
                                .addGap(20, 20, 20)));

        RegistrarInstitucionCU.setTitle("Registar Institucion");
        RegistrarInstitucionCU.setMaximumSize(new java.awt.Dimension(397, 301));
        RegistrarInstitucionCU.setVisible(false);

        jLabelNombreInstitucion.setText("Nombre Institucion");

        jLabelDescInstitucion.setText("Descripcion");

        jLabelurlInstitucion.setText("URL");

        jButtonCancelarInst.setText("Cancelar");
        jButtonCancelarInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarInstActionPerformed(evt);
            }
        });

        jButtonAceptarInt.setText("Aceptar");
        jButtonAceptarInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarIntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistrarInstitucionCULayout = new javax.swing.GroupLayout(
                RegistrarInstitucionCU.getContentPane());
        RegistrarInstitucionCU.getContentPane().setLayout(RegistrarInstitucionCULayout);
        RegistrarInstitucionCULayout.setHorizontalGroup(
                RegistrarInstitucionCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RegistrarInstitucionCULayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(RegistrarInstitucionCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNombreInstitucion)
                                        .addComponent(jLabelDescInstitucion)
                                        .addComponent(jLabelurlInstitucion)
                                        .addComponent(jButtonCancelarInst))
                                .addGap(52, 52, 52)
                                .addGroup(RegistrarInstitucionCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(RegistrarInstitucionCULayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldDescInstitucion,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 113,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextFieldUrl, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextFieldNombreInstitucion,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 113,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButtonAceptarInt, javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        RegistrarInstitucionCULayout.setVerticalGroup(
                RegistrarInstitucionCULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RegistrarInstitucionCULayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(RegistrarInstitucionCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelNombreInstitucion)
                                        .addComponent(jTextFieldNombreInstitucion,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(RegistrarInstitucionCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelDescInstitucion)
                                        .addComponent(jTextFieldDescInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(RegistrarInstitucionCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelurlInstitucion)
                                        .addComponent(jTextFieldUrl, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(RegistrarInstitucionCULayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonCancelarInst)
                                        .addComponent(jButtonAceptarInt))
                                .addGap(35, 35, 35)));

        jMenuInicio.setText("Inicio");
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
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(324, 324, 324)
                                        .addComponent(RegistrarClienteCU, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(480, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(218, 218, 218)
                                        .addComponent(RegistrarActividadCU, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(586, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RegistrarClaseCU, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                Short.MAX_VALUE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(ConsultarUsuarioCU, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(763, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(387, 387, 387)
                                        .addComponent(RegistrarInstitucionCU, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(227, 227, 227)
                                        .addComponent(RegistrarClienteCU, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(473, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(229, 229, 229)
                                        .addComponent(RegistrarActividadCU, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(471, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RegistrarClaseCU, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(ConsultarUsuarioCU, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(646, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(335, 335, 335)
                                        .addComponent(RegistrarInstitucionCU, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(335, Short.MAX_VALUE))));

        RegistrarInstitucionCU.getAccessibleContext().setAccessibleName("Registrar Institucion");

        getAccessibleContext().setAccessibleName("Ventanita");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxActividadesCFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jComboBoxActividadesCFocusGained
        String current = (String) jComboBoxInstitucionesClase.getSelectedItem();
        addActividadesToComboBox("Clase", current);

    }// GEN-LAST:event_jComboBoxActividadesCFocusGained

    private void RegistrarClaseCUInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {// GEN-FIRST:event_RegistrarClaseCUInternalFrameOpened
        addInstitucionesToComboBox("Clase");
        addProfesoresToComboBox();
    }// GEN-LAST:event_RegistrarClaseCUInternalFrameOpened

    private void jComboBoxNombreCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxNombreCActionPerformed
        Object selectedItem = jComboBoxNombreC.getSelectedItem();

        // Realizar acciones basadas en el elemento seleccionado
        if (selectedItem != null) {
            String selectedText = selectedItem.toString(); // Convertir el elemento a String
            jTextFieldNombreC.setText(selectedText); // Establecer el texto en el JTextField
        } // TODO add your handling code here:
    }// GEN-LAST:event_jComboBoxNombreCActionPerformed

    private void jComboBoxProfesorCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxProfesorCActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jComboBoxProfesorCActionPerformed

    private void jComboBoxURLCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxURLCActionPerformed
        Object selectedItem = jComboBoxURLC.getSelectedItem();

        // Realizar acciones basadas en el elemento seleccionado
        if (selectedItem != null) {
            String selectedText = selectedItem.toString(); // Convertir el elemento a String
            jTextFieldURLC.setText(selectedText); // Establecer el texto en el JTextField
        } // TODO add your handling code here:
    }// GEN-LAST:event_jComboBoxURLCActionPerformed

    private void jButtonRCAActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRCAActionPerformed
        Fabrica factory = new Fabrica();
        IControllerAltaClase controllerAltaClase = factory.getControladorAltaClase();

        // final LocalDate fechaInicio = LocalDate.of((int) jSpinnerFICanio.getValue(),
        // (int) jSpinnerFICmes.getValue(), (int) jSpinnerFICdia.getValue());
        // final LocalDate fechaAlta = LocalDate.of((int) jSpinnerFACanio.getValue(),
        // (int) jSpinnerFACmes.getValue(), (int) jSpinnerFACdia.getValue());
        // final LocalTime horaInicio = LocalTime.of((int) jSpinnerHICh.getValue(),
        // (int) jSpinnerHICm.getValue());

        String nombre = jTextFieldNombreC.getText();
        // String profesor = jTextField14.getText();
        String url = jTextFieldURLC.getText();

        // controllerAltaClase.addClase(nombre, fechaInicio, horaInicio, url, fechaAlta,
        // "Tonga"
        jTextFieldNombreC.setText("");
        jTextFieldURLC.setText("");// TODO add your handling code here:
    }// GEN-LAST:event_jButtonRCAActionPerformed

    private void jTextFieldURLCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldURLCActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldURLCActionPerformed

    private void jTextFieldNombreCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldNombreCActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextFieldNombreCActionPerformed

    private void jButtonRCCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRCCActionPerformed
        RegistrarClaseCU.dispose();
        jTextFieldNombreC.setText("");
        jTextFieldURLC.setText("");
        // GEN-LAST:event_jButtonRCCActionPerformed// TODO add your handling code here:
    }// GEN-LAST:event_jButtonRCCActionPerformed

    private void jMenuConsutaActividadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuConsutaActividadActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jMenuConsutaActividadActionPerformed

    // private void jTextFieldNombreCActionPerformed(java.awt.event.ActionEvent evt)
    // {// GEN-FIRST:event_jTextFieldNombreCActionPerformed
    // // TODO add your handling code here:
    // }// GEN-LAST:event_jTextFieldNombreCActionPerformed

    private void RegistrarActividadCUInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {// GEN-FIRST:event_RegistrarActividadCUInternalFrameOpened
        addInstitucionesToComboBox("Actividad");
    }// GEN-LAST:event_RegistrarActividadCUInternalFrameOpened

    private void jMenuItemRClaseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemRClaseActionPerformed
        RegistrarClaseCU.setSize(760, 500);
        RegistrarClaseCU.setLocation(15, 50);
        RegistrarClaseCU.setVisible(true);
        // internalFrame.setSize(300, 200);
        // internalFrame.setVisible(true);
        jDesktopPane1.add(RegistrarClaseCU);
        RegistrarClaseCU.toFront(); // TODO add your handling code here:
    }// GEN-LAST:event_jMenuItemRClaseActionPerformed

    private void jMenuItemRActividadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemRActividadActionPerformed
        RegistrarActividadCU.setSize(560, 500);
        RegistrarActividadCU.setLocation(50, 50);
        RegistrarActividadCU.setVisible(true);
        // internalFrame.setSize(300, 200);
        // internalFrame.setVisible(true);
        jDesktopPane1.add(RegistrarActividadCU);
        RegistrarActividadCU.toFront();// TODO add your handling code here:
    }// GEN-LAST:event_jMenuItemRActividadActionPerformed

    private void jMenuItemRClienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemRClienteActionPerformed
        RegistrarClienteCU.setSize(560, 500);
        RegistrarClienteCU.setLocation(50, 50);
        RegistrarClienteCU.setVisible(true);
        jTextFieldDescProf.setEnabled(false);
        jTextFieldBioProf.setEnabled(false);
        jTextFieldWebProf.setEnabled(false);
        // internalFrame.setSize(300, 200);
        // internalFrame.setVisible(true);
        jDesktopPane1.add(RegistrarClienteCU);
        RegistrarClienteCU.toFront();
    }// GEN-LAST:event_jMenuItemRClienteActionPerformed

    private void jButtonAceptarIntActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAceptarIntActionPerformed
        // TODO add your handling code here:
        System.out.print("Add logic ");
    }// GEN-LAST:event_jButtonAceptarIntActionPerformed

    private void jButtonAceptarActividadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAceptarIntActionPerformed
        // TODO add your handling code here:
        try {
            Date selectedDate = jDateChooserFActividad.getDate();
            LocalDate localDate = selectedDate.toInstant()
                    .atZone(jDateChooserFActividad.getCalendar().getTimeZone().toZoneId()).toLocalDate();
            Fabrica factory = new Fabrica();
            IControllerAltaActividad controllerAltaActividad = factory.getControladorAltaActividad();
            String nombre = jTextFieldNombreA.getText();
            String desc = jTextFieldDescA.getText();
            int duracion = Integer.parseInt(jTextFieldDuracionA.getText());
            float costo = Float.parseFloat(jTextFieldCostoA.getText());
            Object instituciones = jComboBoxInstituciones.getSelectedItem();
            String institucion = instituciones.toString();
            controllerAltaActividad.altaActividad(nombre, desc, duracion, costo, localDate, institucion);
            jTextFieldNombreC.setText("");
            jTextFieldURLC.setText("");
        } catch (NumberFormatException e) {
            // Manejar la excepción si el valor ingresado no es un número válido
            System.out.println("Error: El valor no es un número válido.");
        }
    }

    private void jMenuRInstitucionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuRInstitucionActionPerformed
        RegistrarInstitucionCU.setSize(397, 301);
        RegistrarInstitucionCU.setLocation(50, 50);
        RegistrarInstitucionCU.setVisible(true);
        jDesktopPane1.add(RegistrarInstitucionCU);
        RegistrarInstitucionCU.toFront();
    }// GEN-LAST:event_jMenuRInstitucionActionPerformed

    private void jButtonCancelarInstActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarInstActionPerformed
        RegistrarInstitucionCU.dispose();
    }// GEN-LAST:event_jButtonCancelarInstActionPerformed

    private void jButtonCancelarConsultaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelarConsultaUsuarioActionPerformed

        DefaultTableModel tableModel = (DefaultTableModel) jTableInformacionAsociada.getModel();

        tableModel.setRowCount(0);

        tableModel = (DefaultTableModel) jTableListaUsuario.getModel();

        tableModel.setRowCount(0);
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

    private void jTableListaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableListaUsuarioMouseClicked
        System.out.println("In event");
        int viewRow = jTableListaUsuario.getSelectedRow();

        if (viewRow != -1) {

            // Better to access table row using modelRow rather than viewRow
            int modelRow = jTableListaUsuario.convertRowIndexToModel(viewRow);

            // Access value at selected row at the second column (columnIndex = 1)
            Object modelvalue = jTableListaUsuario.getModel().getValueAt(modelRow, 0);

            // Print cell value
            System.out.println(modelvalue);
            Fabrica factory = new Fabrica();

            IControllerConsultaUsuario consultaUsuario = factory.getControladorConsultaUsuario();

            String nickname = (String) modelvalue;

            Usuario selectedUser = consultaUsuario.getUsuarios(nickname).get(0);

            if (selectedUser instanceof Profesor) {
                // Profesor profesor = (Profesor) selectedUser; // Puedes hacer un casting a
                // Profesor
                System.out.println("El usuario seleccionado es un Profesor.");

                List<Clase> searchResult = consultaUsuario.getClasesAsociadas(nickname);

                if (!searchResult.isEmpty() || searchResult.get(0) != null) {

                    DefaultTableModel tableModel = (DefaultTableModel) jTableInformacionAsociada
                            .getModel();

                    tableModel.setRowCount(0);

                    for (Clase fila : searchResult) {
                        Object[] rowData = { fila.getNombre(), fila.getUrl() };
                        tableModel.addRow(rowData);
                    }

                    // Notificar al modelo de la tabla que se han realizado cambios
                    tableModel.fireTableDataChanged();
                }

            } else if (selectedUser instanceof Socio) {
                // Socio socio = (Socio) selectedUser; // Puedes hacer un casting a Socio
                System.out.println("El usuario seleccionado es un Socio.");

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

    private void jComboBoxInstitucionesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxInstitucionesActionPerformed

    }// GEN-LAST:event_jComboBoxInstitucionesActionPerformed

    private void addInstitucionesToComboBox(String option) {

        List<InstitucionDeportiva> instituciones = ManejadorInstitucion.getInstituciones();
        // Object selectedItem;

        switch (option) {
            case "Actividad":

                jComboBoxInstituciones.removeAllItems();

                for (InstitucionDeportiva institucion : instituciones) {
                    jComboBoxInstituciones.addItem(institucion.getNombre());
                }

                // selectedItem = jComboBoxInstituciones.getSelectedItem();

                // if (selectedItem != null) {
                // String selectedText = selectedItem.toString(); // Convertir el elemento a
                // String
                // }

                break;
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

        // Notificar al modelo de la tabla que se han realizado cambios
        tableModel.fireTableDataChanged();

    }// GEN-LAST:event_jMenuConsultarUsuarioActionPerformed

    private void jButtonCancelarActividadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
        RegistrarActividadCU.dispose();
        jTextFieldNombreA.setText("");
        jTextFieldDescA.setText("");
        jTextFieldDuracionA.setText("");
        jTextFieldCostoA.setText("");
    }// GEN-LAST:event_jButton5ActionPerformed

    private void jComboBoxEmailUActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox4ActionPerformed
        // Obtener el elemento seleccionado del JComboBox
        Object selectedItem = jComboBoxEmailU.getSelectedItem();

        // Realizar acciones basadas en el elemento seleccionado
        if (selectedItem != null) {
            String selectedText = selectedItem.toString(); // Convertir el elemento a String
            jTextFieldEmailU.setText(selectedText); // Establecer el texto en el JTextField
        }
    }// GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBoxNicknameUActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox3ActionPerformed
        // Obtener el elemento seleccionado del JComboBox
        Object selectedItem = jComboBoxNicknameU.getSelectedItem();

        // Realizar acciones basadas en el elemento seleccionado
        if (selectedItem != null) {
            String selectedText = selectedItem.toString(); // Convertir el elemento a String
            jTextFieldNicknameU.setText(selectedText); // Establecer el texto en el JTextField
        }
    }// GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBoxApellidoUActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox2ActionPerformed
        // Obtener el elemento seleccionado del JComboBox
        Object selectedItem = jComboBoxApellidoU.getSelectedItem();

        // Realizar acciones basadas en el elemento seleccionado
        if (selectedItem != null) {
            String selectedText = selectedItem.toString(); // Convertir el elemento a String
            jTextFieldApellidoU.setText(selectedText); // Establecer el texto en el JTextField
        }
    }// GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBoxNombreUActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox1ActionPerformed
        // Obtener el elemento seleccionado del JComboBox
        Object selectedItem = jComboBoxNombreU.getSelectedItem();

        // Realizar acciones basadas en el elemento seleccionado
        if (selectedItem != null) {
            String selectedText = selectedItem.toString(); // Convertir el elemento a String
            jTextFieldNombreU.setText(selectedText); // Establecer el texto en el JTextField
        }
    }// GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonRUCActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        RegistrarClienteCU.dispose();
        jTextFieldNombreU.setText("");
        jTextFieldApellidoU.setText("");
        jTextFieldNicknameU.setText("");
        jTextFieldEmailU.setText("");
        jTextFieldDescProf.setText("");
        jTextFieldBioProf.setText("");
        jTextFieldWebProf.setText("");
    }// GEN-LAST:event_jButton3ActionPerformed
     // GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBoxPROFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCheckBoxPROFActionPerformed
        if (jCheckBoxPROF.isSelected()) {
            jTextFieldDescProf.setEnabled(true);
            jTextFieldBioProf.setEnabled(true);
            jTextFieldWebProf.setEnabled(true);
        } else {
            jTextFieldDescProf.setEnabled(false);
            jTextFieldBioProf.setEnabled(false);
            jTextFieldWebProf.setEnabled(false);
        } // GEN-LAST:event_jCheckBoxPROFActionPerformed
    }
    // GEN-LAST:event_jMenuItem1ActionPerformed
    // GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void jButtonRUAActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Fabrica factory = new Fabrica();

            IControllerAltaUsuario controllerAltaUsuario = factory.getControladorAltaUsuario();

            final LocalDate fechaNacimiento = LocalDate.of((int) jSpinnerFNanio.getValue(),
                    (int) jSpinnerFNmes.getValue(),
                    (int) jSpinnerFNdia.getValue());

            String nickname = jTextFieldNicknameU.getText();
            String nombre = jTextFieldNombreU.getText();
            String apellido = jTextFieldApellidoU.getText();
            String email = jTextFieldEmailU.getText();
            String descripcion = jTextFieldDescProf.getText();
            String biografia = jTextFieldBioProf.getText();
            String sitioweb = jTextFieldWebProf.getText();
            boolean action;
            // Llamar a tu función pasando la variable como argumento
            if (jCheckBoxPROF.isSelected()) {
                action = controllerAltaUsuario.addProfesor(nickname, nombre, apellido, email,
                        fechaNacimiento,
                        descripcion,
                        biografia, sitioweb);
            } else {
                action = controllerAltaUsuario.addSocio(nickname, nombre, apellido, email,
                        fechaNacimiento);
            }

            if (action) {
                jTextFieldNombreU.setText("");
                jTextFieldApellidoU.setText("");
                jTextFieldNicknameU.setText("");
                jTextFieldEmailU.setText("");
                jTextFieldDescProf.setText("");
                jTextFieldBioProf.setText("");
                jTextFieldWebProf.setText("");
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
    private javax.swing.JInternalFrame RegistrarInstitucionCU;
    private javax.swing.JLabel TextoActividadC;
    private javax.swing.JLabel TextoApellidoU;
    private javax.swing.JLabel TextoBioProf;
    private javax.swing.JLabel TextoCostoA;
    private javax.swing.JLabel TextoDescA;
    private javax.swing.JLabel TextoDescProf;
    private javax.swing.JLabel TextoDuracionA;
    private javax.swing.JLabel TextoEmailU;
    private javax.swing.JLabel TextoFAC;
    private javax.swing.JLabel TextoFIC;
    private javax.swing.JLabel TextoFNU;
    private javax.swing.JLabel TextoFechaA;
    private javax.swing.JLabel TextoHIC;
    private javax.swing.JLabel TextoIngreseDatosC;
    private javax.swing.JLabel TextoIngresedatosU;
    private javax.swing.JLabel TextoNicknameU;
    private javax.swing.JLabel TextoNombreA;
    private javax.swing.JLabel TextoNombreC;
    private javax.swing.JLabel TextoNombreU;
    private javax.swing.JLabel TextoProfesorC;
    private javax.swing.JLabel TextoURLC;
    private javax.swing.JLabel TextoWebProf;
    private javax.swing.JButton jButtonAceptarActividad;
    private javax.swing.JButton jButtonAceptarInt;
    private javax.swing.JButton jButtonBuscarUsuario;
    private javax.swing.JButton jButtonCancelarActividad;
    private javax.swing.JButton jButtonCancelarConsultaUsuario;
    private javax.swing.JButton jButtonCancelarInst;
    private javax.swing.JButton jButtonRCA;
    private javax.swing.JButton jButtonRCC;
    private javax.swing.JButton jButtonRUA;
    private javax.swing.JButton jButtonRUC;
    private javax.swing.JCheckBox jCheckBoxPROF;
    private javax.swing.JComboBox<String> jComboBoxActividadesC;
    private javax.swing.JComboBox<String> jComboBoxApellidoU;
    private javax.swing.JComboBox<String> jComboBoxEmailU;
    private javax.swing.JComboBox<String> jComboBoxInstituciones;
    private javax.swing.JComboBox<String> jComboBoxInstitucionesClase;
    private javax.swing.JComboBox<String> jComboBoxNicknameU;
    private javax.swing.JComboBox<String> jComboBoxNombreC;
    private javax.swing.JComboBox<String> jComboBoxNombreU;
    private javax.swing.JComboBox<String> jComboBoxProfesorC;
    private javax.swing.JComboBox<String> jComboBoxURLC;
    private com.toedter.calendar.JDateChooser jDateChooserFActividad;
    private com.toedter.calendar.JDateChooser jDateChooserFechaAlta;
    private com.toedter.calendar.JDateChooser jDateChooserFechaInicio;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelDescInstitucion;
    private javax.swing.JLabel jLabelInstituciones;
    private javax.swing.JLabel jLabelNombreInstitucion;
    private javax.swing.JLabel jLabelurlInstitucion;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuConsultarUsuario;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuConsutaActividad;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItemRActividad;
    private javax.swing.JMenuItem jMenuItemRClase;
    private javax.swing.JMenuItem jMenuItemRCliente;
    private javax.swing.JMenuItem jMenuRInstitucion;
    private javax.swing.JMenu jMenuRegistro;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneConsultaUsuario;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinnerFNanio;
    private javax.swing.JSpinner jSpinnerFNdia;
    private javax.swing.JSpinner jSpinnerFNmes;
    private javax.swing.JTable jTableInformacionAsociada;
    private javax.swing.JTable jTableListaUsuario;
    private javax.swing.JTextField jTextFieldApellidoU;
    private javax.swing.JTextField jTextFieldBioProf;
    private javax.swing.JTextField jTextFieldBuscarUsuario;
    private javax.swing.JTextField jTextFieldCostoA;
    private javax.swing.JTextField jTextFieldDescA;
    private javax.swing.JTextField jTextFieldDescInstitucion;
    private javax.swing.JTextField jTextFieldDescProf;
    private javax.swing.JTextField jTextFieldDuracionA;
    private javax.swing.JTextField jTextFieldEmailU;
    private javax.swing.JTextField jTextFieldNicknameU;
    private javax.swing.JTextField jTextFieldNombreA;
    private javax.swing.JTextField jTextFieldNombreC;
    private javax.swing.JTextField jTextFieldNombreInstitucion;
    private javax.swing.JTextField jTextFieldNombreU;
    private javax.swing.JTextField jTextFieldURLC;
    private javax.swing.JTextField jTextFieldUrl;
    private javax.swing.JTextField jTextFieldWebProf;
    // End of variables declaration//GEN-END:variables

}
