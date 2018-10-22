<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html>
<html style="height: 100%;" lang="en-US">
<head>
	<meta http-equiv="content-type" content="text/html; charset=windows-1252">
	
	<title>
		<tiles:getAsString name="title"/>
	</title>	 
	<%@ include file="css_js.html" %>
</head>
<body style="overflow-x:hidden;"> 
	<%-- <div class="row">
		<tiles:insertAttribute name="header"/>
	</div> --%>
	<div class="row">	
		<div class="col-md-2">
			<tiles:insertAttribute name="userMenu"/>			
		</div><!-- contents  ends -->
		<div class="col-md-10 mt-3">
			
				<tiles:insertAttribute name="body"/>
					
		</div><!-- contents  ends -->				
		<%-- <div class="col-md- mx-auto" style="background-color: aqua;">
			<tiles:insertAttribute name=""/>			
		</div><!-- contents  ends -->		 --%>
					
		<div class="row">				
			<tiles:insertAttribute name="footer"/>					
		</div><!-- 		footer ends -->
	</div>
</body>    
</html>			
		
		
