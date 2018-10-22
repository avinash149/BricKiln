
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="spring"%>

	<div class="card" style="max-width: 480px;">
  		<div class="card-header" style="background-color: #ADD8E6">
    		<h5>Employee Master</h5>
  		</div>
  		<div class="card-body">
			<spring:form action="addEmployee.mvc" method="post" modelAttribute="emp">
				<div class="form-group row">
			      <label for="employee" class="col-md-3 col-form-label">Employee</label>
			      <div class="col-md-9">
				      <spring:select class="form-control" path="empType">
				        <spring:option value="Munnev" label="Munnev"/>
				        <spring:option value="Pather" label="Pather"/>
				        <spring:option value="Nikasi" label="Nikasi"/>
				        <spring:option value="Bojhai" label="Bojhai"/>
				        <spring:option value="Driver" label="Driver"/>
				      </spring:select>
			      </div>
			    </div>
			    
				<div class="form-group row">
			      <label for="name" class="col-md-3 col-form-label">Name</label>
			      <div class="col-md-9">
			        <spring:input type="text" class="form-control" path="name" placeholder="Enter Name"/>
			        <spring:errors path="name" class="text-danger"/>
			      </div>
			    </div>			
				
				<div class="form-group row">
			      <label for="fname" class="col-md-3 col-form-label"> F. Name</label>
			      <div class="col-md-9">
			        <spring:input type="text" class="form-control" path="fname" placeholder="Enter Father Name"/>
			        <spring:errors path="fname" class="text-danger"/>
			      </div>
			    </div>	
			    
				<div class="form-group row">
			      <label for="adhar" class="col-md-3 col-form-label">Adhar</label>
			      <div class="col-md-9">
			        <spring:input type="number" class="form-control" path="adhar" placeholder="Enter Adhar Number"/>
			        <spring:errors path="adhar" class="text-danger"/>
			      </div>
			    </div>
			    
			    <div class="form-group row">
			      <label for="mobile" class="col-md-3 col-form-label">Mobile</label>
			      <div class="col-md-9">
	<!-- 				      	<input type="text" class="form-control bfh-phone" data-country="US"> -->
			        <spring:input type="number" class="form-control" path="mobile" placeholder="Enter Mobile Number"/>
			        <spring:errors path="mobile" class="text-danger"/>
			      </div>
			    </div>
			    
			    <div class="form-group row">
			      <label for="address" class="col-md-3 col-form-label">Address</label>
			      <div class="col-md-9">
			        <spring:textarea class="form-control rounded-0" path="address" rows="3" placeholder="Enter Address"/>
			      </div>
			    </div>	
			    
			    <div class="form-group row">
			      <label for="advance" class="col-md-3 col-form-label">Advance</label>
			      <div class="col-md-9">
			        <spring:input type="number" class="form-control" path="advance" placeholder="Enter Advance Money"/>
			      </div>
			    </div>					    					
				
				<div class="form-group row">
					<div class="col-md-3"></div>
					<div class="col-md-9">
						<button type="submit" class="col-md-4 btn btn-primary">Add</button>
						&nbsp; <label for="viewEmployee" class="col-form-label">View Employee? <a href="viewEmployee.mvc">click here</a></label>
					</div>											
				</div>
				
			</spring:form>
		</div>
	</div>