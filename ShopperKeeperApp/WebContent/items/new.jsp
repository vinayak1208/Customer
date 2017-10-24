<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
		<title>New Item</title>
	</head>
	<body>
		<h2>New Item</h2>
		<hr />
		<a href="../index.obj">HOME</a> <span>|</span>
		<a href="list.obj">List</a> <span>|</span>
		<a href="new.obj">ADD NEW</a> 
		<hr />
		<form:form action="add.obj" method="POST" modelAttribute="item">
			<table>
				<tr>
					<td>Item Code</td>
					<td><form:input path="code" type="number" />
						<form:errors path="code" />
					</td>
				</tr>
				<tr>
					<td>Item Name</td>
					<td><form:input path="name"/>
						<form:errors path="name"/>
					</td>
				</tr>
				<tr>
					<td>Item Rate</td>
					<td><form:input path="rate" type="number"/>
						<form:errors path="rate" />
					</td>
				</tr>
				<tr>
					<td>Date Of Packaging</td>
					<td><form:input path="packagedDate" type="date"/>
						<form:errors path="packagedDate"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="submit">SAVE</button>
					</td>
				</tr>
			</table>			
		</form:form>		
	</body>
</html>