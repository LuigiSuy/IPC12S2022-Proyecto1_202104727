
import java.awt.Color;
import javax.swing.JOptionPane;


public class NewAcount_page extends javax.swing.JFrame {
    //llamado a la clase clientclass para los clientes registrados
    public static ClientClass[] ClientesRegistrados = new ClientClass[5];
    //llamado de la clase cuenta para ingresarlas 
    public static AcountClass[] CuentaRegistrada = new AcountClass[5];
    
    static int id = 101;
    
    Register_page Registropage = new Register_page();
    
    public NewAcount_page() {
        initComponents();
        this.setLocationRelativeTo(null);   
        this.getContentPane().setBackground(new Color(193,179,215));
        
        //llamado desde la clase para el relleno del combobox
        ClientClass[] UsuarioRegistrado = Registropage.ClientesRegistrados;        
        for (int i = 0; i < UsuarioRegistrado.length; i++) {
            if (UsuarioRegistrado[i] != null) {
                CBX_CLIENT_.addItem(UsuarioRegistrado[i].CUI +" - "+ UsuarioRegistrado[i].Nombre + " " + UsuarioRegistrado[i].Apellido);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_CREATE_ = new javax.swing.JButton();
        BTN_RETURN_ = new javax.swing.JButton();
        CBX_CLIENT_ = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Acount");

        BTN_CREATE_.setBackground(new java.awt.Color(154, 206, 223));
        BTN_CREATE_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_CREATE_.setText("Crear");
        BTN_CREATE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CREATE_ActionPerformed(evt);
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

        CBX_CLIENT_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CBX_CLIENT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBX_CLIENT_ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-circundado-usuario-hombre-tipo-de-piel-1-2-80.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTN_CREATE_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_RETURN_, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CBX_CLIENT_, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(141, 141, 141))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBX_CLIENT_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(BTN_CREATE_)
                .addGap(28, 28, 28)
                .addComponent(BTN_RETURN_)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_RETURN_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RETURN_ActionPerformed
        this.setVisible(false);
        MoreOption_page MasOpciones = new MoreOption_page();
        MasOpciones.setVisible(true);
    }//GEN-LAST:event_BTN_RETURN_ActionPerformed

    private void BTN_CREATE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CREATE_ActionPerformed
        //llamado para el cui del cliente
        ClientClass[] UsuarioRegistrado = Registropage.ClientesRegistrados; 
        //obtengo el indice del combobox
        int ind = CBX_CLIENT_.getSelectedIndex();
        
        //asignacion para la cuenta
        AcountClass NuevaCuenta = new AcountClass(id, UsuarioRegistrado[ind].CUI, 0.0);
        
        boolean flag = false;

        //for para pasar por cada cuenta
        for (int j = 0; j < CuentaRegistrada.length; j++) {

            //validacion de que la cuenta en el indice del cbx este vacia
            if (UsuarioRegistrado[ind].CuentasAsociadas[j] == null) {
                //ingreso de la cuenta al cliente del indice obtenido por el cbx

                UsuarioRegistrado[ind].CuentasAsociadas[j] = NuevaCuenta;
                JOptionPane.showMessageDialog(null, "La Cuenta ha sido creada exitosamente");
                id++;

                flag = true;
                break;
            }


        }


        if (!flag) {
            JOptionPane.showMessageDialog(null, "No es posible crear más cuentas para el cliente seleccionado. ", "Alerta", JOptionPane.WARNING_MESSAGE);

        }

        for (int j = 0; j < CuentaRegistrada.length; j++) {

            //validacion de que la cuenta en el indice del cbx este vacia
            if (UsuarioRegistrado[ind].CuentasAsociadas[j] != null) {
                //imprecion de la cuenta con el cui
                UsuarioRegistrado[ind].CuentasAsociadas[j].ImprimirCuenta();


            }
        }   
    }//GEN-LAST:event_BTN_CREATE_ActionPerformed

    private void CBX_CLIENT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBX_CLIENT_ActionPerformed
        
    }//GEN-LAST:event_CBX_CLIENT_ActionPerformed

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
            java.util.logging.Logger.getLogger(NewAcount_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAcount_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAcount_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAcount_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAcount_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_CREATE_;
    private javax.swing.JButton BTN_RETURN_;
    private javax.swing.JComboBox<String> CBX_CLIENT_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
