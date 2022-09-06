
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Transation_page extends javax.swing.JFrame {
    
    //llamado a la clase clientclass para los clientes registrados
    public static ClientClass[] ClientesRegistrados = new ClientClass[5];
    //llamado de la clase cuenta para ingresarlas 
    public static AcountClass[] CuentaRegistrada = new AcountClass[5];
    //llamado de la clase transaccion para ingresarlas
    public static TransationClass[] TransaccionRegistrada = new TransationClass[20];
    
    //datos para los valores de la tabla de informacion
    DefaultTableModel Table = new DefaultTableModel();
    
    //valores de la pagina de registro
    Register_page Registropage = new Register_page();
    //arreglo para agregar el valor del id ingresado
    //static int[] ValorID = new int[25];
    int[] ValorID = new int[25];
    //llamado desde la clase para el relleno del combobox
    ClientClass[] UsuarioRegistrado = Registropage.ClientesRegistrados;
    
    public Transation_page() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(193,179,215));
        
        //INGRESO DE LOS VALORES AL CBX Y VALOR DE ID AL ARREGLO VALORID      
        for (int i = 0; i < UsuarioRegistrado.length; i++) {
            if (UsuarioRegistrado[i] != null) {
                for (int j = 0; j < CuentaRegistrada.length; j++) {
                    //validacion de que la cuenta en el indice del cbx este vacia
                    if (UsuarioRegistrado[i].CuentasAsociadas[j] != null) {
                        //imprecion de la cuenta con el cui
                        CBX_IDCUENTA_.addItem(UsuarioRegistrado[i].CuentasAsociadas[j].ID + "");
                        for (int k = 0; k < ValorID.length; k++) {
                            if (ValorID[k] == 0) {
                                ValorID[k] = UsuarioRegistrado[i].CuentasAsociadas[j].ID;
                                break;
                            }
                        }                           
                    }else{
                        break;
                    }
                    //ingreso del valor del id a la posicion k del valorID    
                }   
            }else{
                break;
            }
        }
        
        //inicio de las columnas para la tabla 1
        Table.addColumn("        ID");
        Table.addColumn("         FECHA");
        Table.addColumn("                                 DETALLE");
        Table.addColumn("          DEBITO");
        Table.addColumn("        CREDITO");
        Table.addColumn("SALDO DISPONIBLE");
        
        //agrega la columna a tabla 1
        this.TBL_TRANSACCION_.setModel(Table);
        
        //ANCHO DE LAS COLUMNAS
        this.TBL_TRANSACCION_.getColumnModel().getColumn(0).setPreferredWidth(15);
        this.TBL_TRANSACCION_.getColumnModel().getColumn(1).setPreferredWidth(50);
        this.TBL_TRANSACCION_.getColumnModel().getColumn(2).setPreferredWidth(200);
        this.TBL_TRANSACCION_.getColumnModel().getColumn(3).setPreferredWidth(50);
        this.TBL_TRANSACCION_.getColumnModel().getColumn(4).setPreferredWidth(50);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TXT_CUI_ = new javax.swing.JTextField();
        TXT_NAME_ = new javax.swing.JTextField();
        TXT_LASTNAME_ = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_TRANSACCION_ = new javax.swing.JTable();
        BTN_TRANSACTION_ = new javax.swing.JButton();
        BTN_RETURN_ = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CBX_IDCUENTA_ = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transation page");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID de la cuenta");
        jLabel1.setToolTipText("");

        TXT_CUI_.setEditable(false);
        TXT_CUI_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        TXT_NAME_.setEditable(false);
        TXT_NAME_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        TXT_LASTNAME_.setEditable(false);
        TXT_LASTNAME_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        TBL_TRANSACCION_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TBL_TRANSACCION_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FECHA", "DETALLE", "DEBITO", "CREDITO", "SALDO DISPONIBLE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_TRANSACCION_.setShowGrid(true);
        TBL_TRANSACCION_.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TBL_TRANSACCION_);

        BTN_TRANSACTION_.setBackground(new java.awt.Color(154, 206, 223));
        BTN_TRANSACTION_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_TRANSACTION_.setText("Mostrar Transacciones");
        BTN_TRANSACTION_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_TRANSACTION_ActionPerformed(evt);
            }
        });

        BTN_RETURN_.setBackground(new java.awt.Color(251, 182, 209));
        BTN_RETURN_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_RETURN_.setText("Regresar");
        BTN_RETURN_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RETURN_ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CUI");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Apellido");
        jLabel7.setToolTipText("");

        CBX_IDCUENTA_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXT_CUI_, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TXT_NAME_, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBX_IDCUENTA_, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BTN_TRANSACTION_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TXT_LASTNAME_, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(BTN_RETURN_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TXT_NAME_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_TRANSACTION_)
                            .addComponent(CBX_IDCUENTA_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_CUI_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXT_LASTNAME_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTN_RETURN_)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_RETURN_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RETURN_ActionPerformed
        this.setVisible(false);
        MoreOption_page MasOpciones = new MoreOption_page();
        MasOpciones.setVisible(true);
    }//GEN-LAST:event_BTN_RETURN_ActionPerformed

    private void BTN_TRANSACTION_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_TRANSACTION_ActionPerformed
        //INDICE SEGUN CBX CUENTA
        int ind = CBX_IDCUENTA_.getSelectedIndex();
        
        //CREACION PARA EL ARREGLO PARA LAS FILAS
        String[] InfoTabla = new String[6];
        
        //limpiar las filas antes de ingresar las nuevas cuentas del cliente elegido
        int row = TBL_TRANSACCION_.getRowCount();
        for (int i = row-1; i >= 0; i--) {
            Table.removeRow(i);
        }
        
        
        
        //el indice es: " + ind + " y el ID de este indice es " + ValorID[ind] );
        for (int i = 0; i < UsuarioRegistrado.length; i++) {

            //Ingrese al for de los usuarios

            if (UsuarioRegistrado[i] != null) {                
                //Ingrese al if y el usuario de esta posicion esta lleno

                for (int j = 0; j < CuentaRegistrada.length; j++) {

                    //ingrese al for de la cuenta
                    //el valor del id segun el indice es: ValorID[ind]);                    
                    //si el valor de la cuenta j en el usuario i esta llena ingreso sino rompo el for de cuenta
                    if (UsuarioRegistrado[i].CuentasAsociadas[j] != null) {
                        //el valor del id de la cuenta que pasa ahorita es: " + UsuarioRegistrado[i].CuentasAsociadas[j].ID
                        //si el valor del ID en el usuario i y cuenta j es igual al id del indice del cbx seleccionado
                        if (UsuarioRegistrado[i].CuentasAsociadas[j].ID == ValorID[ind]) {
                            TXT_CUI_.setText(String. valueOf(UsuarioRegistrado[i].CUI));
                            TXT_NAME_.setText(UsuarioRegistrado[i].Nombre);
                            TXT_LASTNAME_.setText(UsuarioRegistrado[i].Apellido);
                            for (int k = 0; k < TransaccionRegistrada.length; k++) {
                                if (UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k] != null) {

                                    //IMPRESION
                                    InfoTabla[0] = String.valueOf(UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].IDTRANS);
                                    InfoTabla[1] = UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].date;
                                    InfoTabla[2] = UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].detalles;
                                    InfoTabla[3] = String.valueOf(UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].debito);
                                    InfoTabla[4] = String.valueOf(UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].credito);
                                    InfoTabla[5] = String.valueOf(UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].SaldoDisponible);
                
                                    Table.addRow(InfoTabla);
                                }
                            }
                            break;
                        }
                    }else{
                        break;
                    }
                }
            }    
        }
        
    }//GEN-LAST:event_BTN_TRANSACTION_ActionPerformed

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
            java.util.logging.Logger.getLogger(Transation_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transation_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transation_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transation_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transation_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_RETURN_;
    private javax.swing.JButton BTN_TRANSACTION_;
    private javax.swing.JComboBox<String> CBX_IDCUENTA_;
    private javax.swing.JTable TBL_TRANSACCION_;
    private javax.swing.JTextField TXT_CUI_;
    private javax.swing.JTextField TXT_LASTNAME_;
    private javax.swing.JTextField TXT_NAME_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
