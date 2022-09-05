
public class MoreOption_page extends javax.swing.JFrame {

    public MoreOption_page() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BTN_CREATEACOUNT_ = new javax.swing.JButton();
        BTN_INFOCLIENT_ = new javax.swing.JButton();
        BTN_DEPOSIT_ = new javax.swing.JButton();
        BTN_MAKETRANFERENCE_ = new javax.swing.JButton();
        BTN_TRANSACTION_ = new javax.swing.JButton();
        BTN_SERVICE_ = new javax.swing.JButton();
        BTN_RETURN_ = new javax.swing.JButton();
        BTN_EXIT_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("More options");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("MÁS OPCIONES");

        BTN_CREATEACOUNT_.setText("Crear Cuenta");
        BTN_CREATEACOUNT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CREATEACOUNT_ActionPerformed(evt);
            }
        });

        BTN_INFOCLIENT_.setText("Informacion del Cliente");
        BTN_INFOCLIENT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_INFOCLIENT_ActionPerformed(evt);
            }
        });

        BTN_DEPOSIT_.setText("Realizar Deposito");
        BTN_DEPOSIT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DEPOSIT_ActionPerformed(evt);
            }
        });

        BTN_MAKETRANFERENCE_.setText("Realizar Transferencia");
        BTN_MAKETRANFERENCE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MAKETRANFERENCE_ActionPerformed(evt);
            }
        });

        BTN_TRANSACTION_.setText("Historial de Transaccion");
        BTN_TRANSACTION_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_TRANSACTION_ActionPerformed(evt);
            }
        });

        BTN_SERVICE_.setText("Pago de Servicios");
        BTN_SERVICE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SERVICE_ActionPerformed(evt);
            }
        });

        BTN_RETURN_.setText("Regresar");
        BTN_RETURN_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RETURN_ActionPerformed(evt);
            }
        });

        BTN_EXIT_.setText("Salir");
        BTN_EXIT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EXIT_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTN_RETURN_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_TRANSACTION_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_DEPOSIT_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_CREATEACOUNT_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTN_INFOCLIENT_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_MAKETRANFERENCE_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_SERVICE_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_EXIT_, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_CREATEACOUNT_)
                    .addComponent(BTN_INFOCLIENT_))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_DEPOSIT_)
                    .addComponent(BTN_MAKETRANFERENCE_))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_TRANSACTION_)
                    .addComponent(BTN_SERVICE_))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_RETURN_)
                    .addComponent(BTN_EXIT_))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_MAKETRANFERENCE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MAKETRANFERENCE_ActionPerformed
        this.setVisible(false);
        Transference_page transferencia = new Transference_page();
        transferencia.setVisible(true);
    }//GEN-LAST:event_BTN_MAKETRANFERENCE_ActionPerformed

    private void BTN_RETURN_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RETURN_ActionPerformed
        this.setVisible(false);
        Register_page registro = new Register_page();
        registro.setVisible(true);
    }//GEN-LAST:event_BTN_RETURN_ActionPerformed

    private void BTN_CREATEACOUNT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CREATEACOUNT_ActionPerformed
        this.setVisible(false);
        NewAcount_page CrearCuenta = new NewAcount_page();
        CrearCuenta.setVisible(true);
    }//GEN-LAST:event_BTN_CREATEACOUNT_ActionPerformed

    private void BTN_INFOCLIENT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_INFOCLIENT_ActionPerformed
        this.setVisible(false);
        InfoClient_page InfoCliente = new InfoClient_page();
        InfoCliente.setVisible(true);
    }//GEN-LAST:event_BTN_INFOCLIENT_ActionPerformed

    private void BTN_DEPOSIT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DEPOSIT_ActionPerformed
        this.setVisible(false);
        deposit_page deposito = new deposit_page();
        deposito.setVisible(true);
    }//GEN-LAST:event_BTN_DEPOSIT_ActionPerformed

    private void BTN_TRANSACTION_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_TRANSACTION_ActionPerformed
        this.setVisible(false);
        Transation_page transaccion = new Transation_page();
        transaccion.setVisible(true);
    }//GEN-LAST:event_BTN_TRANSACTION_ActionPerformed

    private void BTN_SERVICE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SERVICE_ActionPerformed
        this.setVisible(false);
        Service_page servicio = new Service_page();
        servicio.setVisible(true);
    }//GEN-LAST:event_BTN_SERVICE_ActionPerformed

    private void BTN_EXIT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EXIT_ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTN_EXIT_ActionPerformed

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
            java.util.logging.Logger.getLogger(MoreOption_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoreOption_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoreOption_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoreOption_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoreOption_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_CREATEACOUNT_;
    private javax.swing.JButton BTN_DEPOSIT_;
    private javax.swing.JButton BTN_EXIT_;
    private javax.swing.JButton BTN_INFOCLIENT_;
    private javax.swing.JButton BTN_MAKETRANFERENCE_;
    private javax.swing.JButton BTN_RETURN_;
    private javax.swing.JButton BTN_SERVICE_;
    private javax.swing.JButton BTN_TRANSACTION_;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
