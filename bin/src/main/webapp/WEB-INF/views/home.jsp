<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     pageEncoding="ISO-8859-1" isELIgnored="false" %>
      <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
        crossorigin="anonymous">
    <title>Home</title>
</head>

<body>
    <div class="container">
        Welcome ${user.firstName}
    </div>
    <div class="container">
        <h2>Tour Details</h2>
        <form action="newTour" method="POST">
            <div class="form-row">
                <div class="col-md-6">
                    <div class="form-group">
                        <label for="source">Source</label>
                        <select name="source">
                        <option value="Gulmarg">Gulmarg</option>
                        <option value="Darjeeling">Darjeeling</option>
                        <option value="Mussoorie">Mussoorie</option>
                        <option value="Nainital">Nainital</option>
                        <option value="Manali">Manali</option>
                        </select>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <label for="destination">Destination</label>
                         <select name="destination">
                        <option value="Gulmarg">Gulmarg</option>
                        <option value="Darjeeling">Darjeeling</option>
                        <option value="Mussoorie">Mussoorie</option>
                        <option value="Nainital">Nainital</option>
                        <option value="Manali">Manali</option>
                        </select>
                    </div>
                </div>
            </div>
            <div class="form-row">
                <div class="col-md-4">
                    <div class="form-group">
                        <label for="startingDate">Starting Date</label>
                        <input class="form-control" type="date" name="startingDate" id="startingDate" placeholder="mm-dd-yyyy">
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="form-group">
                        <label for="endingDate">Ending Date</label>
                        <input class="form-control" type="date" name="endingDate" id="endingDate" placeholder="mm-dd-yyyy">
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="form-group">
                        <label for="numberOfTourists">Number Of Tourists</label>
                        <select name="numberOfTourists" id="numberOfTourists" class="form-control">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                        </select>
                    </div>
                </div>
            </div>
            <input class="btn btn-primary" type="submit" value="Submit">
        </form>
        ${tourStatus}
    </div>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>

</html>