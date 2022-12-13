/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointerfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/**
 *
 * @author LucasMorenoZabala
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
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

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        textFieldNombre = new java.awt.TextField();
        label3 = new java.awt.Label();
        textFieldApellidos = new java.awt.TextField();
        label4 = new java.awt.Label();
        label6 = new java.awt.Label();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        label7 = new java.awt.Label();
        jPasswordFieldConfirmar = new javax.swing.JPasswordField();
        textFieldTelefono = new java.awt.TextField();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        label10 = new java.awt.Label();
        textFieldMail = new java.awt.TextField();
        label11 = new java.awt.Label();
        textFieldNombreUsuario = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setSize(new java.awt.Dimension(1080, 720));

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("¡Únete a nosotros!");

        label2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        label2.setText("Rellena los campos con tus datos personales");

        textFieldNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textFieldNombre.setText("Nombre...");
        textFieldNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldNombreMouseClicked(evt);
            }
        });
        textFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label3.setText("Nombre");

        textFieldApellidos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textFieldApellidos.setText("Apellidos...");
        textFieldApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldApellidosMouseClicked(evt);
            }
        });
        textFieldApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldApellidosActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label4.setText("Apellidos");

        label6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label6.setText("Contraseña");

        jPasswordFieldContraseña.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jPasswordFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldContraseñaActionPerformed(evt);
            }
        });

        label7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label7.setText("Confirmar Contraseña");

        jPasswordFieldConfirmar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N

        textFieldTelefono.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textFieldTelefono.setText("Teléfono...");
        textFieldTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldTelefonoMouseClicked(evt);
            }
        });

        label8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label8.setText("Teléfono");

        label9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label9.setText("Género");

        jComboBox1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jButton1.setText("Registrarse");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label10.setText("Email");

        textFieldMail.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textFieldMail.setText("Email...");
        textFieldMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldMailMouseClicked(evt);
            }
        });
        textFieldMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldMailActionPerformed(evt);
            }
        });

        label11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label11.setText("Nombre Usuario");

        textFieldNombreUsuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textFieldNombreUsuario.setText("Nombre Usuario...");
        textFieldNombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldNombreUsuarioMouseClicked(evt);
            }
        });
        textFieldNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNombreUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldNombreUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 131, Short.MAX_VALUE))
                            .addComponent(label8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldConfirmar)
                            .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(10, 10, 10))
        );

        label1.getAccessibleContext().setAccessibleName("jlabelTituloRegistro");
        label2.getAccessibleContext().setAccessibleName("jLabelRellena");
        textFieldNombre.getAccessibleContext().setAccessibleName("jTextFieldNombre");
        label3.getAccessibleContext().setAccessibleName("jLabelNombre");
        textFieldApellidos.getAccessibleContext().setAccessibleName("jTextFIeldApellidos");
        label4.getAccessibleContext().setAccessibleName("jLabelApellidos");
        label6.getAccessibleContext().setAccessibleName("jLabelContraseña");
        label7.getAccessibleContext().setAccessibleName("jLabelConfirmarContraseña");
        textFieldTelefono.getAccessibleContext().setAccessibleName("jTextFieldTelefono");
        label8.getAccessibleContext().setAccessibleName("jLabelTelefono");
        label9.getAccessibleContext().setAccessibleName("jLabelSexo");
        jComboBox1.getAccessibleContext().setAccessibleName("jComboBoxSexo");
        jButton1.getAccessibleContext().setAccessibleName("jButtonInicioSesion");

        getAccessibleContext().setAccessibleName("jFrameRegistro");

        setSize(new java.awt.Dimension(1096, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreActionPerformed

    private void textFieldApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldApellidosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked


 
		Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
		Pattern pat = Pattern.compile("^[A-Z][-a-zA-Z]+$");
                Pattern pattern2 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}_]:;',?/*~$^+=<>]).{8,50}$");
                
                
                Matcher mail = pattern.matcher(textFieldMail.getText());
                Matcher nombre = pat.matcher(textFieldNombre.getText());
                Matcher apellidos = pat.matcher(textFieldApellidos.getText());
                Matcher pass = pattern2.matcher(jPasswordFieldContraseña.getText());
                
                 
                

if(mail.matches()&& pass.matches() && nombre.matches() && apellidos.matches()&& pass.matches()&&jPasswordFieldContraseña.getText().equals(jPasswordFieldConfirmar.getText())){
      InicioSesion is = new InicioSesion();
      
      try{
          
          Connection con = Conexion.getConexion();
          PreparedStatement ps = con.prepareStatement("INSERT INTO Usuarios (NombreUsuario,Nombre,Apellidos,Email,Telefono,Genero,password) VALUES (?,?,?,?,?,?,?)");
          ps.setString(1,textFieldNombreUsuario.getText());
          ps.setString(2, textFieldNombre.getText());
          ps.setString(3, textFieldApellidos.getText());
          ps.setString(4, textFieldMail.getText());
          ps.setInt(5, Integer.parseInt(textFieldTelefono.getText()));
          ps.setString(6, jComboBox1.getItemAt(jComboBox1.getSelectedIndex()));
          ps.setString(7, jPasswordFieldContraseña.getPassword().toString());
          ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El alumno se ha registrado correctamente");
                  
          
             	}catch(SQLException e) {
		 JOptionPane.showMessageDialog(null, "fallo1");
		}catch(ClassNotFoundException e) {
                 System.out.println("fallo2");
		}catch(Exception e) {
		
		}
      
                                is.setVisible(true);
                                is.setSize(1080,720);
                                is.setLocationRelativeTo(null);
                                dispose();
}else
      JOptionPane.showMessageDialog(null, "mail:"+mail.matches()+" pass:"+pass.matches()+" nombre:"+nombre.matches()+" apellido:"+apellidos.matches()+textFieldMail.getText());
{
  
}

    
        
    }//GEN-LAST:event_jButton1MouseClicked
 
    
    public static boolean validarNumeros(String datos){
        return datos.matches("[0-9]");
    }
    
 
    
    
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void textFieldMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldMailActionPerformed

    private void textFieldNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNombreUsuarioActionPerformed

    private void textFieldNombreUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNombreUsuarioMouseClicked
       if(textFieldNombreUsuario.getText().equals("Nombre Usuario...")){
           textFieldNombreUsuario.setText("");
       }
    }//GEN-LAST:event_textFieldNombreUsuarioMouseClicked

    private void textFieldNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNombreMouseClicked
        if(textFieldNombre.getText().equals("Nombre...")){
           textFieldNombre.setText("");
       }
    }//GEN-LAST:event_textFieldNombreMouseClicked

    private void textFieldApellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldApellidosMouseClicked
       if(textFieldApellidos.getText().equals("Apellidos...")){
           textFieldApellidos.setText("");
       }
    }//GEN-LAST:event_textFieldApellidosMouseClicked

    private void textFieldMailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldMailMouseClicked
        if(textFieldMail.getText().equals("Email...")){
           textFieldMail.setText("");
       }
    }//GEN-LAST:event_textFieldMailMouseClicked

    private void textFieldTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldTelefonoMouseClicked
        if(textFieldTelefono.getText().equals("Teléfono...")){
           textFieldTelefono.setText("");
       }
    }//GEN-LAST:event_textFieldTelefonoMouseClicked

    private void jPasswordFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPasswordField jPasswordFieldConfirmar;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.TextField textFieldApellidos;
    private java.awt.TextField textFieldMail;
    private java.awt.TextField textFieldNombre;
    private java.awt.TextField textFieldNombreUsuario;
    private java.awt.TextField textFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
