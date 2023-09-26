<%@page import="java.util.Calendar"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Customer | Home</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src=<spring:url value="/jquery/jquery-3.6.0.js"/>></script>
<spring:url value="/jquery/validation.js" var="pageValidation" />
<script type="text/javascript" src=<spring:url value="/jquery/validation.js"/>></script>
<link rel="stylesheet" href=<spring:url value ="/styles/style.css"/>>
</head>
<body>
	<div
		style="background-color: rgb(183, 233, 233); width: 100%; height: 700px"
		align="center">
		<div>
			<div align="left">
				<div align="center" id="top">
					<a href="index">Home</a> | <a href="home">Get a Quota</a>

				</div>
				<div style="color: teal; font-size: 30px">SoftSolutions |
					Insurance</div>
				<div style="color: teal; font-size: 20px">General Insurance
					Company</div>
			</div>
		</div>
		<div></div>

		<div></div>
		<center>
			<div style="color: teal; font-size: 30px">Insurance | Customer
				Form</div>
				<p id = "formErrMsg">"Please Enter First Name","Please Enter Last Name"</p>
			<form:form modelAttribute="employeeBean" id="employeeBean" action="EmployeeRegForm" method="post">
				<table align="center">
					<tr>
						<td><label>First Name</label></td>
						<td><input type="text" name="firstName" id="fName" class="fNameClass" onkeydown="doClearFormMsg()"></td>
						<td><label id="fNameMsg"></label></td>
					</tr>
					<tr>
						<td><label>Last Name</label></td>
						<td><input type="text" name="lastName" id="lName" class="lNameClass" onkeydown="doClearFormMsg()"></td>
						<td><label id="lNameMsg"></label></td>
					</tr>
					<tr>
						<td><label>Address</label></td>
						<td><input type="text" name="addresss" id="address" class="address" onkeydown="doClearFormMsg()"></td>
						<td><label id="errorAddress"></label></td>

					</tr>
					<tr>
						<td><label>Zip code</label></td>
						<td><input type="text" name="zipCode" id="zipCode" class="zipCode" onkeydown="doClearFormMsg()"></td>
						<td><label id="errorZip"></label></td>
					</tr>
					<tr>
						<td><label>city</label></td>
						<td><input type="text" name="cityName" id="cityName" class="cityName" onkeydown="doClearFormMsg()"></td>
						<td><label id="errorCity"></label></td>
					</tr>
					<tr>
						<td><label>state</label></td>
						<td><input type="text" name="stateName" id="stateName" class="stateName" onkeydown="doClearFormMsg()"></td>
						<td><label id="errorState"></label></td>
					</tr>
					<tr>
						<td><label>Date of birth</label></td>
						<td><input type="text" name="dob" id="dob" class="dob" onkeydown="doClearFormMsg()"></td>
						<td><label id="errorDob"></label></td>
					</tr>
					<tr>
						<td><input type="submit" name="submit" value="continue" onclick="return doValidateForm()">
				</table>
			</form:form>
		</center>
		<div></div>
		<div></div>
		<div id="footer">Copyright &copy; SOFT SOLUTIONS</div>
	</div>
</body>
</html>