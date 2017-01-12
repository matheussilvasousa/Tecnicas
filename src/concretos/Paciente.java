package concretos;

import java.io.Serializable;
import java.util.ArrayList;

public class Paciente extends Pessoa implements Serializable{

	private static final long serialVersionUID = 7573131584209612385L;

	public ArrayList<String> listaConsultas;

	
	final int id = 1;
	private String senha;
	private String fone;
	
	/**
	 * @param idade
	 * @param nome
	 */
	public Paciente(int idade,String nome){
		this.setIdade(idade);
		this.setNome(nome);
		
		listaConsultas = new ArrayList<String>();
	}

	/**
	 * Guarda as consultas
	 * @param path
	 */
	public void setConsulta(String path){
		listaConsultas.add(0, path);
	}
	
	/**
	 * Retorna o telefone do paciente
	 * @return fone
	 */
	public String getFone() {
		return fone;
	}

	/**
	 * Guarda o telefone do paciente
	 * @param fone
	 */
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	/**
	 * Guarda a senha do paciente
	 * @param password
	 */
	public void setSenha(String password){
		this.senha = password;
	}

	@SuppressWarnings("unused")
	private void verConsulta(){}
	
	/**
	 * Retorna a senha do paciente
	 * @return senha
	 * @Override
	 */
	public String getSenha() {
		return senha;
		
	}
	
	/**
	 * Retorna o id do paciente
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
}

