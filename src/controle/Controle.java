package controle;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;


public class Controle extends JFrame {

	private static final long serialVersionUID = 1L; // opcional eclipse

	private JPanel contentPane;
	static Container grid;

	private JMenuItem ExitMenuItem;
	private JMenuItem AboutMenuItem;
	private JMenuItem HelpMenuItem1;

	private JMenuItem BarraIncluir;
	private JMenuItem BarraExcluir;
	private JMenuItem BarraModificar;
	private JMenuItem BarraInfo;
	private JMenuItem Creditos;
	private JMenuItem BarraNovaConsulta;
	private JMenuItem BarraListar;
	
	
	private JMenuBar menuBar;
	private JMenu FileMenu;
	private JMenu AboutMenu;
	private JMenu HelpMenu;
	private JToolBar toolBar;
	private JButton botaoIncluir;
	private JButton botaoRemover;
	private JButton nextMes;
	private JButton prevMes;
	private JButton info; 
	private JButton btnNovaCons;
	private JButton list;
	private JButton botaoModificar;
	private Font fontePadrao;
	private Font fonteBarra;
	private Font fontBotoes;
	
	JLabel mesTitulo ;
	
	final int[] limites = {30,31,31,30,31,30,31};
	
	private int auxMes;
	
	private String path;
	
	private  String[] dias = { "31", "1", "2", "3", "4", "5", "6", "7",
			"8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
			"19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
			"30", "1", "2", "3", "4" , "5", "6", "7",
			"8", "9", "10", "11" };
	
	private String[] meses = {"Junho", "Julho","Agosto", "Setembro","Outubro","Novembro","Dezembro"};
	
	
	String[] julho = {"28","29","30"};
	String[] agosto = {"26","27","28","29","30","31"};
	String[] setembro = {"30","31"};
	String[] outubro = {"27","28","29","30"};
	String[] novembro = { };
	String[] dezembro = {"29","30"};

	
	private JButton[] calendar = new JButton[42]; // 35 botões representando o calendário
												
