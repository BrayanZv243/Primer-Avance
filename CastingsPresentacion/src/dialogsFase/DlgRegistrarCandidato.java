/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogsFase;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DateTimePicker;
import dlgcompartidos.DlgDireccion;
import dlgcompartidos.DlgLlenarPerfil;
import dlgcompartidos.DlgRegistrarContacto;
import entidades.Adulto;
import entidades.Candidato;
import entidades.Casting;
import entidades.Contacto;
import entidades.Direccion;
import entidades.Fase;
import entidades.Niño;
import entidades.Perfil;
import entidades.Representante;
import interfaces.IPersistenciaFachada;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import negocio.PersistenciaFachada;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DlgRegistrarCandidato extends javax.swing.JDialog {

    ImageIcon image;
    static Candidato candidato;
    IPersistenciaFachada persistencia;

    Direccion direccion = new Direccion();
    DlgDireccion dlgDireccion;

    DlgRegistrarContacto dlgContacto;
    Contacto contacto = new Contacto();

    DlgRegistrarContacto dlgRepresentante;
    Representante representante = new Representante();

    DlgLlenarPerfil dlgPerfil;
    ArrayList<Perfil> perfiles;
    ArrayList<Fase> fases;
    int operacion;

    /**
     * Creates new form DlgRegistrarCandidato
     *
     * @param candidato
     */
    public DlgRegistrarCandidato(Candidato candidato) {
        initComponents();
        operacion = 0;
        perfiles = new ArrayList<>();
        setLocationRelativeTo(null);
        setVisible(true);
        this.candidato = candidato;
        persistencia = PersistenciaFachada.getInstance();
        llenarCampos();
    }

    public DlgRegistrarCandidato(Candidato candidato, int operacion, ArrayList<Fase> fases) {
        initComponents();
        this.operacion = operacion;
        this.fases = fases;
        perfiles = new ArrayList<>();
        setLocationRelativeTo(null);
        setVisible(true);
        this.candidato = candidato;
        persistencia = PersistenciaFachada.getInstance();
        llenarCampos();

        if (operacion == 1) {
            desactivarCampos();
        }

    }

    private void llenarCampos() {

        txtCodigo.setText(candidato.getCodigo());
        txtCurp.setText(candidato.getCurp());
        txtNombre.setText(candidato.getNombre());
        txtRFC.setText(candidato.getRfc());
        txtTelefono.setText(candidato.getTelefono());
        comboBoxCandidato.setSelectedItem(this);

        if (candidato.getFechaNacimiento() != null) {
            LocalDate localDate = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(candidato.getFechaNacimiento()));
            dateFechaNacimiento.setDate(localDate);
        }

        if (candidato.getFotografia() != null) {
            ByteArrayInputStream bis = new ByteArrayInputStream(candidato.getFotografia());
            BufferedImage bImage2 = null;
            try {
                bImage2 = ImageIO.read(bis);
            } catch (IOException ex) {

            }
            try {
                ImageIO.write(bImage2, "jpg", new File("output.jpg"));
            } catch (IOException ex) {

            }
            ImageIcon img = new ImageIcon(bImage2);
            lblFoto.setIcon(new ImageIcon(bImage2));

            Icon icono = new ImageIcon(img.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT));
            lblFoto.setIcon(icono);
            image = (ImageIcon) icono;
        }

        aprobadoCheckBox.setSelected(candidato.isAprobado());

        if (candidato instanceof Adulto) {
            comboBoxCandidato.setSelectedIndex(0);
        } else if (candidato instanceof Niño) {
            comboBoxCandidato.setSelectedIndex(1);
        }

        if (candidato.getDireccion() != null) {
            direccion = candidato.getDireccion();
        } else {
            direccion = new Direccion();
        }

        if (candidato.getPerfiles() != null) {
            perfiles = candidato.getPerfiles();
        } else {
            perfiles = new ArrayList<>();
        }

        if (candidato.getRepresentante() != null) {
            representante = candidato.getRepresentante();
        } else {
            representante = new Representante();
        }

        if (candidato.getContacto() != null) {
            contacto = candidato.getContacto();
        } else {
            contacto = new Contacto();
        }
    }

    private void desactivarCampos() {
        comboBoxCandidato.setEnabled(false);
        txtNombre.setEditable(false);
        txtTelefono.setEditable(false);
        txtCurp.setEditable(false);
        txtRFC.setEditable(false);
        txtCodigo.setEditable(false);
        dateFechaNacimiento.setEnabled(false);
        aprobadoCheckBox.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnLimpiar.setEnabled(false);
        btnCancelar.setText("Salir");
        btnEscogerFotografia.setEnabled(false);
        btnRegistrarDireccion.setText("Ver Dirección...");
        btnRegistrarContacto.setText("Ver Contacto...");
        btnRegistrarRepresentante.setText("Ver Contacto...");
        btnRegistrarPerfil.setText("Ver Perfil...");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        lblRFC = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        btnRegistrarDireccion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnRegistrarContacto = new javax.swing.JButton();
        dateFechaNacimiento = new com.github.lgooddatepicker.components.DatePicker();
        jLabel6 = new javax.swing.JLabel();
        btnEscogerFotografia = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        aprobadoCheckBox = new javax.swing.JCheckBox();
        btnRegistrarRepresentante = new javax.swing.JButton();
        btnRegistrarPerfil = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboBoxCandidato = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Candidato");

        jLabel1.setText("Nombre:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel2.setText("Teléfono:");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel3.setText("Curp:");

        txtCurp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCurpKeyTyped(evt);
            }
        });

        lblRFC.setText("RFC:");

        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });

        btnRegistrarDireccion.setText("Registrar Dirección");
        btnRegistrarDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDireccionActionPerformed(evt);
            }
        });

        jLabel5.setText("Código:");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        btnRegistrarContacto.setText("Registrar Contacto");
        btnRegistrarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarContactoActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha Nacimiento:");

        btnEscogerFotografia.setText("Escoger Fotografía...");
        btnEscogerFotografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscogerFotografiaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
        );

        aprobadoCheckBox.setText("Aprobado");
        aprobadoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprobadoCheckBoxActionPerformed(evt);
            }
        });

        btnRegistrarRepresentante.setText("Registrar Representante");
        btnRegistrarRepresentante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRepresentanteActionPerformed(evt);
            }
        });

        btnRegistrarPerfil.setText("Registrar Perfil");
        btnRegistrarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPerfilActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo de Candidato:");

        comboBoxCandidato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adulto", "Niño" }));
        comboBoxCandidato.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCandidatoItemStateChanged(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(lblRFC)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(comboBoxCandidato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(txtTelefono)
                                .addComponent(txtCurp)
                                .addComponent(txtRFC)
                                .addComponent(txtCodigo)
                                .addComponent(aprobadoCheckBox))
                            .addComponent(dateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistrarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrarDireccion))
                                .addGap(39, 39, 39)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btnEscogerFotografia)))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarRepresentante, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboBoxCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRFC)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrarDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrarContacto)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnEscogerFotografia))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarRepresentante, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aprobadoCheckBox)
                    .addComponent(btnRegistrarPerfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    File imageFile;
    private void btnEscogerFotografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscogerFotografiaActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("JPG, PNG", "jpg", "png");
        fileChooser.setFileFilter(filtroImagen);

        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {

            File selectedFile = fileChooser.getSelectedFile();
            imageFile = new File(selectedFile.getAbsolutePath());

            image = new ImageIcon(selectedFile.getAbsolutePath());
            Icon icono = new ImageIcon(image.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT));
            lblFoto.setIcon(icono);
            this.repaint();

        }
    }//GEN-LAST:event_btnEscogerFotografiaActionPerformed

    private void comboBoxCandidatoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCandidatoItemStateChanged
        if (comboBoxCandidato.getSelectedIndex() == 0) {
            lblRFC.setEnabled(true);
            txtRFC.setEnabled(true);
        } else {
            lblRFC.setEnabled(false);
            txtRFC.setEnabled(false);
        }
    }//GEN-LAST:event_comboBoxCandidatoItemStateChanged

    private void btnRegistrarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPerfilActionPerformed

        dlgPerfil = new DlgLlenarPerfil(perfiles, operacion);
        perfiles = dlgPerfil.getPerfil();

    }//GEN-LAST:event_btnRegistrarPerfilActionPerformed

    private void aprobadoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprobadoCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aprobadoCheckBoxActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDireccionActionPerformed
        dlgDireccion = new DlgDireccion(direccion, operacion);
        direccion = dlgDireccion.getDireccion();
    }//GEN-LAST:event_btnRegistrarDireccionActionPerformed

    private void btnRegistrarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarContactoActionPerformed
        dlgContacto = new DlgRegistrarContacto(contacto, operacion);
    }//GEN-LAST:event_btnRegistrarContactoActionPerformed

    private void btnRegistrarRepresentanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRepresentanteActionPerformed
        dlgRepresentante = new DlgRegistrarContacto(representante, operacion);

    }//GEN-LAST:event_btnRegistrarRepresentanteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!validacion()) {
            return;
        }
        if (imageFile != null) {
            BufferedImage bImage = null;
            try {
                bImage = ImageIO.read(imageFile);
            } catch (IOException ex) {

            }
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            try {
                ImageIO.write(bImage, "jpg", bos);
            } catch (IOException ex) {

            }
            byte[] data = bos.toByteArray();
            candidato.setFotografia(data);
        }

        if (comboBoxCandidato.getSelectedIndex() == 0) {
            String nombre = txtNombre.getText();
            String curp = txtCurp.getText();
            String rfc = txtRFC.getText();
            String telefono = txtTelefono.getText();
            String codigo = txtCodigo.getText();
            boolean aprobado = aprobadoCheckBox.isSelected();
            Date fechaNacimiento = null;
            try {
                fechaNacimiento = toDate(null, dateFechaNacimiento);
            } catch (Exception ex) {

            }

            Adulto adulto = new Adulto(codigo, contacto, fechaNacimiento,
                    candidato.getFotografia(), representante, perfiles, aprobado, nombre, telefono, curp, rfc, direccion);
            candidato = adulto;
            JOptionPane.showMessageDialog(null, "Adulto registrado correctamente",
                    "Candidato", JOptionPane.INFORMATION_MESSAGE);

            dispose();
        } else {
            String nombre = txtNombre.getText();
            String curp = txtCurp.getText();
            String telefono = txtTelefono.getText();
            String codigo = txtCodigo.getText();
            boolean aprobado = aprobadoCheckBox.isSelected();

            Date fechaNacimiento = null;
            try {
                fechaNacimiento = toDate(null, dateFechaNacimiento);
            } catch (Exception ex) {

            }

            Niño niño = new Niño(codigo, contacto, fechaNacimiento,
                    candidato.getFotografia(), representante, perfiles, aprobado, nombre, telefono, curp, direccion);
            candidato = niño;
            JOptionPane.showMessageDialog(null, "Niño registrado correctamente",
                    "Candidato", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    public static Candidato getCandidato() {
        if (candidato == null) {
            return new Candidato();
        }
        return candidato;
    }

    public boolean validacion() {
        
        if(txtNombre.getText().equals("") || txtTelefono.getText().equals("") || txtCurp.getText().equals("")
                || txtRFC.getText().equals("") || txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campos vacíos, reviselos e intentelo de nuevo!");
            return false;
        }
        
        if (direccion.getCalle() == null || direccion.getCodigoPostal() == null
                || direccion.getColonia() == null || direccion.getEntreCalles() == null
                || direccion.getNumExterior() == null || direccion.getNumInterior() == null
                || direccion.getReferencia() == null) {
            JOptionPane.showMessageDialog(null, "Dirección incompleta, llenela para guardar.");
            return false;
        }

        if (contacto.getCurp() == null || contacto.getDireccion() == null || contacto.getNombre() == null
                || contacto.getRfc() == null || contacto.getTelefono() == null) {
            JOptionPane.showMessageDialog(null, "Contacto incompleta, llenela para guardar.");
            return false;
        }

        if (representante.getCurp() == null || representante.getDireccion() == null || representante.getNombre() == null
                || representante.getRfc() == null || representante.getTelefono() == null) {
            JOptionPane.showMessageDialog(null, "Representante incompleto, llenela para guardar.");
            return false;
        }
        if (perfiles.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene al menos un perfil!");
            return false;
        }

        if (image == null) {
            JOptionPane.showMessageDialog(null, "Seleccione una Foto!");
            return false;
        }

        List<Casting> casting = persistencia.buscarCastings();

        if (casting != null) {
            for (int i = 0; i < casting.size(); i++) {
                if (casting.get(i).getFase().get(i).getCandidato().getCodigo().equals(txtCodigo.getText())) {
                    JOptionPane.showMessageDialog(null, "El código de candidato ya existe!");
                    return false;
                }
            }
        }

        if (fases != null) {
            for (int i = 0; i < fases.size(); i++) {
                if (fases.get(i).getCandidato().getCodigo().equals(txtCodigo.getText())) {
                    JOptionPane.showMessageDialog(null, "El código de candidato ya existe!");
                    return false;
                }
            }
        }

        Date fechaN = null;
        try {
            fechaN = toDate(null, dateFechaNacimiento);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una fecha válida");
            return false;
        }
        Date date = new Date();
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date);
        c1.add(Calendar.YEAR, -18);
        c1.setTime(date);
        c1.add(Calendar.YEAR, -18);
        if (comboBoxCandidato.getSelectedIndex() == 0) {
            if (fechaN.getTime() >= c1.getTime().getTime()) {
                JOptionPane.showMessageDialog(null, "Ingrese una fecha válida para un adulto!");
                return false;
            }
        } else {
            if (fechaN.getTime() <= c1.getTime().getTime()) {
                JOptionPane.showMessageDialog(null, "Ingrese una fecha válida para un niño!");
                return false;
            }
        }

        return true;
    }

    public Date toDate(DateTimePicker dateTimePicker, DatePicker datePicker) throws Exception {
        ZoneId defaultZoneId = ZoneId.systemDefault();

        if (dateTimePicker != null) {
            String date = dateTimePicker.getDatePicker().getDate().format(DateTimeFormatter.ofPattern("dd-MM-uuuu"));
            String hour = dateTimePicker.timePicker.getTime().toString();

            String dateS = date + " " + hour;
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm");
            Date fecha = null;
            try {
                fecha = formatter.parse(dateS);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return fecha;
        } else if (datePicker != null) {
            Date fecha = Date.from(datePicker.getDate().atStartOfDay(defaultZoneId).toInstant());
            return fecha;
        }
        return null;

    }


    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }

        if (txtNombre.getText().trim().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtTelefono.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtCurpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurpKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean numeros = key >= 48 && key <= 57;

        if (!(minusculas || mayusculas || espacio || numeros)) {
            evt.consume();
        }

        if (txtCurp.getText().trim().length() == 18) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCurpKeyTyped

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean numeros = key >= 48 && key <= 57;

        if (!(minusculas || mayusculas || espacio || numeros)) {
            evt.consume();
        }

        if (txtRFC.getText().trim().length() == 13) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtCodigo.getText().trim().length() == 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void limpiar() {
        comboBoxCandidato.setSelectedIndex(0);
        txtNombre.setText("");
        txtTelefono.setText("");
        txtCurp.setText("");
        txtRFC.setText("");
        txtCodigo.setText("");
        dateFechaNacimiento.setText("");
        aprobadoCheckBox.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox aprobadoCheckBox;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEscogerFotografia;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrarContacto;
    private javax.swing.JButton btnRegistrarDireccion;
    private javax.swing.JButton btnRegistrarPerfil;
    private javax.swing.JButton btnRegistrarRepresentante;
    private javax.swing.JComboBox<String> comboBoxCandidato;
    private com.github.lgooddatepicker.components.DatePicker dateFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
