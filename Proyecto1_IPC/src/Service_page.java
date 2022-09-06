
import java.awt.Color;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Service_page extends javax.swing.JFrame {
    
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
    //STRING PARA SABER QUE SERVICIO PAGARE    
    String[] ServicioAPagar = new String[3]; 
    
    //VARIABLE PARA ID TRANSFERENCIA 
    static int IdTransference = 4001;
    
    //FORMATO DE DIA Y HORA
    DateTimeFormatter DiaYHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
    String dia = DiaYHora.format(LocalDateTime.now());
    
    
    //llamado desde la clase para el relleno del combobox
    ClientClass[] UsuarioRegistrado = Registropage.ClientesRegistrados;

    public Service_page() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(193,179,215));
        
        ServicioAPagar[0] = "Luz eléctrica";
        ServicioAPagar[1] = "Agua";
        ServicioAPagar[2] = "Servicio telefónico";
        
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

        jLabel3 = new javax.swing.JLabel();
        TXT_MONTO_ = new javax.swing.JTextField();
        BTN_PAGAR_ = new javax.swing.JButton();
        BTN_RETURN_ = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CBX_CUENTA_ = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CBX_SERVICIO_ = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Service page");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Monto");

        TXT_MONTO_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        BTN_PAGAR_.setBackground(new java.awt.Color(154, 206, 223));
        BTN_PAGAR_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_PAGAR_.setText("Realizar Pago");
        BTN_PAGAR_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PAGAR_ActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("  Pago de Servicios");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Cuenta de Origen");

        CBX_CUENTA_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Servicio");

        CBX_SERVICIO_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CBX_SERVICIO_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luz eléctrica", "Agua", "Servicio telefónico" }));
        CBX_SERVICIO_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBX_SERVICIO_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BTN_RETURN_, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(BTN_PAGAR_, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXT_MONTO_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(79, 79, 79))
                                    .addComponent(CBX_SERVICIO_, javax.swing.GroupLayout.Alignment.TRAILING, 0, 200, Short.MAX_VALUE)
                                    .addComponent(CBX_CUENTA_, javax.swing.GroupLayout.Alignment.TRAILING, 0, 200, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(50, 50, 50))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel2)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBX_CUENTA_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBX_SERVICIO_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_MONTO_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(BTN_PAGAR_)
                .addGap(18, 18, 18)
                .addComponent(BTN_RETURN_)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_RETURN_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RETURN_ActionPerformed
        this.setVisible(false);
        MoreOption_page MasOpciones = new MoreOption_page();
        MasOpciones.setVisible(true);
    }//GEN-LAST:event_BTN_RETURN_ActionPerformed

    private void CBX_SERVICIO_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBX_SERVICIO_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBX_SERVICIO_ActionPerformed

    private void BTN_PAGAR_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PAGAR_ActionPerformed
        
        //VARIABLE PARA EL INDICE SEGUN EL CBX DE LA CUENTA
        int IndiceCuenta = CBX_CUENTA_.getSelectedIndex();
        //VARIABLE PARA EL INDICE SEGUN EL CBX DEL SERVICIO A PAGAR
        int IndiceServicio = CBX_SERVICIO_.getSelectedIndex();
        //VARIABLE PARA EL SALDO DE LA CUENTA AL ENCONTRARLA
        double SaldoCuenta = 0;
        //VARIABLE PARA EL MONTO A PAGAR
        double Monto = Double.parseDouble(TXT_MONTO_.getText());
        //VARIABLE PARA SABER QUE SERVICIO SE PAGA EN LA TRANSACCION ELEGIDA
        String ServicioPagado = "";
        //SWITCH SEGUN INDICE SERVICIO
        switch (IndiceServicio) {
            case 0:
                ServicioPagado = "Pago de Servicio - " + ServicioAPagar[IndiceServicio];
                break;
            case 1:
                ServicioPagado = "Pago de Servicio - " + ServicioAPagar[IndiceServicio];
                break;
            case 2:
                ServicioPagado = "Pago de Servicio - " + ServicioAPagar[IndiceServicio];
                break;
            default:
                throw new AssertionError();
        }
        
        //ASIGNACION DE TRANSFERENCIA
        TransationClass NuevaTransaccion = new TransationClass(IdTransference, dia, ServicioPagado, 0.0, 0.0, 0.0);
        
        
        
        //VALIDACION PARA QUE LE MONTO INGRESADO SEA MAYOR A 0
        if (Monto <= 0) {
            JOptionPane.showMessageDialog(null, "El monto del pago debe ser mayor a 0", "Alerta", JOptionPane.WARNING_MESSAGE);
            TXT_MONTO_.setText(null);
        }else{
            //EL VALOR INGRESADO ES MAYOR A 0 SE PUEDE SEGUIR TRABAJANDO
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
                            if (UsuarioRegistrado[i].CuentasAsociadas[j].ID == ValorID[IndiceCuenta]) {
                                SaldoCuenta = UsuarioRegistrado[i].CuentasAsociadas[j].Saldo;
                                System.out.println("* * * * * * * * * Saldo inicial cuenta 1 * * * * * * * * *");
                                UsuarioRegistrado[i].CuentasAsociadas[j].ImprimirCuenta();
                                break;
                            }
                        }else{
                            break;
                        }
                    }  
                }   
            }
            //VALIDACION PARA QUE LA CUENTA TENGA SUFICIENTES FONDOS PARA PAGAR EL MONTO
            if (SaldoCuenta < Monto) {
                    JOptionPane.showMessageDialog(null, "La cuenta no tiene suficientes fondos ", "Alerta", JOptionPane.WARNING_MESSAGE);
                    TXT_MONTO_.setText(null);
            }else{

                for (int i = 0; i < UsuarioRegistrado.length; i++) {

                    if (UsuarioRegistrado[i] != null) {
                        for (int j = 0; j < CuentaRegistrada.length; j++) {

                            //ingrese al for de la cuenta
                            //el valor del id segun el indice es: ValorID[ind]);                    
                            //si el valor de la cuenta j en el usuario i esta llena ingreso sino rompo el for de cuenta
                            if (UsuarioRegistrado[i].CuentasAsociadas[j] != null) {
                                //el valor del id de la cuenta que pasa ahorita es: " + UsuarioRegistrado[i].CuentasAsociadas[j].ID
                                //si el valor del ID en el usuario i y cuenta j es igual al id del indice del cbx seleccionado
                                if (UsuarioRegistrado[i].CuentasAsociadas[j].ID == ValorID[IndiceCuenta]) {
                                    UsuarioRegistrado[i].CuentasAsociadas[j].Saldo = UsuarioRegistrado[i].CuentasAsociadas[j].Saldo - Monto;
                                    System.out.println("* * * * * * Saldo nuevo Cuenta 1 * * * * * *");
                                    UsuarioRegistrado[i].CuentasAsociadas[j].ImprimirCuenta();
                                    System.out.println("* * * * * * * * * * * * * * * * * *");
                                    System.out.println("Se pago el servicio de: " + ServicioAPagar[IndiceServicio]);
                                    
                                    for (int k = 0; k < TransaccionRegistrada.length; k++) {
                                        if (UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k] == null) {

                                            //INGRESO DE LA TRANSACCION
                                            UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k] = NuevaTransaccion;
                                            UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].debito = Monto;
                                            UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].SaldoDisponible = UsuarioRegistrado[i].CuentasAsociadas[j].Saldo;
                                            JOptionPane.showMessageDialog(null, "Pago realizado exitosamente");
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
        }
        
    }//GEN-LAST:event_BTN_PAGAR_ActionPerformed

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
            java.util.logging.Logger.getLogger(Service_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Service_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Service_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Service_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Service_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_PAGAR_;
    private javax.swing.JButton BTN_RETURN_;
    private javax.swing.JComboBox<String> CBX_CUENTA_;
    private javax.swing.JComboBox<String> CBX_SERVICIO_;
    private javax.swing.JTextField TXT_MONTO_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
