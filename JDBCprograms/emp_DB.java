import java.sql.*;
import java.util.*;

class emp_DB{
	public static int rows;
	
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/testdb";
			String user="rajvir";
			String pass="2108";
			
			Connection con=DriverManager.getConnection(url,user,pass);
			
			if(con!=null){
				System.out.println("Database connection successfuully");
			}
			
			Statement st=con.createStatement();
			st.execute("CREATE TABLE IF NOT EXISTS Emp_db(emp_id INT,emp_name VARCHAR(20),emp_dept VARCHAR(20),emp_sal DOUBLE)");
			
			if(st!=null){
				System.out.println("Table created successfuully");
			}
			
			
			System.out.println("=====MENU=====");
			System.out.println("(1) Insertion (2) Updation (3) Deletion (4) Display (5) Exit");
			
			while(true){
				System.out.println("Enter choice for database operation: ");
				int ch=sc.nextInt();
				
				if(ch==1){
					String qry="INSERT INTO Emp_db(emp_id,emp_name,emp_dept,emp_sal)VALUES(?,?,?,?)";
					
					PreparedStatement pst=con.prepareStatement(qry);
					
					System.out.println("Enter Employee data:");
					System.out.println("Id: ");
					int id=sc.nextInt();
					
					System.out.println("Name: ");
					String name=sc.next();
					
					System.out.println("Enter department name:");
					String dept=sc.next();
					
					System.out.println("Enter salary:");
					double sal=sc.nextDouble();
					
					pst.setInt(1,id);
					pst.setString(2,name);
					pst.setString(3,dept);
					pst.setDouble(4,sal);
					
					rows=pst.executeUpdate();
					
					if(rows>0){
						System.out.println("data inserted...");
						
					}
					
				}
				else if(ch==2){
					String qry1="UPDATE Emp_db set emp_sal=? where emp_id=?";
					
					PreparedStatement pst=con.prepareStatement(qry1);
					
					System.out.println("Enter emp id for update salary:");
					int eid=sc.nextInt();
					
					System.out.println("Enter new salary:");
					double esal=sc.nextDouble();
					
					pst.setDouble(1,esal);
					pst.setInt(2,eid);
					
					rows=pst.executeUpdate();
					
					if(rows>0){
						
						System.out.println("Data updated successfully..");
					}
				}
				else if(ch==3){
					
					String qry1="DELETE FROM Emp_db WHERE emp_id=?";
					PreparedStatement pst=con.prepareStatement(qry1);
					
					System.out.println("Enter emp id for delete:");
					int eid=sc.nextInt();
					
					pst.setInt(1,eid);
					
					rows=pst.executeUpdate();
					
					if(rows>0){
						
						System.out.println("Data deleted successfully");
					}
					
					
				}
				
				else if(ch==4){
					
					String qry1="SELECT * FROM Emp_db";
					
					ResultSet rs=st.executeQuery(qry1);
					
					while(rs.next()){
						
						System.out.println(rs.getInt("emp_id")+" "+rs.getString("emp_name")+" "+rs.getString("emp_dept")+" "+rs.getDouble("emp_sal"));
					}
				}
				else{
					break;
				}
				con.close();
			}
			
			
		}
		catch(Exception e){
				System.out.println("error:"+e.getMessage());
			}
	}
	
}