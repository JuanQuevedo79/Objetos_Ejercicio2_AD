/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author jquevedo3
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEntero_1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtDenominador_1 = new javax.swing.JTextField();
        txtDenominador_2 = new javax.swing.JTextField();
        cmbOperaciones = new javax.swing.JComboBox<String>();
        jTextField4 = new javax.swing.JTextField();
        txtNumerador_2 = new javax.swing.JTextField();
        txtEntero_2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtNumerador_1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEntero_3 = new javax.swing.JTextField();
        txtDenominador_3 = new javax.swing.JTextField();
        txtNumerador_3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmdCalcularFraccionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("OPERACIONES CON MIXTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        txtEntero_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntero_1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtEntero_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 40, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 80, 10));
        jPanel1.add(txtDenominador_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 60, -1));
        jPanel1.add(txtDenominador_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 60, -1));

        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Suma", "Resta", "Multiplicación", "División" }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 60, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 60, -1));
        jPanel1.add(txtNumerador_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 60, -1));

        txtEntero_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntero_2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtEntero_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 40, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 80, 10));
        jPanel1.add(txtNumerador_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, -1));

        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        txtEntero_3.setEditable(false);
        txtEntero_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntero_3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtEntero_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 40, 30));

        txtDenominador_3.setEditable(false);
        jPanel1.add(txtDenominador_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 60, -1));

        txtNumerador_3.setEditable(false);
        jPanel1.add(txtNumerador_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 60, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 80, 10));

        cmdCalcular.setText("Calcular");
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        cmdBorrar.setText("Limpiar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        cmdCalcularFraccionario.setText("Calcular Fraccionario");
        cmdCalcularFraccionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularFraccionarioActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcularFraccionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEntero_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntero_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntero_1ActionPerformed

    private void txtEntero_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntero_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntero_2ActionPerformed

    private void txtEntero_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntero_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntero_3ActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtNumerador_1.setText("");
        txtNumerador_2.setText("");
        txtNumerador_3.setText("");
        txtDenominador_1.setText("");
        txtDenominador_2.setText("");
        txtDenominador_3.setText("");
        txtEntero_1.setText("");
        txtEntero_2.setText("");
        txtEntero_3.setText("");
        txtEntero_1.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdCalcularFraccionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularFraccionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdCalcularFraccionarioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperaciones;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdCalcularFraccionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtDenominador_1;
    private javax.swing.JTextField txtDenominador_2;
    private javax.swing.JTextField txtDenominador_3;
    private javax.swing.JTextField txtEntero_1;
    private javax.swing.JTextField txtEntero_2;
    private javax.swing.JTextField txtEntero_3;
    private javax.swing.JTextField txtNumerador_1;
    private javax.swing.JTextField txtNumerador_2;
    private javax.swing.JTextField txtNumerador_3;
    // End of variables declaration//GEN-END:variables
}
