import java.sql.*;
import java.util.Scanner;

class InsertStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", ""
            );

            // 3. Prepare SQL Query
            String query = "INSERT INTO Student (id, name, percentage) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            // 4. Take Input
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Percentage: ");
            double per = sc.nextDouble();

            // 5. Set Values
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, per);

            // 6. Execute Query
            int rows = ps.executeUpdate();

            if(rows > 0)
                System.out.println("Record Inserted Successfully!");
            else
                System.out.println("Insertion Failed!");

            // 7. Close Connection
            ps.close();
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}