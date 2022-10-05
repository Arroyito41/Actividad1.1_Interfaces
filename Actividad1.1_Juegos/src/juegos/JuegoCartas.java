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
	private final JPanel panelVictoria = new JPanel();

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
		
		JPanel panelDerrota = new JPanel();
		panelDerrota.setBackground(new Color(0, 0, 0));
		panelDerrota.setBounds(0, 0, 434, 261);
		contentPane.add(panelDerrota);
		panelDerrota.setVisible(false);
		
		JLabel lblSumaBot = new JLabel("");
		lblSumaBot.setBounds(319, 29, 89, 46);
		panelPrincipal.add(lblSumaBot);
		
		JButton btnCarta2 = new JButton("");
		btnCarta2.setBackground(new Color(128, 128, 255));
		btnCarta2.setBounds(130, 161, 66, 89);
		btnCarta2.setForeground(new Color(0, 0, 0));
		btnCarta2.setBounds(120, 162, 66, 89);

		panelPrincipal.add(btnCarta2);
		

		JButton btnCarta4 = new JButton("");
		btnCarta4.setBackground(new Color(0, 255, 255));
		btnCarta4.setBounds(39, 11, 66, 89);
		panelPrincipal.add(btnCarta4);

		JButton btnCarta1 = new JButton("");
		btnCarta1.setBackground(new Color(0, 255, 255));
		btnCarta1.setBounds(120, 12, 66, 89);
		panelPrincipal.add(btnCarta1);

		
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

		JButton btnPedir = new JButton("Pedir");
		btnPedir.setBounds(36, 112, 85, 21);
		panelPrincipal.add(btnPedir);
		btnPedir.setVisible(false);

		JButton btnCarta6 = new JButton("");
		btnCarta6.setBackground(Color.CYAN);
		btnCarta6.setBounds(216, 11, 66, 89);
		panelPrincipal.add(btnCarta6);

		JButton btnPlantarse = new JButton("Plantarse");
		btnPlantarse.setBounds(168, 112, 85, 21);
		panelPrincipal.add(btnPlantarse);

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

		JLabel lblRes2 = new JLabel("");
		lblRes2.setBounds(223, 200, 45, 13);
		panelPrincipal.add(lblRes2);
		
		JLabel lblRes1 = new JLabel("");
		lblRes1.setBounds(223, 61, 45, 13);
		panelPrincipal.add(lblRes1);
		
		JLabel lblDerrota = new JLabel("Has Perdido");
		lblDerrota.setBounds(84, 28, 275, 120);
		panelDerrota.add(lblDerrota);
		lblDerrota.setForeground(new Color(255, 255, 0));
		lblDerrota.setHorizontalAlignment(SwingConstants.CENTER);
		lblDerrota.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblVictoria = new JLabel("Has Ganado");
		lblVictoria.setBounds(94, 51, 264, 130);
		panelVictoria.add(lblVictoria);
		lblVictoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblVictoria.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panelDerrota.setLayout(null);
		panelVictoria.setBackground(new Color(128, 255, 128));
		panelVictoria.setLayout(null);
		panelVictoria.setVisible(false);
		
		panelVictoria.setBounds(0, 0, 445, 261);
		contentPane.add(panelVictoria);
		btnPlantarse.setVisible(false);

		
		JPanel panelInstrucciones = new JPanel();
		panelInstrucciones.setBackground(new Color(128, 255, 255));
		panelInstrucciones.setBounds(0, 0, 434, 261);
		contentPane.add(panelInstrucciones);
		panelInstrucciones.setLayout(null);
		
		JLabel lblTitulo = new JLabel("BLACK JACK");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(105, 23, 238, 30);
		panelInstrucciones.add(lblTitulo);
		
		JLabel lblInstrucciones1 = new JLabel("Esta pruba consiste en la suma de las dos cartas");
		lblInstrucciones1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstrucciones1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInstrucciones1.setBounds(34, 80, 364, 37);
		panelInstrucciones.add(lblInstrucciones1);
		
		JLabel lblInstrucciones2 = new JLabel("el que mas sume gana la prueba");
		lblInstrucciones2.setHorizontalAlignment(SwingConstants.CENTER);
		lblInstrucciones2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInstrucciones2.setBounds(34, 112, 364, 37);
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
			int res1 = 0;
			int res2 = 0;
			public void actionPerformed(ActionEvent e) {
				int aleatorio1;
				int aleatorio2;
				aleatorio1=(int)(1+Math.random()*21);
				aleatorio2=(int)(1+Math.random()*21);
				
				btnJugar.setVisible(false);
				btnPedir.setVisible(true);
				btnPlantarse.setVisible(true);
				int random1=(int)(1+Math.random()*10);
				 btnCarta1.setText(String.valueOf(random1));
				 res1 += random1;
				 int random2=(int)(1+Math.random()*10);
				 btnCarta2.setText(String.valueOf(random2));
				 res2 += random2;
				 
				btnPedir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(res2 < 21) {
							 int random2=(int)(1+Math.random()*10);
							 btnCarta2.setText(String.valueOf(random2));
							 res2 += random2;
							 lblRes2.setText(String.valueOf(res2));
							 if(res2>21) {
								 panelVictoria.setVisible(false);
								 panelDerrota.setVisible(true);
								 panelPrincipal.setVisible(false);
							 }
						}
					}
				});
				btnPlantarse.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						while(res1 <= 16) {
							 int random1=(int)(1+Math.random()*10);
							 btnCarta1.setText(String.valueOf(random1));
							 res1 += random1;
							 lblRes1.setText(String.valueOf(res1));
						}
						if (res1==res2) {
							
						}else if ((res1>res2)&&(res1<=21)){
							panelDerrota.setVisible(true);
							 panelPrincipal.setVisible(false);
							 panelVictoria.setVisible(false);
						}else if ((res2>res1)&&(res2<=21)){
							panelDerrota.setVisible(false);
							panelVictoria.setVisible(true);
							 panelPrincipal.setVisible(false);
						}else if ((res1>21)&&(res2<=21)){
							panelDerrota.setVisible(false);
							panelVictoria.setVisible(true);
							 panelPrincipal.setVisible(false);
						}
					}
				});
			}
		});
		
		
	}
}
