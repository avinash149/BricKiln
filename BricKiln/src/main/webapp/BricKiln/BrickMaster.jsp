<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="spring"%>
			
	<div class="card" style="max-width: 480px;">
  		<div class="card-header" style="background-color: #ADD8E6">
    		<h5>Brick Master</h5>
  		</div>
  		<div class="card-body">
			<spring:form action="addBrick.mvc" method="post" modelAttribute="brick">
						    
				<div class="form-group row">
			      <label for="name" class="col-md-3 col-form-label">Brick Name</label>
			      <div class="col-md-9">
			        <spring:input type="text" class="form-control" path="name" placeholder="Enter Brick Name"/>
			        <spring:errors path="name" class="text-danger"/>
			      </div>
			    </div>	
			    
				<div class="form-group row">
			      <label for="Quantity" class="col-md-3 col-form-label">Quantity</label>
			      <div class="col-md-9">
			        <spring:input type="number" class="form-control" path="quantity" placeholder="Enter quantity"/>
			        <spring:errors path="quantity" class="text-danger"/>
			      </div>
			    </div>		
				
				<div class="form-group row">
			      <label for="price" class="col-md-3 col-form-label"> Price</label>
			      <div class="col-md-9">
			        <spring:input type="text" class="form-control" path="price" placeholder="Enter Price"/>
			        <spring:errors path="price" class="text-danger"/>
			      </div>
			    </div>	
			    		    
			    <div class="form-group row">
					<div class="col-md-3"></div>
					<div class="col-md-9">
						<button type="submit" class="col-md-12 btn btn-primary">Add</button>
					</div>											
				</div>				
				
			</spring:form>
			<table class="table table-bordered table-striped table-hover">
					<thead bgcolor=#ADD8E6>
				      <tr>
				        <th>SNo</th>
				        <th>Brick_Name</th>
				        <th>Qty</th>
				        <th>Price</th>
				        <th>Edit</th>
				        <th>Delete</th>
				      </tr>
				    </thead>
				    <tbody>
				    	<c:forEach begin="0" items="${brick}" var="b">
							<tr>
								<td>${b.id}</td>
								<td>${b.name}</td>
								<td>${b.quantity}</td>
								<td>${b.price}</td>
								<td><a href="editBrick.mvc?id=${b.id}">Edit</a></td>
								<td><a href="deleteBrick.mvc?id=${b.id}">Delete</a></td>
							</tr>
						</c:forEach>
				    </tbody>					
				</table>
		</div>
	</div>