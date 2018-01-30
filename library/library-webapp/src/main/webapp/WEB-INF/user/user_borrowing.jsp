<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/html_head.jsp" %>
    <title>Library - <s:property value="#session.userSession.firstName"/> <s:property value="#session.userSession.lastName"/></title>
</head>
<body>

<%@ include file="../_include/header.jsp" %>

<div class="container">
    <h2 class="mt-md-3">Liste des emprunts (<s:property value="borrowings.size"/>) de <s:property value="#session.userSession.firstName"/> <s:property value="#session.userSession.lastName"/></h2>

    <nav class="mt-md-3">
        <div class="nav nav-tabs" id="nav-tab" role="tablist">
            <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-current" role="tab" aria-controls="nav-home" aria-selected="true">En cours</a>
            <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-archive" role="tab" aria-controls="nav-profile" aria-selected="false">Archives</a>
        </div>

        <div class="tab-content" id="nav-tabContent">
            <div class="tab-pane fade show active" id="nav-current" role="tabpanel" aria-labelledby="nav-home-tab">
                <table class="table table-sm table-striped mt-md-3">
                    <thead>
                    <tr>
                        <th scope="col">Titre</th>
                        <th scope="col">Date d'emprunt</th>
                        <th scope="col">Date de retour</th>
                        <th scope="col">Prolongation</th>
                    </tr>
                    </thead>
                    <tbody>
                    <s:iterator value="borrowings">
                        <s:if test="loaned">
                            <tr class="<s:if test="currentDate > returnDate.toGregorianCalendar().time">table-warning</s:if>">
                                <td>
                                    <a class="nav-link" href="<s:url action="work/%{book.work.id}"/>"><s:property value="book.work.title"/></a>
                                </td>
                                <td>
                                    <div class="block-padding">
                                        <s:date name="borrowingDate.toGregorianCalendar().time" format="dd MMMM yyyy"/>
                                    </div>
                                </td>
                                <td class="<s:if test="currentDate > returnDate.toGregorianCalendar().time">text-danger text-bold</s:if>">
                                    <div class="block-padding">
                                        <s:date name="returnDate.toGregorianCalendar().time" format="dd MMMM yyyy"/>
                                    </div>
                                </td>
                                <td>
                                    <div class="block-padding">
                                        <s:if test="extended">
                                            déjà prolongé
                                        </s:if>
                                        <s:else>
                                            <a href="<s:url action="borrowing/update/%{id}"/>">prolonger</a>
                                        </s:else>
                                    </div>
                                </td>
                            </tr>
                        </s:if>
                    </s:iterator>
                    </tbody>
                </table>
            </div>

            <div class="tab-pane fade" id="nav-archive" role="tabpanel" aria-labelledby="nav-profile-tab">
                <table class="table table-sm table-striped mt-md-3">
                    <thead>
                    <tr>
                        <th scope="col">Titre</th>
                        <th scope="col">Date d'emprunt</th>
                        <th scope="col">Date de retour</th>
                    </tr>
                    </thead>
                    <tbody>
                    <s:iterator value="borrowings">
                        <s:if test="!loaned">
                            <tr>
                                <td>
                                    <a class="nav-link" href="<s:url action="work/%{book.work.id}"/>"><s:property value="book.work.title"/></a>
                                </td>
                                <td>
                                    <div class="block-padding">
                                        <s:date name="borrowingDate.toGregorianCalendar().time" format="dd MMMM yyyy"/>
                                    </div>
                                </td>
                                <td>
                                    <div class="block-padding">
                                        <s:date name="returnDate.toGregorianCalendar().time" format="dd MMMM yyyy"/>
                                    </div>
                                </td>
                            </tr>
                        </s:if>
                    </s:iterator>
                    </tbody>
                </table>
            </div>
        </div>
    </nav>
</div>

<%@ include file="../_include/footer.jsp" %>

</body>
</html>
