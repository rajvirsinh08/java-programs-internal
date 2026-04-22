import java.sql.*;
import java.util.*;

class HashMapInsert{
	public static void main(String args[]){
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(1,"Nisha");
		map.put(2,"Rahul");
		map.put(3,"Amit");
		map.put(4,"Neha");
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost/testdb","rajvir","2108"
			);
			
			Statement st=con.createStatement();
			
			st.execute("CREATE TABLE IF NOT EXISTS STUDENT(ROLLNO INT PRIMARY KEY,NAME VARCHAR(50))");
			
			if(st!=null){
				System.out.println("Table craeetd succcessfully");
			}
			
			String query="INSERT INTO STUDENT(ROLLNO,NAME) VALUES (?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			
			for(Map.Entry<Integer,String>entry:map.entrySet()){
				ps.setInt(1,entry.getKey());
				ps.setString(2,entry.getValue());
				ps.executeUpdate();
			}
			
			System.out.println("All records inserted succcessfully");
			ps.close();
			st.close();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}