package juegos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JuegoCaminos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegoCaminos frame = new JuegoCaminos();
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
	public JuegoCaminos() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelInstrucciones = new JPanel();
		panelInstrucciones.setBackground(new Color(249, 222, 252));
		panelInstrucciones.setBounds(0, -24, 447, 287);
		contentPane.add(panelInstrucciones);
		panelInstrucciones.setLayout(null);

		JLabel lblTitulo = new JLabel("Juego de los caminos");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitulo.setBounds(49, 41, 349, 58);
		panelInstrucciones.add(lblTitulo);

		JLabel lblInstrucciones1 = new JLabel("Elige un camino.");
		lblInstrucciones1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstrucciones1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInstrucciones1.setBounds(49, 129, 323, 13);
		panelInstrucciones.add(lblInstrucciones1);

		JLabel lblInstrucciones2 = new JLabel("Si eliges el incorrecto, seras eliminado.");
		lblInstrucciones2.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstrucciones2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInstrucciones2.setBounds(49, 152, 323, 20);
		panelInstrucciones.add(lblInstrucciones2);

		JButton btnEmpezar = new JButton("Empezar");
		btnEmpezar.setBounds(173, 212, 85, 51);
		panelInstrucciones.add(btnEmpezar);

		JPanel panelGanar = new JPanel();
		panelGanar.setBackground(new Color(0, 255, 128));
		panelGanar.setBounds(0, -24, 436, 287);
		contentPane.add(panelGanar);
		panelGanar.setLayout(null);

		JLabel lblGanar = new JLabel("Has Ganado");
		lblGanar.setHorizontalAlignment(SwingConstants.CENTER);
		lblGanar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblGanar.setBounds(60, 102, 328, 58);
		panelGanar.add(lblGanar);

		JPanel panelC2 = new JPanel();
		panelC2.setBackground(new Color(128, 255, 255));
		panelC2.setBounds(0, -24, 436, 287);
		contentPane.add(panelC2);
		panelC2.setLayout(null);

		JLabel lblC2 = new JLabel("Ruta 2");
		lblC2.setHorizontalAlignment(SwingConstants.CENTER);
		lblC2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblC2.setBounds(121, 37, 175, 32);
		panelC2.add(lblC2);

		JLabel lblNewLabel_1 = new JLabel("Seleccione un camino:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(131, 79, 140, 23);
		panelC2.add(lblNewLabel_1);

		JButton btnc2_1 = new JButton("Camino1");
		btnc2_1.setForeground(new Color(255, 255, 255));
		btnc2_1.setBackground(new Color(128, 0, 0));
		btnc2_1.setBounds(10, 127, 85, 134);
		panelC2.add(btnc2_1);

		JButton btnc2_2 = new JButton("Camino2");
		btnc2_2.setForeground(new Color(255, 255, 255));
		btnc2_2.setBackground(new Color(128, 0, 0));
		btnc2_2.setBounds(169, 127, 85, 134);
		panelC2.add(btnc2_2);

		JButton btnc2_3 = new JButton("Camino3");
		btnc2_3.setForeground(new Color(255, 255, 255));
		btnc2_3.setBackground(new Color(128, 0, 0));
		btnc2_3.setBounds(322, 127, 85, 134);
		panelC2.add(btnc2_3);

		JPanel panelC3 = new JPanel();
		panelC3.setBackground(new Color(128, 255, 255));
		panelC3.setBounds(0, -24, 426, 287);
		contentPane.add(panelC3);
		panelC3.setLayout(null);

		JLabel lblC3 = new JLabel("Ruta 3");
		lblC3.setHorizontalAlignment(SwingConstants.CENTER);
		lblC3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblC3.setBounds(121, 37, 175, 32);
		panelC3.add(lblC3);

		JLabel lblNewLabel_1_1 = new JLabel("Seleccione un camino:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(131, 79, 140, 23);
		panelC3.add(lblNewLabel_1_1);

		JButton btnc3_1 = new JButton("Camino1");
		btnc3_1.setForeground(new Color(255, 255, 255));
		btnc3_1.setBackground(new Color(128, 0, 0));
		btnc3_1.setBounds(67, 127, 85, 134);
		panelC3.add(btnc3_1);

		JButton btnc3_2 = new JButton("Camino2");
		btnc3_2.setForeground(new Color(255, 255, 255));
		btnc3_2.setBackground(new Color(128, 0, 0));
		btnc3_2.setBounds(274, 127, 85, 134);
		panelC3.add(btnc3_2);

		JPanel panelC1 = new JPanel();
		panelC1.setBackground(new Color(128, 255, 255));
		panelC1.setBounds(0, -24, 426, 287);
		contentPane.add(panelC1);
		panelC1.setLayout(null);

		JLabel lblC1 = new JLabel("Ruta 1");
		lblC1.setHorizontalAlignment(SwingConstants.CENTER);
		lblC1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblC1.setBounds(121, 37, 175, 32);
		panelC1.add(lblC1);

		JLabel lblNewLabel = new JLabel("Seleccione un camino:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(131, 79, 140, 23);
		panelC1.add(lblNewLabel);

		JButton btnc1_1 = new JButton("Camino1");
		btnc1_1.setForeground(new Color(255, 255, 255));
		btnc1_1.setBackground(new Color(128, 0, 0));
		btnc1_1.setBounds(10, 127, 85, 134);
		panelC1.add(btnc1_1);

		JButton btnc1_2 = new JButton("Camino2");
		btnc1_2.setForeground(new Color(255, 255, 255));
		btnc1_2.setBackground(new Color(128, 0, 0));
		btnc1_2.setBounds(121, 127, 85, 134);
		panelC1.add(btnc1_2);

		JButton btnc1_3 = new JButton("Camino3");
		btnc1_3.setForeground(new Color(255, 255, 255));
		btnc1_3.setBackground(new Color(128, 0, 0));
		btnc1_3.setBounds(234, 127, 85, 134);
		panelC1.add(btnc1_3);

		JButton btnc1_4 = new JButton("Camino4");
		btnc1_4.setForeground(new Color(255, 255, 255));
		btnc1_4.setBackground(new Color(128, 0, 0));
		btnc1_4.setBounds(341, 127, 85, 134);
		panelC1.add(btnc1_4);

		JPanel panelPerder = new JPanel();
		panelPerder.setForeground(new Color(255, 255, 0));
		panelPerder.setBackground(new Color(0, 0, 0));
		panelPerder.setLayout(null);
		panelPerder.setBounds(0, -24, 436, 287);
		contentPane.add(panelPerder);

		JLabel lblPerder = new JLabel("Has Perdido");
		lblPerder.setForeground(new Color(255, 255, 0));
		lblPerder.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerder.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPerder.setBounds(60, 102, 328, 58);
		panelPerder.add(lblPerder);

		panelInstrucciones.setVisible(true);
		panelGanar.setVisible(false);
		panelPerder.setVisible(false);
		panelC1.setVisible(false);
		panelC2.setVisible(false);
		panelC3.setVisible(false);

		btnEmpezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInstrucciones.setVisible(false);
				panelGanar.setVisible(false);
				panelPerder.setVisible(false);
				panelC1.setVisible(true);
				panelC2.setVisible(false);
				panelC3.setVisible(false);
			}
		});

		btnc1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int random = (int) (1 + Math.random() * 4);
				if (random != 1) {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(false);
					panelC1.setVisible(false);
					panelC2.setVisible(true);
					panelC3.setVisible(false);
				} else {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(true);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(false);
				}

			}
		});

		btnc1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int random = (int) (1 + Math.random() * 4);
				if (random != 2) {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(false);
					panelC1.setVisible(false);
					panelC2.setVisible(true);
					panelC3.setVisible(false);
				} else {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(true);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(false);
				}

			}
		});

		btnc1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int random = (int) (1 + Math.random() * 4);
				if (random != 3) {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(false);
					panelC1.setVisible(false);
					panelC2.setVisible(true);
					panelC3.setVisible(false);
				} else {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(true);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(false);
				}

			}
		});

		btnc1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int random = (int) (1 + Math.random() * 4);
				if (random != 4) {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(false);
					panelC1.setVisible(false);
					panelC2.setVisible(true);
					panelC3.setVisible(false);
				} else {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(true);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(false);
				}

			}
		});

		btnc2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int random = (int) (1 + Math.random() * 3);
				if (random != 1) {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(false);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(true);
				} else {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(true);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(false);
				}

			}
		});

		btnc2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int random = (int) (1 + Math.random() * 3);
				if (random != 2) {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(false);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(true);
				} else {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(true);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(false);
				}

			}
		});

		btnc2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int random = (int) (1 + Math.random() * 3);
				if (random != 3) {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(false);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(true);
				} else {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(true);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(false);
				}

			}
		});

		btnc3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int random = (int) (1 + Math.random() * 2);
				if (random != 1) {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(true);
					panelPerder.setVisible(false);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(false);
				} else {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(true);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(false);
				}

			}
		});

		btnc3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int random = (int) (1 + Math.random() * 2);
				if (random != 2) {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(true);
					panelPerder.setVisible(false);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(false);

					JuegoCartas abrir = new JuegoCartas();
					abrir.setVisible(true);
					
				} else {
					panelInstrucciones.setVisible(false);
					panelGanar.setVisible(false);
					panelPerder.setVisible(true);
					panelC1.setVisible(false);
					panelC2.setVisible(false);
					panelC3.setVisible(false);
				}

			}
		});

	}
}
