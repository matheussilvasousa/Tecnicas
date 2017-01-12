package controle;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import concretos.Medico;
import consulta.Consulta;


public class ControllerMedico {
		
	static MedicoView telaMedico;
	Medico m;
	
	/**
	 * @param path
	 */
	public ControllerMedico(String path)
	{
		this.m = extrairMedico(path);
		
		try{
			verConsultas(m);
		}catch(Exception e){
	         e.printStackTrace();
		}
		
		
	}
	
	/**
	 * Visualiza as consultas do médico
	 * @param medico
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void verConsultas(Medico medico) throws IOException, ClassNotFoundException{
		String nomeMedico; 
		int y= 0;
		boolean verif = true;
		Consulta c2 = null;
		String dados [][] = new String[medico.listaConsultas.size()][4];
		for (String c : medico.listaConsultas){
			verif = true;
			try{
				FileInputStream fis = new FileInputStream(c);
				ObjectInputStream ois = new ObjectInputStream(fis);
				c2 = (Consulta) ois.readObject();
				ois.close();
			}catch(FileNotFoundException flf){
				verif = false;
			}
						
			if (verif == true){
				dados [y][0] = c2.paciente.getNome().toString();
			
				dados [y][1] =  String.valueOf(c2.paciente.getIdade());
			
				dados [y][2] = c2.getData().toString();
			
				dados [y][3] = c2.getHora();
			
				y++;
			}
		}
		nomeMedico = medico.getNome();
		telaMedico = new MedicoView(dados,nomeMedico);
		
	}
	
	/**
	 * Retorna a view do médico
	 * @return telaMedico
	 */
	public MedicoView getMedicoView()
	{
		return telaMedico;
	}
	
	/**
	 * Deserializa os medicos armazenados
	 * @param path
	 * @return p
	 */
    private Medico extrairMedico(String path){
		  Medico p = null;
	      try
	      {
	         FileInputStream fileIn = new FileInputStream(path);
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         
	        
	        	 p = (Medico) in.readObject();
	         
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

