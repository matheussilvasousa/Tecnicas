package controle;


import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IncluirAtendente extends JFrame{

	private static final long serialVersionUID = -3645583524938869975L;

	JComboBox<String> add;
	private JPanel contentPane;
	private Font fontePadrao;
	private JButton medico;
	private JButton paciente;
	
	public IncluirAtendente(){
		
		
		setTitle("");
		setBounds(100, 100, 300, 100);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(1,2));
		setContentPane(contentPane);
		fontePadrao = new Font("Serif",Font.BOLD, 15);
		
		medico = new JButton("Medico");
		medico.setFont(fontePadrao);
		paciente = new JButton("Paciente");
		paciente.setFont(fontePadrao);
		
		contentPane.add(medico);
		contentPane.add(paciente);	
	}

	/**
	 * Retorna o botão do médico
	 * @return medico
	 */
	public JButton getMedico() {
		return medico;
	}

	/**
	 * Retorna o botão do paciente
	 * @return paciente
	 */
	public JButton getPaciente() {
		return paciente;
	}
		
}
