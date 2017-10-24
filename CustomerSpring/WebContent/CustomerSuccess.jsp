<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Successfully Registered</h2>
<table align="center" border="1px">
<tr>
<td>Customer Name</td>
<td>
${reg.customerName }</td>
</tr>

<tr>
<td>Customer Id</td>
<td>
${reg.customerId }</td>
</tr>

<tr>
<td>Customer Mobile</td>
<td>
${reg.customerMobile }</td>
</tr>

<tr>
<td>Customer Email</td>
<td>
${reg.customerEmail }</td>
</tr>

<tr>
<td>Customer DOB</td>
<td>
${reg.customerDOB }</td>
</tr>


</table>
</body>
</html>