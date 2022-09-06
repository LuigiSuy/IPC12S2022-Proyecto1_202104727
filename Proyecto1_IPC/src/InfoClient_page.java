
import java.awt.Color;
import javax.swing.table.DefaultTableModel;


public class InfoClient_page extends javax.swing.JFrame {
    
    //llamado a la clase clientclass para los clientes registrados
    public static ClientClass[] ClientesRegistrados = new ClientClass[5];
    
    //llamado de la clase cuenta para ingresarlas 
    public static AcountClass[] CuentaRegistrada = new AcountClass[5];
   
    //llamado alos valores de la pagina de registro
    Register_page Registropage = new Register_page();
    
    //datos para los valores de la tabla de informacion
    DefaultTableModel Table1 = new DefaultTableModel();
    //datos para los valores de la tabla de cuenta
    DefaultTableModel Table2 = new DefaultTableModel();
    
    public InfoClient_page() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(193,179,215));
        //inicio de las columnas para la tabla 1
        Table1.addColumn("CUI");
        Table1.addColumn("Nombre");
        Table1.addColumn("Apellido");
        
        //agrega la columna a tabla 1
        this.TBL_INFO_.setModel(Table1);
        
        //inicio de la columna para la tabla 2
        Table2.addColumn("Cuentas Asociadas");
        //agrega la columna a tabla 2
        this.TBL_ASOCIADAS_.setModel(Table2);
        
        
        //LLAMADO DE LOS USUARION DESDE LA PAGINA DE REGISTRO
        ClientClass[] UsuarioRegistrado = Registropage.ClientesRegistrados;       
        
        
        //MATRIZ PARA INGRESO DE DATOS
        String[] InfoTabla = new String[3];
        //FOR PARA EL INGRESO DE DATOS EN EL COMBOBOX DESDE UN INICIO
        for (int i = 0; i < UsuarioRegistrado.length; i++) {
            if (UsuarioRegistrado[i] != null) {
                CBX_CLIENTES_.addItem(UsuarioRegistrado[i].CUI +" - "+ UsuarioRegistrado[i].Nombre + " " + UsuarioRegistrado[i].Apellido);
            }
        }
        
        //FOR PARA LA MUESTRA DE DATOS EN LA TABLA 
        for (int i = 0; i < UsuarioRegistrado.length; i++) {
            if (UsuarioRegistrado[i] != null) {
                InfoTabla[0] = String.valueOf(UsuarioRegistrado[i].CUI);
                InfoTabla[1] = UsuarioRegistrado[i].Nombre;
                InfoTabla[2] = UsuarioRegistrado[i].Apellido;
                
                Table1.addRow(InfoTabla);
            }
        }
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBL_INFO_ = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BTN_SEARCH_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBL_ASOCIADAS_ = new javax.swing.JTable();
        BTN_RETURN_ = new javax.swing.JButton();
        CBX_CLIENTES_ = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Info Client");

        TBL_INFO_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TBL_INFO_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CUI", "Nombre", "Apellido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_INFO_.setShowGrid(true);
        TBL_INFO_.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TBL_INFO_);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cliente");

        BTN_SEARCH_.setBackground(new java.awt.Color(154, 206, 223));
        BTN_SEARCH_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_SEARCH_.setText("Buscar Cuentas Asociadas");
        BTN_SEARCH_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SEARCH_ActionPerformed(evt);
            }
        });

        TBL_ASOCIADAS_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TBL_ASOCIADAS_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Cuentas Asociadas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBL_ASOCIADAS_.setShowGrid(true);
        TBL_ASOCIADAS_.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TBL_ASOCIADAS_);

        BTN_RETURN_.setBackground(new java.awt.Color(251, 182, 209));
        BTN_RETURN_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_RETURN_.setText("Regresar");
        BTN_RETURN_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RETURN_ActionPerformed(evt);
            }
        });

        CBX_CLIENTES_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(CBX_CLIENTES_, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTN_RETURN_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTN_SEARCH_, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_SEARCH_)
                            .addComponent(CBX_CLIENTES_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(BTN_RETURN_)
                        .addGap(68, 68, 68))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_SEARCH_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SEARCH_ActionPerformed
        //LLAMADO DE LOS USUARION DESDE LA PAGINA DE REGISTRO
        ClientClass[] UsuarioRegistrado = Registropage.ClientesRegistrados; 
        //retorna el indice del cbx de los clientes
        int ind = CBX_CLIENTES_.getSelectedIndex();
        
        String[] InfoTabla2 = new String[1];
        
        //limpiar las filas antes de ingresar las nuevas cuentas del cliente elegido
        int row = TBL_ASOCIADAS_.getRowCount();
        for (int i = row-1; i >= 0; i--) {
            Table2.removeRow(i);
        }
        
        //imprimir la cuenta 
        for (int j = 0; j < CuentaRegistrada.length; j++) {

            //validacion de que la cuenta en el indice del cbx este vacia
            if (UsuarioRegistrado[ind].CuentasAsociadas[j] != null) {
                //imprecion del id de la cuenta
                InfoTabla2[0] = String.valueOf(UsuarioRegistrado[ind].CuentasAsociadas[j].ID);
                
                Table2.addRow(InfoTabla2);

            }
        }
        
    }//GEN-LAST:event_BTN_SEARCH_ActionPerformed

    private void BTN_RETURN_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RETURN_ActionPerformed
        this.setVisible(false);
        MoreOption_page MasOpciones = new MoreOption_page();
        MasOpciones.setVisible(true);
    }//GEN-LAST:event_BTN_RETURN_ActionPerformed

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
            java.util.logging.Logger.getLogger(InfoClient_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoClient_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoClient_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoClient_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoClient_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_RETURN_;
    private javax.swing.JButton BTN_SEARCH_;
    private javax.swing.JComboBox<String> CBX_CLIENTES_;
    private javax.swing.JTable TBL_ASOCIADAS_;
    private javax.swing.JTable TBL_INFO_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
