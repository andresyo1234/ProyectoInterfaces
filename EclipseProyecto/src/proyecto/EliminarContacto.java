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
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EliminarContacto extends JFrame {

	private JPanel contentPane;
	private JPanel botonInicio;
	private JLabel lblNewLabel;
	private JLabel lblUneteANosotros;
	private JLabel lblRellenaLosCampos;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EliminarContacto frame = new EliminarContacto();
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
	public EliminarContacto() {
		
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
		
		JPanel botonInicio = new JPanel();
		botonInicio.setForeground(Color.WHITE);
		botonInicio.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonInicio.setBackground(new Color(57, 91, 100));
		botonInicio.setBounds(592, 209, 160, 41);
		contentPane.add(botonInicio);
		
		lblNewLabel = new JLabel("Eliminar");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonInicio.add(lblNewLabel);
		
		
		
		//Para que salga la manita
		botonInicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		lblUneteANosotros = new JLabel("Eliminar Contacto");
		lblUneteANosotros.setForeground(new Color(0, 0, 0));
		lblUneteANosotros.setBackground(new Color(255, 255, 255));
		lblUneteANosotros.setFont(new Font("Segoe UI", Font.BOLD, 21));
		lblUneteANosotros.setBounds(103, 29, 181, 19);
		contentPane.add(lblUneteANosotros);
		
		lblRellenaLosCampos = new JLabel("Elimina el contacto");
		lblRellenaLosCampos.setForeground(new Color(0, 0, 0));
		lblRellenaLosCampos.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblRellenaLosCampos.setBounds(103, 53, 548, 19);
		contentPane.add(lblRellenaLosCampos);
		JLabel fotoMancha = new JLabel("");
		fotoMancha.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/Ilustracion_sin_titulo_2.png")));
		fotoMancha.setBounds(272, -105, 610, 459);
		contentPane.add(fotoMancha);
		
		JPanel botonInicio_1 = new JPanel();
		botonInicio_1.setForeground(Color.WHITE);
		botonInicio_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonInicio_1.setBackground(new Color(57, 91, 100));
		botonInicio_1.setBounds(592, 276, 160, 41);
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
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(103, 95, 479, 305);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, "", null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Nombre", "Apellidos", "Telefono", "Email", "Sexo"
			}
		));
		scrollPane.setViewportView(table);
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
