/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointerfaces;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author LucasMorenoZabala
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
        setTitle("Mi Agenda - Inicio");
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
        TituloInicioSesion = new java.awt.Label();
        inputUsuario = new javax.swing.JTextField();
        BotonInicioSesion = new javax.swing.JButton();
        BotonRegistro = new javax.swing.JButton();
        InputContrasenya = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1080, 720));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 196, 255));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });

        TituloInicioSesion.setAlignment(java.awt.Label.CENTER);
        TituloInicioSesion.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        TituloInicioSesion.setText("MI AGENDA");

        inputUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputUsuario.setText("Usuario...");
        inputUsuario.setToolTipText("Introduce tu nombre de Usuario...");
        inputUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsuarioActionPerformed(evt);
            }
        });
        inputUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputUsuarioKeyTyped(evt);
            }
        });

        BotonInicioSesion.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        BotonInicioSesion.setText("Inicio Sesión");
        BotonInicioSesion.setToolTipText("Click para Iniciar Sesión...");
        BotonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioSesionActionPerformed(evt);
            }
        });

        BotonRegistro.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        BotonRegistro.setText("Registro");
        BotonRegistro.setToolTipText("Click para Registrarse...");
        BotonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistroMouseClicked(evt);
            }
        });
        BotonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroActionPerformed(evt);
            }
        });

        InputContrasenya.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InputContrasenya.setToolTipText("Introduce tu Contraseña...");
        InputContrasenya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InputContrasenyaKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Contraseña:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Usuario:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(689, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InputContrasenya)
                            .addComponent(TituloInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                            .addComponent(inputUsuario)
                            .addComponent(BotonInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(326, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(TituloInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputContrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(BotonInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(BotonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        TituloInicioSesion.getAccessibleContext().setAccessibleName("jLabelTituloInicioSesion");
        inputUsuario.getAccessibleContext().setAccessibleName("jTextFieldUsuario");
        BotonInicioSesion.getAccessibleContext().setAccessibleName("jButtonInicioSesion");
        BotonRegistro.getAccessibleContext().setAccessibleName("jButtonRegistro");
        BotonRegistro.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(1096, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistroActionPerformed

    private void BotonRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistroMouseClicked
        Registro r = new Registro();
        r.setVisible(true);

        dispose();
    }//GEN-LAST:event_BotonRegistroMouseClicked

    public static int IdUsuario;
    private void InputContrasenyaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputContrasenyaKeyTyped
         char teclaPresionada = evt.getKeyChar();
        
        if (teclaPresionada == KeyEvent.VK_ENTER) {
                    
            BotonInicioSesion.doClick(100);
        }
        
    }//GEN-LAST:event_InputContrasenyaKeyTyped

    private void BotonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioSesionActionPerformed
       String nombreUsuario, psw = null;
        

        Statement st_;
        ResultSet rs_;

        try {

            Connection con = Conexion.getConexion();
            st_ = con.createStatement();

            nombreUsuario = inputUsuario.getText();

            rs_ = st_.executeQuery("select * from Usuarios where NombreUsuario = '" + nombreUsuario + "'");
           

            while (rs_.next()) {
                IdUsuario = rs_.getInt(1);
                psw = rs_.getString(8);
            }
            System.out.println("asd: " + IdUsuario);

            
            
            if (IdUsuario != 0) {

                rs_.next();
                if (new String(InputContrasenya.getPassword()).equals(psw)) {
                    AgendaPrincipal ag = new AgendaPrincipal();
                    ag.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe");
            }

            // JOptionPane.showMessageDialog(null, "El alumno se ha registrado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "usuario ya exitente");
        } catch (ClassNotFoundException e) {
            System.out.println("fallo2");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_BotonInicioSesionActionPerformed

    private void inputUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputUsuarioKeyTyped
        char teclaPresionada = evt.getKeyChar();
        
        if (teclaPresionada == KeyEvent.VK_ENTER) {
                    
            BotonInicioSesion.doClick(100);
        }
        
    }//GEN-LAST:event_inputUsuarioKeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        char teclaPresionada = evt.getKeyChar();
        
        if (teclaPresionada == KeyEvent.VK_ENTER) {
                    
            BotonInicioSesion.doClick(100);
        }
    }//GEN-LAST:event_formKeyTyped

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
        char teclaPresionada = evt.getKeyChar();
        
        if (teclaPresionada == KeyEvent.VK_ENTER) {
                    
            BotonInicioSesion.doClick(100);
        }
    }//GEN-LAST:event_jPanel1KeyTyped

    private void inputUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsuarioActionPerformed
        if (inputUsuario.getText() == "Usuario...") {
            inputUsuario.setText("");
        }
    }//GEN-LAST:event_inputUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInicioSesion;
    private javax.swing.JButton BotonRegistro;
    private javax.swing.JPasswordField InputContrasenya;
    private java.awt.Label TituloInicioSesion;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
