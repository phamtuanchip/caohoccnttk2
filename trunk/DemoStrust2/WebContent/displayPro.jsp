<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.odd{
background-color: silver;
}
span{
margin-top:15px;
margin-left:60px;
margin-bottom:15px;
color:maroon;
}
/* for hiding the page banner */
.pagebanner{
display: none;
}
/* for coustamizing page links */
.pagelinks{
color: maroon;
margin-left: 60px;
margin-top:50px;
}

/* for shifting all the Export options*/
.exportlinks
{
margin-top: 5px;
margin-left: 50px;
}
/* For changing the spaces between export link */
.export{
margin-left: 30px;
}
</style>



</head>
<body>
	
	<h1>Demo list Product</h1>
	 <c:forEach var="pr" items="${objlist}">
            ${pr.getProID()}<br/>
            ${pr.getProName()}<br/>
            ${pr.getProDesc()}<br/>
            ${pr.getProPrice()}<br/>
            ${pr.getQuantity()}<br/>
            ===================><br/>
        </c:forEach>
     
	
</body>
</html>