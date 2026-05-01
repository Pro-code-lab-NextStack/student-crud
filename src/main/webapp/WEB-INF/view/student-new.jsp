<%--
  Created by IntelliJ IDEA.
  User: 2022
  Date: 4/29/2026
  Time: 9:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<jsp:include page="header.jsp"/>
<form action="create-student" method="post">
    <div class="container">
        <div class="row">
            <div class="col-3">
                <div class="form-group">
                    <label for="id">ID</label>
                    <input type="number" name="id" id="id" class="form-control">
                </div>
            </div>
            <div class="col-3">
                <div class="form-group">
                    <label for="name">Name</label>
                    <input type="text" name="name" id="name" class="form-control">
                </div>
            </div>
            <div class="col-3">
                <div class="form-group">
                    <label for="address">Address</label>
                    <input type="text" name="address" id="address" class="form-control">
                </div>
            </div>
            <div class="col-3">
                <div class="form-group">
                    <label for="salary">Salary</label>
                    <input type="number" name="salary" id="salary" class="form-control">
                </div>
            </div>
        </div>
        <div class="col-12">
            <br>
            <button type="submit" class="btn btn-primary col-12">Save student</button>
        </div>
    </div>
</form>



</body>
</html>
