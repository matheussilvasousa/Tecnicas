package consulta;

import java.util.ArrayList;

import concretos.Medico;
import concretos.Paciente;


public class Consulta implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	public Paciente paciente;
	public Medico medico;
	private String data;
	private String hora;
	ArrayList<Integer> diaConsulta = new ArrayList<Integer>();
	
	/**
	 * @param p
	 * @param m
	 * @param data
	 * @param hora
	 * @param diaConsulta
	 */
	public Consulta(Paciente p, Medico m, String data, String hora, ArrayList<Integer> diaConsulta){
		this.paciente = p;
		this.medico = m;
		this.data = data;
		this.hora = hora;
		this.diaConsulta = diaConsulta;
		
	}
	
	/**
	 * Guarda a data informada
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}
	
	/**
	 * Retorna a data
	 * @return data
	 */
	public String getData(){
		return data;
	}
	
	/**
	 * Guarda a hora informada
	 * @param hora
	 */
	public void setHora(String hora){
		this.hora = hora;
	}
	
	/**
	 * Retorna a hora informada
	 * @return
	 */
	public String getHora(){
		return hora;
	}
	
}
