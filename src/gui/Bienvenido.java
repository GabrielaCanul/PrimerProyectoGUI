
package gui;

import javax.swing.JOptionPane;


public class Bienvenido extends javax.swing.JFrame {


    public Bienvenido() {
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaPrimerNumero = new javax.swing.JLabel();
        campoNumero1 = new javax.swing.JTextField();
        etiquetaSegundoNumero = new javax.swing.JLabel();
        campoNumero2 = new javax.swing.JTextField();
        botonSumar = new javax.swing.JButton();
        etiquetaResultado = new javax.swing.JLabel();
        campoResultado = new javax.swing.JTextField();
        botonRestar = new javax.swing.JButton();
        botonMultiplicacion = new javax.swing.JButton();
        botonDivicion = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenidos");

        etiquetaPrimerNumero.setText("Primer número:");

        campoNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumero1ActionPerformed(evt);
            }
        });

        etiquetaSegundoNumero.setText("Segundo número:");

        botonSumar.setText("Sumar");
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });

        etiquetaResultado.setText("Resultado:");

        campoResultado.setEditable(false);
        campoResultado.setFocusable(false);

        botonRestar.setText("Restar");
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });

        botonMultiplicacion.setText("Multiplicacion");
        botonMultiplicacion.setToolTipText("");
        botonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });

        botonDivicion.setText("Divicion ");
        botonDivicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDividirActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(etiquetaResultado)
                                .addComponent(etiquetaSegundoNumero))
                            .addComponent(etiquetaPrimerNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNumero2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(campoNumero1)
                            .addComponent(campoResultado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBorrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonSumar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonRestar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonMultiplicacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonDivicion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaPrimerNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSegundoNumero)
                    .addComponent(campoNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSumar)
                    .addComponent(botonRestar)
                    .addComponent(botonMultiplicacion)
                    .addComponent(botonDivicion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaResultado)
                    .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBorrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed
        String texto1 = campoNumero1.getText();
        try {
            int num1 = Integer.parseInt(texto1);
            int num2 = Integer.parseInt(campoNumero2.getText());
            int resultado = num1 + num2;
            String textoResultado = Integer.toString(resultado);
            campoResultado.setText(textoResultado);
        } catch(NumberFormatException nfe ) {
            JOptionPane.showMessageDialog(this, "Sólo se admiten números");
        }
    }//GEN-LAST:event_botonSumarActionPerformed

    private void campoNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumero1ActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        // TODO add your handling code here:
        String texto1 = campoNumero1.getText();
        try {
            int num1 = Integer.parseInt(texto1);
            int num2 = Integer.parseInt(campoNumero2.getText());
            int resultado = num2 - num1;
            String textoResultado = Integer.toString(resultado);
            campoResultado.setText(textoResultado);
        } catch(NumberFormatException nfe ) {
            JOptionPane.showMessageDialog(this, "Sólo se admiten números");
        }
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
        // TODO add your handling code here:
        String texto1 = campoNumero1.getText();
        try {
            int num1 = Integer.parseInt(texto1);
            int num2 = Integer.parseInt(campoNumero2.getText());
            int resultado = num1 * num2;
            String textoResultado = Integer.toString(resultado);
            campoResultado.setText(textoResultado);
        } catch(NumberFormatException nfe ) {
            JOptionPane.showMessageDialog(this, "Sólo se admiten números");
        }
    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void botonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDividirActionPerformed
        // TODO add your handling code here:
        String texto1 = campoNumero1.getText();
        try {
            int num1 = Integer.parseInt(texto1);
            int num2 = Integer.parseInt(campoNumero2.getText());
            int resultado = num1 / num2;
            String textoResultado = Integer.toString(resultado);
            campoResultado.setText(textoResultado);
        } catch(NumberFormatException nfe ) {
            JOptionPane.showMessageDialog(this, "Sólo se admiten números");
        }
    }//GEN-LAST:event_botonDividirActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        // TODO add your handling code here:
        campoNumero1.setText("");
        campoNumero2.setText("");
        campoResultado.setText("");
        
    }//GEN-LAST:event_botonBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonDivicion;
    private javax.swing.JButton botonMultiplicacion;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSumar;
    private javax.swing.JTextField campoNumero1;
    private javax.swing.JTextField campoNumero2;
    private javax.swing.JTextField campoResultado;
    private javax.swing.JLabel etiquetaPrimerNumero;
    private javax.swing.JLabel etiquetaResultado;
    private javax.swing.JLabel etiquetaSegundoNumero;
    // End of variables declaration//GEN-END:variables
}
