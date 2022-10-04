package juegos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class JuegoCartas extends JFrame {

	private JPanel contentPane;
	private final JPanel panelPrincipal = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegoCartas frame = new JuegoCartas();
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
	public JuegoCartas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		panelPrincipal.setBounds(0, 0, 434, 261);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblSumaBot = new JLabel("");
		lblSumaBot.setBounds(319, 29, 89, 46);
		panelPrincipal.add(lblSumaBot);
		
		JButton btnCarta1 = new JButton("");
		btnCarta1.setBackground(new Color(128, 128, 255));
		btnCarta1.setForeground(new Color(0, 0, 0));
		btnCarta1.setBounds(39, 161, 66, 89);
		panelPrincipal.add(btnCarta1);
		
		JButton btnCarta2 = new JButton("");
		btnCarta2.setBackground(new Color(128, 128, 255));
		btnCarta2.setBounds(130, 161, 66, 89);
		panelPrincipal.add(btnCarta2);
		
		JButton btnCarta4 = new JButton("");
		btnCarta4.setBackground(new Color(0, 255, 255));
		btnCarta4.setBounds(39, 11, 66, 89);
		panelPrincipal.add(btnCarta4);
		
		JButton btnCarta5 = new JButton("");
		btnCarta5.setBackground(new Color(0, 255, 255));
		btnCarta5.setBounds(130, 11, 66, 89);
		panelPrincipal.add(btnCarta5);
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.setBounds(49, 115, 89, 23);
		panelPrincipal.add(btnJugar);
		
		JLabel lblSuma = new JLabel("");
		lblSuma.setBounds(319, 183, 89, 46);
		panelPrincipal.add(lblSuma);
		
		JButton btnCarta6 = new JButton("");
		btnCarta6.setBackground(Color.CYAN);
		btnCarta6.setBounds(216, 11, 66, 89);
		panelPrincipal.add(btnCarta6);
		
		JButton btnCarta3 = new JButton("");
		btnCarta3.setBackground(new Color(128, 128, 255));
		btnCarta3.setBounds(216, 161, 66, 89);
		panelPrincipal.add(btnCarta3);
		
		JButton btnPlantar = new JButton("Plantarse");
		btnPlantar.setBounds(161, 116, 89, 23);
		panelPrincipal.add(btnPlantar);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(49, 116, 89, 23);
		panelPrincipal.add(btnContinuar);
		
		JButton btnContinuar2 = new JButton("Continuar");
		btnContinuar2.setBounds(49, 116, 89, 23);
		panelPrincipal.add(btnContinuar2);
		
		JPanel panelInstrucciones = new JPanel();
		panelInstrucciones.setBounds(0, 0, 434, 261);
		contentPane.add(panelInstrucciones);
		panelInstrucciones.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Puntuación mas alta");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(105, 23, 238, 30);
		panelInstrucciones.add(lblTitulo);
		
		JLabel lblInstrucciones1 = new JLabel("Esta pruba consiste en la suma de las dos cartas");
		lblInstrucciones1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInstrucciones1.setBounds(34, 80, 327, 37);
		panelInstrucciones.add(lblInstrucciones1);
		
		JLabel lblInstrucciones2 = new JLabel("el que más sume gana la prueba");
		lblInstrucciones2.setHorizontalAlignment(SwingConstants.LEFT);
		lblInstrucciones2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInstrucciones2.setBounds(34, 112, 327, 37);
		panelInstrucciones.add(lblInstrucciones2);
		
		JButton btnEmpezar = new JButton("Empezar");
		btnEmpezar.setBounds(170, 186, 89, 23);
		panelInstrucciones.add(btnEmpezar);
		
		panelPrincipal.setVisible(false);
		
		btnEmpezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelPrincipal.setVisible(true);
				panelInstrucciones.setVisible(false);
			}
		});
		
		
		
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int aleatorio1;
				int aleatorio2;
				aleatorio1=(int)(1+Math.random()*21);
				aleatorio2=(int)(1+Math.random()*21);
				
			}
		});
		
		
	}
}
