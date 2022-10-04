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
		panelDerrota.setBounds(0, 0, 10, 10);
		contentPane.add(panelDerrota);
		panelDerrota.setVisible(false);
		
		JLabel lblSumaBot = new JLabel("");
		lblSumaBot.setBounds(305, 28, 89, 46);
		panelPrincipal.add(lblSumaBot);
		
		JButton btnCarta2 = new JButton("");
		btnCarta2.setBackground(new Color(128, 128, 255));
		btnCarta2.setForeground(new Color(0, 0, 0));
		btnCarta2.setBounds(120, 162, 66, 89);
		panelPrincipal.add(btnCarta2);
		
		JButton btnCarta1 = new JButton("");
		btnCarta1.setBackground(new Color(0, 255, 255));
		btnCarta1.setBounds(120, 12, 66, 89);
		panelPrincipal.add(btnCarta1);
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.setBounds(97, 111, 89, 23);
		panelPrincipal.add(btnJugar);
		
		JButton btnPedir = new JButton("Pedir");
		btnPedir.setBounds(36, 112, 85, 21);
		panelPrincipal.add(btnPedir);
		btnPedir.setVisible(false);
		
		JButton btnPlantarse = new JButton("Plantarse");
		btnPlantarse.setBounds(168, 112, 85, 21);
		panelPrincipal.add(btnPlantarse);
		
		JLabel lblRes2 = new JLabel("");
		lblRes2.setBounds(223, 200, 45, 13);
		panelPrincipal.add(lblRes2);
		
		JLabel lblRes1 = new JLabel("");
		lblRes1.setBounds(249, 61, 45, 13);
		panelPrincipal.add(lblRes1);
		
		JLabel lblDerrota = new JLabel("Has Perdido");
		lblDerrota.setBounds(138, 30, 130, 31);
		panelDerrota.add(lblDerrota);
		lblDerrota.setHorizontalAlignment(SwingConstants.CENTER);
		lblDerrota.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panelDerrota.setLayout(null);
		
		JLabel lblVictoria = new JLabel("Has Ganado");
		lblVictoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblVictoria.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblVictoria.setBounds(55, 12, 282, 89);
		panelVictoria.add(lblVictoria);
		panelVictoria.setVisible(false);
		
		panelVictoria.setBounds(0, 0, 445, 261);
		contentPane.add(panelVictoria);
		btnPlantarse.setVisible(false);
		
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
			int res1 = 0;
			int res2 = 0;
			public void actionPerformed(ActionEvent e) {
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
