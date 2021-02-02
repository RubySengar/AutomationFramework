package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;

//import com.mysql.cj.xdevapi.Result;

public interface dataBase {
	
	default ArrayList<String> DatabaseQuery(){
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("KD101205");
		al.add("KD101206");
		al.add("KD101207");
		al.add("KD101208");
		al.add("KD101209");
		al.add("KD101210");
		al.add("KD101212");
		
		
		return al;
		
		//Class.forName("");
	}
	
	default ArrayList<String> jdbcdatabaseresult() throws ClassNotFoundException, SQLException{
		
		ArrayList<String> al = new ArrayList<String>();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
				
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@https://retail.axisbank.co.in/:5000:AXIS", "872048754", "azad1234");
		
		Statement stm = con.createStatement();
		ResultSet rst = stm.executeQuery("select * from AXIS_TABLE");
		
		while(rst.next()){
			
			String dbvalue = rst.getString("BAL");
			
			al.add(dbvalue);
		}
		
		return al;
		
	}

}
