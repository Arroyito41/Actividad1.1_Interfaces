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
		lblSumaBot.setBounds(305, 28, 89, 46);
		panelPrincipal.add(lblSumaBot);
		
		JButton btnCarta1 = new JButton("");
		btnCarta1.setBackground(new Color(128, 128, 255));
		btnCarta1.setForeground(new Color(0, 0, 0));
		btnCarta1.setBounds(39, 161, 66, 89);
		panelPrincipal.add(btnCarta1);
		
		JButton btnCarta2 = new JButton("");
		btnCarta2.setBackground(new Color(128, 128, 255));
		btnCarta2.setBounds(168, 161, 66, 89);
		panelPrincipal.add(btnCarta2);
		
		JButton btnCarta3 = new JButton("");
		btnCarta3.setBackground(new Color(0, 255, 255));
		btnCarta3.setBounds(39, 11, 66, 89);
		panelPrincipal.add(btnCarta3);
		
		JButton btnCarta4 = new JButton("");
		btnCarta4.setBackground(new Color(0, 255, 255));
		btnCarta4.setBounds(168, 11, 66, 89);
		panelPrincipal.add(btnCarta4);
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.setBounds(97, 111, 89, 23);
		panelPrincipal.add(btnJugar);
		
		JLabel lblSuma = new JLabel("");
		lblSuma.setBounds(305, 182, 89, 46);
		panelPrincipal.add(lblSuma);
		
		JLabel lblGanar = new JLabel("Has ganado");
		lblGanar.setHorizontalAlignment(SwingConstants.CENTER);
		lblGanar.setBounds(324, 103, 70, 31);
		panelPrincipal.add(lblGanar);
		
		JLabel lblPerder = new JLabel("Has perdido");
		lblPerder.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerder.setBounds(324, 145, 70, 31);
		panelPrincipal.add(lblPerder);
		
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
				lblGanar.setVisible(false);
				lblPerder.setVisible(false);
			}
		});
		
		
		
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int random1=(int)(1+Math.random()*10);
				int random2=(int)(1+Math.random()*10);
				int random3=(int)(1+Math.random()*10);
				int random4=(int)(1+Math.random()*10);
				int resultado1;
				int resultado2;
				
				resultado1=random1+random2;
				resultado2=random3+random4;
				
				btnCarta1.setText(String.valueOf(random1));
				btnCarta2.setText(String.valueOf(random2));
				btnCarta3.setText(String.valueOf(random3));
				btnCarta4.setText(String.valueOf(random4));
				
				lblSuma.setText(String.valueOf(resultado1));
				lblSumaBot.setText(String.valueOf(resultado2));
				
				if (resultado1>resultado2) {
					lblGanar.setVisible(true);
					lblPerder.setVisible(false);
				}else {
					lblPerder.setVisible(true);
					lblGanar.setVisible(false);
				}
			}
		});
		
	}
}
