/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana1;

import java.util.ArrayList;

/**
 *
 * @author hugo
 */
public class VArray extends javax.swing.JFrame {
    //Creamos 2 listas
        ArrayList noms= new ArrayList();
        ArrayList edads=new ArrayList();
        
     //Instaciamos clase 
        
        Empleado emp= new Empleado(noms, edads);
    
    
    /**
     * Creates new form Ventana
     */
    public VArray() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTIngresar = new javax.swing.JButton();
        BTBuscar = new javax.swing.JButton();
        BTEliminar = new javax.swing.JButton();
        BTSalir = new javax.swing.JButton();
        TFNom = new javax.swing.JTextField();
        TFEdad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAPantalla = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nom: ");

        jLabel2.setText("Edad: ");

        BTIngresar.setText("Ingresar");
        BTIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTIngresarActionPerformed(evt);
            }
        });

        BTBuscar.setText("Buscar");
        BTBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBuscarActionPerformed(evt);
            }
        });

        BTEliminar.setText("Eliminar");
        BTEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEliminarActionPerformed(evt);
            }
        });

        BTSalir.setText("Salir");
        BTSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTSalirActionPerformed(evt);
            }
        });

        TFNom.setText("Nom");

        TFEdad.setText("18");
        TFEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEdadActionPerformed(evt);
            }
        });

        TAPantalla.setColumns(20);
        TAPantalla.setRows(5);
        jScrollPane1.setViewportView(TAPantalla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BTIngresar)
                            .addGap(18, 18, 18)
                            .addComponent(BTBuscar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BTEliminar)
                            .addGap(18, 18, 18)
                            .addComponent(BTSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFEdad)
                            .addComponent(TFNom))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TFNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTIngresar)
                            .addComponent(BTBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTEliminar)
                            .addComponent(BTSalir)))
                    .addComponent(jScrollPane1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFEdadActionPerformed

    private void BTBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTBuscarActionPerformed
        // TODO add your handling code here:
        this.TAPantalla.append("Mostrar informacion: "+"\nnom: "+emp.BuscarNombre(this.TFNom.getText()));
        this.TAPantalla.append("\nEdad: "+String.valueOf(emp.BuscarEdad(Integer.parseInt(this.TFEdad.getText())))+"\n");
    }//GEN-LAST:event_BTBuscarActionPerformed

    private void BTIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTIngresarActionPerformed
        // TODO add your handling code here:
        emp.IngresarNombre(this.TFNom.getText());
        emp.IngresarEdad(Integer.parseInt(this.TFEdad.getText()));
    }//GEN-LAST:event_BTIngresarActionPerformed

    private void BTEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEliminarActionPerformed
        // TODO add your handling code here:
        emp.EliminarNombre(this.TFNom.getText());
        emp.EliminarEdad(Integer.parseInt(this.TFEdad.getText()));
    }//GEN-LAST:event_BTEliminarActionPerformed

    private void BTSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VArray.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VArray().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTBuscar;
    private javax.swing.JButton BTEliminar;
    private javax.swing.JButton BTIngresar;
    private javax.swing.JButton BTSalir;
    private javax.swing.JTextArea TAPantalla;
    private javax.swing.JTextField TFEdad;
    private javax.swing.JTextField TFNom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
