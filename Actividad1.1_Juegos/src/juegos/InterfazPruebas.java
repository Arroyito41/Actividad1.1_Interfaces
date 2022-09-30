package juegos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.Color;

public class InterfazPruebas extends JFrame {

	private JPanel contentPane;
	private final JPanel panelBicho = new JPanel();
	private final JLabel lblPerder = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazPruebas frame = new InterfazPruebas();
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
	public InterfazPruebas() {
		int ganador;
		ArrayList <JButton> puertas = new ArrayList<>();
		
		
		JButton btnPuerta1 = new JButton("1");
		btnPuerta1.setForeground(new Color(255, 255, 255));
		btnPuerta1.setBackground(new Color(128, 0, 0));
		puertas.add(btnPuerta1);
		JButton btnPuerta2 = new JButton("2");
		btnPuerta2.setBackground(new Color(128, 0, 0));
		btnPuerta2.setForeground(new Color(255, 255, 255));
		puertas.add(btnPuerta2);
		JButton btnPuerta3 = new JButton("3");
		btnPuerta3.setForeground(new Color(255, 255, 255));
		btnPuerta3.setBackground(new Color(128, 0, 0));
		puertas.add(btnPuerta3);
		JButton btnPuerta4 = new JButton("4");
		btnPuerta4.setForeground(new Color(255, 255, 255));
		btnPuerta4.setBackground(new Color(128, 0, 0));
		puertas.add(btnPuerta4);
		
		ganador = (int)(1+Math.random()*(puertas.size()));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(200, 255, 255));
		panel.setBounds(0, 0, 447, 274);
		contentPane.add(panel);
		panel.setLayout(null);
		lblPerder.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblPerder.setBounds(145, 218, 126, 25);
		contentPane.add(lblPerder);
		
		JLabel lblBicho = new JLabel("");
		lblBicho.setIcon(new ImageIcon("C:\\Users\\alber\\Desktop\\2DAM\\Interfaces\\Workspace-int\\bicho.jfif"));
		lblBicho.setBounds(73, 0, 261, 194);
		panelBicho.setBounds(0, 0, 416, 253);
		contentPane.add(panelBicho);
		panelBicho.add(lblBicho);
		panelBicho.setVisible(false);
		
		JLabel lblPrueba1 = new JLabel("Prueba 1");
		lblPrueba1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblPrueba1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrueba1.setBounds(114, 0, 173, 58);
		panel.add(lblPrueba1);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(134, 192, 167, 44);
		panelBicho.add(lblResultado);
		
		btnPuerta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int p1 = 1;
				if (ganador == p1) {
					lblResultado.setText("HAS GANADO");
					panel.setVisible(false);
					panelBicho.setVisible(true);
				}else {
					lblPerder.setText("HAS PERDIDO");
					panel.setVisible(false);
				}
			}
		});
		btnPuerta1.setBounds(10, 83, 71, 103);
		panel.add(btnPuerta1);
		
		btnPuerta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int p2 = 2;
				if (ganador == p2) {
					lblResultado.setText("HAS GANADO");
					panel.setVisible(false);
					panelBicho.setVisible(true);
				}else {
					lblPerder.setText("HAS PERDIDO");
					panel.setVisible(false);
				}
			}
		});
		btnPuerta2.setBounds(114, 83, 71, 103);
		panel.add(btnPuerta2);
		
		btnPuerta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int p3 = 3;
				if (ganador == p3) {
					lblResultado.setText("HAS GANADO");
					panel.setVisible(false);
					panelBicho.setVisible(true);
				}else {
					lblPerder.setText("HAS PERDIDO");
					panel.setVisible(false);
				}
			}
		});
		btnPuerta3.setBounds(229, 83, 71, 103);
		panel.add(btnPuerta3);
		
		btnPuerta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int p4 = 4;
				if (ganador == p4) {
					lblResultado.setText("HAS GANADO");
					panel.setVisible(false);
					panelBicho.setVisible(true);
				}else {
					lblPerder.setText("HAS PERDIDO");
					panel.setVisible(false);
				}
			}
		});
		btnPuerta4.setBounds(335, 83, 71, 103);
		panel.add(btnPuerta4);
		
		JLabel lblEleccion = new JLabel("Elige una puerta");
		lblEleccion.setBounds(164, 60, 148, 13);
		panel.add(lblEleccion);
		
	}
}
