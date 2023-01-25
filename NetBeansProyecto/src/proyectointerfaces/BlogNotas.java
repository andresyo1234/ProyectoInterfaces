/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointerfaces;

import static proyectointerfaces.NuevaNota.txtArea;
import javax.swing.DefaultListModel;

import static proyectointerfaces.NuevaNota.txtTitulo;
import java.util.ArrayList;
import java.sql.*;
import java.sql.Statement;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static proyectointerfaces.AgendaPrincipal.TablaContactos;




/**
 *
 * @author AndresRoldanGonzalez
 */
public class BlogNotas extends javax.swing.JFrame {
   
    
    int idusuario = InicioSesion.IdUsuario;
    
     DefaultListModel modelo = new DefaultListModel();
    

    /**
     * Creates new form BlogNotas
     */
    public BlogNotas() {
           initComponents();
           
         Statement st_;
        ResultSet rs_;
        try {
            Connection con = Conexion.getConexion();
            st_ = con.createStatement();
            rs_ = st_.executeQuery("select * from Notas where Id_usuario = " + idusuario);
            
            while (rs_.next()) {
               modelo.addElement(rs_.getString("Titulo"));
                
            }
            Notas.setModel(modelo);
           
            rs_.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "usuario ya exitente");
        } catch (ClassNotFoundException e) {
            System.out.println("fallo2");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        
        
        
     
        setTitle("Mi Agenda - Bloc de Notas");
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
        BotonPaginaAgenda1 = new javax.swing.JButton();
        BotonPaginaCompra = new javax.swing.JButton();
        BotonPaginaCartera = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Notas = new javax.swing.JList<>();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAbrirNota = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 91, 100));

        BotonPaginaAgenda1.setBackground(new java.awt.Color(57, 91, 100));
        BotonPaginaAgenda1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        BotonPaginaAgenda1.setText("Agenda");
        BotonPaginaAgenda1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonPaginaAgenda1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BotonPaginaAgenda1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BotonPaginaAgenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPaginaAgenda1ActionPerformed(evt);
            }
        });

        BotonPaginaCompra.setBackground(new java.awt.Color(57, 91, 100));
        BotonPaginaCompra.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        BotonPaginaCompra.setText("Lista Compra");
        BotonPaginaCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonPaginaCompra.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BotonPaginaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPaginaCompraMouseClicked(evt);
            }
        });
        BotonPaginaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPaginaCompraActionPerformed(evt);
            }
        });

        BotonPaginaCartera.setBackground(new java.awt.Color(57, 91, 100));
        BotonPaginaCartera.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        BotonPaginaCartera.setText("Cartera");
        BotonPaginaCartera.setAlignmentY(0.0F);
        BotonPaginaCartera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonPaginaCartera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonPaginaCartera.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BotonPaginaCartera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonPaginaCartera.setIconTextGap(0);
        BotonPaginaCartera.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BotonPaginaCartera.setRequestFocusEnabled(false);
        BotonPaginaCartera.setRolloverEnabled(false);
        BotonPaginaCartera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPaginaCarteraMouseClicked(evt);
            }
        });
        BotonPaginaCartera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPaginaCarteraActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(57, 91, 100));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton2.setText("Bloc de Notas");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectointerfaces/imagenes/PNGENGRANAJE.png"))); // NOI18N
        jButton1.setToolTipText("");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BotonPaginaAgenda1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(BotonPaginaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(BotonPaginaCartera, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonPaginaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addComponent(BotonPaginaAgenda1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonPaginaCartera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 196, 255));

        Notas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Notas.setModel(new DefaultListModel ());
        jScrollPane1.setViewportView(Notas);

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnAgregar.setText("Agregar Nota");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnEliminar.setText("Eliminar Nota");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAbrirNota.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnAbrirNota.setText("Abrir Nota");
        btnAbrirNota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirNotaMouseClicked(evt);
            }
        });
        btnAbrirNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(btnAbrirNota, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap(245, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAbrirNota, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(653, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        NuevaNota nn = new NuevaNota();
        nn.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       // eliminarDato();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAbrirNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirNotaActionPerformed

        EditarNota en = new EditarNota();
        en.setVisible(true);
    }//GEN-LAST:event_btnAbrirNotaActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
     
        
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAbrirNotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirNotaMouseClicked

    }//GEN-LAST:event_btnAbrirNotaMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
         Statement st_;
        ResultSet rs_;

        try {
            Connection con = Conexion.getConexion();
            st_ = con.createStatement();

            rs_ = st_.executeQuery("select * from Notas where Id_usuario = " + idusuario);

            int[] rows = Notas.getSelectedIndices();

            if (!(rows.length > 1)) {

                while (rs_.getRow() <= rows[0]) {
                    rs_.next();
                    System.out.println(rs_.getRow());

                }
                st_.executeUpdate("Delete from Notas where IdNota=" + rs_.getString("IdNota"));
                dispose();
                  BlogNotas bn = new BlogNotas();
                bn.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione unicamente 1 fila ");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "fallo1");
        } catch (ClassNotFoundException e) {
            System.out.println("fallo2");
        } catch (Exception e) {
            System.out.println("fallo3");

        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void BotonPaginaAgenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPaginaAgenda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPaginaAgenda1ActionPerformed

    private void BotonPaginaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPaginaCompraMouseClicked
        // TODO add your handling code here:
        ListaCompra lc = new ListaCompra();
        lc.setVisible(true);
        lc.setLocationRelativeTo(null);
        lc.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_BotonPaginaCompraMouseClicked

    private void BotonPaginaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPaginaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPaginaCompraActionPerformed

    private void BotonPaginaCarteraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPaginaCarteraMouseClicked
        // TODO add your handling code here:
        Cartera cart = new Cartera();
        cart.setVisible(true);
        cart.setLocationRelativeTo(null);
        cart.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_BotonPaginaCarteraMouseClicked

    private void BotonPaginaCarteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPaginaCarteraActionPerformed

    }//GEN-LAST:event_BotonPaginaCarteraActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BlogNotas bn = new BlogNotas();
        bn.setVisible(true);
        bn.setLocationRelativeTo(null);
        bn.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Informes in = new Informes();
        in.setVisible(true);
        in.setLocationRelativeTo(null);
        in.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(BlogNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlogNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlogNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlogNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlogNotas().setVisible(true);
            }
        });
    }


  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPaginaAgenda1;
    private javax.swing.JButton BotonPaginaCartera;
    private javax.swing.JButton BotonPaginaCompra;
    public static javax.swing.JList<String> Notas;
    private javax.swing.JButton btnAbrirNota;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
