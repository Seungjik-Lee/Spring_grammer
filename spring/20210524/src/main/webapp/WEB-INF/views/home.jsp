<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p>
${a}
${aa}
${arr1}
</p>
<p>
<c:forEach items="${arr1}" var="arritem">
${arritem}
</c:forEach>
</p>

</body>
</html>
