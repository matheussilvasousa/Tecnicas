package concretos;

import java.io.Serializable;
import java.util.ArrayList;

public class Medico extends Funcionario implements Serializable{

	private static final long serialVersionUID = 2592596887762250729L;
	private String senha;
	private String fone;
	final int id = 4;
	private String[] areas = {"Odontologia", "Pediatria", "Clinico Geral", "Cardiologia", "Dermatologia"};
	public ArrayList<String> listaConsultas = new ArrayList<String>();

	private String especialidade;
	
	ArrayList<boolean[][]> agenda = new ArrayList<boolean[][]>();
	
	/**
	 * Guarda a especialidade do medico
	 * @param index
	 */
	public void setEspecialidade(int index) {
		this.especialidade = areas[index];
	}

	/**
	 * @param idade
	 * @param nome
	 */
	public Medico(int idade, String nome) {
		super(idade, nome);
		
		boolean[][] temp = new boolean[1][1];
		agenda.add(0, temp);
		int[] numMeses = {0, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31};
		// TODO 
		for(int i = 1; i <= 12; i++)
		{
			boolean[][] agendaMes = new boolean[(numMeses[i]+1)][11];
			for (int n = 0; n <= numMeses[i]; n++)
	 		{
	 			for (int j = 0; j < 11; j++)
	 				agendaMes[n][j] = true;
	 				
	 		}
			
			agenda.add(i, agendaMes);
		}
	}
	
	/**
	 * Guarda as consultas do medico
	 * @param path
	 */
	public void setConsulta(String path){
		listaConsultas.add(path);
	}
	
	/**
	 * Limpa a agenda do mes
	 * @param numDoMes
	 */
	public void limparAgendaMes(int numDoMes){
		int[] numMeses = {0, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31};
		
		boolean[][] agendaMes = new boolean[numMeses[numDoMes]+1][11];
		for (int n = 0; n <= numMeses[numDoMes]; n++)
 		{
 			for (int j = 0; j < 11; j++)
 				agendaMes[n][j] = true;
 				
 		}
		
		agenda.add(numDoMes, agendaMes);
	}
	
	/**
	 * Retorna a agenda do mes
	 * @param nMes
	 * @return
	 */
	public boolean[][] getAgenda(int nMes){
		return agenda.get(nMes);
	}
	
	/**
	 * Guarda a agenda
	 * Verifico se todos os horarios daquele dia ja estao ocupados
	 * @param hora
	 * @param dia
	 * @param mes
	 */
	public void setAgenda(int hora, int dia, int mes){
		boolean[][] temp;
		int i = 1;
		boolean verif = true;
		
		
		temp = agenda.get(mes);
		
		temp[dia][hora] = false;
		
		while ((i < 11) && (verif == true))   //Verifico se todos os horarios daquele dia ja estao ocupados
		{									  			
			if (temp[dia][i] == true)
				verif = false;
			i++;
		}
		if (verif == true)
			temp[dia][0] = false;
		
		
		agenda.add(mes, temp);
	}
	
	/**
	 * Retorna a especialidade do medico
	 * @return especialidade
	 */
	public String getEspecialidade() {
		return especialidade;
	}

	/**
	 * Retorna o telefone do medico
	 * @return fone
	 */
	public String getFone() {
		return fone;
	}

	/**
	 * Guarda o telefone do medico
	 * @param fone
	 */
	public void setFone(String fone) {
		this.fone = fone;
	}

	/**
	 * Guarda a senha do medico
	 * @param password
	 * @Override
	 */
	
	public void setSenha(String password) {
		this.senha = password;
		
	}
	
	/**
	 * Retorna a senha do medico
	 * @return senha
	 */
	public String getSenha(){
		return senha;
	}
	
	/**
	 * Retorna o id do medico
	 * @return id
	 */
	public int getId() {
		return id;
	}
}
