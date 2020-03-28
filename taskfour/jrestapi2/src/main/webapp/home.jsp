<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container">

<div class="row">
	<div class="col-md-6">
		<form action="getStudentById">
		<div class="form-group">
	    	<label for="id">Search with ID:</label>
	    	<input type="number" class="form-control" id="id" name="id">
	  	</div>
		
		

		<input type="submit"  value = "Find" class="btn btn-info"><br>
	</form>
	</div>
	<div class="col-md-6">
		<form action="deleteStudentById">
		<div class="form-group">
	    	<label for="id">Delete with Id:</label>
	    	<input type="text" class="form-control" id="id" name="id">
	  	</div>
		
		

		<input type="submit" value = "Delete" class="btn btn-danger"><br>
	</form>
	</div>
	
	
	</div>
	<h1>Create New Student</h1>
	<form action="addStudent">
	<div class="form-group">
	    <label for="id">ID:</label>
	    <input type="number" class="form-control" id="id" name="id">
	  </div>
	  <div class="form-group">
	    <label for="name">Name:</label>
	    <input type="text" class="form-control" id="name" name="name">
	  </div>
	  <div class="form-group">
	    <label for="language">Language:</label>
	    <input type="text" class="form-control" id="language" name="language">
	  </div>
	  <div class="form-group">
	    <label for="framework">Framework:</label>
	    <input type="text" class="form-control" id="framework" name="framework">
	  </div>
		
		<input type="submit" value = "Create" class="btn btn-success"><br>
	</form>
	
	</div>
	<script type="text/javascript" src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</body>
</html>