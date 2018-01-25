<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/html_head.jsp" %>
    <title>Library - Editor item</title>
</head>
<body>

<%@ include file="../_include/header.jsp" %>

<div class="container">
    <h2 class="mt-md-3">Liste des œuvres de l'éditeur <s:property value="editor.name"/> (<s:property value="editor.books.size"/>)</h2>

    <table class="table table-striped mt-md-3">
        <thead>
        <tr>
            <th scope="col"></th>
            <th scope="col">Titre</th>
            <th scope="col">Auteur</th>
        </tr>
        </thead>
        <tbody>
        <s:iterator value="editor.books">
            <tr>
                <td>
                    <a href="<s:url action="work/%{work.id}"/>"><img style="width: 95px;" src="<s:property value="work.imageURL"/>"/></a>
                </td>
                <td>
                    <a class="nav-link" href="<s:url action="work/%{work.id}"/>"><s:property value="work.title"/></a>
                </td>
                <td>
                    <nav class="nav flex-column">
                        <s:iterator value="work.authors">
                            <a class="nav-link" href="<s:url action="author/%{id}"/>"><s:property value="firstName"/> <s:property value="lastName"/></a>
                        </s:iterator>
                    </nav>
                </td>
            </tr>
        </s:iterator>
        </tbody>
    </table>
</div>

<%@ include file="../_include/footer.jsp" %>

</body>
</html>
