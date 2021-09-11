<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Home Page</title>
</head>
<style>
.jumbotron {
    padding:70px 30px 70px 30px;
    margin:40px auto;
    background: #9575CD ;
    color:floralwhite;
}
</style>
<body style="text-align:center;">


    <p><header class="jumbotron">
        <div class="container">
            <div class="row row-header">
                <div class="col-12 col-sm-6">
                    <h1>Hello Doctor ${name}</h1>
                </div>
                <div class="col-12 col-sm">
                </div>
            </div>
        </div> </header> </p>
    
<h1>Patients List</h1>
	<table border="2" width="70%" cellpadding="2" align="center">
	<tr><th>BookId</th><th>DoctorName</th><th>PatientName</th><th>Payment</th><th>Status</th><th>DateTime</th></tr>
    <c:forEach var="appointment" items="${list}"> 
    <tr>
    <td>${appointment.bookId}</td>
    <td>${appointment.doctorName}</td>
    <td>${appointment.patientName}</td>
    <td>${appointment.payment}</td>
    <td>${appointment.status}</td>
    <td>${appointment.dateTime}</td>
    <td><a href="http://localhost:8083/doctor/treating/${appointment.bookId}" >Treat</a></td>
   
    </tr>
    </c:forEach>
    </table>
    <br/>
	 <a href="http://localhost:8083/logout">Log out</a>
</body>
</html>