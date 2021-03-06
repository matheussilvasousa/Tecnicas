package controle;



import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CadastroPaciente extends JFrame{
	
	private JLabel nome;
	private JLabel fone;
	private JLabel senha;
	private JLabel idade;
	private JTextField idadeText;
	private JPasswordField senhaText;
	private JTextField nomeText;
	private JTextField foneText;
	private JPanel contentPane;
	private Font fontePadrao;
	private JLabel titulo;
	private JButton ok;
	private JLabel adress;
	private JTextField adressText;
	
	private static final long serialVersionUID = -3578867369088875029L;

	public CadastroPaciente(){
	
		setTitle("Adicionar Paciente");
		setVisible(true);
		setBounds(100,100,400, 405);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		fontePadrao = new Font("Serif", Font.PLAIN, 25);
		
		
		nomeText = new JTextField();
		nomeText.setBounds(110,55,230,30);
		nomeText.setFont(fontePadrao);
		contentPane.add(nomeText);

		idade = new JLabel("Idade: ");
		idade.setFont(fontePadrao);
		idade.setBounds(10, 100, 200, 40);
		contentPane.add(idade);
		
		idadeText = new JTextField();
		idadeText.setFont(fontePadrao);
		idadeText.setBounds(110, 105, 60, 30);
		contentPane.add(idadeText);
		
		
		
		foneText = new JTextField();
		foneText.setBounds(110,155,190,30);
		foneText.setFont(fontePadrao);
		contentPane.add(foneText);
		
		
		senhaText = new JPasswordField();
		senhaText.setBounds(110,205,190,30);
		senhaText.setFont(fontePadrao);
		contentPane.add(senhaText);
		

		adressText = new JTextField();
		adressText.setFont(fontePadrao);
		adressText.setBounds(145, 255, 200, 30);
		contentPane.add(adressText);
		
		
		
		
		titulo = new JLabel("ADICIONAR PACIENTE");
		titulo.setBounds(40, 15, 360, 20);
		titulo.setFont(fontePadrao);
		contentPane.add(titulo);
		
		nome = new JLabel("Nome: ");
		nome.setFont(fontePadrao);
		nome.setBounds(10, 50, 200, 40);
		contentPane.add(nome);
		
		fone = new JLabel("Fone: ");
		fone.setFont(fontePadrao);
		fone.setBounds(10, 150, 200, 40);
		contentPane.add(fone);
	
		senha = new JLabel("Senha: ");
		senha.setFont(fontePadrao);
		senha.setBounds(10, 200, 200, 40);
		contentPane.add(senha);
		
		
		adress = new JLabel("Endereço: ");
		adress.setFont(fontePadrao);
		adress.setBounds(10, 250, 200, 40);
		contentPane.add(adress);
		
		
		
		ok = new JButton("Cadastrar");
		ok.setBounds(10,315,370,60);
		ok.setFont(fontePadrao);
		contentPane.add(ok);		
	}


	/**
	 * Retorna uma string com o endereço do paciente
	 * @return texto do endereço
	 */
	public String getAdressText() {
		return adressText.getText();
	}

	/**
	 * Retorna uma string com o texto da senha
	 * @return aux
	 */
	public String getSenhaText() {
		String aux = new String(senhaText.getPassword());
		return aux;
	}

	/**
	 * Retorna uma string com o nome do paciente
	 * @return texto do nome
	 */
	public String getNomeText() {
		return nomeText.getText();
	}
	
	/**
	 * Retorna a idade do paciente
	 * @return aux
	 */
	public int getIdadeText() {
		int aux=-1;
		try{
			aux = Integer.parseInt(idadeText.getText());
			return aux;
		}catch(NumberFormatException e){
		}
		return aux;
	}

	/**
	 * Retorna o telefone do paciente
	 * @return o texto do telefone
	 */
	public String getFoneText() {
		return foneText.getText();
	}

	/**
	 * Envia o botao "ok"
	 * @return ok
	 */
	public JButton getOk() {
		return ok;
	}

}
