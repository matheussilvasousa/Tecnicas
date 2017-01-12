package controle;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ModificaView extends JFrame{
	
	private static final long serialVersionUID = 2238960045044079286L;
		private JLabel nome;
		private JLabel fone;
		private JLabel senha;
		private JLabel area;
		private JLabel idade;
		private JTextField areaText;
		private JTextField idadeText;
		private JTextField senhaText;
		private JTextField nomeText;
		private JTextField foneText;
		private JPanel contentPane;
		private Font fontePadrao;
		private JLabel titulo;
		private JButton show;
		private JButton save;
		private JLabel adress;
		private JLabel tipo;
		private JTextField tipoText;
		private JTextField adressText;
		
		
		
		public ModificaView(){
			
			
			setTitle("Dados");
			setVisible(true);
			setBounds(100,100,420, 530);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			contentPane = new JPanel();
			setContentPane(contentPane);
			contentPane.setLayout(null);
			fontePadrao = new Font("Serif", Font.PLAIN, 25);
			
			
			titulo = new JLabel("MODIFICAR CADASTRO");
			titulo.setBounds(40, 15, 360, 20);
			titulo.setFont(fontePadrao);
			contentPane.add(titulo);
			
			nome = new JLabel("Nome: ");
			nome.setFont(fontePadrao);
			nome.setBounds(10, 50, 200, 40);
			contentPane.add(nome);
			
			idade = new JLabel("Idade: ");
			idade.setFont(fontePadrao);
			idade.setBounds(10, 100, 200, 40);
			contentPane.add(idade);
			
			fone = new JLabel("Fone: ");
			fone.setFont(fontePadrao);
			fone.setBounds(10, 150, 200, 40);
			contentPane.add(fone);
		
			senha = new JLabel("Senha: ");
			senha.setFont(fontePadrao);
			senha.setBounds(10, 200, 200, 40);
			contentPane.add(senha);
			
			area = new JLabel("Área: ");
			area.setFont(fontePadrao);
			area.setBounds(10, 255, 200, 40);
			contentPane.add(area);
			
			adress = new JLabel("Endereço: ");
			adress.setFont(fontePadrao);
			adress.setBounds(10, 300, 200, 40);
			contentPane.add(adress);
			
			tipo = new JLabel("Tipo: ");
			tipo.setFont(fontePadrao);
			tipo.setBounds(10, 350, 200, 40);
			contentPane.add(tipo);
			

			nomeText = new JTextField("?");
			nomeText.setFont(fontePadrao);
			nomeText.setBounds(110, 50, 200, 40);
			contentPane.add(nomeText);
			
			idadeText = new JTextField("?");
			idadeText.setFont(fontePadrao);
			idadeText.setBounds(110, 100, 200, 40);
			contentPane.add(idadeText);
			
			foneText = new JTextField("?");
			foneText.setBounds(110,155,190,40);
			foneText.setFont(fontePadrao);
			contentPane.add(foneText);
			
			
			senhaText = new JTextField("?");
			senhaText.setBounds(110,205,190,40);
			senhaText.setFont(fontePadrao);
			contentPane.add(senhaText);
			
			areaText = new JTextField("?");
			areaText.setFont(fontePadrao);
			areaText.setBounds(110, 255, 200, 40);
			contentPane.add(areaText);
			
			adressText = new JTextField("?");
			adressText.setFont(fontePadrao);
			adressText.setBounds(160, 300, 200, 40);
			contentPane.add(adressText);
			
			tipoText = new JTextField("?");
			tipoText.setFont(fontePadrao);
			tipoText.setBounds(110, 350, 200, 40);
			contentPane.add(tipoText);
			
			show = new JButton("Info");
			show.setBounds(10,420,180,60);
			show.setFont(fontePadrao);
			contentPane.add(show);
			
			save = new JButton("Salvar");
			save.setBounds(200,420,180,60);
			save.setFont(fontePadrao);
			contentPane.add(save);
			
			
		}

		/**
		 * Retorna o botão de mostrar
		 * @return show
		 */
		public JButton getShow() {
			return show;
		}
		
		/**
		 * Retorna o botão de salvar
		 * @return
		 */
		public JButton getSave() {
			return save;
		}
		
		/**
		 * Guarda a área do médico
		 * @param areaText
		 */
		public void setAreaText(String areaText) {
			this.areaText.setText(areaText);
		}
		
		/**
		 * Retorna a área do médico
		 * @return uma string com a área
		 */
		public String getAreaText(){
			return areaText.getText();
		}		

		/**
		 * Guarda a idade do usuário
		 * @param idadeText
		 */
		public void setIdadeText(int idadeText) {
			this.idadeText.setText(String.valueOf(idadeText));
		}
		
		/**
		 * Retorna a idade do usuário
		 * @return uma string com a idade
		 */
		public String getIdadeText(){
			return idadeText.getText();
		}

		/**
		 * Guarda a senha do usuário
		 * @param senhaText
		 */
		public void setSenhaText(String senhaText) {
			this.senhaText.setText(senhaText);
		}
		
		/**
		 * Retorna a senha do usuário
		 * @return uma string com a senha
		 */
		public String getSenhaText(){
			return senhaText.getText();
		}
		
		/**
		 * Guarda o nome do usuário
		 * @param nomeText
		 */
		public void setNomeText(String nomeText) {
			this.nomeText.setText(nomeText);
		}
		
		/**
		 * Retorna o nome do usuário
		 * @return uma string com o nome
		 */
		public String getNomeText(){
			return nomeText.getText();
		}
		
		/**
		 * Guarda o telefone do usuário
		 * @param foneText
		 */
		public void setFoneText(String foneText) {
			this.foneText.setText(foneText);
		}
		
		/**
		 * Retorna o telefone do usuário
		 * @return uma string com o telefone
		 */
		public String getFoneText(){
			return foneText.getText();
		}
		
		/**
		 * Guarda o endereço do usuário
		 * @param adressText
		 */
		public void setAdressText(String adressText) {
			this.adressText.setText(adressText);
		}
		
		/**
		 * Retorna o endereço do usuário
		 * @return uma string com o endereço
		 */
		public String getAdressText(){
			return adressText.getText();
		}
		
		/**
		 * Guarda o tipo do usuário
		 * @param tipoText
		 */
		public void setTipoText(String tipoText) {
			this.tipoText.setText(tipoText);
		}
		
		/**
		 * Retorna a especialidade do médico
		 * @return int
		 */
		public int getTipoText(){
			
			if(tipoText.getText().equalsIgnoreCase("Sistema Nervoso"))
				return 1; 
			else if(tipoText.getText().equalsIgnoreCase("Viral"))
				return 2; 
			else if(tipoText.getText().equalsIgnoreCase("Fratura"))
				return 3; 
			else if(tipoText.getText().equalsIgnoreCase("Vascular"))
				return 4;
			else if(tipoText.getText().equalsIgnoreCase("Respiratório"))
				return 5;
			else
				return 0;
		}
	
}