package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;

public class Login extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	public Login() {
		
		//COPIAR SIEMPRE DE AQUI HASTA LA LINEA
		
			        setVisible(true);
			        
					//setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/Ilustracion_sin_titulo_2.png")));
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					setBounds(100, 100, 800, 500);
					setResizable(false);
					setTitle("Aplicacion Multitarea - Grupo 5");
			
			        setLocationRelativeTo(null);
        
        
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//HASTA AQUI 
		
		JPanel botonRegistro = new JPanel();
		botonRegistro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonRegistro.addMouseListener(new MouseAdapter() {
			@Override
			
			//Evento para cuando el raton pase por encima del panel de Pedir Cita, le de un feedback al usuario y cambie de color
			public void mouseEntered(MouseEvent e) {
				botonRegistro.setBackground(new Color(42,159,194));
							
			}
			@Override
			//Mismo evento para cuando deje de estar el raton encima vuelva al color original
			public void mouseExited(MouseEvent e) {
				botonRegistro.setBackground(new Color(132,192,199));
					
			}
			@Override
			public void mousePressed(MouseEvent e) {	
				//Creo un objeto de tipo pacientePedirCita, despues lo hago visible y con dispose() cierro el jFrame actual.
				Registro reg = new Registro();
				reg.setVisible(true);				
				dispose();
				
			}
		});
		botonRegistro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonRegistro.setBackground(new Color(132,192,199));
		botonRegistro.setForeground(Color.WHITE);
		botonRegistro.setBounds(315, 367, 123, 41);
		contentPane.add(botonRegistro);
		
		JLabel textoRegistro = new JLabel("Registro");
		textoRegistro.setBorder(null);
		botonRegistro.add(textoRegistro);
		textoRegistro.setFont(new Font("Segoe UI", Font.BOLD, 20));
		
		JLabel textoTitulo = new JLabel("Bienvenido");
		textoTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		textoTitulo.setFont(new Font("Segoe UI", Font.BOLD, 35));
		textoTitulo.setBounds(270, 110, 249, 54);
		contentPane.add(textoTitulo);
		
		
		
		JPanel botonInicio = new JPanel();
		//Para que salga la manita
		botonInicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botonInicio.setBackground(new Color(42,159,194));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botonInicio.setBackground(new Color(132,192,199));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
				MenuInicio mn = new MenuInicio();
				mn.setVisible(true);

				dispose();
				
				
			}
		});
		
		
		
		
		botonInicio.setForeground(Color.WHITE);
		botonInicio.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonInicio.setBackground(new Color(132, 192, 199));
		botonInicio.setBounds(299, 274, 151, 41);
		contentPane.add(botonInicio);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesion");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonInicio.add(lblNewLabel);
		
		
		
		

	}
}