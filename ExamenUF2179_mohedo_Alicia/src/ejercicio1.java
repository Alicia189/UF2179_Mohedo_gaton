import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField textnombre;
	private JTextField textapellido;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbida;
	private JRadioButton idayvuelta;
	private JButton btncalcular;
	private JComboBox combodestino;
	private JComboBox comborigen;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio1 frame = new ejercicio1();
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
	public ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow][][grow][][][][][grow][][]", "[][][][][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("Venta de Billetes");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel, "cell 1 0 12 1");
		
		JLabel lblNewLabel_1 = new JLabel("Origen:");
		contentPane.add(lblNewLabel_1, "cell 2 1,alignx trailing");
		
		 comborigen = new JComboBox();
		comborigen.setForeground(Color.BLACK);
		comborigen.setModel(new DefaultComboBoxModel(new String[] {"Adamuz", "And\u00FAjar", "Cabra", "Carde\u00F1a", "Obejo", "Santaella"}));
		contentPane.add(comborigen, "cell 3 1 10 1,growx");
		
		JLabel lblNewLabel_2 = new JLabel("Destino:");
		contentPane.add(lblNewLabel_2, "cell 2 2,alignx trailing");
		
		combodestino = new JComboBox();
		combodestino.setModel(new DefaultComboBoxModel(new String[] {"Adamuz", "And\u00FAjar", "Cabra", "Carde\u00F1a", "Obejo", "Santaella"}));
		contentPane.add(combodestino, "cell 3 2 10 1,growx");
		
		 lblNewLabel_3 = new JLabel("Nombre");
		contentPane.add(lblNewLabel_3, "cell 2 3,alignx trailing");
		
		textnombre = new JTextField();
		contentPane.add(textnombre, "cell 3 3 3 1,growx");
		textnombre.setColumns(10);
		
		 lblNewLabel_6 = new JLabel("Apellidos");
		contentPane.add(lblNewLabel_6, "cell 9 3,alignx trailing");
		
		textapellido = new JTextField();
		contentPane.add(textapellido, "cell 10 3,growx");
		textapellido.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Precio:");
		contentPane.add(lblNewLabel_4, "cell 2 4,alignx trailing");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 3 4,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Billete:");
		contentPane.add(lblNewLabel_5, "cell 2 5");
		
		 rdbida = new JRadioButton("Ida");
		rdbida.setSelected(true);
		buttonGroup.add(rdbida);
		contentPane.add(rdbida, "cell 3 5");
		
		idayvuelta = new JRadioButton("Ida y vuelta");
		buttonGroup.add(idayvuelta);
		contentPane.add(idayvuelta, "cell 5 5");
		
		btncalcular = new JButton("Calcular");
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JRadioButton targetadorada = new JRadioButton("Targeta Dorada");
		targetadorada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGroup.add(targetadorada);
		contentPane.add(targetadorada, "cell 9 5");
		contentPane.add(btncalcular, "cell 5 6");
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, "cell 2 7 11 1,grow");
			double precio= 20;
			if (idayvuelta.isSelected()) {
				precio= (precio*2)-8;
			}
			if (targetadorada.isSelected()) {
				precio=precio-2.4;
			}
			
		JOptionPane.showMessageDialog(comborigen, combodestino,txtnombre,txtapellido,precio);	
			
		
			
	
	}

}
