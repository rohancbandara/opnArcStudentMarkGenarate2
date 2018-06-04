<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="static/js/jquery.js"></script>
<script src="static/js/mark.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mark</title>
</head>
<body>
	Select Student
	<br>
	<div id="div1"></div>
	<select name="select" id="select"">
		<option>Select Student</option>
	</select>
	<div id="div2"></div>
	<input type="button" id="btnSave" value="Save Mark" onclick="addMark()">
	<div id="div3">
		<table id="tblMark" border="1">
			<tr>
				<th>Student Name</th>
				<th>AVG Mark</th>
			</tr>
		</table>

	</div>
	<div id="div3"></div>
</body>
</html>