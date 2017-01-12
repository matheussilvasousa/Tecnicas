package concretos;

import java.io.Serializable;

public class Atendente extends Funcionario implements Serializable{

	private static final long serialVersionUID = -7979705955899340592L;
	
	private String senha;
	private String fone;
	
	/**
	 * Retorna o telefone do usuário
	 * @return fone
	 */
	public String getFone() {
		return fone;
	}
	
	/**
	 * Guarda o telefone do usuário
	 * @param fone
	 */
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	/**
	 * @param idade
	 * @param nome
	 */
	public Atendente(int idade, String nome) {
		super(idade, nome);
	}

	final int id = 2;

	/**
	 * Guarda a senha do usuário
	 * @param password
	 * @Override
	 */
	
	public void setSenha(String password) {
		this.senha = password;
		
	}
	
	/**
	 * Retorna a senha do usuário
	 * @return senha
	 * @Override
	 */
	public String getSenha(){
		return senha;
	}
	
	/**
	 * Retorna o id do usuário
	 * @return id
	 */
	public int getId() {
		return id;
	}
}