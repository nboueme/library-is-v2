<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/html_head.jsp" %>
    <title>Library - Type</title>
</head>
<body>

<%@ include file="../_include/header.jsp" %>

<div class="container">
    <h2 class="mt-md-3">Liste des genres (<s:property value="types.size"/>)</h2>

    <div class="mt-md-3 mb-md-3 list-group">
        <s:iterator value="types">
            <a class="list-group-item list-group-item-action" href="<s:url action="type/%{id}"/>"><s:property value="type"/>
                <span class="badge badge-primary badge-pill"><s:property value="works.size"/> livres</span>
            </a>
        </s:iterator>
    </div>
</div>

<%@ include file="../_include/footer.jsp" %>

</body>
</html>
