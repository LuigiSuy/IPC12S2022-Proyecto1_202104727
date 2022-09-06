
import java.awt.Color;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Transference_page extends javax.swing.JFrame {
    
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
    int[] ValorID2 = new int [25];
    //llamado desde la clase para el relleno del combobox
    ClientClass[] UsuarioRegistrado = Registropage.ClientesRegistrados;
    
    //VARIABLE PARA ID TRANSFERENCIA 
    static int IdTransference = 2001;
    static int IdTransference2 = 3001;
    
    //FORMATO DE DIA Y HORA
    DateTimeFormatter DiaYHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
    String dia = DiaYHora.format(LocalDateTime.now());
    
        
    public Transference_page() {
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
                        CBX_ORIGIN_.addItem(UsuarioRegistrado[i].CuentasAsociadas[j].ID +" - Cuenta de "+ UsuarioRegistrado[i].Nombre + " " + UsuarioRegistrado[i].Apellido);
                        CBX_DESTINO_.addItem(UsuarioRegistrado[i].CuentasAsociadas[j].ID +" - Cuenta de "+ UsuarioRegistrado[i].Nombre + " " + UsuarioRegistrado[i].Apellido);
                        for (int k = 0; k < ValorID.length; k++) {
                            if (ValorID[k] == 0) {
                                ValorID[k] = UsuarioRegistrado[i].CuentasAsociadas[j].ID;
                                ValorID2[k] = UsuarioRegistrado[i].CuentasAsociadas[j].ID;
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

        jLabel1 = new javax.swing.JLabel();
        CBX_ORIGIN_ = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CBX_DESTINO_ = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TXT_MONTO_ = new javax.swing.JTextField();
        BTN_TRANSFER_ = new javax.swing.JButton();
        BTN_RETURN_ = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Make Transference");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Cuenta de Origen");

        CBX_ORIGIN_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Cuenta de Destino");

        CBX_DESTINO_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Monto");

        TXT_MONTO_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        BTN_TRANSFER_.setBackground(new java.awt.Color(154, 206, 223));
        BTN_TRANSFER_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_TRANSFER_.setText("Transferir");
        BTN_TRANSFER_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_TRANSFER_ActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setText("Transferencias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BTN_RETURN_, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(BTN_TRANSFER_, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TXT_MONTO_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(79, 79, 79))
                                .addComponent(CBX_DESTINO_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CBX_ORIGIN_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(46, 46, 46))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(50, 50, 50))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(jLabel4))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBX_ORIGIN_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CBX_DESTINO_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_MONTO_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(BTN_TRANSFER_)
                .addGap(18, 18, 18)
                .addComponent(BTN_RETURN_)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_RETURN_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RETURN_ActionPerformed
        this.setVisible(false);
        MoreOption_page MasOpciones = new MoreOption_page();
        MasOpciones.setVisible(true);
    }//GEN-LAST:event_BTN_RETURN_ActionPerformed

    private void BTN_TRANSFER_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_TRANSFER_ActionPerformed
        //INDICE DE CADA CUENTA A PARTIR DEL INDICE SELECCIONADO EN EL CBX
        int IndiceCuenta1 = CBX_ORIGIN_.getSelectedIndex();
        int IndiceCuenta2 = CBX_DESTINO_.getSelectedIndex();
        
        //VARIABLE PARA EL SALDO 1
        double SaldoCuenta1 = 0;
        //VARIABLE PARA EL MONTO INGRESADO
        double MontoIngresado = Double.parseDouble(TXT_MONTO_.getText());
        
        
        
        //VALIDACION PARA QUE EL MONTO NO SEA MENOR O IGUAL A 0 Y QUE LAS CUENTAS NO SEAN LAS MISMAS
        if (MontoIngresado <= 0) {
            JOptionPane.showMessageDialog(null, "El monto de la transferecia debe de ser mayor a 0","Alerta", JOptionPane.WARNING_MESSAGE);
            TXT_MONTO_.setText(null);
        }else if(IndiceCuenta1 == IndiceCuenta2){
            JOptionPane.showMessageDialog(null, "La Cuenta de destino no puede ser igual a la cuenta de origen","Alerta", JOptionPane.WARNING_MESSAGE);
            TXT_MONTO_.setText(null);
        }else{
            System.out.println("Ya iniciamos a trabajar desde aqui, el monto es mayor a 0 y son diferentes cuentas <3");
            
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
                            if (UsuarioRegistrado[i].CuentasAsociadas[j].ID == ValorID[IndiceCuenta1]) {
                                SaldoCuenta1 = UsuarioRegistrado[i].CuentasAsociadas[j].Saldo;
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
            
            if (SaldoCuenta1 < MontoIngresado) {
                JOptionPane.showMessageDialog(null, "La cuenta de origen no tiene suficientes fondos","Alerta", JOptionPane.WARNING_MESSAGE);
                TXT_MONTO_.setText(null);
            }else{
                System.out.println("Ya estan todas las validaciones iniciamos con la resta y suma del monto en cuenta 1 y 2 respectivamente");
                
                for (int i = 0; i < UsuarioRegistrado.length; i++) {
                    //ASIGNACION DE TRANSFERENCIA
                    TransationClass NuevaTransaccion = new TransationClass(IdTransference, dia, "Transferencia", 0.0, 0.0, 0.0);

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
                                if (UsuarioRegistrado[i].CuentasAsociadas[j].ID == ValorID[IndiceCuenta1]) {
                                    UsuarioRegistrado[i].CuentasAsociadas[j].Saldo = UsuarioRegistrado[i].CuentasAsociadas[j].Saldo - MontoIngresado;
                                    System.out.println("* * * * * * Saldo nuevo Cuenta 1 * * * * * *");
                                    UsuarioRegistrado[i].CuentasAsociadas[j].ImprimirCuenta();
                                    System.out.println("* * * * * * * * * * * * * * * * * *");
                                    for (int k = 0; k < TransaccionRegistrada.length; k++) {
                                        if (UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k] == null) {

                                            //INGRESO DE LA TRANSACCION
                                            UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k] = NuevaTransaccion;
                                            UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].credito = 0;
                                            UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].debito = MontoIngresado;
                                            UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].SaldoDisponible = UsuarioRegistrado[i].CuentasAsociadas[j].Saldo;
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
                
                for (int i = 0; i < UsuarioRegistrado.length; i++) {
                    //ASIGNACION DE TRANSFERENCIA
                    TransationClass NuevaTransaccion = new TransationClass(IdTransference2, dia, "Transferencia", 0.0, 0.0, 0.0);
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
                                if (UsuarioRegistrado[i].CuentasAsociadas[j].ID == ValorID[IndiceCuenta2]) {
                                    System.out.println("* * * * * * * Saldo anterior cuenta 2 * * * * * * *");
                                    UsuarioRegistrado[i].CuentasAsociadas[j].ImprimirCuenta();
                                    
                                    UsuarioRegistrado[i].CuentasAsociadas[j].Saldo = UsuarioRegistrado[i].CuentasAsociadas[j].Saldo + MontoIngresado;
                                    
                                    System.out.println("* *  * * * * Saldo nuevo cuenta 2 * *  * * * *");
                                    UsuarioRegistrado[i].CuentasAsociadas[j].ImprimirCuenta();
                                    for (int k = 0; k < TransaccionRegistrada.length; k++) {
                                        if (UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k] == null) {

                                            //INGRESO DE LA TRANSACCION
                                            UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k] = NuevaTransaccion;
                                            UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].credito = MontoIngresado;
                                            UsuarioRegistrado[i].CuentasAsociadas[j].TransaccionesRealizadas[k].SaldoDisponible = UsuarioRegistrado[i].CuentasAsociadas[j].Saldo;
                                            JOptionPane.showMessageDialog(null, "Transferencia realizada exitosamente");
                                            TXT_MONTO_.setText(null);
                                            IdTransference2++;

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
        
    }//GEN-LAST:event_BTN_TRANSFER_ActionPerformed

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
            java.util.logging.Logger.getLogger(Transference_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transference_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transference_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transference_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transference_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_RETURN_;
    private javax.swing.JButton BTN_TRANSFER_;
    private javax.swing.JComboBox<String> CBX_DESTINO_;
    private javax.swing.JComboBox<String> CBX_ORIGIN_;
    private javax.swing.JTextField TXT_MONTO_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
