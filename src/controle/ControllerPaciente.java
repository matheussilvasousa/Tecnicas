package controle;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import concretos.Paciente;
import consulta.Consulta;


public class ControllerPaciente {
		
	static PacienteView telaPaciente;
	Paciente p;
	
	/**
	 * @param path
	 */
	public ControllerPaciente(String path)
	{
		this.p = extrairPaciente(path);
		
		try{
			verConsultas(p);
		}catch(Exception e){
	         e.printStackTrace();
		}
		
		
	}
	
	/**
	 * Visualiza as consultas do paciente
	 * @param paciente
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void verConsultas(Paciente paciente) throws IOException, ClassNotFoundException{
		String nomePaciente; 
		int y= 0;
		boolean verif = true;
		Consulta c2 = null;
		String dados [][] = new String[paciente.listaConsultas.size()][4];
		for (String c : paciente.listaConsultas){
			verif = true;
			try {
				FileInputStream fis = new FileInputStream(c);
				ObjectInputStream ois = new ObjectInputStream(fis);
				c2 = (Consulta) ois.readObject();
				ois.close();
			
			}catch(FileNotFoundException fnf){
				verif = false;
			}
				
			if (verif == true){
				dados [y][0] = c2.medico.getEspecialidade().toString();
			
				dados [y][1] = c2.medico.getNome().toString();
			
				dados [y][2] = c2.getData().toString();
			
				dados [y][3] = c2.getHora();
			
			y++;
			}
			
		}
		nomePaciente = paciente.getNome();
		telaPaciente = new PacienteView(dados,nomePaciente);
		
	}	
	
	/**
	 * Retorna a view do paciente
	 * @return telaPaciente
	 */
	public PacienteView getPacientView()
	{
		return telaPaciente;
	}
	
	
	/**
	 * Deserializa os medicos armazenados
	 * @param path
	 * @return p
	 */
    private Paciente extrairPaciente(String path){
		  Paciente p = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream(path);
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         
	        
	        	 p = (Paciente) in.readObject();
	         
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	       }catch(ClassNotFoundException c)
	       {
	    	 c.printStackTrace();
	       }
	       
	      
	      
	      return p;
	}

}

