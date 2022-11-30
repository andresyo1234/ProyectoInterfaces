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
import javax.swing.ImageIcon;

public class EditarContacto extends JFrame {

	private JPanel contentPane;
	private JTextField textInputNombre;
	private JTextField textInputApellidos;
	private JTextField textInputEmail;
	private JTextField textInputTelefono;
	private JPanel botonInicio;
	private JLabel lblNewLabel;
	private JLabel lblUneteANosotros;
	private JLabel lblRellenaLosCampos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditarContacto frame = new EditarContacto();
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
	public EditarContacto() {
		
//COPIAR SIEMPRE DE AQUI HASTA LA LINEA
		
        setVisible(true);
        
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/Ilustracion_sin_titulo_2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		setResizable(false);
		setTitle("Registro");

        setLocationRelativeTo(null);



		contentPane = new JPanel();
		contentPane.setBackground(new Color(186, 218, 207));
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
		textInputTelefono.setBounds(103, 244, 248, 28);
		contentPane.add(textInputTelefono);
		
		JLabel textNombre = new JLabel("Nombre");
		textNombre.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textNombre.setBounds(103, 83, 74, 14);
		contentPane.add(textNombre);
		
		JLabel textApellidos = new JLabel("Apellidos");
		textApellidos.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textApellidos.setBounds(403, 83, 111, 14);
		contentPane.add(textApellidos);
		
		JLabel textEmail = new JLabel("E-Mail");
		textEmail.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textEmail.setBounds(103, 155, 74, 14);
		contentPane.add(textEmail);
		
		JLabel textTelefono = new JLabel("Telefono");
		textTelefono.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textTelefono.setBounds(103, 219, 74, 14);
		contentPane.add(textTelefono);
		
		JPanel botonInicio = new JPanel();
		botonInicio.setForeground(Color.WHITE);
		botonInicio.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonInicio.setBackground(new Color(57, 91, 100));
		botonInicio.setBounds(103, 313, 548, 41);
		contentPane.add(botonInicio);
		
		lblNewLabel = new JLabel("Editar Contacto");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonInicio.add(lblNewLabel);
		
		
		
		//Para que salga la manita
		botonInicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblUneteANosotros = new JLabel("Editar contacto");
		lblUneteANosotros.setForeground(new Color(0, 0, 0));
		lblUneteANosotros.setBackground(new Color(255, 255, 255));
		lblUneteANosotros.setFont(new Font("Segoe UI", Font.BOLD, 21));
		lblUneteANosotros.setBounds(103, 29, 181, 19);
		contentPane.add(lblUneteANosotros);
		
		lblRellenaLosCampos = new JLabel("Modifica los datos del contacto");
		lblRellenaLosCampos.setForeground(new Color(0, 0, 0));
		lblRellenaLosCampos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblRellenaLosCampos.setBounds(103, 53, 548, 19);
		contentPane.add(lblRellenaLosCampos);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer", "OdooFan"}));
		comboBox.setBounds(403, 247, 248, 22);
		contentPane.add(comboBox);
		JLabel fotoMancha = new JLabel("");
		fotoMancha.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/Ilustracion_sin_titulo_2.png")));
		fotoMancha.setBounds(272, -105, 610, 459);
		contentPane.add(fotoMancha);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblSexo.setBounds(403, 219, 74, 14);
		contentPane.add(lblSexo);
		
		JPanel botonInicio_1 = new JPanel();
		botonInicio_1.setForeground(Color.WHITE);
		botonInicio_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonInicio_1.setBackground(new Color(57, 91, 100));
		botonInicio_1.setBounds(103, 379, 548, 41);
		contentPane.add(botonInicio_1);
		botonInicio_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botonInicio_1.setBackground(new Color(165, 201, 202));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				botonInicio_1.setBackground(new Color(57, 91, 100));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				AgendaPrincipal ap = new AgendaPrincipal();
				ap.setVisible(true);

				dispose();
				
				
			}
		});
		
		JLabel lblAtras = new JLabel("Cancelar");
		lblAtras.setForeground(Color.WHITE);
		lblAtras.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonInicio_1.add(lblAtras);
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
				
				AgendaPrincipal ap = new AgendaPrincipal();
				ap.setVisible(true);

				dispose();
				
				
			}
		});
		
		
		
	}
}
