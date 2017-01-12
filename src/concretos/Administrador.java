package concretos;

import java.io.Serializable;

public class Administrador extends Atendente implements Serializable{
	
	private static final long serialVersionUID = -5719878253078641689L;
	private String senha;
	final int id = 3;
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
	Administrador(int idade, String nome) {
		super(idade, nome);
	}

	/**
	 * Guarda a senha do usuário
	 * @param password
	 */
	public void setSenha(String password) {
		this.senha = password;
		
	}
	
	/**
	 * Retorna a senha do usuário
	 * @return senha
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
