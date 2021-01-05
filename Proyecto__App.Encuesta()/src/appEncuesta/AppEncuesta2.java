
package appEncuesta;


public class AppEncuesta2 extends javax.swing.JFrame {

   
    public AppEncuesta2() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        promEncuesta = new javax.swing.JTextField();
        EXIT = new javax.swing.JButton();
        imagenEncuesta = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encuesta Satisfaccion");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        promEncuesta.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        promEncuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        promEncuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promEncuestaActionPerformed(evt);
            }
        });
        getContentPane().add(promEncuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, 470, 140));

        EXIT.setBackground(new java.awt.Color(0, 0, 0));
        EXIT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EXIT.setForeground(new java.awt.Color(255, 255, 255));
        EXIT.setText("Fin");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        getContentPane().add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 20, 220, 50));

        imagenEncuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenEncuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5Estrellas.png"))); // NOI18N
        getContentPane().add(imagenEncuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 360, 270));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        jLabelFondo.setText("jLabel1");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 593, 899));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void promEncuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promEncuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promEncuestaActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

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
            java.util.logging.Logger.getLogger(AppEncuesta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppEncuesta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppEncuesta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppEncuesta2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppEncuesta2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    public static javax.swing.JLabel imagenEncuesta;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelFondo;
    public static javax.swing.JTextField promEncuesta;
    // End of variables declaration//GEN-END:variables
}
