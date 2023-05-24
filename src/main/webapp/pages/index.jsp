<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>INSURANCE REPORT APPLICATON</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h3 class="pb-3 pt-4">INSURANCE REPORT APPLICATON</h3>

		<form:form action="/search" modelAttribute="search" method="POST">
			<table>
				<tr>
					<td>Plan Name :</td>
					<td><form:select path="planName">
							<form:option value="">Select</form:option>
							<form:options items="${names}"/>
						</form:select></td>

					<td>Plan Status :</td>
					<td><form:select path="planStatus">
							<form:option value="">Select</form:option>
							<form:options items="${status}"/>
						</form:select></td>

					<td>Gender :</td>
					<td><form:select path="gender">
							<form:option value="">Select</form:option>
							<form:option value="Male">Male</form:option>
							<form:option value="Female">Female</form:option>
						</form:select></td>
						<tr>
					<td>Start Date :</td>
					<td><form:input type="date" path="startDate" /></td>
					<td>End Date :</td>
					<td><form:input type="date" path="endDate" /></td>
				</tr>
				<tr>
					<td><a href="/" class="btn btn-dark">Reset</a></td>
					
					<td><input type="submit" value="Search"
					class="btn btn-primary" /></td>
				</tr>
			</table>
		</form:form>
		<hr></hr>
		<table class="table table-hover table-bordered">
		<thead>
		<tr>
		<td>S.No</td>
		<td>Holder Name</td>
		<td>Plan Name</td>
		<td>Plan Status</td>
		<td>Gender</td>
		<td>Start Date</td>
		<td>End Date</td>
		<tr>
		</thead>
		<tbody>
		<c:forEach items="${plans}" var="plan" varStatus="index">
		<tr><td>${plan.citizenId}</td>
		<td>${plan.citizenName}</td>
		<td>${plan.planName}</td>
		<td>${plan.planStatus}</td>
		<td>${plan.gender}</td>
		<td>${plan.startDate}</td>
		<td>${plan.endDate}</td>
		</tr>
		</c:forEach>
		<tr>
		<c:if test="${empty plans}">
						<td colspan="8" style="text-align: center">No records found</td>
		</c:if>
		</tbody>
		</table>
		<hr></hr> 
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
</body>
</html>