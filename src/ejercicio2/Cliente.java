/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente extends javax.swing.JFrame {
    

    static public ResultSet r;

    public Cliente() throws SQLException {
        initComponents();
        
        CONFIRMAR.setVisible(false);
        CANCELAR.setVisible(false);
        
        String url = "jdbc:mysql://localhost:3306/sergiooyono";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url, user, pass);

        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String query = "select* from clientes";
        r = s.executeQuery(query);
        r.first();
        NIF.setText(r.getString("NIF"));
        NOMBRE.setText(r.getString("NOMBRE"));
        DIRECCION.setText(r.getString("DIRECCION"));
        POBLACION.setText(r.getString("POBLACION"));
        PROVINCIA.setText(r.getString("PROVINCIA"));
        TELEFONO.setText(r.getString("TELEFONO"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NIF = new javax.swing.JTextField();
        NOMBRE = new javax.swing.JTextField();
        DIRECCION = new javax.swing.JTextField();
        POBLACION = new javax.swing.JTextField();
        PROVINCIA = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TELEFONO = new javax.swing.JTextField();
        PRIMERO = new javax.swing.JButton();
        ANTERIOR = new javax.swing.JButton();
        SIGUIENTE = new javax.swing.JButton();
        ULTIMO = new javax.swing.JButton();
        EDITAR = new javax.swing.JButton();
        NUEVO = new javax.swing.JButton();
        CONFIRMAR = new javax.swing.JButton();
        CANCELAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NIF.setEditable(false);
        NIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIFActionPerformed(evt);
            }
        });

        PROVINCIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROVINCIAActionPerformed(evt);
            }
        });

        jLabel1.setText("NIF");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("DIRECCION");

        jLabel4.setText("POBLACION");

        jLabel5.setText("PROVINCIA");

        jLabel6.setText("TELEFONO");

        PRIMERO.setText("PRIMERO");
        PRIMERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRIMEROActionPerformed(evt);
            }
        });

        ANTERIOR.setText("ANTERIOR");
        ANTERIOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANTERIORActionPerformed(evt);
            }
        });

        SIGUIENTE.setText("SIGUIENTE");
        SIGUIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGUIENTEActionPerformed(evt);
            }
        });

        ULTIMO.setText("ULTIMO");
        ULTIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ULTIMOActionPerformed(evt);
            }
        });

        EDITAR.setText("EDITAR");
        EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARActionPerformed(evt);
            }
        });

        NUEVO.setText("NUEVO");
        NUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVOActionPerformed(evt);
            }
        });

        CONFIRMAR.setText("CONFIRMAR");
        CONFIRMAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONFIRMARActionPerformed(evt);
            }
        });

        CANCELAR.setText("CANCELAR");
        CANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addContainerGap(621, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PROVINCIA, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                                        .addComponent(TELEFONO)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NIF, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                                        .addComponent(NOMBRE)
                                        .addComponent(DIRECCION)
                                        .addComponent(POBLACION))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PRIMERO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANTERIOR)
                                .addGap(33, 33, 33)
                                .addComponent(SIGUIENTE)
                                .addGap(18, 18, 18)
                                .addComponent(ULTIMO)
                                .addGap(48, 48, 48)
                                .addComponent(EDITAR)
                                .addGap(30, 30, 30)
                                .addComponent(NUEVO))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(CONFIRMAR)
                        .addGap(119, 119, 119)
                        .addComponent(CANCELAR)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(POBLACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PROVINCIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PRIMERO)
                    .addComponent(ANTERIOR)
                    .addComponent(SIGUIENTE)
                    .addComponent(ULTIMO)
                    .addComponent(EDITAR)
                    .addComponent(NUEVO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CONFIRMAR)
                    .addComponent(CANCELAR))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIFActionPerformed

    private void PROVINCIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROVINCIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PROVINCIAActionPerformed

    private void PRIMEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRIMEROActionPerformed
        try {
            r.first();
            NIF.setText(r.getString("NIF"));
            NOMBRE.setText(r.getString("NOMBRE"));
            DIRECCION.setText(r.getString("DIRECCION"));
            POBLACION.setText(r.getString("POBLACION"));
            PROVINCIA.setText(r.getString("PROVINCIA"));
            TELEFONO.setText(r.getString("TELEFONO"));
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PRIMEROActionPerformed

    private void SIGUIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGUIENTEActionPerformed
        try {
            if (r.next()) {
                NIF.setText(r.getString("NIF"));
                NOMBRE.setText(r.getString("NOMBRE"));
                DIRECCION.setText(r.getString("DIRECCION"));
                POBLACION.setText(r.getString("POBLACION"));
                PROVINCIA.setText(r.getString("PROVINCIA"));
                TELEFONO.setText(r.getString("TELEFONO"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SIGUIENTEActionPerformed

    private void ULTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ULTIMOActionPerformed
        try {
            r.last();
            NIF.setText(r.getString("NIF"));
            NOMBRE.setText(r.getString("NOMBRE"));
            DIRECCION.setText(r.getString("DIRECCION"));
            POBLACION.setText(r.getString("POBLACION"));
            PROVINCIA.setText(r.getString("PROVINCIA"));
            TELEFONO.setText(r.getString("TELEFONO"));
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ULTIMOActionPerformed

    private void ANTERIORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANTERIORActionPerformed
        try {
            if (r.previous()) {
                NIF.setText(r.getString("NIF"));
                NOMBRE.setText(r.getString("NOMBRE"));
                DIRECCION.setText(r.getString("DIRECCION"));
                POBLACION.setText(r.getString("POBLACION"));
                PROVINCIA.setText(r.getString("PROVINCIA"));
                TELEFONO.setText(r.getString("TELEFONO"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ANTERIORActionPerformed

    private void NUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVOActionPerformed
        PRIMERO.setVisible(false);
        ANTERIOR.setVisible(false);
        SIGUIENTE.setVisible(false);
        ULTIMO.setVisible(false);
        NUEVO.setVisible(false);
        EDITAR.setVisible(false);
        CONFIRMAR.setVisible(true);
        CANCELAR.setVisible(true);
        NIF.setEditable(true);
        NIF.setText("");
        NOMBRE.setText("");
        DIRECCION.setText("");
        POBLACION.setText("");
        PROVINCIA.setText("");
        TELEFONO.setText("");

    }//GEN-LAST:event_NUEVOActionPerformed

    private void EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARActionPerformed
        try {
            String vNIF, vNOMBRE, vDIRECCION, vPOBLACION, vPROVINCIA, vTELEFONO;
            vNIF = NIF.getText();
            vNOMBRE = NOMBRE.getText();
            vDIRECCION = DIRECCION.getText();
            vPOBLACION = POBLACION.getText();
            vPROVINCIA = PROVINCIA.getText();
            vTELEFONO = TELEFONO.getText();
            String url = "jdbc:mysql://localhost:3306/sergiooyono";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement s = connection.createStatement();
            String query = "update clientes set NOMBRE='" + vNOMBRE + "', DIRECCION='" + vDIRECCION + "', POBLACION='" + vPOBLACION + "', PROVINCIA='" + vPROVINCIA + "', TELEFONO='" + vTELEFONO + "' WHERE NIF='" + vNIF + "'";
            int resultado = s.executeUpdate(query);
            r.refreshRow();
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_EDITARActionPerformed

    private void CONFIRMARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONFIRMARActionPerformed
        // TODO add your handling code here:
        try {
            String vNIF, vNOMBRE, vDIRECCION, vPOBLACION, vPROVINCIA, vTELEFONO;
            vNIF = NIF.getText();
            vNOMBRE = NOMBRE.getText();
            vDIRECCION = DIRECCION.getText();
            vPOBLACION = POBLACION.getText();
            vPROVINCIA = PROVINCIA.getText();
            vTELEFONO = TELEFONO.getText();
            String url = "jdbc:mysql://localhost:3306/sergiooyono";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String query = "insert into clientes values ('" + vNIF + "', '" + vNOMBRE + "', '" + vDIRECCION + "', '" + vPOBLACION + "', '" + vPROVINCIA + "', '" + vTELEFONO + "')";
            int resultado = s.executeUpdate(query);
            NIF.setEditable(false);
            PRIMERO.setVisible(true);
            ANTERIOR.setVisible(true);
            SIGUIENTE.setVisible(true);
            ULTIMO.setVisible(true);
            NUEVO.setVisible(true);
            EDITAR.setVisible(true);
            CONFIRMAR.setVisible(false);
            CANCELAR.setVisible(false);
            
            s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); //actualizamos una vez se han introducido los valores, lanzando otra vez la consulta
            query = "select* from articulos";
            r = s.executeQuery(query);
            r.last();

        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CONFIRMARActionPerformed

    private void CANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELARActionPerformed
        // TODO add your handling code here:
        try {
            NIF.setEditable(false);
            PRIMERO.setVisible(true);
            ANTERIOR.setVisible(true);
            SIGUIENTE.setVisible(true);
            ULTIMO.setVisible(true);
            NUEVO.setVisible(true);
            EDITAR.setVisible(true);
            CONFIRMAR.setVisible(false);
            CANCELAR.setVisible(false);
            r.refreshRow();
            r.last();
            NIF.setText(r.getString("NIF"));
            NOMBRE.setText(r.getString("NOMBRE"));
            DIRECCION.setText(r.getString("DIRECCION"));
            POBLACION .setText(r.getString("POBLACION"));
            PROVINCIA.setText(r.getString("PROVINCIA"));
            TELEFONO.setText(r.getString("TELEFONO"));
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_CANCELARActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Cliente().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANTERIOR;
    private javax.swing.JButton CANCELAR;
    private javax.swing.JButton CONFIRMAR;
    private javax.swing.JTextField DIRECCION;
    private javax.swing.JButton EDITAR;
    private javax.swing.JTextField NIF;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JButton NUEVO;
    private javax.swing.JTextField POBLACION;
    private javax.swing.JButton PRIMERO;
    private javax.swing.JTextField PROVINCIA;
    private javax.swing.JButton SIGUIENTE;
    private javax.swing.JTextField TELEFONO;
    private javax.swing.JButton ULTIMO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
