<html>
<body>
<h2>Hello World!</h2>

<%
Object obj = request.getAttribute("dummyValueKey");
if(obj != null){
	String str = (String)obj;
	out.print(str);
}
else{
	out.print("initial page");
}
%>

<a href="openRegPage">Click For Registration</a>
<a href="OpenSearchPage">Search</a>
</body>
</html>
