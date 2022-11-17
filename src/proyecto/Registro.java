package proyecto;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textInputNombre;
	private JTextField textInputApellidos;
	private JTextField textInputEmail;
	private JTextField textInputTelefono;
	private JPanel botonInicio;
	private JLabel lblNewLabel;
	private JLabel lblUneteANosotros;
	private JLabel lblRellenaLosCampos;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registro() {
		
//COPIAR SIEMPRE DE AQUI HASTA LA LINEA
		
        setVisible(true);
        
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/Ilustracion_sin_titulo_2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		setResizable(false);
		setTitle("Registro");

        setLocationRelativeTo(null);



		contentPane = new JPanel();
		contentPane.setBackground(new Color(231, 246, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//hasta aqui creo al 91 porciento
		
		textInputNombre = new JTextField();
		textInputNombre.setBounds(103, 107, 248, 28);
		contentPane.add(textInputNombre);
		textInputNombre.setColumns(10);
		
		textInputApellidos = new JTextField();
		textInputApellidos.setColumns(10);
		textInputApellidos.setBounds(403, 107, 248, 28);
		contentPane.add(textInputApellidos);
		
		textInputEmail = new JTextField();
		textInputEmail.setColumns(10);
		textInputEmail.setBounds(103, 180, 548, 28);
		contentPane.add(textInputEmail);
		
		textInputTelefono = new JTextField();
		textInputTelefono.setColumns(10);
		textInputTelefono.setBounds(103, 321, 248, 28);
		contentPane.add(textInputTelefono);
		
		JLabel textNombre = new JLabel("Nombre");
		textNombre.setBounds(103, 83, 46, 14);
		contentPane.add(textNombre);
		
		JLabel textApellidos = new JLabel("Apellidos");
		textApellidos.setBounds(403, 83, 111, 14);
		contentPane.add(textApellidos);
		
		JLabel textEmail = new JLabel("E-Mail");
		textEmail.setBounds(103, 155, 46, 14);
		contentPane.add(textEmail);
		
		JLabel textTelefono = new JLabel("Telefono");
		textTelefono.setBounds(103, 296, 74, 14);
		contentPane.add(textTelefono);
		
		JLabel textCiudad = new JLabel("Contrase\u00F1a");
		textCiudad.setBounds(103, 221, 119, 14);
		contentPane.add(textCiudad);
		
		JPanel botonInicio = new JPanel();
		botonInicio.setForeground(Color.WHITE);
		botonInicio.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonInicio.setBackground(new Color(57, 91, 100));
		botonInicio.setBounds(103, 378, 548, 41);
		contentPane.add(botonInicio);
		
		lblNewLabel = new JLabel("Iniciar Sesion");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonInicio.add(lblNewLabel);
		
		
		
		//Para que salga la manita
		botonInicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblUneteANosotros = new JLabel("Unete a nosotros!");
		lblUneteANosotros.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblUneteANosotros.setBounds(103, 29, 181, 19);
		contentPane.add(lblUneteANosotros);
		
		lblRellenaLosCampos = new JLabel("Rellena los Campos con tus datos personales");
		lblRellenaLosCampos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRellenaLosCampos.setBounds(103, 53, 548, 19);
		contentPane.add(lblRellenaLosCampos);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(103, 246, 248, 28);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(403, 246, 248, 28);
		contentPane.add(passwordField_1);
		
		JLabel lblConfirmeContrasea = new JLabel("Confirme Contrase\u00F1a");
		lblConfirmeContrasea.setBounds(403, 221, 168, 14);
		contentPane.add(lblConfirmeContrasea);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer", "OdooFan"}));
		comboBox.setBounds(403, 324, 248, 22);
		contentPane.add(comboBox);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(403, 296, 74, 14);
		contentPane.add(lblSexo);
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
				
				Login lg = new Login();
				lg.setVisible(true);

				dispose();
				
				
			}
		});
		
		
	}
}
