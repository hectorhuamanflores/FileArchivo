package testHector;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileTest {
	   
	  public void crearCarpeta(String ubicacion){
		    File carpeta = new File(ubicacion);		    
	        if (carpeta.exists()) {
	        	System.out.println("La carpeta = " + ubicacion + " ya existe");
	        } else {
	        	carpeta.mkdir();
	        	System.out.println("Carpeta creada");  
	        }   
	  }
	  public void crearArchivo(String nombreArchivo,String ubicacion) throws IOException{
		  FileWriter fichero = null;  
		  File miArchivo = new File(ubicacion + "Qna-" + nombreArchivo + ".txt");
	        if (miArchivo.exists()) {
	            System.out.println("El archivo existe");
	            miArchivo.delete();
	            System.out.println("Por lo tanto el archivo ha sido borrado");
	        }
	        if (!miArchivo.exists()) {
	            System.out.println("El archivo no existe");
	            fichero = new FileWriter(ubicacion + "Qna-" + nombreArchivo + ".txt", true);
	            System.out.println("Por lo tanto se creo el archivo");
	        }
	  }
	  public void insertarTextoArchivo(String texto,String ubicacion) throws IOException{
		     FileWriter fichero = null;
            
                fichero = new FileWriter(ubicacion,true); 
                int contador=0; 
                while(contador<1){ 
                    System.out.println("entra al ciclo"); 
                    System.out.println("contador "+contador); 
                fichero.write(texto+"\r\n");
                contador++; 
                } 
			fichero.close();
             
	  }
      public static void main(String[] args) throws IOException {
    	
    	
    	fileTest file = new  fileTest();
    	String ubicacion = "C:\\Documentos xml\\";   	
    	String nombreArchivo ="ouput";
    	String archivo = ubicacion+"Qna-" + nombreArchivo + ".txt";
    	String xml = "<note><to>Tove</to><from>Jani</from><heading>Reminder</heading><body>Don't forget me this weekend!</body></note>";  
    	file.crearCarpeta(ubicacion);
    	file.crearArchivo(nombreArchivo, ubicacion);
    	file.insertarTextoArchivo(xml,archivo);
    	
    	

        
        
        
		 
    }
}
