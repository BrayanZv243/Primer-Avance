/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlgcompartidos;

import Enums.Estado;
import Enums.Sexo;
import entidades.Perfil;
import Enums.EPerfil;
import entidades.Casting;
import entidades.Fase;
import interfaces.IPersistenciaFachada;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.PersistenciaFachada;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DlgLlenarPerfil extends javax.swing.JDialog {

    ArrayList<Perfil> perfiles;
    DefaultComboBoxModel listaCastings;
    IPersistenciaFachada persistenciaFachada;
    int operacion;

    /**
     * Creates new form LlenarPerfil
     *
     * @param perfiles
     */
    public DlgLlenarPerfil(ArrayList<Perfil> perfiles, DefaultComboBoxModel listaCastings) {
        this.listaCastings = listaCastings;
        this.perfiles = perfiles;
        persistenciaFachada = PersistenciaFachada.getInstance();
        this.operacion = 0;
        initComponents();
        if (listaCastings != null) {
            lblCasting.setVisible(true);
            comboBoxCastings.setVisible(true);
            comboBoxCastings.setModel(listaCastings);
        } else {
            lblCasting.setVisible(false);
            comboBoxCastings.setVisible(false);

        }
        setLocationRelativeTo(null);
        setVisible(true);
        llenarTabla(perfiles);

    }

    public DlgLlenarPerfil(ArrayList<Perfil> perfiles, int operacion) {
        this.perfiles = perfiles;
        this.operacion = operacion;
        persistenciaFachada = PersistenciaFachada.getInstance();
        initComponents();
        if (listaCastings != null) {
            lblCasting.setVisible(true);
            comboBoxCastings.setVisible(true);
            comboBoxCastings.setModel(listaCastings);
        } else {
            lblCasting.setVisible(false);
            comboBoxCastings.setVisible(false);

        }
        setLocationRelativeTo(null);
        setVisible(true);
        llenarTabla(perfiles);
        if (operacion == 1) {
            desactivarCampos();
        }

    }

    private void desactivarCampos() {
        txtCodigo.setEditable(false);
        txtColorOjos.setEditable(false);
        txtColorPelo.setEditable(false);
        comboBoxCastings.setEnabled(false);
        comboBoxEstados.setEnabled(false);
        comboBoxExperiencia.setEnabled(false);
        comboBoxPerfil.setEnabled(false);
        comboBoxRangoAltura.setEnabled(false);
        comboBoxRangoEdad.setEnabled(false);
        comboBoxSexo.setEnabled(false);
        btnLimpiar.setEnabled(false);
        btnInsertar.setEnabled(false);
        btnCancelar.setText("Salir");
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
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
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboBoxEstados = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboBoxSexo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtColorPelo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtColorOjos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboBoxPerfil = new javax.swing.JComboBox<>();
        comboBoxExperiencia = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPerfil2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPerfil1 = new javax.swing.JTable();
        btnInsertar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        comboBoxRangoAltura = new javax.swing.JComboBox<>();
        comboBoxRangoEdad = new javax.swing.JComboBox<>();
        lblCasting = new javax.swing.JLabel();
        comboBoxCastings = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Llenar Perfil");

        jLabel1.setText("Código:");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        jLabel2.setText("Estado:");

        comboBoxEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Coahuila", "Colima", "Chiapas", "Chihuahua", "Durango", "CDMX", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));

        jLabel3.setText("Sexo:");

        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        comboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSexoActionPerformed(evt);
            }
        });

        jLabel4.setText("Rango Altura:");

        jLabel6.setText("Rango Edad:");

        jLabel8.setText("Color de Pelo:");

        txtColorPelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorPeloKeyTyped(evt);
            }
        });

        jLabel9.setText("Color de Ojos:");

        txtColorOjos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorOjosKeyTyped(evt);
            }
        });

        jLabel10.setText("Tipo de Perfil:");

        comboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modelo", "Actor" }));

        comboBoxExperiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel11.setText("Con experiencia:");

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

        tblPerfil2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "R. Edad", "Tipo Perfil", "Color Pelo", "Color Ojos", "Experiencia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPerfil2);

        tblPerfil1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Estado", "Sexo", "R. Altura"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPerfil1);

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        comboBoxRangoAltura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menos de 1.50", "1.50 - 1.70", "1.70 - 1.90", "Mayor a 1.90" }));

        comboBoxRangoEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0-15", "5 – 18", "18 - 25", "25 – 35", "35 – 45", "45 – 60", "Mayor a 60" }));

        lblCasting.setText("Casting:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnLimpiar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigo)
                                    .addComponent(comboBoxEstados, 0, 159, Short.MAX_VALUE)
                                    .addComponent(comboBoxSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxRangoAltura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxRangoEdad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxExperiencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtColorPelo)
                                    .addComponent(txtColorOjos))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(lblCasting)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxCastings, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 16, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboBoxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBoxRangoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(comboBoxRangoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBoxExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(lblCasting)
                                    .addComponent(comboBoxCastings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtColorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(txtColorOjos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(145, 145, 145)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCancelar)
                    .addComponent(btnInsertar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (perfiles.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inserte al menos un perfil para guardar!",
                    "Perfil", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (listaCastings != null) {
            Casting casting = (Casting) comboBoxCastings.getSelectedItem();
            casting.setPerfiles(perfiles);
            if (persistenciaFachada.actualizarCasting(casting)) {
                JOptionPane.showMessageDialog(null, "Perfil(es) guardado con éxito al casting",
                        "Perfil", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al guardar el perfil",
                        "Perfil", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                return;
            }

        }

        dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (!validar()) {
            return;
        }

        String codigo = txtCodigo.getText();

        Estado estado = toEnum(comboBoxEstados.getSelectedItem().toString());

        Sexo sexo = toSexo(comboBoxSexo.getSelectedItem().toString());

        String rangoAltura = comboBoxRangoAltura.getSelectedItem().toString();
        String rangoEdad = comboBoxRangoEdad.getSelectedItem().toString();

        String colorCabello = txtColorPelo.getText();
        String colorOjos = txtColorOjos.getText();
        EPerfil tipoPerfil = toPerfil(comboBoxPerfil.getSelectedItem().toString());
        boolean experiencia = (comboBoxExperiencia.getSelectedItem().toString().equals("Si"));

        Perfil perfil = new Perfil(codigo, estado, sexo, rangoAltura,
                rangoEdad, colorCabello, colorOjos, experiencia, tipoPerfil);

        perfiles.add(perfil);

        llenarTabla(perfiles);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        DefaultTableModel modelPerfil1 = (DefaultTableModel) tblPerfil1.getModel();
        DefaultTableModel modelPerfil2 = (DefaultTableModel) tblPerfil2.getModel();
        try {
            if (tblPerfil1.getSelectedRow() != -1) {
                perfiles.remove(tblPerfil1.getSelectedRow());

                modelPerfil1.removeRow(tblPerfil1.getSelectedRow());
                modelPerfil2.removeRow(tblPerfil1.getSelectedRow());
            } else if (tblPerfil2.getSelectedRow() != -1) {
                perfiles.remove(tblPerfil2.getSelectedRow());

                modelPerfil1.removeRow(tblPerfil2.getSelectedRow());
                modelPerfil2.removeRow(tblPerfil2.getSelectedRow());
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un campo para eliminar.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Seleccione un campo para eliminar.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtCodigo.getText().trim().length() == 5) {
            evt.consume();
        }    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtColorPeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorPeloKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }

        if (txtColorPelo.getText().trim().length() == 15) {
            evt.consume();
        }

    }//GEN-LAST:event_txtColorPeloKeyTyped

    private void txtColorOjosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorOjosKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }

        if (txtColorOjos.getText().trim().length() == 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtColorOjosKeyTyped

    private void comboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxSexoActionPerformed

    private void llenarTabla(ArrayList<Perfil> perfiles) {

        DefaultTableModel modelPerfil1 = (DefaultTableModel) tblPerfil1.getModel();
        DefaultTableModel modelPerfil2 = (DefaultTableModel) tblPerfil2.getModel();

        int rowCountClientes = tblPerfil1.getRowCount();

        for (int i = rowCountClientes - 1; i >= 0; i--) {
            modelPerfil1.removeRow(i);
            modelPerfil2.removeRow(i);
        }

        Object rowDataPerfiles1[] = new Object[4];
        Object rowDataPerfiles2[] = new Object[5];
        if (perfiles != null) {
            for (int i = 0; i < perfiles.size(); i++) {

                rowDataPerfiles1[0] = perfiles.get(i).getCodigo();
                rowDataPerfiles1[1] = perfiles.get(i).getEstado().toString();
                rowDataPerfiles1[2] = perfiles.get(i).getSexo().toString();
                rowDataPerfiles1[3] = perfiles.get(i).getRangoAltura();

                modelPerfil1.addRow(rowDataPerfiles1);
            }

            for (int i = 0; i < perfiles.size(); i++) {
                rowDataPerfiles2[0] = perfiles.get(i).getRangoEdad();
                rowDataPerfiles2[1] = perfiles.get(i).getColorCabello();
                rowDataPerfiles2[2] = perfiles.get(i).getColorOjos();
                rowDataPerfiles2[3] = perfiles.get(i).getTipoPerfil().toString();
                rowDataPerfiles2[4] = perfiles.get(i).isExperiencia();

                modelPerfil2.addRow(rowDataPerfiles2);
            }
        }
    }

    public ArrayList<Perfil> getPerfil() {
        return perfiles;
    }

    public Sexo toSexo(String s) {
        Sexo sexo = null;
        switch (s) {
            case "Masculino":
                sexo = Sexo.MASCULINO;
                break;
            case "Femenino":
                sexo = Sexo.FEMENINO;
                break;
        }
        return sexo;
    }

    public EPerfil toPerfil(String p) {
        EPerfil perfil = null;
        switch (p) {
            case "Actor":
                perfil = EPerfil.Actor;
                break;
            case "Modelo":
                perfil = EPerfil.Modelo;
                break;
        }
        return perfil;
    }

    public Estado toEnum(String e) {
        Estado estado = null;
        switch (e) {
            case "Aguascalientes":
                estado = Estado.Aguascalientes;
                break;
            case "Baja California":
                estado = Estado.BajaCalifornia;
                break;
            case "Baja California Sur":
                estado = Estado.BajaCaliforniaSur;
                break;
            case "Campeche":
                estado = Estado.Campeche;
                break;
            case "Coahuila":
                estado = Estado.Coahuila;
                break;
            case "Colima":
                estado = Estado.Colima;
                break;
            case "Chiapas":
                estado = Estado.Chiapas;
                break;
            case "Chihuahua":
                estado = Estado.Chihuahua;
                break;
            case "Durango":
                estado = Estado.Durango;
                break;
            case "CDMX":
                estado = Estado.CDMX;
                break;
            case "Guanajuato":
                estado = estado.Guanajuato;
                break;
            case "Guerrero":
                estado = Estado.Guerrero;
            case "Hidalgo":
                estado = Estado.Hidalgo;
                break;
            case "Jalisco":
                estado = Estado.Jalisco;
                break;
            case "Michoacán":
                estado = Estado.Michoacán;
                break;
            case "Morelos":
                estado = Estado.Morelos;
                break;
            case "Nayarit":
                estado = Estado.Nayarit;
                break;
            case "Nuevo León":
                estado = Estado.NuevoLeón;
                break;
            case "Oaxaca":
                estado = Estado.Oaxaca;
                break;
            case "Puebla":
                estado = Estado.Puebla;
                break;
            case "Querétaro":
                estado = Estado.Querétaro;
                break;
            case "Quintana Roo":
                estado = Estado.QuintanaRoo;
                break;
            case "San Luis Potosí":
                estado = Estado.SanLuisPotosí;
                break;
            case "Sinaloa":
                estado = Estado.Sinaloa;
                break;
            case "Sonora":
                estado = Estado.Sonora;
                break;
            case "Tabasco":
                estado = Estado.Tabasco;
                break;
            case "Tamaulipas":
                estado = Estado.Tamaulipas;
                break;
            case "Tlaxcala":
                estado = Estado.Tlaxcala;
                break;
            case "Veracruz":
                estado = Estado.Veracruz;
                break;
            case "Yucatán":
                estado = Estado.Yucatán;
                break;
            case "Zacatecas":
                estado = Estado.Zacatecas;
                break;
        }

        return estado;
    }

    public void limpiar() {
        txtCodigo.setText("");
        comboBoxEstados.setSelectedIndex(0);
        comboBoxSexo.setSelectedIndex(0);
        comboBoxRangoAltura.setSelectedIndex(0);
        comboBoxRangoEdad.setSelectedIndex(0);
        txtColorPelo.setText("");
        txtColorOjos.setText("");
        comboBoxPerfil.setSelectedIndex(0);
        comboBoxExperiencia.setSelectedIndex(0);
    }

    public boolean validar() {
        if (txtCodigo.getText().equals("") || txtColorOjos.getText().equals("") || txtColorPelo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos requeridos!");
            return false;
        }

        List<Casting> castings = persistenciaFachada.buscarCastings();
        List<Fase> fases = new ArrayList<>();

        if (castings != null) {
            for (int i = 0; i < castings.size(); i++) {
                for (int j = 0; j < castings.get(i).getFase().size(); j++) {
                    fases.add(castings.get(i).getFase().get(j));
                }

            }
        }

        for (int i = 0; i < fases.size(); i++) {
            ArrayList<Perfil> perfiles = fases.get(i).getCandidato().getPerfiles();
            for (int j = 0; j < perfiles.size(); j++) {
                if (perfiles.get(j).getCodigo().equals(txtCodigo.getText())) {
                    JOptionPane.showMessageDialog(null, "El perfil ya existe!");
                    return false;
                }
            }
        }

        if (castings != null) {
            for (int i = 0; i < castings.size(); i++) {
                ArrayList<Perfil> perfilesCasting = castings.get(i).getPerfiles();
                if (perfilesCasting != null) {
                    for (int j = 0; j < perfilesCasting.size(); j++) {
                        if (perfilesCasting.get(j).getCodigo().equals(txtCodigo.getText())) {
                            JOptionPane.showMessageDialog(null, "El perfil ya existe!");
                            return false;
                        }
                    }
                }
            }

        }

        for (int i = 0; i < perfiles.size(); i++) {
            if (perfiles.get(i).getCodigo().equals(txtCodigo.getText())) {
                JOptionPane.showMessageDialog(null, "El perfil ya existe!");
                return false;
            }
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> comboBoxCastings;
    private javax.swing.JComboBox<String> comboBoxEstados;
    private javax.swing.JComboBox<String> comboBoxExperiencia;
    private javax.swing.JComboBox<String> comboBoxPerfil;
    private javax.swing.JComboBox<String> comboBoxRangoAltura;
    private javax.swing.JComboBox<String> comboBoxRangoEdad;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCasting;
    private javax.swing.JTable tblPerfil1;
    private javax.swing.JTable tblPerfil2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColorOjos;
    private javax.swing.JTextField txtColorPelo;
    // End of variables declaration//GEN-END:variables
}
