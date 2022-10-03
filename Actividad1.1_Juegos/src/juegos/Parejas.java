package juegos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Parejas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parejas frame = new Parejas();
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
	public Parejas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelIntro = new JPanel();
		panelIntro.setBounds(10, 10, 416, 243);
		contentPane.add(panelIntro);
		panelIntro.setLayout(null);
		
		JPanel panelGanar = new JPanel();
		panelGanar.setBounds(10, 10, 416, 243);
		contentPane.add(panelGanar);
		panelGanar.setLayout(null);
		panelGanar.setVisible(false);
		
		JPanel panelPerder = new JPanel();
		panelPerder.setBounds(10, 10, 416, 243);
		contentPane.add(panelPerder);
		panelPerder.setLayout(null);
		panelPerder.setVisible(false);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(10, 10, 416, 243);
		contentPane.add(panel1);
		panel1.setLayout(null);
		panel1.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("DOBLES PAREJAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(95, 11, 209, 62);
		panelIntro.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hay que acertar dos cartas que sean iguales...");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(64, 84, 301, 38);
		panelIntro.add(lblNewLabel_1);
		
		JButton btnInicio = new JButton("COMENZAR");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelIntro.setVisible(false);
				panel1.setVisible(true);
			}
		});
		btnInicio.setBounds(138, 149, 134, 23);
		panelIntro.add(btnInicio);
		
		JLabel lblPerdido = new JLabel("HAS PERDIDO");
		lblPerdido.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerdido.setBounds(138, 112, 120, 34);
		panelPerder.add(lblPerdido);
		
		JLabel lblGanar = new JLabel("HAS GANADO");
		lblGanar.setHorizontalAlignment(SwingConstants.CENTER);
		lblGanar.setBounds(138, 112, 133, 26);
		panelGanar.add(lblGanar);
		
		JButton btnCarta1 = new JButton();
		btnCarta1.setForeground(new Color(231, 236, 237));
		btnCarta1.setBounds(28, 29, 85, 68);
		panel1.add(btnCarta1);
		
		JButton btnCarta2 = new JButton();
		btnCarta2.setForeground(new Color(231, 236, 237));
		btnCarta2.setBounds(292, 136, 85, 68);
		panel1.add(btnCarta2);
		
		JButton btnCarta3 = new JButton();
		btnCarta3.setForeground(new Color(231, 236, 237));
		btnCarta3.setBounds(160, 29, 85, 68);
		panel1.add(btnCarta3);
		
		JButton btnCarta4 = new JButton();
		btnCarta4.setForeground(new Color(231, 236, 237));
		btnCarta4.setBounds(160, 136, 85, 68);
		panel1.add(btnCarta4);
		
		JButton btnCarta5 = new JButton();
		btnCarta5.setForeground(new Color(231, 236, 237));
		btnCarta5.setBounds(28, 136, 85, 68);
		panel1.add(btnCarta5);
		
		JButton btnCarta6 = new JButton();
		btnCarta6.setForeground(new Color(231, 236, 237));
		btnCarta6.setBounds(292, 29, 85, 68);
		panel1.add(btnCarta6);

		ArrayList<Integer> cartas = new ArrayList<>();
		
		cartas.add(1);
		cartas.add(2);
		cartas.add(3);
		cartas.add(1);
		cartas.add(2);
		cartas.add(3);
		
		numerarParejas(cartas, btnCarta1, btnCarta2, btnCarta3, btnCarta4, btnCarta5, btnCarta6);
		
		btnCarta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				crearParejas(cartas, btnCarta1, btnCarta2, btnCarta3, btnCarta4, btnCarta5, btnCarta6);

			}
		});
		
		btnCarta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				crearParejas(cartas, btnCarta1, btnCarta2, btnCarta3, btnCarta4, btnCarta5, btnCarta6);

			}
		});
		
		btnCarta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				crearParejas(cartas, btnCarta1, btnCarta2, btnCarta3, btnCarta4, btnCarta5, btnCarta6);

			}
		});
		
		btnCarta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				crearParejas(cartas, btnCarta1, btnCarta2, btnCarta3, btnCarta4, btnCarta5, btnCarta6);

			}
		});
		
		btnCarta5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				crearParejas(cartas, btnCarta1, btnCarta2, btnCarta3, btnCarta4, btnCarta5, btnCarta6);

			}
		});
		
		btnCarta6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				crearParejas(cartas, btnCarta1, btnCarta2, btnCarta3, btnCarta4, btnCarta5, btnCarta6);

			}
		});
		
	}
	
	public void crearParejas (ArrayList<Integer> cartas, JButton btnCarta1, JButton btnCarta2, JButton btnCarta3,
								JButton btnCarta4 ,JButton btnCarta5 ,JButton btnCarta6) {
				
		if(btnCarta1.equals(btnCarta2) && btnCarta1.equals(btnCarta3) && btnCarta1.equals(btnCarta4) 
				&& btnCarta1.equals(btnCarta5) && btnCarta1.equals(btnCarta6)) {
			btnCarta1.setBackground(Color.GREEN);
		}
		if(btnCarta2.equals(btnCarta1) && btnCarta2.equals(btnCarta3) && btnCarta2.equals(btnCarta4) 
				&& btnCarta2.equals(btnCarta5) && btnCarta2.equals(btnCarta6)) {
			btnCarta3.setBackground(Color.GREEN);
		}
		if(btnCarta3.equals(btnCarta2) && btnCarta3.equals(btnCarta1) && btnCarta3.equals(btnCarta4) 
				&& btnCarta3.equals(btnCarta5) && btnCarta3.equals(btnCarta6)) {
			btnCarta3.setBackground(Color.GREEN);
		}
		if(btnCarta4.equals(btnCarta2) && btnCarta4.equals(btnCarta3) && btnCarta4.equals(btnCarta1) 
				&& btnCarta4.equals(btnCarta5) && btnCarta4.equals(btnCarta6)) {
			btnCarta4.setBackground(Color.GREEN);
		}
		if(btnCarta5.equals(btnCarta2) && btnCarta5.equals(btnCarta3) && btnCarta5.equals(btnCarta4) 
				&& btnCarta5.equals(btnCarta1) && btnCarta5.equals(btnCarta6)) {
			btnCarta5.setBackground(Color.GREEN);
		}
		if(btnCarta6.equals(btnCarta2) && btnCarta6.equals(btnCarta3) && btnCarta6.equals(btnCarta4) 
				&& btnCarta6.equals(btnCarta5) && btnCarta6.equals(btnCarta1)) {
			btnCarta6.setBackground(Color.GREEN);
		}
		
			
	}
	
	public void numerarParejas (ArrayList<Integer> cartas, JButton btnCarta1, JButton btnCarta2, JButton btnCarta3,
			JButton btnCarta4 ,JButton btnCarta5 ,JButton btnCarta6) {
		
		int aleatorio = 0, num1, num2, num3, num4, num5, num6;
		
			aleatorio = (int)(Math.random()*cartas.size());
			num1 = cartas.get(aleatorio);
			cartas.remove(aleatorio);
			btnCarta1.setText(String.valueOf(num1));
			
			aleatorio = (int)(Math.random()*cartas.size());
			num2 = cartas.get(aleatorio);
			cartas.remove(aleatorio);
			btnCarta2.setText(String.valueOf(num2));
			
			aleatorio = (int)(Math.random()*cartas.size());
			num3 = cartas.get(aleatorio);
			cartas.remove(aleatorio);
			btnCarta3.setText(String.valueOf(num3));
			
			aleatorio = (int)(Math.random()*cartas.size());
			num4 = cartas.get(aleatorio);
			cartas.remove(aleatorio);
			btnCarta4.setText(String.valueOf(num4));
			
			aleatorio = (int)(Math.random()*cartas.size());
			num5 = cartas.get(aleatorio);
			cartas.remove(aleatorio);
			btnCarta5.setText(String.valueOf(num5));
			
			aleatorio = (int)(Math.random()*cartas.size());
			num6 = cartas.get(aleatorio);
			cartas.remove(aleatorio);
			btnCarta6.setText(String.valueOf(num6));
		
	}
}
