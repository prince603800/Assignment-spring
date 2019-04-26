<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Patients</title>
	
	
</head>

<body>

	
			<h2>Patient Record  Manager</h2>
		
	
	
		
			<!-- put new button: Add Customer -->
		
			<input type="button" value="Add Patient"
				   onclick="window.location.href='showFormForAdd'; return false;"/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Name</th>
					<th>Address</th>
					<th>Email</th>
					<th>Phone number</th>
					<th>Password</th>
				</tr>
				
				<!-- loop over and print our patients -->
				<c:forEach var="tempPatient" items="${patients}">
				
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="patientId" value="${tempPatient.id}" />
					</c:url>					

					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/patient/delete">
						<c:param name="patientId" value="${tempPatient.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempPatient.name} </td>
						<td> ${tempPatient.address} </td>
						<td> ${tempPatient.email} </td>
						<td> ${tempPatient.phNumber} </td>
						<td> ${tempPatient.password} </td>
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this patient?'))) return false">Delete</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
</body>

</html>



