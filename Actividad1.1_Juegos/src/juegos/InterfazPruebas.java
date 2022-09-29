package juegos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class InterfazPruebas extends JFrame {

	private JPanel contentPane;
	private JTextField textPrueba1;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		textPrueba1 = new JTextField();
		textPrueba1.setText("PRUEBA 1");
		textPrueba1.setBounds(159, 10, 96, 19);
		contentPane.add(textPrueba1);
		textPrueba1.setColumns(10);
		
		JButton btnPuerta1 = new JButton("Puerta 1");
		btnPuerta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnPuerta1.setBounds(30, 53, 71, 102);
		contentPane.add(btnPuerta1);
		

		JButton btnPuerta2 = new JButton("Puerta 2");
		btnPuerta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPuerta2.setBounds(134, 53, 71, 102);
		contentPane.add(btnPuerta2);
		
		JButton btnPuerta3 = new JButton("Puerta 3");
		btnPuerta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPuerta3.setBounds(234, 53, 71, 102);
		contentPane.add(btnPuerta3);
		
		JButton btnPuerta4 = new JButton("Puerta 4");
		btnPuerta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPuerta4.setBounds(329, 53, 71, 102);
		contentPane.add(btnPuerta4);
		
	}

}
