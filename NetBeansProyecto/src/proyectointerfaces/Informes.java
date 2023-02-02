/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectointerfaces;

import java.sql.Connection;
import java.sql.DriverManager;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.view.JasperViewer;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import static proyectointerfaces.InicioSesion.IdUsuario;

/**
 *
 * @author andres
 */
public class Informes extends javax.swing.JFrame {

    /**
     * Creates new form AgendaPrincipal
     */
    public Informes() {
        initComponents();
        BotonPaginaAgenda.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        jButton2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        BotonPaginaCompra.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        BotonPaginaCartera.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        setTitle("Mi Agenda - Agenda");

        Statement st_;
        ResultSet rs_;

        try {
            Connection con = Conexion.getConexion();
            st_ = con.createStatement();

            //TablaContactos.setModel(model);
            // JOptionPane.showMessageDialog(null, "El alumno se ha registrado correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "usuario ya exitente");
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

        jFrame1 = new javax.swing.JFrame();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Navegacion = new javax.swing.JPopupMenu();
        irAgenda = new javax.swing.JMenuItem();
        irBlocNotas = new javax.swing.JMenuItem();
        irListaCompra = new javax.swing.JMenuItem();
        irCartera = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        BotonPaginaAgenda = new javax.swing.JButton();
        BotonPaginaCompra = new javax.swing.JButton();
        BotonPaginaCartera = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("Crear");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Genero");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(279, 279, 279))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(335, 335, 335)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(336, 336, 336)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(95, 95, 95))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        irAgenda.setText("Ir a Agenda");
        irAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irAgendaActionPerformed(evt);
            }
        });
        Navegacion.add(irAgenda);

        irBlocNotas.setText("Ir a Bloc de Notas");
        irBlocNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irBlocNotasActionPerformed(evt);
            }
        });
        Navegacion.add(irBlocNotas);

        irListaCompra.setText("Ir a Lista Compra");
        irListaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irListaCompraActionPerformed(evt);
            }
        });
        Navegacion.add(irListaCompra);

        irCartera.setText("Ir a Cartera");
        irCartera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irCarteraActionPerformed(evt);
            }
        });
        Navegacion.add(irCartera);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(231, 246, 242));

        jPanel1.setBackground(new java.awt.Color(57, 91, 100));

        BotonPaginaAgenda.setBackground(new java.awt.Color(57, 91, 100));
        BotonPaginaAgenda.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        BotonPaginaAgenda.setText("Agenda");
        BotonPaginaAgenda.setToolTipText("Ventana Agenda");
        BotonPaginaAgenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonPaginaAgenda.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        BotonPaginaAgenda.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BotonPaginaAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPaginaAgendaActionPerformed(evt);
            }
        });

        BotonPaginaCompra.setBackground(new java.awt.Color(57, 91, 100));
        BotonPaginaCompra.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        BotonPaginaCompra.setText("Lista Compra");
        BotonPaginaCompra.setToolTipText("Ventana Lista Compra");
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
        BotonPaginaCartera.setToolTipText("Ventana Cartera");
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
        jButton2.setToolTipText("Ventana Bloc de Notas");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("*");
        jButton1.setToolTipText("Ventana Actual");
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
                .addComponent(BotonPaginaAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(BotonPaginaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(BotonPaginaCartera, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonPaginaCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addComponent(BotonPaginaAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonPaginaCartera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 196, 255));
        jPanel2.setComponentPopupMenu(Navegacion);

        jButton3.setText("INFORME MEDIA DE CONTACTOS POR USUARIOS");
        jButton3.setToolTipText("Click para generar Informe de media de Contactos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("INFORME TRANSACCIONES DE LA CUENTA");
        jButton4.setToolTipText("Click para generar infore de transacciones de la cuenta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(507, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1096, 740));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPaginaAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPaginaAgendaActionPerformed
        AgendaPrincipal ag = new AgendaPrincipal();
        ag.setVisible(true);
        ag.setLocationRelativeTo(null);
        ag.setSize(1080, 720);
        dispose();    }//GEN-LAST:event_BotonPaginaAgendaActionPerformed

    private void BotonPaginaCarteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPaginaCarteraActionPerformed


    }//GEN-LAST:event_BotonPaginaCarteraActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked


    }//GEN-LAST:event_jButton6MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        rootPane.repaint();
        System.out.println("refresh");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked

    }//GEN-LAST:event_jMenuItem1MouseClicked
    /// ABRIR AGENDA    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Informes ap = new Informes();
        ap.setVisible(true);
        ap.setLocationRelativeTo(null);
        ap.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    //ABRIR LISTA COMPRA
    private void BotonPaginaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPaginaCompraMouseClicked
        // TODO add your handling code here:
        ListaCompra lc = new ListaCompra();
        lc.setVisible(true);
        lc.setLocationRelativeTo(null);
        lc.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_BotonPaginaCompraMouseClicked
    //abrir cartera
    private void BotonPaginaCarteraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPaginaCarteraMouseClicked
        // TODO add your handling code here:
        Cartera cart = new Cartera();
        cart.setVisible(true);
        cart.setLocationRelativeTo(null);
        cart.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_BotonPaginaCarteraMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BlogNotas bn = new BlogNotas();
        bn.setVisible(true);
        bn.setLocationRelativeTo(null);
        bn.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BotonPaginaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPaginaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPaginaCompraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Connection con = Conexion.getConexion();
            System.out.println("0");
            String reportPath = "C:\\ProyectoInterfaces\\Informes\\Informe1.jasper";
            System.out.println("1");
            //JasperReport jr = JasperCompileManager.compileReport(reportPath);
            System.out.println("2");
            JasperPrint jp = JasperFillManager.fillReport(reportPath, null, con);
            System.out.println("3");
            JasperViewer.viewReport(jp, false);
            System.out.println("4");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Connection con = Conexion.getConexion();
            System.out.println("0");
            String reportPath = "C:\\ProyectoInterfaces\\Informes\\Informe3.jasper";
            System.out.println("1");
            //JasperReport jr = JasperCompileManager.compileReport(reportPath);
            System.out.println("2");
            JasperPrint jp = JasperFillManager.fillReport(reportPath, null, con);
            System.out.println("3");
            JasperViewer.viewReport(jp, false);
            System.out.println("4");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void irAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irAgendaActionPerformed
        AgendaPrincipal ag = new AgendaPrincipal();
        ag.setVisible(true);
        ag.setLocationRelativeTo(null);
        ag.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_irAgendaActionPerformed

    private void irBlocNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irBlocNotasActionPerformed
        BlogNotas bn = new BlogNotas();
        bn.setVisible(true);
        bn.setLocationRelativeTo(null);
        bn.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_irBlocNotasActionPerformed

    private void irListaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irListaCompraActionPerformed
        ListaCompra lc = new ListaCompra();
        lc.setVisible(true);
        lc.setLocationRelativeTo(null);
        lc.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_irListaCompraActionPerformed

    private void irCarteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irCarteraActionPerformed
        // TODO add your handling code here:
        Cartera cart = new Cartera();
        cart.setVisible(true);
        cart.setLocationRelativeTo(null);
        cart.setSize(1080, 720);
        dispose();
    }//GEN-LAST:event_irCarteraActionPerformed

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
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        System.out.println("entra");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informes().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPaginaAgenda;
    private javax.swing.JButton BotonPaginaCartera;
    private javax.swing.JButton BotonPaginaCompra;
    private javax.swing.JPopupMenu Navegacion;
    private javax.swing.JMenuItem irAgenda;
    private javax.swing.JMenuItem irBlocNotas;
    private javax.swing.JMenuItem irCartera;
    private javax.swing.JMenuItem irListaCompra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
