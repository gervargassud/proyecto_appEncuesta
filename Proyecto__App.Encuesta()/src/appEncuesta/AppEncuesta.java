
package appEncuesta;

import appEncuesta.Encuesta;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
        
public class AppEncuesta extends javax.swing.JFrame {

   
    public AppEncuesta() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabelVN.setVisible(false);
        jLabelVA.setVisible(false);
        jLabelVNCL.setVisible(false);
        
    }
     public boolean camposNoVacios() {

        boolean estado;
        if (Nombre.getText().isEmpty() || jLabelVA.getText().isEmpty() || jLabelVNCL.getText().isEmpty()) {
            jLabelVN.setVisible(true);
            jLabelVA.setVisible(true);
            jLabelVNCL.setVisible(true);
            JOptionPane.showMessageDialog(this, "Complete todos los campos");
            return estado = false;
        } else {
            return estado = true;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelEncuesta = new javax.swing.JLabel();
        jLabelPedirDatos = new javax.swing.JLabel();
        jLabelPedirDatos1 = new javax.swing.JLabel();
        jLabelDato2 = new javax.swing.JLabel();
        jLabelDato1 = new javax.swing.JLabel();
        jLabelDato3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JTextField();
        NroCliente = new javax.swing.JTextField();
        jLabelDato4 = new javax.swing.JLabel();
        jLabelDato5 = new javax.swing.JLabel();
        jLabelDato6 = new javax.swing.JLabel();
        jComboBoxResolucion = new javax.swing.JComboBox<>();
        jComboBoxRecomendacion = new javax.swing.JComboBox<>();
        jComboBoxAtencion = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelVN = new javax.swing.JLabel();
        jLabelVA = new javax.swing.JLabel();
        jLabelVNCL = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encuesta Satisfaccion");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEncuesta.setBackground(new java.awt.Color(204, 255, 255));
        jLabelEncuesta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        jLabelEncuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEncuesta.setText("Encuesta");
        getContentPane().add(jLabelEncuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 370, 40));

        jLabelPedirDatos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPedirDatos.setText("Nivel de Satisfaccion: ");
        getContentPane().add(jLabelPedirDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jLabelPedirDatos1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPedirDatos1.setText("Datos Personales: ");
        getContentPane().add(jLabelPedirDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabelDato2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelDato2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDato2.setText("Nro de cliente");
        getContentPane().add(jLabelDato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 170, 60));

        jLabelDato1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelDato1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDato1.setText("Apellido");
        getContentPane().add(jLabelDato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 170, 60));

        jLabelDato3.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelDato3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDato3.setText("Nombre");
        getContentPane().add(jLabelDato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 170, 60));

        Nombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 280, 60));

        Apellido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 280, 60));

        NroCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NroClienteActionPerformed(evt);
            }
        });
        getContentPane().add(NroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 280, 60));

        jLabelDato4.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelDato4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDato4.setText("Resolucion");
        getContentPane().add(jLabelDato4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 170, 60));

        jLabelDato5.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelDato5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDato5.setText("Recomendacion");
        getContentPane().add(jLabelDato5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 710, 180, 60));

        jLabelDato6.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabelDato6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDato6.setText("Atencion");
        getContentPane().add(jLabelDato6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 170, 60));

        jComboBoxResolucion.setBackground(new java.awt.Color(0, 0, 0));
        jComboBoxResolucion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxResolucion.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxResolucion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBoxResolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxResolucionActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxResolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 650, 100, 40));

        jComboBoxRecomendacion.setBackground(new java.awt.Color(0, 0, 0));
        jComboBoxRecomendacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxRecomendacion.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxRecomendacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBoxRecomendacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRecomendacionActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxRecomendacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 720, 100, 40));

        jComboBoxAtencion.setBackground(new java.awt.Color(0, 0, 0));
        jComboBoxAtencion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBoxAtencion.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBoxAtencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtencionActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 100, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 810, 140, 70));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 130, 50));

        jLabelVN.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelVN.setText(".");
        getContentPane().add(jLabelVN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        jLabelVA.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelVA.setText(".");
        getContentPane().add(jLabelVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabelVNCL.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelVNCL.setText(".");
        getContentPane().add(jLabelVNCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        jLabelFondo.setText("jLabel1");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 593, 899));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoActionPerformed

    private void NroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NroClienteActionPerformed

    private void jComboBoxResolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxResolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxResolucionActionPerformed

    private void jComboBoxRecomendacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRecomendacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRecomendacionActionPerformed

    private void jComboBoxAtencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAtencionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if (camposNoVacios()) {

            String nombre = Nombre.getText();
            String apellido = Apellido.getText();
            Integer nroCliente = Integer.parseInt(NroCliente.getText().toString());

            Integer Atencion = Integer.parseInt(jComboBoxAtencion.getSelectedItem().toString());
            Integer Recomendacion = Integer.parseInt(jComboBoxRecomendacion.getSelectedItem().toString());
            Integer Resolucion = Integer.parseInt(jComboBoxResolucion.getSelectedItem().toString());

            
            Integer promedio = (Integer) ((Atencion + Recomendacion + Resolucion) / 3);
            
            Encuesta encuesta = new Encuesta(Atencion,Recomendacion,Resolucion,nombre,apellido,nroCliente);
            encuesta.setPromedioEncuesta(promedio);
            
            AppEncuesta2 encuesta2 = new AppEncuesta2();
            encuesta2.promEncuesta.setText(promedio.toString());

            Icon emoji;

            if (promedio >= 9) {
                emoji = new ImageIcon(getClass().getResource("/imagenes/5Estrellas.png"));

            } else {
                    if ((promedio >= 6) && (promedio < 9)) {
                emoji = new ImageIcon(getClass().getResource("/imagenes/4Estrellas.png"));

            } else {
                    if ((promedio >= 4) && (promedio < 6)){
                emoji = new ImageIcon(getClass().getResource("/imagenes/3Estrellas.png"));
            } else {
                    if (promedio > 1 && promedio < 4){
                
                emoji = new ImageIcon(getClass().getResource("/imagenes/2Estrellas.png"));
                
            } else {
                
                emoji = new ImageIcon(getClass().getResource("/imagenes/1_estrella1.png"));
                
            }
                    }          
                    }
            }
            encuesta2.imagenEncuesta.setIcon(emoji);
            encuesta2.setLocationRelativeTo(null);
            encuesta2.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(AppEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppEncuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppEncuesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NroCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxAtencion;
    private javax.swing.JComboBox<String> jComboBoxRecomendacion;
    private javax.swing.JComboBox<String> jComboBoxResolucion;
    private javax.swing.JLabel jLabelDato1;
    private javax.swing.JLabel jLabelDato2;
    private javax.swing.JLabel jLabelDato3;
    private javax.swing.JLabel jLabelDato4;
    private javax.swing.JLabel jLabelDato5;
    private javax.swing.JLabel jLabelDato6;
    private javax.swing.JLabel jLabelEncuesta;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelPedirDatos;
    private javax.swing.JLabel jLabelPedirDatos1;
    private javax.swing.JLabel jLabelVA;
    private javax.swing.JLabel jLabelVN;
    private javax.swing.JLabel jLabelVNCL;
    // End of variables declaration//GEN-END:variables
}
