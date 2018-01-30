<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/html_head.jsp" %>
    <title>Library - <s:property value="#session.userSession.firstName"/> <s:property value="#session.userSession.lastName"/></title>
</head>
<body>

<%@ include file="../_include/header.jsp" %>

<div class="container">
    <h2 class="mt-md-3">Livres trouvés pour "<s:property value="search"/>"</h2>

    <s:if test="works.size > 0">
    <table class="table table-striped mt-md-3">
        <thead>
        <tr>
            <th scope="col"></th>
            <th scope="col">Titre</th>
            <th scope="col">Auteur</th>
            <th scope="col">Disponibilité</th>
        </tr>
        </thead>
        <tbody>
        <s:iterator value="works">
            <tr>
                <td>
                    <a href="<s:url action="work/%{id}"/>"><img class="img-sm" src="<s:property value="imageURL"/>"/></a>
                </td>
                <td>
                    <a class="nav-link" href="<s:url action="work/%{id}"/>"><s:property value="title"/></a>

                    <div class="block-padding">
                        <div class="block-item">
                            Genre : <a href="<s:url action="type/%{typeWork.id}"/>"><s:property value="typeWork.type"/></a>
                        </div>
                    </div>

                    <div class="block-padding">
                        Édité par :
                        <s:iterator value="books">
                            <div class="block-item">
                                - <a href="<s:url action="editor/%{editor.id}"/>"><s:property value="editor.name"/></a>
                            </div>
                        </s:iterator>
                    </div>
                </td>
                <td>
                    <nav class="nav flex-column">
                        <s:iterator value="authors">
                            <a class="nav-link" href="<s:url action="author/%{id}"/>"><s:property value="firstName"/> <s:property value="lastName"/></a>
                        </s:iterator>
                    </nav>
                </td>
                <td>
                    <div class="block-padding">
                        inconnu
                    </div>
                </td>
            </tr>
        </s:iterator>
        </s:if>
        <s:else>
            <div class="mt-md-3 mb-md-3">
                Il n'existe aucun livres ou éditions correspondants à vos critères.
            </div>
        </s:else>
        </tbody>
    </table>
</div>

<%@ include file="../_include/footer.jsp" %>

</body>
</html>
