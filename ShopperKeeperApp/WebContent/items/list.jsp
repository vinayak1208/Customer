<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
	<head>
		<title>Items List</title>
	</head>
	<body>
		<h2>Items List</h2>
		<hr />
		<a href="../index.obj">HOME</a> <span>|</span>
		<a href="list.obj">List</a> <span>|</span>
		<a href="new.obj">ADD NEW</a> 
		<hr />
		<table>
			<tr><th>#</th><th>Name</th><th>Rate</th><th>Packaged On</th><th>Actions</th></tr>
			<c:forEach var="item" items="${items}">
				<tr>
					<td>${item.code}</td>
					<td>${item.name}</td>
					<td>${item.rate}</td>
					<td>${item.packagedDate}</td>
					<td>
						<a href="edit.obj?itemCode=${item.code}">EDIT</a> <span>|</span>
						<a href="delete.obj?itemCode=${item.code}">DELETE</a>
					</td>
				</tr> 
			</c:forEach>
		</table>
	</body>
</html>