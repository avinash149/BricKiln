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
<div class="row">
	<div class="row col-md-8">
<%-- 		<tiles:insertAttribute name="home"/> --%>
	</div> <!--	container  ends -->
	
	<div class="row col-md-4 mt-5">
		<tiles:insertAttribute name="body"/>			
	</div><!-- contents  ends -->		
	</div>			
	<div class="row">				
		<tiles:insertAttribute name="footer"/>					
	</div><!-- 		footer ends -->		
</body>   
</html>				
