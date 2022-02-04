import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.util.ArrayList;

public class ventanaAutocar extends JFrame {

	private JPanel contentPane;
	private JTextField textmatricula;
	private JTextField textmarca;
	private JTextField textkilometros;
	private JTextField textmodelo;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private ArrayList<Autocares1>Autocares1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaAutocar frame = new ventanaAutocar();
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
	public ventanaAutocar() {
		Autocares1 = new ArrayList <Autocares1>();
		
	
	
	
	
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[10px][][grow][][][][][grow][][]", "[10px][][][][][][][][grow]"));
		
		JLabel lblNewLabel_5 = new JLabel("Gesti\u00F3n autocares");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_5, "cell 2 1 8 1,alignx leading");
		
		JLabel lblNewLabel = new JLabel("Matr\u00EDcula");
		contentPane.add(lblNewLabel, "cell 1 2,alignx trailing");
		
		textmatricula = new JTextField();
		contentPane.add(textmatricula, "cell 2 2,growx");
		textmatricula.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Marca");
		contentPane.add(lblNewLabel_1, "cell 1 3,alignx trailing");
		
		textmarca = new JTextField();
		contentPane.add(textmarca, "cell 2 3,growx");
		textmarca.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Modelo:");
		contentPane.add(lblNewLabel_3, "flowx,cell 9 3");
		
		JLabel lblNewLabel_2 = new JLabel("Kilometros");
		contentPane.add(lblNewLabel_2, "cell 1 4,alignx trailing");
		
		textkilometros = new JTextField();
		contentPane.add(textkilometros, "cell 2 4,growx");
		textkilometros.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Plazas:");
		contentPane.add(lblNewLabel_4, "flowx,cell 9 4");
		
		textmodelo = new JTextField();
		contentPane.add(textmodelo, "cell 9 3");
		textmodelo.setColumns(10);
		
		JSpinner formattedTextField = new JSpinner();
		formattedTextField.setModel(new SpinnerNumberModel(30, 1, 80, 1));
		contentPane.add(formattedTextField, "cell 9 4");
		
		 btnNewButton = new JButton("Insertar");
		contentPane.add(btnNewButton, "cell 2 6");
		
		 btnNewButton_1 = new JButton("Mostrar Datos");
		contentPane.add(btnNewButton_1, "cell 7 6");
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, "cell 1 8 9 1,grow");
	}
}
