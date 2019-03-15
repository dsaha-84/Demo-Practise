import java.sql.*;
public class Service
Connection con-null;
ResultSet rs= null;
Statement st= null;

public List service()
{
	Class.forName();
	con=DriverManager.fetConnection(jdbc:mysql://localhost:...);
}
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
//here sonoo is database name, root is username and password
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from emp");
while(rs.next())
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
con.close();
}catch(Exception e){ System.out.println(e);}
}
 public static void main(String[] as)
{
	System.out.println("Contributed by Collaborator Piku-tr02");
	System.out.println("Contributed by Collaborator dsaha-84");
}
}


