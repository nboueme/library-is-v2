<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/html_head.jsp" %>
    <title>Library - Work item</title>
</head>
<body>

<%@ include file="../_include/header.jsp" %>

<div class="container">
    <h2 class="mt-md-3"><s:property value="work.title"/></h2>

    <div class="row mt-md-3">

        <div class="col-sm-auto">
            <img style="width: 210px;" src="<s:property value="work.imageURL"/>"/>
        </div>

        <div class="col-sm">
            <ul class="nav flex-column">
                <s:iterator value="work.authors">
                    <li class="nav-item">
                        <a href="<s:url action="author/%{id}"/>"><s:property value="firstName"/> <b><s:property value="lastName"/></b></a>
                    </li>
                </s:iterator>
            </ul>

            <div>Genre : <a href="<s:url action="type/%{work.typeWork.id}"/>"><s:property value="work.typeWork.type"/></a></div>

            <div class="mt-md-3 border-bottom">Résumé :</div>
            <div style="text-align: justify;"><s:property value="work.summary"/></div>
        </div>
    </div>

    <table class="table table-sm table-striped mt-md-3">
        <caption>Liste des éditions</caption>
        <thead>
        <tr>
            <th scope="col">ISBN</th>
            <th scope="col">Éditeur</th>
            <th scope="col">Statut</th>
        </tr>
        </thead>
        <s:iterator value="work.books">
            <tr>
                <td><s:property value="ISBN"/></td>
                <td><s:property value="editor.name"/> (<s:property value="year"/>)</td>
                <td>inconnu</td>
            </tr>
        </s:iterator>
    </table>
</div>

<%@ include file="../_include/footer.jsp" %>

</body>
</html>
