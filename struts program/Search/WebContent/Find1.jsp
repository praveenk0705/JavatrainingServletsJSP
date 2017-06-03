
	<%@ page language="java" import="java.sql.*" %>

	<%!  Connection con=null;
             PreparedStatement ps=null;
		     ResultSet rs=null;
		     String  s1,s2,s3,s4,s5,s7;
			 int num1, ct;
	 %>

	<%
	
	 try
		{
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	//Class.forName("oracle.jdbc.driver.OracleDriver");
//Class.forName("com.mysql.jdbc.Driver");
		}
			catch(Exception e)
		{
			System.out.println(e);
		}

	
	 try
		{
         
con=DriverManager.getConnection("jdbc:oracle:thin:@home:1521:xe", "system", "manager");

	// con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");																				
			 Statement stmt=con.createStatement();
			 rs = stmt.executeQuery("select * from sa_plan ");
			 ResultSetMetaData rsmd= rs.getMetaData();
			 String string=null;
			 int i;%><table border=3><tr bgcolor="#6600FF"><%
			 for(i=1;i<=rsmd.getColumnCount( );i++)
			 { %>
			  <td>
					<%=rsmd.getColumnName(i)%>
					
			 </td>
			 <%
		     }
		     %>
			
			</tr>
				   <%ct = 0;
					while(rs.next()){%>
				
				    <%ct++; 
				  
					s1=rs.getString("id");
					s2=rs.getString("pname");
				    num1=rs.getInt("pamount");
		        	s3=rs.getString("pdetail");
		        	s4=rs.getString("status");
		        	s5=rs.getString("address");
		        	s7=rs.getString("ADDRS");
		        	%>
			       <tr BGCOLOR="#00CCFF"><td> <%=s1%></td>
				   <td><%=s2%></td>
				  <td><%=num1%></td>
				  <td><%=s3%></td>
				    <td><%=s4%></td>
				      <td><%=s5%></td>
				       <td><%=s7%></td>
				       
				  </tr>

			
			       <%}
				   }
	
			catch(SQLException e)
			{
			e.printStackTrace();
			}
				%>
			<br></table>
			<%=ct%>         rows selected.
			</body>
			</HTML>