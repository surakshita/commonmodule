<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
<link rel="stylesheet" href="css/register.css" type="text/css">
</head>
<body style="background-image: url('img/registerbg.jpeg'); background-repeat: no-repeat; background-attachment: fixed; background-size: cover;">
<header>THE PET SHOP</header>
<div class="wrapper">
<div class="tittle">Register</div>
<form action="registration.do" method="post">
<div class="form">
<div class="input_field">
<label>FULLNAME:</label>
<input type="text" name="fullName">
</div>
<div class="input_field">
<label>EMAIL:</label>
<input type="email" name="emailId">
</div>
<div class="input_field">
<label>DATE OF BIRTH:</label>
<input type="text" name="dob">
</div>
<div class="input_field">
<label>CONTACT:</label>
<input type="number" name="contact">
</div>
<div class="input_field">
<label>ADDRESS:</label>
<input type="text" name="address">
</div>
<div>
<label>GENDER</label>
<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female
<input type="radio" name="gender" value="others">Other
</div>
<div class="input_field">
<label>PASSWORD:</label>
<input type="password" name="password">
</div>
<div class="submit_field">
<input type="submit" value="register" class="btn" >
<input type="reset" value="reset" class="btn">
</div>
</div>
</div>
</form>
</div>
 
 
 <footer>&COPY;2021</footer>
</body>
</html>