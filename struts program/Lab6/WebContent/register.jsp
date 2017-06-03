<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><bean:message key="abc"/></title>
</head>
<body>
<html:form action="/RegSubmit">
<table style="height: ">
			<tr>
				<td>Student ID</td>
				<td><html:text property="sid" />
				</td>
				<td><html:errors property="sid" />
				</td>
			</tr>
			<tr>
				<td>User</td>
				<td><html:text property="username" />
				</td>
				<td><html:errors property="username" />
				</td>
			</tr>
			<tr>
				<td>Password</td>
				<td><html:text property="password" />
				</td>
				<td><html:errors property="password" />
				</td>
			</tr>
			<tr>
				<td>Email</td>
				<td><html:text property="email" />
				</td>
				<td><html:errors property="email" />
				</td>
			</tr>
				<tr>
				<td>DOB</td>
				<td><html:text property="dob" />
				</td>
				<td><html:errors property="dob" />
				</td>
			</tr>
			<tr>
				<td>phone</td>
				<td><html:text property="phone" />
				</td>
				<td><html:errors property="phone" />
				</td>
			</tr>
				<tr>
				<td>Fee</td>
				<td><html:text property="fee" />
				</td>
				<td><html:errors property="fee" />
				</td>
				</tr>
				<tr>
				<td>Course</td>
				<td>
				<html:checkbox  property="course" value="Java" />Java
				<html:checkbox  property="course"  value="JDBC"/>JDBC
				<html:checkbox  property="course" value="EJB"/>EJB
				<html:checkbox  property="course" value="JSP"/>JSP
				</td>
				<td><html:errors property="course"/>
				</td></tr>
				<tr><td>Gender</td>
				<td>
				<html:radio property="gender" value="Male"/>Male
			    <html:radio property="gender" value="FeMale"/>FeMale
			    </td>
			    <tr>
				<td>Qualification</td>
				<td><html:select property="quali" >
				<html:option value="select">Select</html:option>
				<html:option value="M.Sc">M.Sc</html:option>
				<html:option value="B.Sc">B.Sc</html:option>
				<html:option value="B.Tech">B.Tech</html:option>
				<html:option value="M.Tech">M.Tech</html:option>
				</html:select>
				<td><html:errors property="quali"/>
				</td>
				</tr>
				<tr><td colspan="3" align="center"><html:submit value="Register"/></td></tr>
		</table>
</html:form>
</body>
</html>