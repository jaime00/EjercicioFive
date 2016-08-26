/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author jaime
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    double v[];
    public Principal() {
        initComponents();
        txtLongitud.requestFocusInWindow();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenarManual = new javax.swing.JButton();
        cmdLlenarAutomatico = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cmdProductoria = new javax.swing.JButton();
        cmdSumatoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos Iniciales:"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Longitud:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("Ejercicio 5");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 70, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Resultado:"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 100));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 220, 130));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Opciones:"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, -1));

        cmdLlenarManual.setText("Llenar Manual");
        cmdLlenarManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenarManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, -1));

        cmdLlenarAutomatico.setText("Llenar Automatico");
        cmdLlenarAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenarAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 180, 190));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Operaciones:"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdProductoria.setText("Productoria");
        cmdProductoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdProductoriaActionPerformed(evt);
            }
        });
        jPanel4.add(cmdProductoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, -1));

        cmdSumatoria.setText("Sumatoria");
        cmdSumatoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSumatoriaActionPerformed(evt);
            }
        });
        jPanel4.add(cmdSumatoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          
          }
    }//GEN-LAST:event_txtLongitudKeyTyped
    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int longitud=Integer.parseInt(txtLongitud.getText());

        if(longitud%2==0){
            if(txtLongitud.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Digite la longitud");
                txtLongitud.requestFocusInWindow();

            }else if(Integer.parseInt(txtLongitud.getText().trim())==0){
                JOptionPane.showMessageDialog(this, "No se puede digitar cero en la longitud");
                txtLongitud.requestFocusInWindow();
                txtLongitud.selectAll();
            }else{
                longitud=Integer.parseInt(txtLongitud.getText());
                v= new double [longitud];
                JOptionPane.showMessageDialog(this, "Vector creado exitosamente");
            }
        }else{
            JOptionPane.showMessageDialog(this, "La longitud no puede ser impar","ERROR",JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        }

    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenarManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarManualActionPerformed
        double n;
        for (int i = 0; i < v.length; i++) {
            n=Double.parseDouble(JOptionPane.showInputDialog(this,"Digite el elemento (pos "+i+")"));
            v[i]=n;
        }
        JOptionPane.showMessageDialog(this, "Vector llenado exitosamente");
    }//GEN-LAST:event_cmdLlenarManualActionPerformed

    private void cmdLlenarAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarAutomaticoActionPerformed
        double n;
        for (int i = 0; i < v.length; i++) {
            n=(int)(Math.random()*50+ 1);
            v[i]=n;
        }
        JOptionPane.showMessageDialog(this, "Vector llenado exitosamente");
    }//GEN-LAST:event_cmdLlenarAutomaticoActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed

        txtLongitud.setText("");
        txtResultado.setText("");

        txtLongitud.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdProductoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdProductoriaActionPerformed
        double prod=1;
        for (int i = 0; i <(v.length-(v.length/2)); i++) {
            prod =prod*v[i];
        }
        txtResultado.append("1 parte del vector (prod)= "+prod);
    }//GEN-LAST:event_cmdProductoriaActionPerformed

    private void cmdSumatoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSumatoriaActionPerformed
        double suma=0;
        for (int i = (v.length/2); i <v.length; i++) {
            suma=suma+v[i];
        }
        txtResultado.append("\n 2 parte del vector (suma)= "+suma);
    }//GEN-LAST:event_cmdSumatoriaActionPerformed

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
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLlenarAutomatico;
    private javax.swing.JButton cmdLlenarManual;
    private javax.swing.JButton cmdProductoria;
    private javax.swing.JButton cmdSumatoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
