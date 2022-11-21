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
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Compra extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compra frame = new Compra();
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
	public Compra() {
		//COPIAR SIEMPRE DE AQUI HASTA LA LINEA
		
        setVisible(true);
        
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/Ilustracion_sin_titulo_2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		setResizable(false);
		setTitle("Compra");

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
				
				AgendaPrincipal ag= new AgendaPrincipal();
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(192, 192, 192), 4, true));
		panel.setBounds(195, 84, 513, 310);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel botonAgenda_1 = new JPanel();
		botonAgenda_1.setBounds(185, 258, 138, 41);
		botonAgenda_1.setForeground(Color.WHITE);
		botonAgenda_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		botonAgenda_1.setBackground(new Color(57, 91, 100));
		panel.add(botonAgenda_1);
		
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
				
				Compra cm = new Compra();
				cm.setVisible(true);

				dispose();
				
				
			}
		});
		
		
		JLabel botonAceptar = new JLabel("Aceptar");
		botonAceptar.setForeground(Color.WHITE);
		botonAceptar.setFont(new Font("Segoe UI", Font.BOLD, 18));
		botonAgenda_1.add(botonAceptar);
		
		JCheckBox chckbxChocolate = new JCheckBox("Chocolate");
		chckbxChocolate.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate.setBounds(6, 7, 97, 23);
		panel.add(chckbxChocolate);
		
		JCheckBox chckbxChocolate_1 = new JCheckBox("Queso");
		chckbxChocolate_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_1.setBounds(6, 33, 97, 23);
		panel.add(chckbxChocolate_1);
		
		JCheckBox chckbxChocolate_2 = new JCheckBox("Aceitunas");
		chckbxChocolate_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_2.setBounds(6, 59, 97, 23);
		panel.add(chckbxChocolate_2);
		
		JCheckBox chckbxChocolate_3 = new JCheckBox("Agua");
		chckbxChocolate_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_3.setBounds(6, 85, 97, 23);
		panel.add(chckbxChocolate_3);
		
		JCheckBox chckbxChocolate_4 = new JCheckBox("Pan");
		chckbxChocolate_4.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_4.setBounds(6, 111, 97, 23);
		panel.add(chckbxChocolate_4);
		
		JCheckBox chckbxChocolate_5 = new JCheckBox("Jamon");
		chckbxChocolate_5.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_5.setBounds(6, 137, 97, 23);
		panel.add(chckbxChocolate_5);
		
		JCheckBox chckbxChocolate_6 = new JCheckBox("Servilletas");
		chckbxChocolate_6.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_6.setBounds(6, 163, 97, 23);
		panel.add(chckbxChocolate_6);
		
		JCheckBox chckbxChocolate_7 = new JCheckBox("ChocoBom");
		chckbxChocolate_7.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_7.setBounds(6, 189, 97, 23);
		panel.add(chckbxChocolate_7);
		
		JCheckBox chckbxChocolate_8 = new JCheckBox("Yogurt");
		chckbxChocolate_8.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_8.setBounds(6, 217, 97, 23);
		panel.add(chckbxChocolate_8);
		
		JCheckBox chckbxChocolate_9 = new JCheckBox("Helado");
		chckbxChocolate_9.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_9.setBounds(105, 218, 97, 23);
		panel.add(chckbxChocolate_9);
		
		JCheckBox chckbxChocolate_10 = new JCheckBox("Cocacola");
		chckbxChocolate_10.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_10.setBounds(105, 190, 97, 23);
		panel.add(chckbxChocolate_10);
		
		JCheckBox chckbxChocolate_11 = new JCheckBox("Yatekomo");
		chckbxChocolate_11.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_11.setBounds(105, 164, 97, 23);
		panel.add(chckbxChocolate_11);
		
		JCheckBox chckbxChocolate_12 = new JCheckBox("Huevos ");
		chckbxChocolate_12.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_12.setBounds(105, 138, 97, 23);
		panel.add(chckbxChocolate_12);
		
		JCheckBox chckbxChocolate_13 = new JCheckBox("Leche");
		chckbxChocolate_13.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_13.setBounds(105, 112, 97, 23);
		panel.add(chckbxChocolate_13);
		
		JCheckBox chckbxChocolate_14 = new JCheckBox("Atun");
		chckbxChocolate_14.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_14.setBounds(105, 86, 97, 23);
		panel.add(chckbxChocolate_14);
		
		JCheckBox chckbxChocolate_15 = new JCheckBox("Pescado");
		chckbxChocolate_15.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_15.setBounds(105, 60, 97, 23);
		panel.add(chckbxChocolate_15);
		
		JCheckBox chckbxChocolate_16 = new JCheckBox("Filete");
		chckbxChocolate_16.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_16.setBounds(105, 34, 97, 23);
		panel.add(chckbxChocolate_16);
		
		JCheckBox chckbxChocolate_17 = new JCheckBox("Ketchup");
		chckbxChocolate_17.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_17.setBounds(105, 8, 97, 23);
		panel.add(chckbxChocolate_17);
		
		JCheckBox chckbxChocolate_1_1 = new JCheckBox("Pollo");
		chckbxChocolate_1_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_1_1.setBounds(204, 32, 97, 23);
		panel.add(chckbxChocolate_1_1);
		
		JCheckBox chckbxChocolate_2_1 = new JCheckBox("Pizza");
		chckbxChocolate_2_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_2_1.setBounds(204, 58, 97, 23);
		panel.add(chckbxChocolate_2_1);
		
		JCheckBox chckbxChocolate_3_1 = new JCheckBox("Hamburguesa");
		chckbxChocolate_3_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_3_1.setBounds(204, 84, 97, 23);
		panel.add(chckbxChocolate_3_1);
		
		JCheckBox chckbxChocolate_4_1 = new JCheckBox("Bacon");
		chckbxChocolate_4_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_4_1.setBounds(204, 110, 97, 23);
		panel.add(chckbxChocolate_4_1);
		
		JCheckBox chckbxChocolate_5_1 = new JCheckBox("Pasta");
		chckbxChocolate_5_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_5_1.setBounds(204, 136, 97, 23);
		panel.add(chckbxChocolate_5_1);
		
		JCheckBox chckbxChocolate_6_1 = new JCheckBox("Tomate");
		chckbxChocolate_6_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_6_1.setBounds(204, 162, 97, 23);
		panel.add(chckbxChocolate_6_1);
		
		JCheckBox chckbxChocolate_7_1 = new JCheckBox("Ensalada");
		chckbxChocolate_7_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_7_1.setBounds(204, 188, 97, 23);
		panel.add(chckbxChocolate_7_1);
		
		JCheckBox chckbxChocolate_8_1 = new JCheckBox("Lentejas");
		chckbxChocolate_8_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_8_1.setBounds(204, 216, 97, 23);
		panel.add(chckbxChocolate_8_1);
		
		JCheckBox chckbxChocolate_9_1 = new JCheckBox("Guisantes");
		chckbxChocolate_9_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_9_1.setBounds(303, 217, 97, 23);
		panel.add(chckbxChocolate_9_1);
		
		JCheckBox chckbxChocolate_10_1 = new JCheckBox("Cangreburguer");
		chckbxChocolate_10_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_10_1.setBounds(303, 189, 97, 23);
		panel.add(chckbxChocolate_10_1);
		
		JCheckBox chckbxChocolate_11_1 = new JCheckBox("Nestea");
		chckbxChocolate_11_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_11_1.setBounds(303, 163, 97, 23);
		panel.add(chckbxChocolate_11_1);
		
		JCheckBox chckbxChocolate_12_1 = new JCheckBox("Limon");
		chckbxChocolate_12_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_12_1.setBounds(303, 137, 97, 23);
		panel.add(chckbxChocolate_12_1);
		
		JCheckBox chckbxChocolate_13_1 = new JCheckBox("Sal");
		chckbxChocolate_13_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_13_1.setBounds(303, 111, 97, 23);
		panel.add(chckbxChocolate_13_1);
		
		JCheckBox chckbxChocolate_14_1 = new JCheckBox("Azucar");
		chckbxChocolate_14_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_14_1.setBounds(303, 85, 97, 23);
		panel.add(chckbxChocolate_14_1);
		
		JCheckBox chckbxChocolate_15_1 = new JCheckBox("Aceite");
		chckbxChocolate_15_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_15_1.setBounds(303, 59, 97, 23);
		panel.add(chckbxChocolate_15_1);
		
		JCheckBox chckbxChocolate_16_1 = new JCheckBox("Salchichas");
		chckbxChocolate_16_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_16_1.setBounds(303, 33, 97, 23);
		panel.add(chckbxChocolate_16_1);
		
		JCheckBox chckbxChocolate_17_1 = new JCheckBox("Dulces");
		chckbxChocolate_17_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_17_1.setBounds(303, 7, 97, 23);
		panel.add(chckbxChocolate_17_1);
		
		JCheckBox chckbxChocolate_18 = new JCheckBox("Mermelada");
		chckbxChocolate_18.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_18.setBounds(204, 8, 97, 23);
		panel.add(chckbxChocolate_18);
		
		JCheckBox chckbxChocolate_18_1 = new JCheckBox("Piña");
		chckbxChocolate_18_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_18_1.setBounds(402, 218, 97, 23);
		panel.add(chckbxChocolate_18_1);
		
		JCheckBox chckbxChocolate_18_2 = new JCheckBox("Especias");
		chckbxChocolate_18_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_18_2.setBounds(402, 190, 97, 23);
		panel.add(chckbxChocolate_18_2);
		
		JCheckBox chckbxChocolate_18_3 = new JCheckBox("Pepinillos");
		chckbxChocolate_18_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_18_3.setBounds(402, 164, 97, 23);
		panel.add(chckbxChocolate_18_3);
		
		JCheckBox chckbxChocolate_18_4 = new JCheckBox("Arroz");
		chckbxChocolate_18_4.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_18_4.setBounds(402, 138, 97, 23);
		panel.add(chckbxChocolate_18_4);
		
		JCheckBox chckbxChocolate_18_5 = new JCheckBox("Galletas");
		chckbxChocolate_18_5.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_18_5.setBounds(402, 112, 97, 23);
		panel.add(chckbxChocolate_18_5);
		
		JCheckBox chckbxChocolate_18_6 = new JCheckBox("Jabon");
		chckbxChocolate_18_6.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_18_6.setBounds(402, 86, 97, 23);
		panel.add(chckbxChocolate_18_6);
		
		JCheckBox chckbxChocolate_18_7 = new JCheckBox("Cafe");
		chckbxChocolate_18_7.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_18_7.setBounds(402, 60, 97, 23);
		panel.add(chckbxChocolate_18_7);
		
		JCheckBox chckbxChocolate_18_8 = new JCheckBox("Natillas");
		chckbxChocolate_18_8.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_18_8.setBounds(402, 34, 97, 23);
		panel.add(chckbxChocolate_18_8);
		
		JCheckBox chckbxChocolate_18_9 = new JCheckBox("Flan");
		chckbxChocolate_18_9.setFont(new Font("Segoe UI", Font.BOLD, 12));
		chckbxChocolate_18_9.setBounds(402, 8, 97, 23);
		panel.add(chckbxChocolate_18_9);
		
		JLabel lblNewLabel = new JLabel("Lista Numero:");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 93, 86, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(99, 91, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNuevaLista = new JButton("Nueva ");
		btnNuevaLista.setIcon(new ImageIcon(Compra.class.getResource("/Imagenes/s.png")));
		btnNuevaLista.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnNuevaLista.setBounds(49, 156, 105, 43);
		contentPane.add(btnNuevaLista);
		
		JButton btnAbrirLista = new JButton("Abrir");
		btnAbrirLista.setIcon(new ImageIcon(Compra.class.getResource("/Imagenes/lupa.png")));
		btnAbrirLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAbrirLista.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnAbrirLista.setBounds(49, 210, 105, 43);
		contentPane.add(btnAbrirLista);
		
		JButton btnEliminarLista = new JButton("Eliminar");
		btnEliminarLista.setIcon(new ImageIcon(Compra.class.getResource("/Imagenes/borrar.png")));
		btnEliminarLista.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnEliminarLista.setBounds(49, 264, 105, 43);
		contentPane.add(btnEliminarLista);
		
		JLabel fotoMancha = new JLabel("");
		fotoMancha.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/Ilustracion_sin_titulo_2.png")));
		fotoMancha.setBounds(-321, 193, 610, 459);
		contentPane.add(fotoMancha);
		
		
		
	}
}
