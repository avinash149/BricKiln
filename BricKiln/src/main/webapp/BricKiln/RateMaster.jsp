	<div class="card" style="max-width: 480px;">
  		<div class="card-header" style="background-color: #ADD8E6">
    		<h5>Rate Master</h5>
  		</div>
  		
  		<div class="card-body">
			
			<form method="post" action="rateMaster.mvc">
				<%-- <table class="table table-bordered table-striped table-hover">
				<thead bgcolor=#ADD8E6>
				      <tr>
				        <th>SNO</th>
				        <th>Name</th>				        
				        <th>Quantity</th>
				        <th>Unit</th>
				        <th>Price</th>
				        <th>Edit</th>
				        <th>Delete</th>
				      </tr>
			    </thead>
			    <tbody>	
			    	<c:forEach items="${emp}" var="e">
					<tr>
						<td>1</td>
						<td>${e.name}</td>
						<td>${e.qty}</td>
						<td>${e.unit}</td>
						<td>${e.price}</td>
						<td><a href="editEmployee.mvc?id=${e.id}">Edit</a></td>
						<td><a href="deleteEmployee.mvc?id=${e.id}">Delete</a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>	 --%>							    
				<div class="form-group row">
			      <label for="pathai" class="col-md-2 col-form-label">Pathai</label>
			      <div class="col-md-5">
			        <input type="text" class="form-control" id="pathai1" placeholder="Rs.">
			      </div>
			      <div class="col-md-5">
			        <input type="text" class="form-control" id="pathai2" placeholder="per 1000 Brick">
			      </div>
			    </div>	
			  
			    <div class="form-group row">
			      <label for="nikasi" class="col-md-2 col-form-label">Nikasi</label>
			      <div class="col-md-5">
			        <input type="text" class="form-control" id="nikasi1" placeholder="Rs.">
			      </div>
			      <div class="col-md-5">
			        <input type="text" class="form-control" id="nikasi2" placeholder="per 1000 Brick">
			      </div>
			    </div>			
			    
			    <div class="form-group row">
			      <label for="bojhai" class="col-md-2 col-form-label">Bojhai</label>
			      <div class="col-md-5">
			        <input type="text" class="form-control" id="bojhai1" placeholder="Rs.">
			      </div>
			      <div class="col-md-5">
			        <input type="text" class="form-control" id="bojhai2" placeholder="per 1000 Brick">
			      </div>
			    </div>		
			    
			    <div class="form-group row">
			      <label for="jalai" class="col-md-2 col-form-label">Jalai</label>
			      <div class="col-md-5">
			        <input type="text" class="form-control" id="name" placeholder="Rs.">
			      </div>
			      <div class="col-md-5">
				      <select class="form-control" id="jalai">
				        <option>per Month</option>
				        <option>per Year</option>
				      </select>
			      </div>
			    </div>			    
				
				<div class="form-group row">
					<div class="col-md-2"></div>
					<div class="col-md-10">
						<button type="submit" class="col-md-12 btn btn-primary">Set</button>
					</div>							
				</div>
				
			</form>
			
		</div>
	</div>