	public Controle(String path) {
		
		
		// PADRÃO PARA JOPTIONPANE
		UIManager.put("OptionPane.messageFont",new FontUIResource(new Font("Serif", Font.PLAIN, 15)));
		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Serif", Font.PLAIN, 10)));
				
				
		
		fontePadrao = new Font("Serif", Font.PLAIN, 25);
		fonteBarra = new Font("Serif", Font.PLAIN, 20);
		fontBotoes = new Font("Serif", Font.PLAIN, 15);
	
	
				

		this.path = path; // PATH DO OBJETO
		
		
		setTitle("Consultas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(0, 0, 1366, 760);

		setVisible(true);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		botaoIncluir = new JButton("Incluir");
		botaoIncluir.setBounds(71, 159, 127, 35);
		botaoIncluir.setFont(fontBotoes);
		botaoIncluir.setToolTipText("Incluir Pessoal");
		contentPane.add(botaoIncluir);

		botaoModificar = new JButton("Modificar");
		botaoModificar.setBounds(71, 219, 127, 35);
		botaoModificar.setFont(fontBotoes);
		botaoModificar.setToolTipText("Modificar Pesooal Cadastrado");
		contentPane.add(botaoModificar);

		
		contentPane.setBackground(new Color(169,169,169));
				
		
		botaoRemover = new JButton("Excluir");
		botaoRemover.setBounds(71, 279, 127, 35);
		botaoRemover.setFont(fontBotoes);
		botaoRemover.setToolTipText("Excluir Pesooal Cadastrado");
		contentPane.add(botaoRemover);

		info = new JButton("Buscar"); // DEVE PEDIR UM NOME E SE ACHAR EM SEGUIDA MOSTRA AS INFORMAÇÕES DAQUELE OBJETO
		info.setBounds(71, 339, 127, 35);
		info.setFont(fontBotoes);
		contentPane.add(info);


		//Botao de nova consulta
		btnNovaCons = new JButton("Nova Consulta");
		btnNovaCons.setBounds(71, 399, 127, 35);
		btnNovaCons.setFont(fontBotoes);
		btnNovaCons.setToolTipText("Adicionar nova Consuta");
		contentPane.add(btnNovaCons);
	
		// Botão list
		list = new JButton("Listar");
		list.setBounds(71, 459, 127, 35);
		list.setFont(fontBotoes);
		list.setToolTipText("Listar Pessoal Cadastrado");
		contentPane.add(list);
		
		
		// pondo o calendario no container
		grid = new JPanel();
		grid.setLayout(new GridLayout(6, 7));
		grid.setBounds(270, 145, 1000, 500);
		contentPane.add(grid);
	
		for (int i = 0; i < 42; i++) {
			String nome = String.valueOf(i);
			calendar[i] = new JButton(nome); // cada botão tem a representação de sua posição agora
			calendar[i].setText(dias[i]);
			grid.add(calendar[i]);
			calendar[i].setFont(fontePadrao);
		}

		DesselectDias();
		
		// botão proximo mes;
		nextMes = new JButton(" >> ");
		nextMes.setBounds(1153, 650, 127, 35);
		nextMes.setFont(fontBotoes);
		contentPane.add(nextMes);
		
		

		// botão do mes anterior;
		prevMes = new JButton(" << ");
		prevMes.setBounds(271, 650, 127, 35);
		prevMes.setFont(fontBotoes);
		contentPane.add(prevMes);

		mesTitulo = new JLabel("Junho 2015"); // mes default
		
		mesTitulo.setFont(new Font("Lucida Sans", Font.BOLD, 35));
		mesTitulo.setBounds(650, 30, 300, 40);
		contentPane.add(mesTitulo);

		JLabel diasSemana = new JLabel(
				" Domingo   Segunda     Terca      Quarta     Quinta       Sexta      Sabado");
		diasSemana.setFont(new Font("Courier 10 Pitch", Font.BOLD, 27));
		diasSemana.setBounds(266, 90, 1000, 40);
		contentPane.add(diasSemana);
		
		
		/**	
		 * MESMAS FUNÇÕES AGORA NA BARRA
		 */
		
		toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 1366, 30);
		toolBar.setFont(fonteBarra);
		contentPane.add(toolBar);
	
		menuBar = new JMenuBar();
		menuBar.setFont(fonteBarra);
		toolBar.add(menuBar);
		
		
		// PADRÃO
		AboutMenuItem = new JMenuItem("About This   ");
		AboutMenuItem.setFont(fonteBarra);
		
		ExitMenuItem = new JMenuItem("Exit          "); 
		ExitMenuItem.setFont(fonteBarra);
		
		HelpMenuItem1 = new JMenuItem("How to exit ");
		HelpMenuItem1.setFont(fonteBarra);
		
		BarraIncluir = new JMenuItem("Incluir       ");
		BarraIncluir.setFont(fonteBarra);
		
		BarraExcluir = new JMenuItem("Excluir       ");
		BarraExcluir.setFont(fonteBarra);
	
		BarraInfo = new JMenuItem("Info           ");
		BarraInfo.setFont(fonteBarra);
		
		BarraModificar = new JMenuItem("Modificar   ");
		BarraModificar.setFont(fonteBarra);
		
		Creditos = new JMenuItem("Créditos     ");
		Creditos.setFont(fonteBarra);
	
		BarraNovaConsulta = new JMenuItem("Nova Consulta ");
		BarraNovaConsulta.setFont(fonteBarra);
		
		BarraListar = new JMenuItem("Listar ");
		BarraListar.setFont(fonteBarra);
		
		
		FileMenu = new JMenu(" File  ");
		FileMenu.setFont(fonteBarra);
		menuBar.add(FileMenu);
		FileMenu.add(ExitMenuItem);
		FileMenu.add(BarraIncluir);
		FileMenu.add(BarraExcluir);
		FileMenu.add(BarraInfo);
		FileMenu.add(BarraModificar);
		FileMenu.add(BarraNovaConsulta);
		FileMenu.add(BarraListar);


		

		

		

		
		//ADD NA BARRA PRINCIPAL
		AboutMenu = new JMenu(" About  ");
		AboutMenu.setFont(fonteBarra);
		menuBar.add(AboutMenu);
		AboutMenu.add(AboutMenuItem);
		AboutMenu.add(Creditos);
		
		HelpMenu = new JMenu(" Help  ");
		HelpMenu.setFont(fonteBarra);
		menuBar.add(HelpMenu);
		HelpMenu.add(HelpMenuItem1);
		

	}

