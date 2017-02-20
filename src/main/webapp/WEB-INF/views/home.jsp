<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
	<head>
		<title>Home</title>
		<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function()
			{
				initButtonEvent();
			})
			
			function initButtonEvent()
			{
				$("input[type='button']").click(function()
				{
					var url = $(this).attr('name');
					var methodType = "POST";
					
					requestForUrl(url, methodType);
				});
			}
			
			function requestForUrl(url, methodType)
			{
				$.ajax({ url:url, type:methodType});
			}
		</script>
	</head>
	<body>
		<h4>check your application logs. after buttun clicked !!!</h4>
		<input type="button" id="btn_createMan" value="Create Man" name="man"/>
		<input type="button" id="btn_createWoman" value="Create Woman" name="woman"/>
	</body>
</html>
