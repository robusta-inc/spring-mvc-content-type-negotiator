<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test page</title>
    <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
</head>
<body>
 <span id="dynamic-content">Loading...</span>
 <script type="text/javascript">
     $.ajax({url: 'rest/brands/test'}).done(function(data, textStatus, jqXHR) {
            $("#dynamic-content").html('Data: ' + data);
         });

 </script>
</body>
</html>