	/**
	 * DEFINE O MES CORRENTE
	 * @param mes
	 */
	public void setMesTitulo(int mes){
	
		mesTitulo.setText(meses[mes]+" 2015");
	
		// DEFININDO O MES CORRENTE
		this.auxMes = mes;
		
	}
	
	/**
	 * RETORNANDO O MES ATUAL PARA PODER MOSTRAR EM CONTROLLER
	 * @return auxMes
	 */
	public int getMesTitulo(){
	
		return auxMes;
	}
	
	/**
	 * REALIZA A TRANSIÇÃO DOS MESES NO CALENDÁRIO
	 * @param mes
	 */
	public void TransicaoMeses(int mes){
		int i,j=1;
		
		switch (mes){
		case 0:
			for(i=0;i<42;i++){
				calendar[i].setText(dias[i]);
			}
			break;
		case 1: // julho
			for(i=0;i<julho.length;i++){
				calendar[i].setText(julho[i]);
			}j=1;
			for(i=julho.length;i<limites[mes];i++){
				calendar[i].setText(String.valueOf(j));
				j++;
			}i+=julho.length;
			for(j=1;i<=41;i++,j++){
				calendar[i].setText(String.valueOf(j));}
			break;
		case 2:// agosto
			for(i=0;i<agosto.length;i++){
				calendar[i].setText(agosto[i]);
			}j=1;
			for(i=agosto.length;i<limites[mes];i++){
				calendar[i].setText(String.valueOf(j));
				j++;
			}i+=agosto.length;
			for(j=1;i<=41;i++,j++){
				calendar[i].setText(String.valueOf(j));}
			break;
		case 3:// agosto
			for(i=0;i<setembro.length;i++){
				calendar[i].setText(setembro[i]);
			}j=1;
			for(i=setembro.length;i<limites[mes];i++){
				calendar[i].setText(String.valueOf(j));
				j++;
			}i+=setembro.length;
			for(j=1;i<=41;i++,j++){
				calendar[i].setText(String.valueOf(j));}
			break;	
		case 4:// outubro
			for(i=0;i<outubro.length;i++){
				calendar[i].setText(outubro[i]);
			}j=1;
			for(i=outubro.length;i<limites[mes];i++){
				calendar[i].setText(String.valueOf(j));
				j++;
			}i+=outubro.length;
			for(j=1;i<=41;i++,j++){
				calendar[i].setText(String.valueOf(j));}
			break;
		case 5:// novembro
			for(i=0;i<novembro.length;i++){
				calendar[i].setText(novembro[i]);
			}j=1;
			for(i=novembro.length;i<limites[mes];i++){
				calendar[i].setText(String.valueOf(j));
				j++;
			}i+=novembro.length;
			for(j=1;i<=41;i++,j++){
				calendar[i].setText(String.valueOf(j));}
			break;	
		case 6:// dezembro
			for(i=0;i<dezembro.length;i++){
				calendar[i].setText(dezembro[i]);
			}j=1;
			for(i=dezembro.length;i<limites[mes];i++){
				calendar[i].setText(String.valueOf(j));
				j++;
			}i+=dezembro.length;
			for(j=1;i<=41;i++,j++){
				calendar[i].setText(String.valueOf(j));}
			break;	
		
		}
		
		DesselectDias();
	}
	
	/**
	 * DESSELECIONA TUDO
	 * PEGA A POSIÇÃO DO PRIMEIRO DIA
	 * DEIXA CLICÁVEIS OS BOTÕES NO LIMITE DAQUELE MES
	 */
	private void DesselectDias(){
		
		int i,j;
		
		
		int aux=0;
		// DESSELECIONA TUDO POR ENQUANTO
		for(j=0;j<42;j++){
			calendar[j].setEnabled(false);
		}
		
		for(i=0;i<15;i++){
			
			j = Integer.valueOf( calendar[i].getText() );// PEGAR A POSIÇÃO DO PRIMEIRO DIA
			if(j==1){
				aux = i; //POSIÇÃO DO DIA 1
			}
		}
		
		// DEIXANDO CLICÁVEIS OS BOTÕES NO LIMITE DAQUELE MES
		
		for (i = 0; i < limites[auxMes]; i++){
			calendar[aux+i].setText(String.valueOf(i+1));
			calendar[aux+i].setEnabled(true);
		}
		
	}
	
