<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<%@ page import="com.brickiln.entity.Employee" %>
<%@ page import="java.util.*;" %>
<%@ page isELIgnored="false" %>		
	<div class="card" style="max-width: 720px;">
  		<div class="card-header" style="background-color: #ADD8E6">
    		<h5>View Employees</h5>
  		</div>
  		
  		<div class="card-body">
  			<div class="form-group row ml-1">
		      <label class="col-form-label">Employee Type</label>
		      <div class="col-md-5">
			      <select class="form-control" id="employee">
			        <option>Munnev</option>
			        <option>Pather</option>
			        <option>Nikasi</option>
			        <option>Driver</option>
			      </select>
		      </div>	
		    </div>
<% List<Employee> list = (List<Employee>)request.getAttribute("empList");
Iterator itr = list.iterator();
while(itr.hasNext()) {
	Employee e = (Employee)itr.next();
	System.out.println(e.getName()+"\t"+e.getFname());
}
%>		    
			<table class="table table-bordered table-striped table-hover">
				<thead bgcolor=#ADD8E6>
				      <tr>
				        <th style="width:10%">Id</th>
				        <th style="width:25%">Name</th>
				        <th style="width:25%">Father_Name</th>
				        <th style="width:20%">Mobile</th>
				        <th style="width:10%">Edit</th>
				        <th style="width:10%">Delete</th>
				      </tr>
			    </thead>
			    <tbody>		
			    	<c:forEach items="${empList}" var="e">
					<tr>
						<td>${e.id}</td>
						<td>${e.name}</td>
						<td>${e.fname}</td>
						<td>${e.mobile}</td>
						<td><a href="editEmployee.mvc?id=${e.id}">Edit</a></td>
						<td><a href="deleteEmployee.mvc?id=${e.id}">Delete</a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>