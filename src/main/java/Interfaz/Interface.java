/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import com.mycompany.clinicaveterinaria.Animal;
import com.mycompany.clinicaveterinaria.Costo;
import com.mycompany.clinicaveterinaria.Medicamento;
import com.mycompany.clinicaveterinaria.Procedimiento;
import com.mycompany.clinicaveterinaria.Propietario;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author santa
 */
public class Interface extends javax.swing.JFrame {

    Animal animal;
    Propietario propietario;
    Procedimiento procedimiento;
    Medicamento medicamento;
    Costo costo;
    
    public Interface() {
        initComponents();
    }
    
    private String fechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha= new SimpleDateFormat("dd/MM/YYYY");
        
        return formatoFecha.format(fecha);
    }
    
    private void imprimirTablaFactura(Procedimiento p, Medicamento m){
        DefaultTableModel tblModel = (DefaultTableModel) jTable4.getModel();
        String datosPersona[] = {p.getProcedimiento(),m.getMedicamento(),m.getNaturaleza(),m.getPropiedad(),m.getViaDeAdministracion()};
        tblModel.addRow(datosPersona);
    }

    private void imprimirInformacion(Animal a,Propietario p){
        DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel tblModel2 = (DefaultTableModel) jTable2.getModel();
        String datosPersona[] = {a.getAnimal(),a.getNombre(),a.getPeso(),a.getSexo(),a.getEstadoDeSalud(),a.getSintomas()};
        tblModel.addRow(datosPersona);
        tblModel2.addRow(datosPersona);
    }
    
    private void imprimirMedicamento(Medicamento m){
        DefaultTableModel tblModel3 = (DefaultTableModel) jTable3.getModel();
        String datosPersona[] = {m.getMedicamento(),m.getPropiedad(),m.getViaDeAdministracion(),m.getNaturaleza()};
        tblModel3.addRow(datosPersona);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtAnimal = new javax.swing.JTextField();
        txtNombrePaciente = new javax.swing.JTextField();
        jComboSexo = new javax.swing.JComboBox<>();
        txtPeso = new javax.swing.JTextField();
        jComboEstado = new javax.swing.JComboBox<>();
        txtSintoma = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombrePropietario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnRegistrarProcedimiento = new javax.swing.JButton();
        txtProcedimiento = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        btnRegistrarMedicamentos = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jComboPropiedad = new javax.swing.JComboBox<>();
        jComboNaturaleza = new javax.swing.JComboBox<>();
        jComboViaAdministracion = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        txtMedicamento = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        btnRegistrarCostos = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtValorMedicamento = new javax.swing.JTextField();
        txtCantidadMedicamento = new javax.swing.JTextField();
        txtValorProcedimiento = new javax.swing.JTextField();
        txtTiempoClinica = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtNumeroFactura = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        fNombrePropietario = new javax.swing.JTextField();
        fNumeroIdentificacion = new javax.swing.JTextField();
        fTelefono = new javax.swing.JTextField();
        fDireccion = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        fAnimal = new javax.swing.JTextField();
        fNombrePaciente = new javax.swing.JTextField();
        fPeso = new javax.swing.JTextField();
        fEstadoSalud = new javax.swing.JTextField();
        fSexo = new javax.swing.JTextField();
        fSintoma = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        fValorMedicamento = new javax.swing.JTextField();
        fCantidadMedicamento = new javax.swing.JTextField();
        fValorProcedimiento = new javax.swing.JTextField();
        fTiempoClinica = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        fTotal = new javax.swing.JTextField();
        btnInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 133, 215));

        jPanel1.setBackground(new java.awt.Color(0, 133, 215));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Informacion del paciente");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setText("Veterinary Turtle");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Animal");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Sexo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Peso");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Sintoma");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Estado de salud");

        txtAnimal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnimalActionPerformed(evt);
            }
        });

        txtNombrePaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboSexo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Hembra" }));
        jComboSexo.setToolTipText("");

        txtPeso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sano", "Riesgo de enfermar", "Enfermo", "Discapacitado" }));

        txtSintoma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Informacion del propietario");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Telefono");

        txtNombrePropietario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("N_Identificacion");

        txtIdentificacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Nombre");

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Dirección");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar Informacion");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(711, 711, 711))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPeso))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombrePaciente))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)))
                        .addGap(83, 83, 83))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombrePropietario)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)))
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTelefono)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNombrePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("Paciente", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 133, 215));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Informacion del paciente");
        jLabel14.setToolTipText("");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel15.setText("Veterinary Turtle");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Animal", "Nombre", "Peso", "Sexo", "Estado de salud", "Sintoma"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Procedimiento");
        jLabel16.setToolTipText("");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Descripción del procedimiento");

        btnRegistrarProcedimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrarProcedimiento.setText("Registrar Procedimiento");
        btnRegistrarProcedimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProcedimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(385, Short.MAX_VALUE)
                .addComponent(btnRegistrarProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(376, 376, 376))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProcedimiento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(81, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(290, 290, 290)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(291, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("Procedimiento", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 133, 215));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Informacion del Paciente");
        jLabel18.setToolTipText("");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel19.setText("Veterinary Turtle");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Animal", "Nombre", "Peso", "Sexo", "Estado de salud", "Sintoma"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Medicamento");
        jLabel20.setToolTipText("");

        btnRegistrarMedicamentos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrarMedicamentos.setText("Registrar Procedimiento");
        btnRegistrarMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMedicamentosActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setText("Naturaleza");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setText("Vía de administración");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setText("Propiedad");

        jComboPropiedad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboPropiedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antiparasitario", "Analgésico", "Anestésico", "Otro" }));

        jComboNaturaleza.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboNaturaleza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inmunológicos", "Farmacológicos" }));

        jComboViaAdministracion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboViaAdministracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inyectable", "Oral", "Intrauterino", "Cutáneo", "Intramamarios", "Otro" }));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel24.setText("Medicamento");

        txtMedicamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btnRegistrarMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboNaturaleza, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboViaAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(81, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel20)
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jComboViaAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jComboPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addComponent(btnRegistrarMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(jComboNaturaleza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(290, 290, 290)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(291, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("Medicamento", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 133, 215));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Informacion del medicamento");
        jLabel25.setToolTipText("");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel26.setText("Veterinary Turtle");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicamento", "Naturaleza", "Propiedad", "Via de administracion"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Costos");
        jLabel27.setToolTipText("");

        btnRegistrarCostos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrarCostos.setText("Registrar Costos");
        btnRegistrarCostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCostosActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setText("Valor del medicamento");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel29.setText("Cantidad de medicamento ");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel30.setText("Tiempo en la clínica");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel31.setText("Valor del procedimiento");

        txtValorMedicamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btnRegistrarCostos, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtValorMedicamento)
                                    .addComponent(txtCantidadMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtValorProcedimiento)
                                    .addComponent(txtTiempoClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(81, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel27)
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel31)
                    .addComponent(txtValorMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(txtCantidadMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTiempoClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(btnRegistrarCostos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(290, 290, 290)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(291, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("Costo", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 133, 215));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Numero de Factura");

        txtNumeroFactura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("Fecha de emision");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(195, 195, 195)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha)
                    .addComponent(txtNumeroFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Información del propietario");
        jLabel34.setToolTipText("");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel35.setText("Nombre");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel36.setText("N_Identificacion");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel37.setText("Telefono");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel38.setText("Dirección");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Información del paciente");
        jLabel39.setToolTipText("");

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel79.setText("Animal");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel80.setText("Nombre");

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel81.setText("Peso");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel82.setText("Sintoma");

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel83.setText("Estado de salud");

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel84.setText("Sexo");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Procedimiento", "Medicamento", "Naturaleza", "Propiedad", "Via de administracion"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel40.setText("Valor del medicamento");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel41.setText("Cantidad de medicamento ");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel42.setText("Valor del procedimiento");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel43.setText("Tiempo en la clínica");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel44.setText("Total a pagar:");

        btnInicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInicio.setText("Volver al inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fNombrePropietario)
                                    .addComponent(fNumeroIdentificacion)
                                    .addComponent(fTelefono)
                                    .addComponent(fDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(128, 128, 128)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel39)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fEstadoSalud))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fAnimal)
                                    .addComponent(fNombrePaciente)
                                    .addComponent(fPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel82)
                                .addGap(18, 18, 18)
                                .addComponent(fSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel40)
                                        .addGap(40, 40, 40)))
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fValorMedicamento)
                                    .addComponent(fCantidadMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fValorProcedimiento)
                                    .addComponent(fTiempoClinica, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                            .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(fAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84)
                            .addComponent(fSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel80)
                            .addComponent(fNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82)
                            .addComponent(fSintoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81)
                            .addComponent(fPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(fEstadoSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(fNombrePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(fNumeroIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(fTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(fDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel42)
                    .addComponent(fValorMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fValorProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel43)
                    .addComponent(fCantidadMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fTiempoClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44)
                        .addComponent(fTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("Factura", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnimalActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        animal= new Animal(txtAnimal.getText(),txtNombrePaciente.getText(),txtPeso.getText(),(String)jComboSexo.getSelectedItem(),(String)jComboEstado.getSelectedItem(),txtSintoma.getText());
        propietario = new Propietario(txtNombrePropietario.getText(),txtIdentificacion.getText(),txtTelefono.getText(),txtDireccion.getText());
        imprimirInformacion(animal,propietario);
        
        jTabbedPane1.setSelectedIndex(1);
        
        //Bloqueo
        txtAnimal.setEditable(false);
        txtNombrePaciente.setEditable(false);
        txtPeso.setEditable(false);
        jComboSexo.setEnabled(false);
        jComboEstado.setEnabled(false);
        txtSintoma.setEditable(false);
        
        txtNombrePropietario.setEditable(false);
        txtIdentificacion.setEditable(false);
        txtTelefono.setEditable(false);
        txtDireccion.setEditable(false);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegistrarProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProcedimientoActionPerformed
       procedimiento = new Procedimiento(txtProcedimiento.getText());
        jTabbedPane1.setSelectedIndex(2);
        
        //Bloqueo
        txtProcedimiento.setEditable(false);
    }//GEN-LAST:event_btnRegistrarProcedimientoActionPerformed

    private void btnRegistrarMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMedicamentosActionPerformed
        medicamento = new Medicamento(txtMedicamento.getText(),(String)jComboPropiedad.getSelectedItem(),(String)jComboViaAdministracion.getSelectedItem(),(String)jComboNaturaleza.getSelectedItem());
        imprimirMedicamento(medicamento);
        jTabbedPane1.setSelectedIndex(3);
        //Bloqueo
        txtMedicamento.setEditable(false);
        jComboPropiedad.setEnabled(false);
        jComboViaAdministracion.setEnabled(false);
        jComboNaturaleza.setEnabled(false);
    }//GEN-LAST:event_btnRegistrarMedicamentosActionPerformed

    private void btnRegistrarCostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCostosActionPerformed
        costo=new Costo(Double.parseDouble(txtValorMedicamento.getText()),Integer.parseInt(txtCantidadMedicamento.getText()),Double.parseDouble(txtValorProcedimiento.getText()), Integer.parseInt(txtTiempoClinica.getText()));
        int a=0;
        a=(int)(Math.random()*100);
        
        //Fecha y numeo de factura
        txtNumeroFactura.setText(Integer.toString(a));
        txtFecha.setText(fechaActual());
        
        //Propietario
        fNombrePropietario.setText(propietario.getNombre());
        fNumeroIdentificacion.setText(propietario.getIdentificacion());
        fTelefono.setText(propietario.getTelefono());
        fDireccion.setText(propietario.getDireccion());
        
        //Paciente
        fAnimal.setText(animal.getAnimal());
        fNombrePaciente.setText(animal.getNombre());
        fPeso.setText(animal.getPeso());
        fEstadoSalud.setText(animal.getEstadoDeSalud());
        fSexo.setText(animal.getSexo());
        fSintoma.setText(animal.getSintomas());
        
        //Tabla
        imprimirTablaFactura(procedimiento,medicamento);
        
        //Valores
        double valorTotal=((costo.getTiempoClinica()*5000)+(costo.getValorMedicamento()*costo.getCantidadMedicamento())+costo.getValorProcedimiento());
        System.out.println("Total:"+valorTotal);
        fValorMedicamento.setText(String.valueOf(costo.getValorMedicamento()));
        fCantidadMedicamento.setText(Integer.toString(costo.getCantidadMedicamento()));
        fTotal.setText(String.valueOf(valorTotal));
        fValorProcedimiento.setText(String.valueOf(costo.getValorProcedimiento()));
        fTiempoClinica.setText(Integer.toString(costo.getTiempoClinica()));
                
        //Bloquear 
        txtNumeroFactura.setEditable(false);
        txtFecha.setEditable(false);
        
        txtValorMedicamento.setEditable(false);
        txtCantidadMedicamento.setEditable(false);
        txtValorProcedimiento.setEditable(false);
        txtTiempoClinica.setEditable(false);
        
        //Bloqueo Propietario
        fNombrePropietario.setEditable(false);
        fNumeroIdentificacion.setEditable(false);
        fTelefono.setEditable(false);
        fDireccion.setEditable(false);
        
        //Bloque paciente
        fAnimal.setEditable(false);
        fNombrePaciente.setEditable(false);
        fPeso.setEditable(false);
        fEstadoSalud.setEditable(false);
        fSexo.setEditable(false);
        fSintoma.setEditable(false);
        
        //Bloqueo valores
        fValorMedicamento.setEditable(false);
        fCantidadMedicamento.setEditable(false);
        fTotal.setEditable(false);
        fValorProcedimiento.setEditable(false);
        fTiempoClinica.setEditable(false);
        
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnRegistrarCostosActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        
        //Valores nulos
        //Pestaña paciente
        txtAnimal.setText(null);
        txtNombrePaciente.setText(null);
        txtPeso.setText(null);
        jComboSexo.setSelectedIndex(0);
        jComboEstado.setSelectedIndex(0);
        txtSintoma.setText(null);
        
        txtNombrePropietario.setText(null);
        txtIdentificacion.setText(null);
        txtTelefono.setText(null);
        txtDireccion.setText(null);
        
        //Pestaña procedimiento
        txtProcedimiento.setText(null);
        
        //Pestaña medicamento
        txtMedicamento.setText(null);
        jComboPropiedad.setSelectedIndex(0);
        jComboViaAdministracion.setSelectedIndex(0);
        jComboNaturaleza.setSelectedIndex(0);
        
        //Pestaña costo
        txtValorMedicamento.setText(null);
        txtCantidadMedicamento.setText(null);
        txtValorProcedimiento.setText(null);
        txtTiempoClinica.setText(null);
        
        //Pestaña Factura
        txtNumeroFactura.setText(null);
        txtFecha.setText(null);
        
        // Propietario
        fNombrePropietario.setText(null);
        fNumeroIdentificacion.setText(null);
        fTelefono.setText(null);
        fDireccion.setText(null);
        
        // paciente
        fAnimal.setText(null);
        fNombrePaciente.setText(null);
        fPeso.setText(null);
        fEstadoSalud.setText(null);
        fSexo.setText(null);
        fSintoma.setText(null);
        
        //Costo
        fValorMedicamento.setText(null);
        fCantidadMedicamento.setText(null);
        fTotal.setText(null);
        fValorProcedimiento.setText(null);
        fTiempoClinica.setText(null);
        
        /*------------------------------------------
        Habilitar nuavemente las pestañas
        */
        
        txtAnimal.setEditable(true);
        txtNombrePaciente.setEditable(true);
        txtPeso.setEditable(true);
        jComboSexo.setEnabled(true);
        jComboEstado.setEnabled(true);
        txtSintoma.setEditable(true);
        
        txtNombrePropietario.setEditable(true);
        txtIdentificacion.setEditable(true);
        txtTelefono.setEditable(true);
        txtDireccion.setEditable(true);
        
        //Pestaña procedimiento
        txtProcedimiento.setEditable(true);
        
        //Pestaña medicamento
        txtMedicamento.setEditable(true);
        jComboPropiedad.setEnabled(true);
        jComboViaAdministracion.setEnabled(true);
        jComboNaturaleza.setEnabled(true);
        
        //Pestaña costo
        txtValorMedicamento.setEditable(true);
        txtCantidadMedicamento.setEditable(true);
        txtValorProcedimiento.setEditable(true);
        txtTiempoClinica.setEditable(true);
        
        //Pestaña Factura
        txtNumeroFactura.setEditable(true);
        txtFecha.setEditable(true);
        
        // Propietario
        fNombrePropietario.setEditable(true);
        fNumeroIdentificacion.setEditable(true);
        fTelefono.setEditable(true);
        fDireccion.setEditable(true);
        
        // paciente
        fAnimal.setEditable(true);
        fNombrePaciente.setEditable(true);
        fPeso.setEditable(true);
        fEstadoSalud.setEditable(true);
        fSexo.setEditable(true);
        fSintoma.setEditable(true);
        
        //Costo
        fValorMedicamento.setEditable(true);
        fCantidadMedicamento.setEditable(true);
        fTotal.setEditable(true);
        fValorProcedimiento.setEditable(true);
        fTiempoClinica.setEditable(true);
    }//GEN-LAST:event_btnInicioActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarCostos;
    private javax.swing.JButton btnRegistrarMedicamentos;
    private javax.swing.JButton btnRegistrarProcedimiento;
    private javax.swing.JTextField fAnimal;
    private javax.swing.JTextField fCantidadMedicamento;
    private javax.swing.JTextField fDireccion;
    private javax.swing.JTextField fEstadoSalud;
    private javax.swing.JTextField fNombrePaciente;
    private javax.swing.JTextField fNombrePropietario;
    private javax.swing.JTextField fNumeroIdentificacion;
    private javax.swing.JTextField fPeso;
    private javax.swing.JTextField fSexo;
    private javax.swing.JTextField fSintoma;
    private javax.swing.JTextField fTelefono;
    private javax.swing.JTextField fTiempoClinica;
    private javax.swing.JTextField fTotal;
    private javax.swing.JTextField fValorMedicamento;
    private javax.swing.JTextField fValorProcedimiento;
    private javax.swing.JComboBox<String> jComboEstado;
    private javax.swing.JComboBox<String> jComboNaturaleza;
    private javax.swing.JComboBox<String> jComboPropiedad;
    private javax.swing.JComboBox<String> jComboSexo;
    private javax.swing.JComboBox<String> jComboViaAdministracion;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField txtAnimal;
    private javax.swing.JTextField txtCantidadMedicamento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtMedicamento;
    private javax.swing.JTextField txtNombrePaciente;
    private javax.swing.JTextField txtNombrePropietario;
    private javax.swing.JTextField txtNumeroFactura;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtProcedimiento;
    private javax.swing.JTextField txtSintoma;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTiempoClinica;
    private javax.swing.JTextField txtValorMedicamento;
    private javax.swing.JTextField txtValorProcedimiento;
    // End of variables declaration//GEN-END:variables
}
