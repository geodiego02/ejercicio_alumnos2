package Formularios;
import Clases.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormAlumno extends javax.swing.JFrame {
    private Conexion c = new Conexion();
    
    public FormAlumno() {
        initComponents();
        crearComboBox();
        deshabilitar();
    }

    public void crearComboBox(){
        DefaultComboBoxModel borrador_form = c.construirCbo("ciudad","nom_ciu");
        cbo_Ciudad.setModel(borrador_form);
        DefaultComboBoxModel borrador_form2 = c.construirCbo("alumno","rut_alu");
        cbo_Eliminar.setModel(borrador_form2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadioSexo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Mostrar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Rut = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        rbtn_Masculino = new javax.swing.JRadioButton();
        rbtn_Femenino = new javax.swing.JRadioButton();
        cbo_Ciudad = new javax.swing.JComboBox<>();
        txt_Carrera = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        btn_Mostrar = new javax.swing.JButton();
        btn_Consultar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cbo_Eliminar = new javax.swing.JComboBox<>();
        btn_Eliminar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_ConsultarM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_Mostrar);

        jLabel1.setText("Rut:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Sexo:");

        jLabel5.setText("Ciudad:");

        jLabel6.setText("Carrera:");

        grupoRadioSexo.add(rbtn_Masculino);
        rbtn_Masculino.setText("M");

        grupoRadioSexo.add(rbtn_Femenino);
        rbtn_Femenino.setText("F");

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Limpiar.setText("Limpiar Formulario");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        btn_Mostrar.setText("Mostrar");
        btn_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostrarActionPerformed(evt);
            }
        });

        btn_Consultar.setText("Consultar");
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Rut a eliminar:");

        btn_Eliminar.setText("Eliminar Alumno");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(cbo_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cbo_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        btn_ConsultarM.setText("Consultar para Modificar");
        btn_ConsultarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Rut)
                            .addComponent(txt_Nombre)
                            .addComponent(txt_Apellido)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtn_Masculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtn_Femenino))
                            .addComponent(txt_Carrera)
                            .addComponent(cbo_Ciudad, 0, 100, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(btn_Mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ConsultarM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_Rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Guardar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Limpiar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Mostrar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rbtn_Masculino)
                            .addComponent(rbtn_Femenino)
                            .addComponent(btn_Consultar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbo_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ConsultarM))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Modificar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        Alumno alu = new Alumno();
        alu.setRut(txt_Rut.getText());
        alu.setNombre(txt_Nombre.getText());
        alu.setApellido(txt_Apellido.getText());
        if(rbtn_Masculino.isSelected()){
            alu.setSexo("Masculino");
        }else{
            alu.setSexo("Femenino");
        }
        alu.setCiudad(cbo_Ciudad.getSelectedIndex());
        alu.setCarrera(txt_Carrera.getText());
        c.guardarAlumnos(alu);
        limpiar();
        deshabilitar();
    }//GEN-LAST:event_btn_GuardarActionPerformed

    public void habilitar(){
        txt_Nombre.setEnabled(true);
        txt_Apellido.setEnabled(true);
        rbtn_Masculino.setEnabled(true);
        rbtn_Femenino.setEnabled(true);
        cbo_Ciudad.setEnabled(true);
        txt_Carrera.setEnabled(true);
        btn_Guardar.setEnabled(true);
        txt_Rut.setEnabled(false);
    }
    
    public void deshabilitar(){
        txt_Nombre.setEnabled(false);
        txt_Apellido.setEnabled(false);
        rbtn_Masculino.setEnabled(false);
        rbtn_Femenino.setEnabled(false);
        cbo_Ciudad.setEnabled(false);
        txt_Carrera.setEnabled(false);
        btn_Guardar.setEnabled(false);
        txt_Rut.setEnabled(true);
    }
    
    public void limpiar(){
        txt_Rut.setText("");
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        grupoRadioSexo.clearSelection();
        cbo_Ciudad.setSelectedIndex(0);
        txt_Carrera.setText("");
        txt_Rut.grabFocus();
    }
    
    private void btn_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostrarActionPerformed
        DefaultTableModel borrador_tabla = c.construirTablaMostrar();
        tbl_Mostrar.setModel(borrador_tabla);
    }//GEN-LAST:event_btn_MostrarActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        String rut = txt_Rut.getText();
        boolean recibido = c.consultarAlumno(rut);
        if(recibido == true){
            JOptionPane.showMessageDialog(this, "El alumno YA existe, ingrese otro alumno.", "Consultar", 0);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "Puede ingresar el nuevo alumno en la BD.", "Consultar", 1);
            habilitar();
        }
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        String rut = cbo_Eliminar.getSelectedItem().toString();
        c.eliminarAlumno(rut);
        crearComboBox();
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_ConsultarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarMActionPerformed
        String rut_modificar = txt_Rut.getText();
        boolean modificar = c.consultarAlumno(rut_modificar);
        if(modificar == true){
            Alumno alu1 = c.obtenerAlumno(rut_modificar);
            txt_Nombre.setText(alu1.getNombre());
            txt_Apellido.setText(alu1.getApellido());
            if(alu1.getSexo().equalsIgnoreCase("Masculino")){
                rbtn_Masculino.setSelected(true);
            }else{
                rbtn_Femenino.setSelected(true);
            }
            cbo_Ciudad.setSelectedIndex(alu1.getCiudad());
            txt_Carrera.setText(alu1.getCarrera());
            habilitar();
        }else{
            JOptionPane.showMessageDialog(this,"Alumno no encontrado.","Consultar Modificar",0);
        }
    }//GEN-LAST:event_btn_ConsultarMActionPerformed

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        Alumno alu = new Alumno();
        alu.setRut(txt_Rut.getText());
        alu.setNombre(txt_Nombre.getText());
        alu.setApellido(txt_Apellido.getText());
        if(rbtn_Masculino.isSelected()){
            alu.setSexo("Masculino");
        }else{
            alu.setSexo("Femenino");
        }
        alu.setCiudad(cbo_Ciudad.getSelectedIndex());
        alu.setCarrera(txt_Carrera.getText());
        c.modificarAlumno(alu);
        limpiar();
        deshabilitar();
    }//GEN-LAST:event_btn_ModificarActionPerformed

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
            java.util.logging.Logger.getLogger(FormAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_ConsultarM;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_Mostrar;
    private javax.swing.JComboBox<String> cbo_Ciudad;
    private javax.swing.JComboBox<String> cbo_Eliminar;
    private javax.swing.ButtonGroup grupoRadioSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtn_Femenino;
    private javax.swing.JRadioButton rbtn_Masculino;
    private javax.swing.JTable tbl_Mostrar;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Carrera;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Rut;
    // End of variables declaration//GEN-END:variables
}