	/**
	 * Retorna o caminho do objeto
	 * @return path
	 */
	public String getPath() { 
		return path;
	}

	/**
	 * GETS PARA BOTÕES
	 */
	
	/**
	 * Retorna os botões do calendário
	 * @return calendar
	 */
	public JButton[] getCalendar(){
		return calendar;
	}
	
	/**
	 * Retorna o botão de incluir
	 * @return botaoIncluir
	 */
	public JButton getBotaoIncluir() {
		return botaoIncluir;
	}
	
	/**
	 * Retorna o botão de remover
	 * @return botaoRemover
	 */
	public JButton getBotaoRemover() {
		return botaoRemover;
	}
	
	/**
	 * Retorna o botão de informação
	 * @return info
	 */
	public JButton getBotaoInfo() {
		return info;
	}
	
	/**
	 * Retorna o botão de nova consulta
	 * @return btnNovaCons
	 */
	public JButton getBtnNovaCons(){
		return btnNovaCons;
	}
	
	/**
	 * Retorna a lita
	 * @return list
	 */
	public JButton getList(){
		return list;
	}

	
	/**
	 * GETS PARA BARRA
	 */
	
	/**
	 * Retorna o item de menu de saída
	 * @return ExitMenuItem
	 */
	public JMenuItem getExitMenuItem() {
		return ExitMenuItem;
	}

	/**
	 * Retorna o item de menu "sobre"
	 * @return AboutMenuItem
	 */
	public JMenuItem getAboutMenuItem() {
		return AboutMenuItem;
	}

	/**
	 * Retorna o item de menu ajuda
	 * @return HelpMenuItem1
	 */
	public JMenuItem getHelpMenuItem1() {
		return HelpMenuItem1;
	}
	
	/**
	 * Retorna o item de incluir da barra 
	 * @return BarraIncluir
	 */
	public JMenuItem getBarraIncluir(){
		return BarraIncluir;
	}
	
	/**
	 * Retorna o item de excluir da barra 
	 * @return BarraExcluir
	 */
	public JMenuItem getBarraExcluir(){
		return BarraExcluir;
	}
	
	/**
	 * Retorna o item de modificar da barra
	 * @return BarraModificar
	 */
	public JMenuItem getBarraModificar(){
		return BarraModificar;
	}
	
	/**
	 * Retorna o item de informação da barra
	 * @return BarraInfo
	 */
	public JMenuItem getBarraInfo(){
		return BarraInfo;
	}
	
	/**
	 * Retorna o item de créditos
	 * @return Creditos
	 */
	public JMenuItem getCreditos(){
		return Creditos;
	}
	
	/**
	 * Retorna o item de nova consulta da barra
	 * @return BarraNovaConsulta
	 */
	public JMenuItem getBarraNovaConsulta(){
		return BarraNovaConsulta;
	}
	
	/**
	 * Retorna o item de listar da barra
	 * @return BarraListar
	 */
	public JMenuItem getBarraListar(){
		return BarraListar;
	}
	
	/**
	 * Retorna o botão do próximo mês
	 * @return nextMes
	 */
	public JButton getNextMes() {
		return nextMes;
	}

	/**
	 * Guarda o botão do próximo mês
	 * @param nextMes
	 */
	public void setNextMes(JButton nextMes) {
		this.nextMes = nextMes;
	}

	/**
	 * Retorna o botão do mês anterior
	 * @return prevMes
	 */
	public JButton getPrevMes() {
		return prevMes;
	}

	/**
	 * Guarda o botão do mês anterior
	 * @param prevMes
	 */
	public void setPrevMes(JButton prevMes) {
		this.prevMes = prevMes;
	}
	
	/**
	 * Retorna o botão de modificar
	 * @return botaoModificar
	 */
	public JButton getBotaoModificar(){
		return botaoModificar;
	}
	

}
