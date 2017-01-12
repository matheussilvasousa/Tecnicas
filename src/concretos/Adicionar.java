package concretos;

public interface Adicionar {

	/**
	 * Adiciona paciente
	 * @param p
	 */
	public void addPaciente(Paciente p);
	
	/**
	 * Adiciona medico
	 * @param m
	 */
	public void addMedico(Medico m);
	
	/**
	 * Adiciona atendente
	 * @param a
	 */
	public void addAtendente(Atendente a);
	
	/**
	 * Adiciona administrador
	 * @param ad
	 */
	public void addAdministrador(Administrador ad);
	
}