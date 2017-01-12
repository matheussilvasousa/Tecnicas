package concretos;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable{

	private static final long serialVersionUID = 5947658230149119032L;

	private String senha;
	
	/**
	 * @param idade
	 * @param nome
	 */
	Funcionario(int idade, String nome){
		this.setIdade(idade);
		this.setNome(nome);
	}
	
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
	public String getSenha() {
		return senha;
	}
	
}