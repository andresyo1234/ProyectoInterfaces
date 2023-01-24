/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointerfaces;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static proyectointerfaces.InicioSesion.IdUsuario;


/**
 *
 * @author AndresRoldanGonzalez
 */
public class Cartera extends javax.swing.JFrame {

    /**
     * Creates new form BlogNotas
     */
    public static String tipoOperacion;
    public static int operacion, saldo;
    public Cartera() {
        initComponents();
        limpiarLista();
        setTitle("Mi Agenda - Cartera");
        
        
        
        Statement st_;
        ResultSet rs_;
        Connection connection_;
        try {
            connection_ = Conexion.getConexion();
            st_ = connection_.createStatement();
            
            rs_ = st_.executeQuery("select top 1 saldo from Tarjetas where Id_usuario=" + IdUsuario + " order by idTransaccion desc");
            
            if(rs_.next()){
                saldo = rs_.getInt(1);
            
            }else{
                saldo = 0;
            }
            
            textoDinero.setText(String.valueOf(saldo) + "€");
           
            System.out.println("Saldo: " + saldo);
           
             
            System.out.println("hola");

            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "fallo1");
        } catch (ClassNotFoundException e) {
            System.out.println("fallo2");
        } catch (Exception e) {
            System.out.println("fallo3");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        BotonPaginaAgenda7 = new javax.swing.JButton();
        BotonPaginaCompra7 = new javax.swing.JButton();
        BotonPaginaCartera7 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaRegistro = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        textoDinero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel10.setBackground(new java.awt.Color(57, 91, 100));

        BotonPaginaAgenda7.setBackground(new java.awt.Color(57, 91, 100));
        BotonPaginaAgenda7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        BotonPaginaAgenda7.setText("Agenda");
        BotonPaginaAgenda7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonPaginaAgenda7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BotonPaginaAgenda7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BotonPaginaAgenda7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPaginaAgenda7ActionPerformed(evt);
            }
        });

        BotonPaginaCompra7.setBackground(new java.awt.Color(57, 91, 100));
        BotonPaginaCompra7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        BotonPaginaCompra7.setText("Lista Compra");
        BotonPaginaCompra7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonPaginaCompra7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BotonPaginaCompra7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPaginaCompra7MouseClicked(evt);
            }
        });
        BotonPaginaCompra7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPaginaCompra7ActionPerformed(evt);
            }
        });

        BotonPaginaCartera7.setBackground(new java.awt.Color(57, 91, 100));
        BotonPaginaCartera7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        BotonPaginaCartera7.setText("Cartera");
        BotonPaginaCartera7.setAlignmentY(0.0F);
        BotonPaginaCartera7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonPaginaCartera7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonPaginaCartera7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BotonPaginaCartera7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonPaginaCartera7.setIconTextGap(0);
        BotonPaginaCartera7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BotonPaginaCartera7.setRequestFocusEnabled(false);
        BotonPaginaCartera7.setRolloverEnabled(false);
        BotonPaginaCartera7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPaginaCartera7MouseClicked(evt);
            }
        });
        BotonPaginaCartera7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPaginaCartera7ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(57, 91, 100));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton18.setText("Bloc de Notas");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("*");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(BotonPaginaAgenda7, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(BotonPaginaCompra7, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(BotonPaginaCartera7, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonPaginaCompra7, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addComponent(BotonPaginaAgenda7, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonPaginaCartera7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(153, 196, 255));

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton10.setText("Modificar Saldo");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        listaRegistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jScrollPane1.setViewportView(listaRegistro);

        jPanel2.setBackground(new java.awt.Color(153, 196, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Saldo Actual de:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 196, 255));

        textoDinero.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        textoDinero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoDinero.setText("0€");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(textoDinero, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addGap(89, 89, 89))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(textoDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(653, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
     
        ayadirDinero ad = new ayadirDinero();
        ad.setVisible(true);
        ad.setSize(477, 204);
        ad.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void BotonPaginaAgenda7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPaginaAgenda7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPaginaAgenda7ActionPerformed

    private void BotonPaginaCompra7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPaginaCompra7MouseClicked
        // TODO add your handling code here:
        ListaCompra lc = new ListaCompra();
        lc.setVisible(true);
        lc.setLocationRelativeTo(null);
        lc.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_BotonPaginaCompra7MouseClicked

    private void BotonPaginaCompra7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPaginaCompra7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPaginaCompra7ActionPerformed

    private void BotonPaginaCartera7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPaginaCartera7MouseClicked
        // TODO add your handling code here:
        Cartera cart = new Cartera();
        cart.setVisible(true);
        cart.setLocationRelativeTo(null);
        cart.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_BotonPaginaCartera7MouseClicked

    private void BotonPaginaCartera7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPaginaCartera7ActionPerformed

    }//GEN-LAST:event_BotonPaginaCartera7ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        BlogNotas bn = new BlogNotas();
        bn.setVisible(true);
        bn.setLocationRelativeTo(null);
        bn.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        // TODO add your handling code here:
        Informes in = new Informes();
        in.setVisible(true);
        in.setLocationRelativeTo(null);
        in.setSize(1080, 720);
        dispose();    }//GEN-LAST:event_jButton19MouseClicked

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
            java.util.logging.Logger.getLogger(Cartera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cartera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cartera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cartera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cartera().setVisible(true);
            }
        });
        
        
       
        
        
    }
    
    public DefaultListModel limpiarLista() {
        DefaultListModel modelo = new DefaultListModel();
        listaRegistro.setModel(modelo);
        return modelo;
    }
    
    public static int dineroFinal = 0;
    public static int dineroModificar = 0;
    public static String texto = "";
    public static Date fecha = new Date();
    public static String formato = "yyyy-MM-dd HH:mm:ss";
    public static DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
    public static DefaultListModel listModel = new DefaultListModel();
    public static ArrayList listaCartera = new ArrayList();
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPaginaAgenda7;
    private javax.swing.JButton BotonPaginaCartera7;
    private javax.swing.JButton BotonPaginaCompra7;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JList<String> listaRegistro;
    public static javax.swing.JLabel textoDinero;
    // End of variables declaration//GEN-END:variables
}
