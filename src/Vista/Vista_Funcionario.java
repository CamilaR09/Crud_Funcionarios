package Vista;

import Conexion.ConexionMySql;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cami Rendon
 */
public class Vista_Funcionario extends javax.swing.JFrame {

    ConexionMySql con = new ConexionMySql();
    java.sql.Connection cn = con.conectar();

    public Vista_Funcionario() {
        initComponents();
        mostrardatos();
        llenarComboTipoI();
        llenarComboEstadoC();
        setIconImage(getIconImage());
    }
    @Override
    public Image getIconImage(){
    Image reValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Vista/CRUD.png"));
    return reValue;
            }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        PanelFondo = new javax.swing.JPanel();
        PanelCrear = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        comboTipoI = new javax.swing.JComboBox<>();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        jDateFechaN = new com.toedter.calendar.JDateChooser();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        comboSexo = new javax.swing.JComboBox<>();
        comboEstadoC = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        PanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/delete.png"))); // NOI18N
        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD Funcionario");
        setBackground(new java.awt.Color(102, 102, 102));

        PanelFondo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funcionarios CRUD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        PanelCrear.setBackground(new java.awt.Color(225, 234, 249));
        PanelCrear.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos A Ingresar"));

        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));
        txtId.setEnabled(false);

        comboTipoI.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Identificacion"));

        txtCedula.setBorder(javax.swing.BorderFactory.createTitledBorder("Cedula"));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        txtApellidoP.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido Paterno"));

        txtApellidoM.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido Materno"));

        jDateFechaN.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Nacimiento "));
        jDateFechaN.setDateFormatString("yyyy-MM-dd");

        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Direccion"));

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefono"));

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Femenino", "Masculino" }));
        comboSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        comboEstadoC.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Civil"));

        btnRegistrar.setBackground(new java.awt.Color(193, 227, 217));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(193, 227, 217));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCrearLayout = new javax.swing.GroupLayout(PanelCrear);
        PanelCrear.setLayout(PanelCrearLayout);
        PanelCrearLayout.setHorizontalGroup(
            PanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCrearLayout.createSequentialGroup()
                        .addGroup(PanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCrearLayout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCrearLayout.createSequentialGroup()
                                .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jDateFechaN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(PanelCrearLayout.createSequentialGroup()
                        .addComponent(comboTipoI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(PanelCrearLayout.createSequentialGroup()
                        .addGroup(PanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelCrearLayout.createSequentialGroup()
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCrearLayout.createSequentialGroup()
                                .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboEstadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)
                            .addGroup(PanelCrearLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelCrearLayout.setVerticalGroup(
            PanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCrearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(PanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCedula)
                    .addComponent(comboTipoI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCrearLayout.createSequentialGroup()
                        .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboEstadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDateFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(PanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        PanelTabla.setBackground(new java.awt.Color(225, 234, 249));
        PanelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado De funcionarios"));
        PanelTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelTablaMouseClicked(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDatos.setComponentPopupMenu(jPopupMenu1);
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        javax.swing.GroupLayout PanelTablaLayout = new javax.swing.GroupLayout(PanelTabla);
        PanelTabla.setLayout(PanelTablaLayout);
        PanelTablaLayout.setHorizontalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelTablaLayout.setVerticalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelTabla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelCrear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO funcionarios (tipos_identificacion_id, numero_identificacion, nombres, apellidop, apellidoM, fecha_nacimiento, direccion, telefono, sexo, estados_civil_id, fechade_creacion) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)");

            // Obtener el nombre seleccionado en el comboTipoI y comboEstadoC
            String tipoIdentificacion = comboTipoI.getSelectedItem().toString();
            String estadoCivil = comboEstadoC.getSelectedItem().toString();

            // Obtener el id correspondiente utilizando el nombre
            int tipoIdentificacionId = obtenerIdTipoIdentificacion(tipoIdentificacion);
            int estadoCivilId = obtenerIdEstadoCivil(estadoCivil);

            pst.setInt(1, tipoIdentificacionId);
            pst.setString(2, txtCedula.getText());
            pst.setString(3, txtNombre.getText());
            pst.setString(4, txtApellidoP.getText());
            pst.setString(5, txtApellidoM.getText());
            java.util.Date fechaNacimiento = jDateFechaN.getDate();
            java.sql.Date fechaNacimientoSql = new java.sql.Date(fechaNacimiento.getTime());
            pst.setDate(6, fechaNacimientoSql);
            pst.setString(7, txtDireccion.getText());
            pst.setString(8, txtTelefono.getText());
            pst.setString(9, comboSexo.getSelectedItem().toString());
            pst.setInt(10, estadoCivilId);

            pst.executeUpdate();
            JOptionPane.showConfirmDialog(null, "Funcionario Guardado ");
            mostrardatos();
            LimpiarCampos();

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Error al Registrar el funcionario: " + e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        btnRegistrar.setEnabled(false);
        btnActualizar.setEnabled(true);
        int fila = this.tblDatos.getSelectedRow();
        this.txtId.setText(this.tblDatos.getValueAt(fila, 0).toString());
        this.comboTipoI.setSelectedItem(this.tblDatos.getValueAt(fila, 1).toString());
        this.txtCedula.setText(this.tblDatos.getValueAt(fila, 2).toString());
        this.txtNombre.setText(this.tblDatos.getValueAt(fila, 3).toString());
        this.txtApellidoP.setText(this.tblDatos.getValueAt(fila, 4).toString());
        this.txtApellidoM.setText(this.tblDatos.getValueAt(fila, 5).toString());
        String fechaSeleccionada = this.tblDatos.getValueAt(fila, 6).toString(); // Suponiendo que la fecha está en la columna 6
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date fecha = null;

        try {
            fecha = sdf.parse(fechaSeleccionada);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.jDateFechaN.setDate(fecha);
        this.txtDireccion.setText(this.tblDatos.getValueAt(fila, 7).toString());
        this.txtTelefono.setText(this.tblDatos.getValueAt(fila, 8).toString());
        this.comboSexo.setSelectedItem(this.tblDatos.getValueAt(fila, 9).toString());
        this.comboEstadoC.setSelectedItem(this.tblDatos.getValueAt(fila, 10).toString());
    }//GEN-LAST:event_tblDatosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            int fila = tblDatos.getSelectedRow();
            String id = tblDatos.getValueAt(fila, 0).toString();

            // Obtener el nombre seleccionado en el comboTipoI y comboEstadoC
            String tipoIdentificacion = comboTipoI.getSelectedItem().toString();
            String estadoCivil = comboEstadoC.getSelectedItem().toString();

            // Obtener el id correspondiente utilizando el nombre
            int tipoIdentificacionId = obtenerIdTipoIdentificacion(tipoIdentificacion);
            int estadoCivilId = obtenerIdEstadoCivil(estadoCivil);

            // Actualizar los datos en la base de datos
            PreparedStatement pst = cn.prepareStatement("UPDATE funcionarios SET tipos_identificacion_id = ?, numero_identificacion = ?, nombres = ?, apellidop = ?, apellidoM = ?, fecha_nacimiento = ?, direccion = ?, telefono = ?, sexo = ?, estados_civil_id = ? WHERE id = ?");
            pst.setInt(1, tipoIdentificacionId);
            pst.setString(2, txtCedula.getText());
            pst.setString(3, txtNombre.getText());
            pst.setString(4, txtApellidoP.getText());
            pst.setString(5, txtApellidoM.getText());
            java.util.Date fechaNacimiento = jDateFechaN.getDate();
            java.sql.Date fechaNacimientoSql = new java.sql.Date(fechaNacimiento.getTime());
            pst.setDate(6, fechaNacimientoSql);
            pst.setString(7, txtDireccion.getText());
            pst.setString(8, txtTelefono.getText());
            pst.setString(9, comboSexo.getSelectedItem().toString());
            pst.setInt(10, estadoCivilId);
            pst.setString(11, id);

            int resultado = pst.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario actualizado exitosamente");
                mostrardatos();
                LimpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el funcionario");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el funcionario: " + e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void PanelTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelTablaMouseClicked
       btnRegistrar.setEnabled(true);
        btnActualizar.setEnabled(false);
        LimpiarCampos();
    }//GEN-LAST:event_PanelTablaMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int fila = tblDatos.getSelectedRow();

    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "Seleccione un funcionario de la tabla");
        return;
    }

    String id = tblDatos.getValueAt(fila, 0).toString();

    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este funcionario?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {
        try {
            PreparedStatement pst = cn.prepareStatement("DELETE FROM funcionarios WHERE id = ?");
            pst.setString(1, id);

            int resultado = pst.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario eliminado exitosamente");
                mostrardatos();
                LimpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el funcionario");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el funcionario: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Funcionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Vista_Funcionario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCrear;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelTabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboEstadoC;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JComboBox<String> comboTipoI;
    private com.toedter.calendar.JDateChooser jDateFechaN;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void mostrardatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Tipo I");
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("ApellidoP");
        modelo.addColumn("ApellidoM");
        modelo.addColumn("Fecha N");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Sexo");
        modelo.addColumn("Estado C");
        tblDatos.setModel(modelo);

        String consultaSql = "SELECT funcionarios.*, tipos_identificacion.nombre AS tipo_identificacion_nombre, estados_civil.nombre AS estado_civil_nombre\n"
                + "FROM funcionarios\n"
                + "INNER JOIN tipos_identificacion ON funcionarios.tipos_identificacion_id = tipos_identificacion.id\n"
                + "INNER JOIN estados_civil ON funcionarios.estados_civil_id = estados_civil.id;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultaSql);

            while (rs.next()) {
                String[] data = new String[11];
                data[0] = rs.getString("id");
                data[1] = rs.getString("tipo_identificacion_nombre");
                data[2] = rs.getString("numero_identificacion");
                data[3] = rs.getString("nombres");
                data[4] = rs.getString("apellidop");
                data[5] = rs.getString("apellidoM");
                data[6] = rs.getString("fecha_nacimiento");
                data[7] = rs.getString("direccion");
                data[8] = rs.getString("telefono");
                data[9] = rs.getString("sexo");
                data[10] = rs.getString("estado_civil_nombre");
                modelo.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar los datos: " + e.getMessage());
        }
    }

    private void LimpiarCampos() {
        txtId.setText("");
        comboTipoI.setSelectedIndex(0);
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellidoP.setText("");
        txtApellidoM.setText("");
        jDateFechaN.setDate(null);
        txtDireccion.setText("");
        txtTelefono.setText("");
        comboSexo.setSelectedIndex(0);
        comboEstadoC.setSelectedIndex(0);
    }

    private void llenarComboTipoI() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        String consultaSql = "SELECT id, nombre FROM tipos_identificacion";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultaSql);

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                model.addElement(nombre);
            }

            comboTipoI.setModel(model);

            if (model.getSize() > 0) {
                comboTipoI.setSelectedIndex(0);
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Error al consultar los tipos de identificación: " + e.getMessage());
        }
    }

    private void llenarComboEstadoC() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        String consultaSql = "SELECT id, nombre FROM estados_civil";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultaSql);

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                model.addElement(nombre);
            }

            comboEstadoC.setModel(model);

            if (model.getSize() > 0) {
                comboEstadoC.setSelectedIndex(0);
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Error al consultar los estados civiles: " + e.getMessage());
        }
    }

    private int obtenerIdTipoIdentificacion(String nombreTipoIdentificacion) {
        String consultaSql = "SELECT id FROM tipos_identificacion WHERE nombre = ?";
        int id = 0;

        try {
            PreparedStatement pst = cn.prepareStatement(consultaSql);
            pst.setString(1, nombreTipoIdentificacion);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Error al obtener el ID del tipo de identificación: " + e.getMessage());
        }

        return id;
    }

    private int obtenerIdEstadoCivil(String nombreEstadoCivil) {
        String consultaSql = "SELECT id FROM estados_civil WHERE nombre = ?";
        int id = 0;

        try {
            PreparedStatement pst = cn.prepareStatement(consultaSql);
            pst.setString(1, nombreEstadoCivil);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Error al obtener el ID del estado civil: " + e.getMessage());
        }

        return id;
    }

}
