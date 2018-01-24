<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/html_head.jsp" %>
    <title>Library - Author item</title>
</head>
<body>

<%@ include file="../_include/header.jsp" %>

<div class="container">
    <h2 class="mt-md-3">Liste des œuvres de <s:property value="author.firstName"/> <s:property value="author.lastName"/> (<s:property value="author.works.size"/>)</h2>

    <table class="table table-striped mt-md-3">
        <thead>
        <tr>
            <th scope="col"></th>
            <th scope="col">Titre</th>
        </tr>
        </thead>
        <tbody>
        <s:iterator value="author.works">

            <tr>
                <td>
                    <a href="<s:url action="work/%{id}"/>"><img style="width: 95px;" src="<s:property value="imageURL"/>"/></a>
                </td>
                <td>
                    <a class="nav-link" href="<s:url action="work/%{id}"/>"><s:property value="title"/></a>
                </td>
            </tr>
        </s:iterator>
        </tbody>
    </table>
</div>

<%@ include file="../_include/footer.jsp" %>

</body>
</html>
