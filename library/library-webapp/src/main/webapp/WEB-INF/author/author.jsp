<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/html_head.jsp" %>
    <title>Library - Author</title>
</head>
<body>

<%@ include file="../_include/header.jsp" %>

<div class="container">
    <h2 class="mt-md-3">Liste des auteurs (<s:property value="authors.size"/>)</h2>

    <div class="mt-md-3 mb-md-3 list-group">
        <s:iterator value="authors">
            <a class="list-group-item list-group-item-action" href="<s:url action="author/%{id}"/>"><s:property value="firstName"/> <s:property value="lastName"/>
                <span class="badge badge-primary badge-pill"><s:property value="works.size"/> livres</span>
            </a>
        </s:iterator>
    </div>
</div>

<%@ include file="../_include/footer.jsp" %>

</body>
</html>
