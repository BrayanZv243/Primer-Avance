/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogsCasting;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DateTimePicker;
import dialogsAgente.DlgRegistrarAgente;
import dialogsCliente.DlgRegistrarCliente;
import dialogsFase.DlgRegistrarFase;
import dlgcompartidos.DlgLlenarPerfil;
import entidades.Casting;
import entidades.CastingOnline;
import entidades.CastingPresencial;
import interfaces.IPersistenciaFachada;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.PersistenciaFachada;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DlgBuscarCasting extends javax.swing.JDialog {

    ArrayList<Casting> castings;
    IPersistenciaFachada persistencia;

    public DlgBuscarCasting() {
        persistencia = PersistenciaFachada.getInstance();
        castings = new ArrayList<>();
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxSeleccion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCastings = new javax.swing.JTable();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        dateFechaContrato = new com.github.lgooddatepicker.components.DatePicker();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarCasting = new javax.swing.JButton();
        btnAgente = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnModalidad = new javax.swing.JButton();
        btnFase = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnPerfiles = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Casting");

        comboBoxSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre", "Fecha" }));
        comboBoxSeleccion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxSeleccionItemStateChanged(evt);
            }
        });

        tblCastings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Costo", "Aprobado", "F. Contrato", "F. Hora Inicio", "F. Hora Fin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCastings);
        if (tblCastings.getColumnModel().getColumnCount() > 0) {
            tblCastings.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblCastings.getColumnModel().getColumn(2).setPreferredWidth(1);
            tblCastings.getColumnModel().getColumn(3).setPreferredWidth(1);
        }

        lblCodigo.setText("Código:");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        lblNombre.setText("Nombre:");
        lblNombre.setEnabled(false);

        txtNombre.setEnabled(false);

        lblFecha.setText("Fecha:");
        lblFecha.setEnabled(false);

        dateFechaContrato.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Datos de CASTING");

        btnBuscarCasting.setText("BUSCAR CASTING");
        btnBuscarCasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCastingActionPerformed(evt);
            }
        });

        btnAgente.setText("Agente");
        btnAgente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgenteActionPerformed(evt);
            }
        });

        btnCliente.setText("Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnModalidad.setText("Modalidad");
        btnModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModalidadActionPerformed(evt);
            }
        });

        btnFase.setText("Fase");
        btnFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaseActionPerformed(evt);
            }
        });

        jLabel4.setText("Buscar por:");

        btnPerfiles.setText("Perfiles");
        btnPerfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilesActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(lblFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateFechaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarCasting, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnAgente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnFase, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnPerfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha)
                    .addComponent(dateFechaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarCasting)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCliente)
                    .addComponent(btnAgente)
                    .addComponent(btnModalidad)
                    .addComponent(btnFase)
                    .addComponent(btnPerfiles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModalidadActionPerformed
        if (!validarSeleccion()) {
            return;
        }
        Casting casting = (Casting) castings.get(tblCastings.getSelectedRow());
        try {
            CastingPresencial cp = casting.getCastingPresencial();
            new DlgSeleccionarModalidad(cp, new CastingOnline(), 1);
        } catch (Exception e) {
            CastingOnline co = casting.getCastingOnline();
            new DlgSeleccionarModalidad(new CastingPresencial(), co, 1);
        }


    }//GEN-LAST:event_btnModalidadActionPerformed

    private void btnFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaseActionPerformed
        if (!validarSeleccion()) {
            return;
        }
        Casting casting = (Casting) castings.get(tblCastings.getSelectedRow());
        new DlgRegistrarFase(casting.getFase(), 1);
    }//GEN-LAST:event_btnFaseActionPerformed

    private void comboBoxSeleccionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxSeleccionItemStateChanged
        switch (comboBoxSeleccion.getSelectedIndex()) {
            case 0:
                lblCodigo.setEnabled(true);
                txtCodigo.setEnabled(true);
                lblNombre.setEnabled(false);
                txtNombre.setEnabled(false);
                lblFecha.setEnabled(false);
                dateFechaContrato.setEnabled(false);
                break;
            case 1:
                lblNombre.setEnabled(true);
                txtNombre.setEnabled(true);
                lblCodigo.setEnabled(false);
                txtCodigo.setEnabled(false);
                lblFecha.setEnabled(false);
                dateFechaContrato.setEnabled(false);
                break;
            default:
                lblFecha.setEnabled(true);
                dateFechaContrato.setEnabled(true);
                lblNombre.setEnabled(false);
                txtNombre.setEnabled(false);
                lblCodigo.setEnabled(false);
                txtCodigo.setEnabled(false);
                break;
        }
        txtCodigo.setText("");
        txtNombre.setText("");
        dateFechaContrato.setText("");

    }//GEN-LAST:event_comboBoxSeleccionItemStateChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarCastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCastingActionPerformed
        if (comboBoxSeleccion.getSelectedIndex() == 0) {

            String codigo = txtCodigo.getText();
            if (codigo.equals("")) {
                JOptionPane.showMessageDialog(null, "Llene el campo de Código!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Casting casting = persistencia.buscarCastingPorCodigo(codigo);
            if (casting != null) {
                llenarTabla(casting);
                return;
            }
            JOptionPane.showMessageDialog(null, "No se encontró el casting!",
                    "Error", JOptionPane.ERROR_MESSAGE);

            return;
        }

        if (comboBoxSeleccion.getSelectedIndex() == 1) {

            String nombre = txtNombre.getText();
            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Llene el campo de Nombre!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Casting casting = persistencia.buscarCastingPorNombre(nombre);
            if (casting != null) {
                llenarTabla(casting);
                return;
            }
            JOptionPane.showMessageDialog(null, "No se encontró el casting!",
                    "Error", JOptionPane.ERROR_MESSAGE);

            return;
        }

        if (comboBoxSeleccion.getSelectedIndex() == 2) {
            Date fechaContrato = null;
            try {
                fechaContrato = toDate(null, dateFechaContrato);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ingrese una Fecha válida!",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            List<Casting> castings = persistencia.buscarCastingPorFecha(fechaContrato);
            if (castings != null) {
                llenarTablaParaCastings(castings);
                return;
            }
            JOptionPane.showMessageDialog(null, "No se encontraron castings con la fecha indicada!",
                    "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnBuscarCastingActionPerformed

    private void llenarTabla(Casting casting) {
        DefaultTableModel modelCastings = (DefaultTableModel) tblCastings.getModel();

        int rowCountClientes = tblCastings.getRowCount();

        for (int i = rowCountClientes - 1; i >= 0; i--) {
            modelCastings.removeRow(i);
            this.castings.remove(i);
        }

        Object rowDataPerfiles1[] = new Object[7];
        if (casting != null) {

            rowDataPerfiles1[0] = casting.getCodigo();
            rowDataPerfiles1[1] = casting.getNombre();
            rowDataPerfiles1[2] = casting.getCosto();
            rowDataPerfiles1[3] = casting.isAprobado();
            rowDataPerfiles1[4] = casting.getFechaContrato().toGMTString();
            rowDataPerfiles1[5] = casting.getFechaHoraInicio().toGMTString();
            rowDataPerfiles1[6] = casting.getFechaHoraFin().toGMTString();

            modelCastings.addRow(rowDataPerfiles1);
            this.castings.add(casting);
        }
    }

    private void llenarTablaParaCastings(List<Casting> castings) {
        DefaultTableModel modelCastings = (DefaultTableModel) tblCastings.getModel();

        int rowCountClientes = tblCastings.getRowCount();

        for (int i = rowCountClientes - 1; i >= 0; i--) {
            modelCastings.removeRow(i);
            this.castings.remove(i);
        }

        Object rowDataPerfiles1[] = new Object[7];
        if (castings != null) {
            for (int i = 0; i < castings.size(); i++) {
                rowDataPerfiles1[0] = castings.get(i).getCodigo();
                rowDataPerfiles1[1] = castings.get(i).getNombre();
                rowDataPerfiles1[2] = castings.get(i).getCosto();
                rowDataPerfiles1[3] = castings.get(i).isAprobado();
                rowDataPerfiles1[4] = castings.get(i).getFechaContrato().toGMTString();
                rowDataPerfiles1[5] = castings.get(i).getFechaHoraInicio().toGMTString();
                rowDataPerfiles1[6] = castings.get(i).getFechaHoraFin().toGMTString();

                modelCastings.addRow(rowDataPerfiles1);

                this.castings.add(castings.get(i));
            }

        }
    }

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

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        if (!validarSeleccion()) {
            return;
        }
        Casting casting = (Casting) castings.get(tblCastings.getSelectedRow());
        new DlgRegistrarCliente(casting.getCliente());

    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnAgenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgenteActionPerformed
        if (!validarSeleccion()) {
            return;
        }
        Casting casting = (Casting) castings.get(tblCastings.getSelectedRow());
        new DlgRegistrarAgente(casting.getAgente(), 1);
    }//GEN-LAST:event_btnAgenteActionPerformed

    private void btnPerfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilesActionPerformed
        if (!validarSeleccion()) {
            return;
        }
        Casting casting = (Casting) castings.get(tblCastings.getSelectedRow());
        try {
            if (casting.getPerfiles().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Este casting aún no tiene perfiles!",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(null, "Este casting aún no tiene perfiles!",
                    "Error", JOptionPane.INFORMATION_MESSAGE);
            return;

        }
        new DlgLlenarPerfil(casting.getPerfiles(), 1);
    }//GEN-LAST:event_btnPerfilesActionPerformed

    private boolean validarSeleccion() {
        if (tblCastings.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgente;
    private javax.swing.JButton btnBuscarCasting;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnFase;
    private javax.swing.JButton btnModalidad;
    private javax.swing.JButton btnPerfiles;
    private javax.swing.JComboBox<String> comboBoxSeleccion;
    private com.github.lgooddatepicker.components.DatePicker dateFechaContrato;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblCastings;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
