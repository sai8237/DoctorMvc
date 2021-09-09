<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align:center;">


<h1>Doctor Registration</h1>
     
       
       
       <form action="processregister" method="post">
            <p><label for="username">Username:</label>
            <br>
			<input type="text" name="name" /> <br></p>
			<p><label for="password">Password:</label><br>
			<input type="password" name="password" /> <br> </p>
			<p><label for="email">Email:</label><br>
			<input type="email" name="email" /> <br></p>
			<p><label for="category">Category:</label><br>
				  <select name="category" id="category">
				    <option value="physician">Physician</option>
				    <option value="cardiologist">Cardiologist</option>
				    <option value="neurologist">Neurologist</option>
				    <option value="pathologist">Pathologist</option>
				  </select> </p>
			  <p><label for="gender">Gender:</label><br>
				  <select name="cars" id="cars">
				    <option value="male">Male</option>
				    <option value="female">Female</option>
				  </select> </p>
			<p><label for="mobile">Mobile Number:</label><br>
			<input type="number" name="mobile" /> <br>	</p>
			<p><label for="fees">Fees:</label><br>
			<input type="number" name="fee" /> <br>	</p>
			
			<input type="submit" value="Register" /> <br>
	</form>
	
	
	
</body>
</html>