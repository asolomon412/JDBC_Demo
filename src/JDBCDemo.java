
// 1.
import java.sql.*;

public class JDBCDemo {

	// 1. import java.sql
	// 2. Load and register Driver
	// 3. Create connection
	// 4. Create statement
	// 5. Execute the query (optional)
	// 6. Process the results (optional)
	// 7. close the connection (optional)

	public static void main(String[] args) throws Exception {

		// Declare the string url for the Driver
		String url = "jdbc:mysql://127.0****/jdbc";
		// Declare database login info & query that you want to perform
		String userName = "";
		String password = "";
		String query = "select studentName from student where id=1";
		// 2.
		Class.forName("com.mysql.jdbc.Driver");
		// 3.
		Connection con = DriverManager.getConnection(url, userName, password);
		// 4.
		Statement st = con.createStatement();
		// 5.
		ResultSet rs = st.executeQuery(query);

		rs.next();
		// 6.
		String name = rs.getString("studentName");

		System.out.println(name);
		// 7.
		st.close();
		con.close();

	}

}
