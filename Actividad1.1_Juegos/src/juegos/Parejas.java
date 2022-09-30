package juegos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
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
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(10, 10, 416, 243);
		contentPane.add(panel2);
		panel2.setLayout(null);
		panel2.setVisible(false);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(10, 10, 416, 243);
		contentPane.add(panel3);
		panel3.setLayout(null);
		panel3.setVisible(false);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(10, 10, 416, 243);
		contentPane.add(panel4);
		panel4.setLayout(null);
		panel4.setVisible(false);
		
		JPanel panel5 = new JPanel();
		panel5.setBounds(10, 10, 416, 243);
		contentPane.add(panel5);
		panel5.setLayout(null);
		panel5.setVisible(false);
		
		JPanel panel6 = new JPanel();
		panel6.setBounds(10, 10, 416, 243);
		contentPane.add(panel6);
		panel6.setLayout(null);
		panel6.setVisible(false);
		
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
				panel2.setVisible(true);
				panel3.setVisible(true);
				panel4.setVisible(true);
				panel5.setVisible(true);
				panel6.setVisible(true);

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
		
		JButton btnCarta1 = new JButton("1");
		btnCarta1.setForeground(new Color(231, 236, 237));
		btnCarta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCarta1.setBounds(28, 29, 85, 68);
		panel1.add(btnCarta1);
		
		JButton btnCarta2 = new JButton("1");
		btnCarta2.setForeground(new Color(231, 236, 237));
		btnCarta2.setBounds(292, 136, 85, 68);
		panel2.add(btnCarta2);
		
		JButton btnCarta3 = new JButton("2");
		btnCarta3.setForeground(new Color(231, 236, 237));
		btnCarta3.setBounds(160, 29, 85, 68);
		panel3.add(btnCarta3);
		
		JButton btnCarta4 = new JButton("2");
		btnCarta4.setForeground(new Color(231, 236, 237));
		btnCarta4.setBounds(160, 136, 85, 68);
		panel4.add(btnCarta4);
		
		JButton btnCarta5 = new JButton("3");
		btnCarta5.setForeground(new Color(231, 236, 237));
		btnCarta5.setBounds(28, 136, 85, 68);
		panel5.add(btnCarta5);
		
		JButton btnCarta6 = new JButton("3");
		btnCarta6.setForeground(new Color(231, 236, 237));
		btnCarta6.setBounds(292, 29, 85, 68);
		panel6.add(btnCarta6);

	}
		/*public void botonesParejas (JButton btnCarta1, JButton btnCarta2, JButton btnCarta3, JButton btnCarta4, 
									JButton btnCarta5, JButton btnCarta6, JPanel panelGanar, JPanel panelPerder) {
			
			if(btnCarta1.getText().equals(btnCarta2)) {
				panelGanar.setVisible(true);
			}
			
			
		}*/
}
