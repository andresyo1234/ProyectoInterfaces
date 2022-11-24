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
import java.awt.Point;
import java.awt.FlowLayout;

public class Notas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notas frame = new Notas();
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
	public Notas() {
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

				Notas nt = new Notas();
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
		JPanel botonAgenda_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) botonAgenda_1.getLayout();
		botonAgenda_1.setForeground(Color.WHITE);
		botonAgenda_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonAgenda_1.setBackground(new Color(57, 91, 100));
		botonAgenda_1.setBounds(25, 66, 147, 97);
		contentPane.add(botonAgenda_1);
		
		JLabel lblAgenda_1 = new JLabel("Agenda");
		lblAgenda_1.setForeground(Color.WHITE);
		lblAgenda_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonAgenda_1.add(lblAgenda_1);
		botonAgenda_1.setVisible(false);
		
		botonAgenda_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botonAgenda_1.setBackground(new Color(165, 201, 202));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				botonAgenda_1.setBackground(new Color(57, 91, 100));
			}

			@Override
			public void mousePressed(MouseEvent e) {

				CrearNota cn = new CrearNota();
				cn.setVisible(true);

				dispose();

			}
		});

		JLabel lblCartera = new JLabel("Cartera");
		lblCartera.setForeground(Color.WHITE);
		lblCartera.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonCartera.add(lblCartera);
		
		JButton btnCrearNota = new JButton("Crear Nota");
		btnCrearNota.setActionCommand("Crear Lista");
		btnCrearNota.setIcon(new ImageIcon(Notas.class.getResource("/Imagenes/s.png")));
		btnCrearNota.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnCrearNota.setBounds(251, 427, 129, 23);
		contentPane.add(btnCrearNota);
		btnCrearNota.addMouseListener(new MouseAdapter() {
			
			

			@Override
			public void mousePressed(MouseEvent e) {

				botonAgenda_1.setVisible(true);
				
				
			}
		});
		
		JButton btnBorrarNota = new JButton("Borrar Nota");
		btnBorrarNota.setIcon(new ImageIcon(Notas.class.getResource("/Imagenes/borrar.png")));
		btnBorrarNota.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnBorrarNota.setBounds(390, 427, 129, 23);
		contentPane.add(btnBorrarNota);
		JLabel fotoMancha = new JLabel("");
		fotoMancha.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/Ilustracion_sin_titulo_2.png")));
		fotoMancha.setBounds(268, -63, 610, 459);
		contentPane.add(fotoMancha);
		btnBorrarNota.addMouseListener(new MouseAdapter() {
			

			@Override
			public void mousePressed(MouseEvent e) {

				botonAgenda_1.setVisible(false);
				
				
			}
		});
		
		
	}
}
