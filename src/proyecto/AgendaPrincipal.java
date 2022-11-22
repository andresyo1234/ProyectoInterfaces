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
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;

public class AgendaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendaPrincipal frame = new AgendaPrincipal();
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
	public AgendaPrincipal() {
		//COPIAR SIEMPRE DE AQUI HASTA LA LINEA
		
        setVisible(true);
        
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/Ilustracion_sin_titulo_2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		setResizable(false);
		setTitle("Agenda");

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
		
		
		
		JList agendaLista = new JList();
		agendaLista.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		JScrollPane scrollPane = new JScrollPane(agendaLista);
		scrollPane.setSize(479, 305);
		scrollPane.setLocation(71, 100);
		agendaLista.setBounds(new Rectangle(5, 0, 0, 0));
		
		
		scrollPane.setViewportView(agendaLista);
		
		agendaLista.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
		agendaLista.setModel(new AbstractListModel() {
			String[] values = new String[] {"Jorge Garcia - 615 66 10 36", "Dorito Flex - 687 87 32 26", "Dani Gordita - 615 66 10 36", "M3Gara - 687 87 32 26", "AndresYO - 615 66 10 36", "Adro - 615 66 10 36", "Jimenito - 687 87 32 26", "Giraldo - 615 66 10 36", "Ansepe - 687 87 32 26", "Odoo - 615 66 10 36", "Angela mugar - 687 87 32 26", "Magic - 687 87 32 26", "Osito en Llamas - 615 66 10 36", "Adro - 615 66 10 36", "Jimenito - 687 87 32 26", "Giraldo - 615 66 10 36", "Ansepe - 687 87 32 26", "Adro - 615 66 10 36", "Jimenito - 687 87 32 26", "Giraldo - 615 66 10 36", "Ansepe - 687 87 32 26", "Adro - 615 66 10 36", "Jimenito - 687 87 32 26", "Giraldo - 615 66 10 36", "Ansepe - 687 87 32 26", "Adro - 615 66 10 36", "Jimenito - 687 87 32 26", "Giraldo - 615 66 10 36", "Ansepe - 687 87 32 26", "Adro - 615 66 10 36", "Jimenito - 687 87 32 26", "Giraldo - 615 66 10 36", "Ansepe - 687 87 32 26", "Adro - 615 66 10 36", "Jimenito - 687 87 32 26", "Giraldo - 615 66 10 36", "Ansepe - 687 87 32 26", "Adro - 615 66 10 36", "Jimenito - 687 87 32 26", "Giraldo - 615 66 10 36", "Ansepe - 687 87 32 26", "Adro - 615 66 10 36", "Jimenito - 687 87 32 26", "Giraldo - 615 66 10 36", "Ansepe - 687 87 32 26"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		
		agendaLista.setBounds(67, 101, 641, 272);
		contentPane.add(scrollPane);
		
		JButton botonAnadirContacto = new JButton("Añadir Contacto");
		botonAnadirContacto.setIcon(new ImageIcon(AgendaPrincipal.class.getResource("/Imagenes/s.png")));
		botonAnadirContacto.setFont(new Font("Segoe UI", Font.BOLD, 13));
		botonAnadirContacto.setBounds(570, 100, 167, 50);
		contentPane.add(botonAnadirContacto);
		
		JButton botonEditarContacto = new JButton("Editar Contacto");
		botonEditarContacto.setIcon(new ImageIcon(AgendaPrincipal.class.getResource("/Imagenes/lupa.png")));
		botonEditarContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonEditarContacto.setFont(new Font("Segoe UI", Font.BOLD, 13));
		botonEditarContacto.setBounds(570, 161, 167, 50);
		contentPane.add(botonEditarContacto);
		
		JButton botonEditarContacto_1 = new JButton("Eliminar Contacto");
		botonEditarContacto_1.setIcon(new ImageIcon(AgendaPrincipal.class.getResource("/Imagenes/borrar.png")));
		botonEditarContacto_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		botonEditarContacto_1.setBounds(570, 222, 167, 50);
		contentPane.add(botonEditarContacto_1);
		
		JLabel textoAgenda = new JLabel("Mi Agenda");
		textoAgenda.setForeground(new Color(255, 255, 255));
		textoAgenda.setFont(new Font("Segoe UI", Font.BOLD, 21));
		textoAgenda.setBounds(71, 62, 180, 27);
		contentPane.add(textoAgenda);
		
		JLabel fotoMancha = new JLabel("");
		fotoMancha.setIcon(new ImageIcon(Login.class.getResource("/Imagenes/Ilustracion_sin_titulo_2.png")));
		fotoMancha.setBounds(-331, -70, 610, 459);
		contentPane.add(fotoMancha);
		
		
	}
}
