<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     pageEncoding="ISO-8859-1" isELIgnored="false" %>
      <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	 crossorigin="anonymous">
<title>Bill Generation Page</title>
</head>
<body>
    <div class="container">
    <span>Bill Generation</span>
       <br><br>
        Source: ${tour.source} <br>
        Destination: ${tour.destination} <br>
        Tour Starting Date: ${tour.startingDate} <br>
        Tour Ending Date: ${tour.endingDate} <br>
        Number of Tourists: ${tour.numberOfTourists} <br>
       <br><br>
        <a href="PaymentPage.html" class="btn btn-primary">Goto Payment Page</a><br><br>
        <a href="home" class="btn btn-primary">Cancel</a>
    </div>
</body>
</html>