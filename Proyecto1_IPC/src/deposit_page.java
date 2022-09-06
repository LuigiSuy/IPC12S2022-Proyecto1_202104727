
import java.awt.Color;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class deposit_page extends javax.swing.JFrame {
    
    //llamado a la clase clientclass para los clientes registrados
    public static ClientClass[] ClientesRegistrados = new ClientClass[5];
    //llamado de la clase cuenta para ingresarlas 
    public static AcountClass[] CuentaRegistrada = new AcountClass[5];
    //llamado de la clase transaccion para ingresarlas
    public static TransationClass[] TransaccionRegistrada = new TransationClass[20];
    
    //valores de la pagina de registro
    Register_page Registropage = new Register_page();
    //arreglo para agregar el valor del id ingresado
    //static int[] ValorID = new int[25];
    int[] ValorID = new int[25];
    //llamado desde la clase para el relleno del combobox
    ClientClass[] UsuarioRegistrado = Registropage.ClientesRegistrados;
    
    //VARIABLE PARA ID TRANSFERENCIA 
    static int IdTransference = 1001;
    
    //FORMATO DE DIA Y HORA
    DateTimeFormatter DiaYHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
    String dia = DiaYHora.format(LocalDateTime.now());
    
    public deposit_page() {
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
                        CBX_CUENTA_.addItem(UsuarioRegistrado[i].CuentasAsociadas[j].ID +" - Cuenta de "+ UsuarioRegistrado[i].Nombre + " " + UsuarioRegistrado[i].Apellido);
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
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        CBX_CUENTA_ = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXT_MONTO_ = new javax.swing.JTextField();
        BTN_DEPOSITO_ = new javax.swing.JButton();
        BTN_RETURN_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New deposit");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-circundado-usuario-hombre-tipo-de-piel-1-2-80.png"))); // NOI18N

        CBX_CUENTA_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cuenta");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Monto");

        TXT_MONTO_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        BTN_DEPOSITO_.setBackground(new java.awt.Color(154, 206, 223));
        BTN_DEPOSITO_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_DEPOSITO_.setText("Depositar");
        BTN_DEPOSITO_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DEPOSITO_ActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTN_DEPOSITO_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTN_RETURN_, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(5, 5, 5))
                            .addComponent(jLabel2))
                        .addGap(150, 150, 150))))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBX_CUENTA_, 0, 250, Short.MAX_VALUE)
                    .addComponent(TXT_MONTO_, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(CBX_CUENTA_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_MONTO_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(BTN_DEPOSITO_)
                .addGap(18, 18, 18)
                .addComponent(BTN_RETURN_)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_RETURN_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RETURN_ActionPerformed
        this.setVisible(false);
        MoreOption_page MasOpciones = new MoreOption_page();
        MasOpciones.setVisible(true);
    }//GEN-LAST:event_BTN_RETURN_ActionPerformed

    private void BTN_DEPOSITO_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DEPOSITO_ActionPerformed
        int ind = CBX_CUENTA_.getSelectedIndex();
        //ASIGNACION DE TRANSFERENCIA
        TransationClass NuevaTransaccion = new TransationClass(IdTransference, dia, "Deposito", 0.0, 0.0, 0.0);
        
        
        //valido que el ingreso sea mayor a 0
        if (Double.parseDouble(TXT_MONTO_.getText()) <= 0) {
            JOptionPane.showMessageDialog(null, "El Monto del deposito debe ser mayor a 0","Alerta", JOptionPane.WARNING_MESSAGE);
            TXT_MONTO_.setText(null);
        }else{
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
                                UsuarioRegistrado[i].CuentasAsociadas[j].Saldo = UsuarioRegistrado[i].CuentasAsociadas[j].Saldo + Double.parseDouble(TXT_MONTO_.getText());
                                JOptionPane.showMessageDialog(null, "Depósito realizado exitosametne. ");
                                UsuarioRegistrado[i].CuentasAsociadas[j].ImprimirCuenta();
                                System.out.println("* * * * * * * * * * * * * * * * * * * ");
                                
                                for (int k = 0; k < TransaccionRegistrada.length; k++) {
                                    if (UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k] == null) {
                                        
                                        //INGRESO DE LA TRANSACCION
                                        UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k] = NuevaTransaccion;
                                        UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].credito = Double.parseDouble(TXT_MONTO_.getText());
                                        UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].SaldoDisponible = UsuarioRegistrado[i].CuentasAsociadas[j].Saldo;
                                        TXT_MONTO_.setText(null);
                                        IdTransference++;
                                        
                                        UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].imprimirtransaccion();
                                        break;
                                        
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
        }
    }//GEN-LAST:event_BTN_DEPOSITO_ActionPerformed

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
            java.util.logging.Logger.getLogger(deposit_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deposit_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deposit_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deposit_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deposit_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_DEPOSITO_;
    private javax.swing.JButton BTN_RETURN_;
    private javax.swing.JComboBox<String> CBX_CUENTA_;
    private javax.swing.JTextField TXT_MONTO_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
