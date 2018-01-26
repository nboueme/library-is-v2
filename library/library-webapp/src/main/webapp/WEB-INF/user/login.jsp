<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/html_head.jsp" %>
    <title>Library - Login</title>
</head>
<body>

<%@ include file="../_include/header.jsp" %>

<div class="container">
    <h2 class="mt-md-3">Connexion</h2>

    <s:if test="%{hasFieldErrors()}">
        <div class="alert alert-danger alert-dismissible fade show" role="alert">
            <h4 class="alert-heading">Error!</h4>
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
            <s:fielderror/>
        </div>
    </s:if>

    <s:if test="%{hasActionErrors()}">
        <div class="alert alert-danger alert-dismissible fade show" role="alert">
            <h4 class="alert-heading">Error!</h4>
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
            <s:actionerror/>
        </div>
    </s:if>

    <div class="row mt-md-3">
        <div class="col-lg-4 col-sm-6">
            <s:form action="authentication">
                <div class="form-group">
                    <s:label for="user.email" value="Email"/>
                    <s:textfield class="form-control" name="user.email" placeholder="Email" value="lotr_elrond@gmail.com"/>
                </div>
                <div class="form-group">
                    <s:label for="user.password" value="Password"/>
                    <s:password class="form-control" name="user.password" placeholder="Password"/>
                </div>
                <s:submit class="btn btn-primary" data-toggle="tooltip" data-placement="top" title="Tooltip on top" value="Submit"/>
            </s:form>
        </div>
    </div>

</div>

<%@ include file="../_include/footer.jsp" %>

</body>
</html>
