import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

public class JavaApplication28 {
 	public static ArrayList<String> lee(String path){
 		      ArrayList<String> lista = new ArrayList<String>();
 		      
 		      String[][]id= {{"0","operadores"},
 		      				 {"1","identificador"},
 		      				 {"2","p_reservada"},
 		      				 {"3","puntuacion"},
 		      				 {"4","digito"},
 		      				 {"5","e_blanco"}};
 		      /*System.out.println(id[0][1]);
 		      System.out.println(id[1][1]);
 		      System.out.println(id[2][1]);
 		      System.out.println(id[3][1]);
 		      System.out.println(id[4][1]);
 		      System.out.println(id[5][1]);*/
 		      
 		      String operadores [] = {"+","-","*","/","<",">","=",};
 		      String s_puntuacion [] = {";",",",".",":","[","]","(",")"};
 		      String p_reservada [] = {"java","import","public","Scanner","void", "static","main","out","println","print","args","int","input","nextInt"};
 	      
              try {
                  FileReader fb =new FileReader(path);
                  BufferedReader  br = new BufferedReader(fb);

                  String linea;
                    while((linea = br.readLine())!= null){
                           //System.out.println(linea);
                           StringTokenizer st = new StringTokenizer(linea, ";/./ /\n/:", true);
                          // System.out.println("Cuantos: " + st.countTokens());
                    while (st.hasMoreTokens()){
					String token = st.nextToken();
					lista.add(token);
                    //System.out.println(st.nextToken());       
                    }      
                  
               
                    }
              } catch (FileNotFoundException ex) {
                  
              } catch (IOException ex) {
                 
              }
              for(int i = 0; i < 5 ; i++)
              {
              	//System.out.println(lista.get(i));
              }
    		
                  return (lista);
    	}		      
 
 
 	public static boolean ispuntuacion(String puntuacion, String []s_puntuacion){
 		
 		if( s_puntuacion.equals(puntuacion)){
 			return (true);
 		}
  	
		else{
			return (false);
		}
 		
 	}	
 		
 	public static boolean isoperadores (String ope, String [] operaciones){
 		if(operaciones.equals(ope) ){
 			return (true);
 		}
  	
		else{
			return (false);
		}
 		
 	}
 	public static boolean ispalabra (String reservada, String [] p_reservada){
 		if(p_reservada.equals(reservada)){
 			return (true);
 		}
  	
		else{
			return (false);
		}
 		
 	}
 	
 	      
 	public static boolean isnumero(String digito){
 		double num;
 		try{
 			num = Double.parseDouble(digito);
 		}
 		catch(Exception e){
 			return (false);
 		}
 		return (true);
 	}
     
 		      
 		      
   
    public static void main(String[] args) {
    	String[][]id= {{"0","operadores"},
 		      				 {"1","identificador"},
 		      				 {"2","p_reservada"},
 		      				 {"3","puntuacion"},
 		      				 {"4","digito"},
 		      				 {"5","e_blanco"}};
 		    /*  System.out.println(id[0][1]);
 		      System.out.println(id[1][1]);
 		      System.out.println(id[2][1]);
 		      System.out.println(id[3][1]);
 		      System.out.println(id[4][1]);
 		      System.out.println(id[5][1]);*/
 		      
 		      String operadores [] = {"+","-","*","/","<",">","="};
 		      String s_puntuacion [] = {";",",",".",":","[","]","(",")"};
 		      String p_reservada [] = {"java","import","public","Scanner","void", "static","main","out","println","print","args","int","input","nextInt"};
 	             
      System.out.println("Test");
       	ArrayList<String> lista = new ArrayList<>();
             lista = lee("E:\\test.txt");
        	System.out.println(lista.get(5));
                System.out.println("Test2");
//lee("E:\\test.txt");
        
        		String t_simbolos [][] =new String[10][15];
        		/*String t_isnumero [][] =new String[10][15];
        		String t_operadores [][] = new String[10][15];
        		String t_puntuacion [][] = new String[10][15];
        		String t_palabra [][] = new String[10][15];
        		int i = 0;*/
        		
        		
        		
        
       int i=0;
        while(lista.get(i)!= null){
        	String t=lista.get(i);
        	if (t== " "){
        		
        		t_simbolos[i][0]=id[4][0];
        		t_simbolos[i][1]="Espacio en blanco";
        		t_simbolos[i][2]="";
        		t_simbolos[i][3]="";
        		t_simbolos[i][4]="";
        		
        	}
        	else{
        		if ( isnumero(t)){
        		
        		t_simbolos[i][0]=id[4][0];
        		t_simbolos[i][1]="Espacio en blanco";
        		t_simbolos[i][2]="";
        		t_simbolos[i][3]="";
        		t_simbolos[i][4]="";
        		}
        		else{
        			if(isoperadores(t,operadores)){        		
        		t_simbolos[i][0]=id[4][0];
        		t_simbolos[i][1]="Espacio en blanco";
        		t_simbolos[i][2]="";
        		t_simbolos[i][3]="";
        		t_simbolos[i][4]="";
        			}
        			else{
        				if (ispuntuacion(t, s_puntuacion)){
        					t_simbolos[i][0]=id[4][0];
        		t_simbolos[i][1]="Espacio en blanco";
        		t_simbolos[i][2]="";
        		t_simbolos[i][3]="";
        		t_simbolos[i][4]="";
        				}
        				else{
        					if(ispalabra(t, p_reservada)){
        						t_simbolos[i][0]=id[4][0];
        		t_simbolos[i][1]="Espacio en blanco";
        		t_simbolos[i][2]="";
        		t_simbolos[i][3]="";
        		t_simbolos[i][4]="";
        					}
        					else{
        						
        					}
        				}
        			}
        		}
        	}
        }
        
        System.out.print(isnumero ("4"));
        
        
        
         
    }
    
  


}
