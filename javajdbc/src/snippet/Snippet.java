package snippet;

public class Snippet {
	String url="jdbc:mysql://localhost:3306/Rooman";
			String username="root";
			String password="1234567890";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,username,password);
				if(con!=null) {
					System.out.println("Connected to MySQL database successfully");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
}

