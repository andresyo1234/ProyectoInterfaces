package proyecto;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.border.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cartera extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cartera frame = new Cartera();
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
	public Cartera() {
		// COPIAR SIEMPRE DE AQUI HASTA LA LINEA

		setVisible(true);

		// setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/Ilustracion_sin_titulo_2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		setResizable(false);
		setTitle("Cartera");

		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(231, 246, 242));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
		botonNotas.setBackground(new Color(57, 91, 100));
		menuBar.add(botonNotas);

		botonNotas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botonNotas.setBackground(new Color(165, 201, 202));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				botonNotas.setBackground(new Color(57, 91, 100));
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

		JLabel lblCartera = new JLabel("Cartera");
		lblCartera.setForeground(Color.WHITE);
		lblCartera.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonCartera.add(lblCartera);
		
		JLabel dineroTxt = new JLabel("00,00\u20AC");
		dineroTxt.setForeground(new Color(44, 44, 44));
		dineroTxt.setHorizontalAlignment(SwingConstants.CENTER);
		dineroTxt.setFont(new Font("Segoe UI", Font.BOLD, 60));
		dineroTxt.setBounds(270, 189, 233, 152);
		contentPane.add(dineroTxt);
		
		JButton botonAņadirDinero = new JButton("A\u00F1adir Dinero");
		botonAņadirDinero.setFont(new Font("Segoe UI", Font.BOLD, 14));
		botonAņadirDinero.setBounds(159, 337, 145, 41);
		contentPane.add(botonAņadirDinero);
		
		JButton btnQuitarDinero = new JButton("Quitar Dinero");
		btnQuitarDinero.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnQuitarDinero.setBounds(454, 337, 145, 41);
		contentPane.add(btnQuitarDinero);
		
		JLabel lblNewLabel = new JLabel("aqui va foto de tarjetas y puedas ir cambiando");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel.setBounds(182, 74, 437, 84);
		contentPane.add(lblNewLabel);
		
		JPanel botonNotas_1 = new JPanel();
		botonNotas_1.setForeground(Color.WHITE);
		botonNotas_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonNotas_1.setBackground(new Color(57, 91, 100));
		botonNotas_1.setBounds(92, 76, 55, 41);
		contentPane.add(botonNotas_1);
		
		JLabel lblBlocDeNotas_1 = new JLabel("<");
		lblBlocDeNotas_1.setForeground(Color.WHITE);
		lblBlocDeNotas_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonNotas_1.add(lblBlocDeNotas_1);
		
		JPanel botonNotas_1_1 = new JPanel();
		botonNotas_1_1.setForeground(Color.WHITE);
	


		botonNotas_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonNotas_1_1.setBackground(new Color(57, 91, 100));
		botonNotas_1_1.setBounds(629, 76, 55, 41);
		contentPane.add(botonNotas_1_1);
		
		JLabel lblBlocDeNotas_1_1 = new JLabel(">");
		lblBlocDeNotas_1_1.setForeground(Color.WHITE);
		lblBlocDeNotas_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		botonNotas_1_1.add(lblBlocDeNotas_1_1);
		
		JLabel lblPonerFotitoO = new JLabel("poner fotito o algo aqui para mejorar esta mierda");
		lblPonerFotitoO.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblPonerFotitoO.setBounds(213, 183, 437, 84);
		contentPane.add(lblPonerFotitoO);

	}
}
