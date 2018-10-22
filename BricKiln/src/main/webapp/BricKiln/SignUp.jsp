<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>		
		<div>
			<h3>Create your Account</h3>
		</div>		
			
		<div class="container-fluid float-right">
			<form:form method="post" action="register.mvc" modelAttribute="user">
				<div class="form-group row">
			      <label for="name" class="col-md-3 col-form-label">Name</label>
			      <div class="col-md-9">
			        <form:input type="text" class="form-control" path="name" placeholder="Enter Name"/>
			        <form:errors path="name" class="text-danger"/>
			      </div>
			    </div>			
				
				<div class="form-group row">
			      <label for="adhar" class="col-md-3 col-form-label">Adhar</label>
			      <div class="col-md-9">
			        <form:input type="number" class="form-control" path="adhar" placeholder="Enter Adhar Number"/>
			        <form:errors path="adhar" class="text-danger"/>
			      </div>
			    </div>
			    
			    <div class="form-group row">
			      <label for="mobile" class="col-md-3 col-form-label">Mobile</label>
			      <div class="col-md-9">
<!-- 				      	<input type="text" class="form-control bfh-phone" data-country="US"> -->
			        <form:input type="number" class="form-control" path="mobile" placeholder="Enter Mobile Number"/>
			        <form:errors path="mobile" class="text-danger"/>
			      </div>
			    </div>
			    
			    <div class="form-group row">
			      <label for="email" class="col-md-3 col-form-label">Email</label>
			      <div class="col-md-9">
			        <form:input type="email" class="form-control" path="email" placeholder="Enter Email"/>
			        <form:errors path="email" class="text-danger"/>
			      </div>
			    </div>		
			    
				<div class="form-group row">
			      <label for="password" class="col-md-3 col-form-label">Password</label>
			      <div class="col-md-9">
			        <form:input type="password" class="form-control" path="password" placeholder="Enter Password"/>
			        <form:errors path="password" class="text-danger"/>
			      </div>
			    </div>	
			    
			    <div class="form-group row">
			      <label for="cnfPassword" class="col-md-3 col-form-label"> Confirm</label>
			      <div class="col-md-9">
			        <input type="password" class="form-control" name="cnfPassword" placeholder="Re-enter Password"/>
			      </div>
			    </div>	
			    
			    <div class="form-group row">
			      <label for="address" class="col-md-3 col-form-label">Address</label>
			      <div class="col-md-9">
			        <textarea class="form-control rounded-0" name="address" rows="3" placeholder="Enter Address"></textarea>
			      </div>
			    </div>				    
				
				<div class="form-group row">
					<div class="col-md-3"></div>
					<div class="col-md-9">
						<button type="submit" class="col-md-12 btn btn-primary">Register</button>						
					</div>							
				</div>				
			</form:form>
		</div>
		