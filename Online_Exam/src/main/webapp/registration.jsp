<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="reg" method="post">
    <table align="center">
       
        <tr>
            <td>Name:</td>
            <td><input type="text" name="sname"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="email" name="email"></td>
        </tr>
        <tr>
            <td>Branch:</td>
            <td>
                <select name="branch">
                    <option value="it">IT</option>
                    <option value="cs">CS</option>
                    <!-- Add options for other branches -->
                </select>
            </td>
        </tr>
        <tr>
            <td>College Name:</td>
            <td><input type="text" name="college"></td>
        </tr>
        <tr>
            <td>Pass Out Year:</td>
            <td><input type="text" name="poy"></td>
        </tr>
        <tr>
            <td>Mobile Number:</td>
            <td><input type="text" name="mobile"></td>
        </tr>
       
        <!-- Submit button -->
        <tr>
            <td colspan="2"><input type="submit" value="Give Test"></td>
        </tr>
    </table>
</form>

</body>
</html>