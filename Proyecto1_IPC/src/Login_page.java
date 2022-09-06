
import java.awt.Color;
import javax.swing.JOptionPane;


public class Login_page extends javax.swing.JFrame {

    public Login_page() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(193,179,215));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        TXT_USER_ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BTN_RETURN_ = new javax.swing.JButton();
        BTN_LOGIN_ = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TXT_PASSWORD_ = new javax.swing.JPasswordField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");

        TXT_USER_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TXT_USER_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_USER_ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-circundado-usuario-hombre-tipo-de-piel-1-2-80.png"))); // NOI18N

        BTN_RETURN_.setBackground(new java.awt.Color(251, 182, 209));
        BTN_RETURN_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_RETURN_.setText("Regresar");
        BTN_RETURN_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RETURN_ActionPerformed(evt);
            }
        });

        BTN_LOGIN_.setBackground(new java.awt.Color(154, 206, 223));
        BTN_LOGIN_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BTN_LOGIN_.setText("Ingresar");
        BTN_LOGIN_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_LOGIN_ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        TXT_PASSWORD_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TXT_PASSWORD_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_PASSWORD_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(58, 58, 58))
                            .addComponent(TXT_USER_, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_PASSWORD_, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTN_RETURN_, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTN_LOGIN_, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(TXT_USER_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXT_PASSWORD_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_RETURN_)
                    .addComponent(BTN_LOGIN_))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_PASSWORD_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_PASSWORD_ActionPerformed

    }//GEN-LAST:event_TXT_PASSWORD_ActionPerformed

    private void BTN_RETURN_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RETURN_ActionPerformed
        this.setVisible(false);
        Home_page home = new Home_page();
        home.setVisible(true);
    }//GEN-LAST:event_BTN_RETURN_ActionPerformed

    private void TXT_USER_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_USER_ActionPerformed
       
    }//GEN-LAST:event_TXT_USER_ActionPerformed

    private void BTN_LOGIN_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_LOGIN_ActionPerformed
        String usuario = ""; 
        usuario = TXT_USER_.getText();
        
        String contra = new String(TXT_PASSWORD_.getPassword());
        
        if (usuario.equals("administrador") && contra.equals("202104727") ){
            this.setVisible(false);
            Register_page registro = new Register_page();
            registro.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "El usuario o la contraseña no coinciden \n ingrese nuevamente los valores correctos", "Alerta", JOptionPane.WARNING_MESSAGE);
            TXT_USER_.setText(null);
            TXT_PASSWORD_.setText("");
        }
        
        
        
    }//GEN-LAST:event_BTN_LOGIN_ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_LOGIN_;
    private javax.swing.JButton BTN_RETURN_;
    private javax.swing.JPasswordField TXT_PASSWORD_;
    private javax.swing.JTextField TXT_USER_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
