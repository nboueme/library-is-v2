<!DOCTYPE html>
<html>
<head>
    <%@ include file="_include/html_head.jsp" %>
    <title>Library - Work</title>
</head>
<body>

<%@ include file="_include/header.jsp" %>

<div class="container">
    <h2>Hello Work!</h2>
    <div>Titre : <s:property value="work.title"/></div>
    <div>Type : <s:property value="work.typeWork.type"/></div>
    <div>Auteur(s) :</div>
    <ul>
        <s:iterator value="work.authors">
            <li><s:property value="firstName"/> <s:property value="lastName"/> </li>
        </s:iterator>
    </ul>

    <div>Œuvres :</div>
    <ul>
        <s:iterator value="works">
            <li>Titre : <s:property value="title"/></li>
        </s:iterator>
    </ul>
</div>

<%@ include file="_include/footer.jsp" %>

</body>
</html>
