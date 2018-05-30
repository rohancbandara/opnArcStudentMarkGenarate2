<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="static/js/jquery.js"></script>
<script src="static/js/studentJs.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration</title>
</head>
<body>

	<h1 align="center">Student Registration</h1>


	Student Name
	<input type="text" id="txtName" name="txtName">
	<br> Student Name
	<br> No :
	<input type="text" id="adNo" name="adNo">
	<br> Street :
	<input type="text" id="adStreet" name="adStreet">
	<br> City :
	<input type="text" id="adCity" name="adCity">

	<br>
	<br> Gender

	<input type="radio" value="male" id="genderMale" name="gender">Male
	<input type="radio" value="female" id="genderFemale" name="gender">Female
	<br>
	<br>
	<input type="button" onClick="register()" value="Save Student"
		name="btnSave">
	<h1 align="center">All Student</h1>
	<table id="stuTable">
		<tr>
			<th>Student ID</th>
			<th>Student Name</th>
			<th>NO</th>
			<th>Street</th>
			<th>City</th>
			<th></th>
			<th></th>
		</tr>

	</table>

</body>
</html>