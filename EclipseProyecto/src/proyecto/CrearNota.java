package proyecto;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.ImageIcon;

public class CrearNota extends JFrame {

	private JPanel contentPane;
	private JTextField tituloNota;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearNota frame = new CrearNota();
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
	public CrearNota() {
		// COPIAR SIEMPRE DE AQUI HASTA LA LINEA

		setVisible(true);

		// setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/Ilustracion_sin_titulo_2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		setResizable(false);
		setTitle("Notas");

		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(231, 246, 242));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnVolver.setBounds(645, 79, 129, 23);
		contentPane.add(btnVolver);
		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				Notas n = new Notas();
				n.setVisible(true);

				dispose();

			}
		});

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 784, 43);
		contentPane.add(menuBar);

		JPanel botonAgenda = new JPanel();
		botonAgenda.setForeground(Color.WHITE);
		botonAgenda.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonAgenda.setBackground(new Color(57, 91, 100));
		menuBar.add(botonAgenda);

		botonAgenda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botonAgenda.setBackground(new Color(165, 201, 202));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				botonAgenda.setBackground(new Color(57, 91, 100));
			}

			@Override
			public void mousePressed(MouseEvent e) {

				AgendaPrincipal ag = new AgendaPrincipal();
				ag.setVisible(true);

				dispose();

			}
		});

		JLabel lblAgenda = new JLabel("Agenda");
		lblAgenda.setForeground(Color.WHITE);
		lblAgenda.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonAgenda.add(lblAgenda);

		JPanel botonNotas = new JPanel();
		botonNotas.setForeground(Color.WHITE);
		botonNotas.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonNotas.setBackground(new Color(165, 201, 202));
		menuBar.add(botonNotas);

		botonNotas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botonNotas.setBackground(new Color(165, 201, 202));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				botonNotas.setBackground(new Color(165, 201, 202));
			}

			@Override
			public void mousePressed(MouseEvent e) {

				CrearNota nt = new CrearNota();
				nt.setVisible(true);

				dispose();

			}
		});

		JLabel lblBlocDeNotas = new JLabel("Bloc de Notas");
		lblBlocDeNotas.setForeground(Color.WHITE);
		lblBlocDeNotas.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonNotas.add(lblBlocDeNotas);

		JPanel botonCompra = new JPanel();
		botonCompra.setForeground(Color.WHITE);
		botonCompra.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonCompra.setBackground(new Color(57, 91, 100));
		menuBar.add(botonCompra);

		botonCompra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botonCompra.setBackground(new Color(165, 201, 202));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				botonCompra.setBackground(new Color(57, 91, 100));
			}

			@Override
			public void mousePressed(MouseEvent e) {

				Compra cm = new Compra();
				cm.setVisible(true);

				dispose();

			}
		});

		JLabel lblListaDeCompra = new JLabel("Lista de Compra");
		lblListaDeCompra.setForeground(Color.WHITE);
		lblListaDeCompra.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonCompra.add(lblListaDeCompra);

		JPanel botonCartera = new JPanel();
		botonCartera.setForeground(Color.WHITE);
		botonCartera.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonCartera.setBackground(new Color(57, 91, 100));
		menuBar.add(botonCartera);

		botonCartera.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botonCartera.setBackground(new Color(165, 201, 202));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				botonCartera.setBackground(new Color(57, 91, 100));
			}

			@Override
			public void mousePressed(MouseEvent e) {

				Cartera ct = new Cartera();
				ct.setVisible(true);

				dispose();

			}
		});

		JLabel lblCartera = new JLabel("Cartera");
		lblCartera.setForeground(Color.WHITE);
		lblCartera.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonCartera.add(lblCartera);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(192, 192, 192), 4, true));
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textArea.setToolTipText("");
		textArea.setBounds(50, 116, 690, 303);
		
		contentPane.add(textArea);
		
		tituloNota = new JTextField();
		tituloNota.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				tituloNota.setText("");
				
			}
		});
		tituloNota.setFont(new Font("Segoe UI", Font.BOLD, 13));
		tituloNota.setText("Escribe un T\u00EDtulo...");
		tituloNota.setBounds(50, 73, 242, 32);
		contentPane.add(tituloNota);
		tituloNota.setColumns(10);
		
		JButton btnAbrirNota = new JButton("Guardar Nota");
		btnAbrirNota.setIcon(new ImageIcon(CrearNota.class.getResource("/Imagenes/s.png")));
		btnAbrirNota.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnAbrirNota.setBounds(324, 79, 129, 23);
		contentPane.add(btnAbrirNota);
		
		JButton btnBorrarNota = new JButton("Vaciar ");
		btnBorrarNota.setIcon(new ImageIcon(CrearNota.class.getResource("/Imagenes/borrar.png")));
		btnBorrarNota.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnBorrarNota.setBounds(488, 79, 129, 23);
		contentPane.add(btnBorrarNota);
		JLabel fotoMancha = new JLabel("");
		fotoMancha.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/Ilustracion_sin_titulo_2.png")));
		fotoMancha.setBounds(268, -63, 610, 459);
		contentPane.add(fotoMancha);
	}
}
