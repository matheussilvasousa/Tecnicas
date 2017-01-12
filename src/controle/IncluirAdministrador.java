package controle;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class IncluirAdministrador extends JFrame {

	private static final long serialVersionUID = 1310628701369316347L;
	JComboBox<String> add;
	private JPanel contentPane;
	private Font fontePadrao;
	private JButton medico;
	private JButton paciente;
	private JButton atendente;

	public IncluirAdministrador() {

		setTitle("");
		setBounds(100, 100, 400, 100);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);

		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(1, 3));
		setContentPane(contentPane);
		fontePadrao = new Font("Serif", Font.BOLD, 15);

		medico = new JButton("Medico");
		medico.setFont(fontePadrao);
		paciente = new JButton("Paciente");
		paciente.setFont(fontePadrao);

		atendente = new JButton("Atendente");
		atendente.setFont(fontePadrao);

		contentPane.add(medico);
		contentPane.add(paciente);
		contentPane.add(atendente);
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
	
	/**
	 * Retorna o botão do atendente
	 * @return atendente
	 */
	public JButton getAtendente() {
		return atendente;
	}
	
}
