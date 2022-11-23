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
import java.awt.Component;
import javax.swing.border.LineBorder;

public class Login extends JFrame {

	private JPanel contentPane;
<<<<<<< HEAD
	private JTextField textInputContrasenya;
=======
<<<<<<< HEAD
	private JTextField textInputUsuario;
	private JTextField textInputContraseña;
=======
	private JTextField textInputContraseña;
>>>>>>> af77f5012158767b47393035a030238d6dbb7c2b
	private JTextField txtUsuario;
>>>>>>> 4e7a85ddba14235d33b5d2f35371b5a0d089c284

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
		contentPane.setForeground(new Color(99, 173, 148));
		contentPane.setBackground(new Color(186, 218, 207));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//HASTA AQUI 
		
		JLabel fotoMancha = new JLabel("");
		fotoMancha.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/Ilustracion_sin_titulo_2.png")));
		fotoMancha.setBounds(300, -125, 610, 459);
		contentPane.add(fotoMancha);
		
		JPanel botonRegistro = new JPanel();
		botonRegistro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonRegistro.addMouseListener(new MouseAdapter() {
			@Override
			
			//Evento para cuando el raton pase por encima del panel de Pedir Cita, le de un feedback al usuario y cambie de color
			public void mouseEntered(MouseEvent e) {
				botonRegistro.setBackground(new Color(165, 201, 202));
							
			}
			@Override
			//Mismo evento para cuando deje de estar el raton encima vuelva al color original
			public void mouseExited(MouseEvent e) {
				botonRegistro.setBackground(new Color(57, 91, 100));
					
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
		botonRegistro.setBackground(new Color(57, 91, 100));
		botonRegistro.setForeground(new Color(0, 0, 0));
		botonRegistro.setBounds(309, 363, 115, 41);
		contentPane.add(botonRegistro);
		
		JLabel textoRegistro = new JLabel("Registro");
		textoRegistro.setForeground(new Color(255, 255, 255));
		textoRegistro.setBorder(null);
		botonRegistro.add(textoRegistro);
		textoRegistro.setFont(new Font("Segoe UI", Font.BOLD, 20));
		
		JLabel textoTitulo = new JLabel("Mi Agenda");
		textoTitulo.setBackground(new Color(128, 128, 128));
		textoTitulo.setForeground(new Color(52, 103, 103));
		textoTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		textoTitulo.setFont(new Font("Segoe UI", Font.BOLD, 60));
		textoTitulo.setBounds(140, 51, 476, 79);
		contentPane.add(textoTitulo);
		
		
		
		JPanel botonInicio = new JPanel();
		//Para que salga la manita
		botonInicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botonInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botonInicio.setBackground(new Color(165, 201, 202));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				botonInicio.setBackground(new Color(57, 91, 100));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				AgendaPrincipal ag = new AgendaPrincipal();
				ag.setVisible(true);

				dispose();
				
				
			}
		});
		
		
		
		
		
		botonInicio.setForeground(new Color(64, 128, 128));
		botonInicio.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonInicio.setBackground(new Color(57, 91, 100));
		botonInicio.setBounds(294, 304, 140, 41);
		contentPane.add(botonInicio);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesion");
		lblNewLabel.setBackground(new Color(21, 52, 98));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonInicio.add(lblNewLabel);
		
		textInputContrasenya = new JTextField();
		textInputContrasenya.setFont(new Font("Segoe UI", Font.BOLD, 11));
		textInputContrasenya.setText("Contrase\u00F1a...");
		textInputContrasenya.setColumns(10);
		textInputContrasenya.setBackground(new Color(255, 255, 255));
		textInputContrasenya.setBounds(262, 238, 229, 36);
		contentPane.add(textInputContrasenya);
		
<<<<<<< HEAD
		textInputContraseña = new JTextField();
		textInputContraseña.setText("Contrase\u00F1a...");
		textInputContraseña.setColumns(10);
		textInputContraseña.setBackground(new Color(165, 201, 202));
		textInputContraseña.setBounds(262, 238, 229, 36);
		contentPane.add(textInputContraseña);
=======
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario...");
		txtUsuario.setFont(new Font("Segoe UI", Font.BOLD, 11));
		txtUsuario.setColumns(10);
		txtUsuario.setBackground(Color.WHITE);
		txtUsuario.setBounds(262, 178, 229, 36);
		contentPane.add(txtUsuario);
>>>>>>> 4e7a85ddba14235d33b5d2f35371b5a0d089c284
		
		
		
		

	}
}