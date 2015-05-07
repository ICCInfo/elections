package be.icc.ecoles;

import java.io.*;
import java.net.URL;
import java.sql.*;
import java.util.Arrays;

public class ScriptsMain {
	public static void main(String ... args){
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        String url = "jdbc:mysql://localhost:3306/";
        String database = "ECOLES";
        String userName = "root";
        try (Connection connection = DriverManager.getConnection(url + database, userName,"")){
                System.out.println("Database connection: Successful");
                try(BufferedReader br = new BufferedReader(new FileReader("ecoles.csv"))){
        			String linee="";
        			int index = 0;
        			while((linee=br.readLine())!=null){
        				index++;
        				String[] arrayInfosEcoles = linee.split(";");
                    	URL url1 = new URL("http://www.enseignement.be/index.php?page=24797&etab_id="+arrayInfosEcoles[0]);
                        StringBuilder sb = new StringBuilder();
                        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url1.openStream(), "UTF-8"))) {
                            int cpt=0;
                        	for (String line; (line = reader.readLine()) != null;) {
                                cpt++;
                                //System.out.println(cpt);
                                if(cpt>=629 && cpt<=665){
                                	sb.append(line.replace('"', ' '));
                                    //System.out.println(line);
                                }
                            }
                        	System.out.println(index);
                        	String query = "INSERT INTO OPTIONS_RAW VALUES("+index+","+arrayInfosEcoles[0]+",\""+sb.toString()+"\")";                            	
                        	Statement statement = connection.createStatement();
                            int rows = statement.executeUpdate(query);
                        }
        			}
        		} catch (FileNotFoundException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		} catch (IOException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		} catch (Exception e) {
	                System.out.println("Database connection: Failed");
	                e.printStackTrace();
	             
        		}
        } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
