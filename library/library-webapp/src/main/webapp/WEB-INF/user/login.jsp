<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/html_head.jsp" %>
    <title>Library - Login</title>
</head>
<body>

<%@ include file="../_include/header.jsp" %>

<div class="container">
    <h1>Login</h1>
    <s:form action="login">
        <s:textfield name="user.email" label="Email" value="lotr_elrond@gmail.com"/>
        <s:password name="user.password" label="Password"/>
        <s:submit value="Submit"/>
    </s:form>

    <s:if test="%{existingUser != null}">
        <div>First name: <s:property value="existingUser.firstName"/></div>
        <div>Last name: <s:property value="existingUser.lastName"/></div>
        <div>Email: <s:property value="existingUser.email"/></div>
        <div>Password: <s:property value="existingUser.password"/></div>
    </s:if>

    <s:url action="login" var="userEmailLink">
        <s:param name="user.email">nicolasboueme@gmail.com</s:param>
    </s:url>
    <p><a href="${userEmailLink}">Hello Nicolas Bouème</a></p>
</div>

<%@ include file="../_include/footer.jsp" %>

</body>
</html>
