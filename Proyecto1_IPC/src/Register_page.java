
import java.awt.Color;
import javax.swing.JOptionPane;

public class Register_page extends javax.swing.JFrame {

    public static ClientClass[] ClientesRegistrados = new ClientClass[5];
    

    public Register_page() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(193,179,215));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TXT_CUI_ = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TXT_NAME_ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXT_LASTNAME_ = new javax.swing.JTextField();
        BTN_CREATE_ = new javax.swing.JButton();
        BTN_MOREOPTION_ = new javax.swing.JButton();
        BTN_EXIT_ = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("CUI");

        TXT_CUI_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        TXT_NAME_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");

        TXT_LASTNAME_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        BTN_CREATE_.setBackground(new java.awt.Color(154, 206, 223));
        BTN_CREATE_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_CREATE_.setText("Crear");
        BTN_CREATE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CREATE_ActionPerformed(evt);
            }
        });

        BTN_MOREOPTION_.setBackground(new java.awt.Color(72, 181, 163));
        BTN_MOREOPTION_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_MOREOPTION_.setText("Más opciones");
        BTN_MOREOPTION_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MOREOPTION_ActionPerformed(evt);
            }
        });

        BTN_EXIT_.setBackground(new java.awt.Color(251, 182, 209));
        BTN_EXIT_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_EXIT_.setText("Regresar");
        BTN_EXIT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_EXIT_ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-circundado-usuario-hombre-tipo-de-piel-1-2-80.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(BTN_EXIT_, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_CREATE_, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_MOREOPTION_, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TXT_NAME_, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_CUI_))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(TXT_LASTNAME_, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(67, 67, 67))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_CUI_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_NAME_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXT_LASTNAME_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_CREATE_)
                    .addComponent(BTN_MOREOPTION_))
                .addGap(18, 18, 18)
                .addComponent(BTN_EXIT_)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_CREATE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CREATE_ActionPerformed

        ClientClass NewClient = new ClientClass(Long.parseLong(TXT_CUI_.getText()), TXT_NAME_.getText(), TXT_LASTNAME_.getText());
        
         

        boolean flag = false;
        
        for (int i = 0; i < ClientesRegistrados.length; i++) {  
            
            //CUI REPETIDO
            int cont = 0;
            if (ClientesRegistrados[i] == null) {
                ClientesRegistrados[i] = NewClient;
                //INGRESO DEL SEGUNDO CUI
                if (i >= 1) {
                    //FOR PARA RECORRER TODOS LOS VALORES E IGUALAR AL CUI INGRESADO
                    for (int j = 0; j < ClientesRegistrados.length; j++) {
                        //IF PARA VER QUE CLIENTE ESTA LLENO
                        if (ClientesRegistrados[j]!=null) {
                            //IGUALACION Y VERIFICACION DEL CUI
                            if (ClientesRegistrados[i].CUI == ClientesRegistrados[j].CUI) {
                                
                                cont++;
                                //SI EL CUI EN LA MISMA POSICION SE REPITE EL CONTADOR ES 1 SI SE REPITE EN MÁS POSICIONES SERA 2
                                if (cont == 2) {
                                    JOptionPane.showMessageDialog(null, "El Cui ingresado es repetido","Alerta", JOptionPane.WARNING_MESSAGE);
                                    //RESETEO DE CLIETE Y SE REGRESA UNA POSICION
                                    ClientesRegistrados[i] = null;
                                    flag = true;
                                    i--;
                                    break;                                
                                }                            
                            } 
                            
                        }
  
                    }
                    //SI EL CUI EN LA MISMA POSICION SE REPITIO EL CONTADOR ES 1
                    if (cont == 1) {
                        JOptionPane.showMessageDialog(null, "Cliente creado exitosamente");                          
                        flag = true;
                        break;
                    }
                //SE SALE DEL PRIMER FOR Y SE CREA EL CLIENTE    
                break;
                //CREACION DEL PRIMER CLIENTE
                }else{
                    JOptionPane.showMessageDialog(null, "Cliente creado exitosamente");                          
                    flag = true;
                    break;
                }
                
                
            }
            
            //CUI REPETIDO
            
        }

        if (!flag) {
            JOptionPane.showMessageDialog(null, "No es posible crear mas clientes.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
        
        

        for (int i = 0; i < ClientesRegistrados.length; i++) {
            if (ClientesRegistrados[i] != null) {
                ClientesRegistrados[i].Imprimir();
            }
        }
        System.out.println("**************************");

        TXT_CUI_.setText(null);
        TXT_NAME_.setText(null);
        TXT_LASTNAME_.setText(null);

    }//GEN-LAST:event_BTN_CREATE_ActionPerformed

    private void BTN_EXIT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_EXIT_ActionPerformed
        this.setVisible(false);
        Login_page login = new Login_page();
        login.setVisible(true);
    }//GEN-LAST:event_BTN_EXIT_ActionPerformed

    private void BTN_MOREOPTION_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MOREOPTION_ActionPerformed
        this.setVisible(false);
        MoreOption_page MasOpciones = new MoreOption_page();
        MasOpciones.setVisible(true);
    }//GEN-LAST:event_BTN_MOREOPTION_ActionPerformed

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
            java.util.logging.Logger.getLogger(Register_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_CREATE_;
    private javax.swing.JButton BTN_EXIT_;
    private javax.swing.JButton BTN_MOREOPTION_;
    private javax.swing.JTextField TXT_CUI_;
    private javax.swing.JTextField TXT_LASTNAME_;
    private javax.swing.JTextField TXT_NAME_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
