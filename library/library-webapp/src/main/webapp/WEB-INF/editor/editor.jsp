<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/html_head.jsp" %>
    <title>Library - Editor</title>
</head>
<body>

<%@ include file="../_include/header.jsp" %>

<div class="container">
    <h2 class="mt-md-3">Liste des éditeurs (<s:property value="editors.size"/>)</h2>

    <div class="mt-md-3 mb-md-3 list-group">
        <s:iterator value="editors">
            <a class="list-group-item list-group-item-action" href="<s:url action="editor/%{id}"/>"><s:property value="name"/>
                <span class="badge badge-primary badge-pill"><s:property value="books.size"/> livres</span>
            </a>
        </s:iterator>
    </div>
</div>

<%@ include file="../_include/footer.jsp" %>

</body>
</html>
