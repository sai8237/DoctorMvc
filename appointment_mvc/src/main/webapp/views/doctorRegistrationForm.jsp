<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register as Doctor</title>
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
                    <h1>Doctor Resgistration</h1>
                </div>
                <div class="col-12 col-sm">
                </div>
            </div>
        </div>
    </header> </p>


     
       
       
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