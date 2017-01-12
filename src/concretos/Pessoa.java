package concretos;

import java.io.Serializable;

abstract public class Pessoa implements Serializable{

	private static final long serialVersionUID = -3778813093845762220L;
	private int id;
	private int idade;
	private String fone;
	private String adress;	
	private String nome;
	
	/**
	 * Retorna o endereço do usuario
	 * @return adress
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * Guarda o endereço do usuario
	 * @param adress
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	private String senha;

	/**
	 * Retorna a idade do usuario
	 * @return idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * Guarda a idade do usuario
	 * @param idade
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/**
	 * Guarda o telefone do usuario
	 * @param fone
	 */
	public void setFone(String fone) {
		this.fone = fone;
	}

	/**
	 * Retorna o telefone do usuario
	 * @return fone
	 */
	public String getFone() {
		return fone;
	}

	/**
	 * Retorna o nome do usuario
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Guarda o nome do usuario
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Guarda a senha do usuario
	 * @param password
	 */
	public void setSenha(String password) {
		this.senha = password;
	}

	/**
	 * Retorna a senha do usuario
	 * @return senha
	 */
	public String getSenha() {
		return senha;
	}
	
	/**
	 * Retorna o id do usuario
	 * @return id
	 */
	public int getId() {
		return id;
	}

}