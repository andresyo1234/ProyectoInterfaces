/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointerfaces;

import static proyectointerfaces.Cartera.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class ayadirDinero extends javax.swing.JFrame {

    /**
     * Creates new form ayadirDinero
     */
    public ayadirDinero() {
        initComponents();
        setTitle("Mi Agenda - Mi Saldo");
        setLocationRelativeTo(null);
        listModel.clear();
        listaRegistro.setModel(listModel);

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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dineroSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 196, 255));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setText("Añadir Saldo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton2.setText("Quitar Saldo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton3.setText("<");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        dineroSpinner.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dineroSpinner)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dineroSpinner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:

        dispose();

    }//GEN-LAST:event_jButton3MouseClicked
    //AYADIR DINERO 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Statement st_;
        Connection connection_;
        /*try {
            connection_ = Conexion.getConexion();
            st_ = connection_.createStatement();

            String nombre, apellido, email, genero;
            int idusuario, telefono;
            System.out.println(InicioSesion.IdUsuario);
            nombre = inputNombre.getText();
            apellido = inputApellido.getText();
            email = inputEmail.getText();
            genero = comboBoxGenero.getItemAt(comboBoxGenero.getSelectedIndex());
            idusuario = InicioSesion.IdUsuario;
            telefono = Integer.parseInt((inputTelefono.getText()));

            System.out.println("adios");
           
                PreparedStatement ps = connection_.prepareStatement("INSERT INTO Contactos (Id_usuario,Nombre,Apellidos,Email,Telefono,Genero) VALUES (?,?,?,?,?,?)");
                ps.setInt(1, idusuario);
                ps.setString(2, nombre);
                ps.setString(3, apellido);
                ps.setString(4, email);
                ps.setInt(5, telefono);
                ps.setString(6, genero);
                ps.executeUpdate();
            System.out.println("hola");

            JOptionPane.showMessageDialog(null, "Contacto añadido");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "fallo1");
        } catch (ClassNotFoundException e) {
            System.out.println("fallo2");
        } catch (Exception e) {
            System.out.println("fallo3");
        }

        AgendaPrincipal ag = new AgendaPrincipal();
        ag.setVisible(true);
        dispose();*/
        
        
        sumarCalcular();
        if (dineroFinal < 0) {
            textoDinero.setForeground(Color.red);
        } else {
            textoDinero.setForeground(Color.BLACK);
        }

        for (int i = 0; i < listaCartera.size(); i++) {
            //Añadir cada elemento del ArrayList en el modelo de la lista
            listModel.add(i, listaCartera.get(i));
        }
        listaRegistro.setModel(listModel);

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        restarCalcular();

        if (dineroFinal < 0) {
            textoDinero.setForeground(Color.red);
        } else {
            textoDinero.setForeground(Color.BLACK);
        }
        for (int i = 0; i < listaCartera.size(); i++) {
            //Añadir cada elemento del ArrayList en el modelo de la lista
            listModel.add(i, listaCartera.get(i));
        }
        listaRegistro.setModel(listModel);
        dispose();
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
            java.util.logging.Logger.getLogger(ayadirDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ayadirDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ayadirDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ayadirDinero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ayadirDinero().setVisible(true);
            }
        });
    }

    //sumar dinero
    public static void sumarCalcular() {
        dineroModificar = (Integer) dineroSpinner.getValue();
        dineroFinal = dineroModificar + dineroFinal;

        textoDinero.setText(String.valueOf(dineroFinal) + "€");
        
        //NO FUNCIONA ES EL FORMATEO DE LAS HORAS
        //fecha.getTime();
        //texto = formateador.format((TemporalAccessor) fecha) + ", AÑADIDO: " + String.valueOf(dineroModificar) + "€";
        
        texto = "AÑADIDO: " + String.valueOf(dineroModificar) + "€";
        listaCartera.add(texto);
    }

    public static void restarCalcular() {
        dineroModificar = (Integer) dineroSpinner.getValue();
        dineroFinal = dineroFinal - dineroModificar;

        textoDinero.setText(String.valueOf(dineroFinal) + "€");
        
        //NO FUNCIONA ES EL FORMATEO DE LAS HORAS
        //fecha.getTime();
        //texto = formateador.format((TemporalAccessor) fecha) + ", RETIRADO: " + String.valueOf(dineroModificar) + "€";
        
        texto = "RETIRADO: " + String.valueOf(dineroModificar) + "€";
        listaCartera.add(texto);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JSpinner dineroSpinner;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
