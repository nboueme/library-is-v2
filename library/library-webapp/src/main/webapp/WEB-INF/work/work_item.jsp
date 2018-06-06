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
            <img class="img-md" src="<s:property value="work.imageURL"/>"/>
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
            <div class="text-justify"><s:property value="work.summary"/></div>
        </div>
    </div>

    <table class="table table-sm table-striped mt-md-3">
        <caption>Liste des éditions (<s:property value="countBooksByWork"/>)</caption>
        <thead>
        <tr>
            <th scope="col">ISBN</th>
            <th scope="col">Éditeur</th>
            <th scope="col">Disponibilité</th>
        </tr>
        </thead>
        <s:iterator value="work.books" status="book">
            <tr>
                <td><s:property value="ISBN"/></td>
                <td><a href="<s:url action="editor/%{editor.id}"/>"><s:property value="editor.name"/></a> (<s:property value="year"/>)</td>
                <td>
                    <s:set var="canReserve" value="%{true}"/>
                    <s:iterator value="borrowings">
                        <s:if test="#session.userSession.id == userId">
                            <s:set var="alreadyLoaned" value="%{true}"/>
                        </s:if>

                        <s:if test="!loaned">
                            <s:set var="canReserve" value="%{false}"/>
                        </s:if>

                        <s:if test="#minimumReturnDate == null">
                            <s:set var="minimumReturnDate" value="%{returnDate}"/>
                        </s:if>
                        <s:elseif test="returnDate.toGregorianCalendar().before(#minimumReturnDate.toGregorianCalendar())">
                            <s:set var="minimumReturnDate" value="%{returnDate}"/>
                        </s:elseif>
                    </s:iterator>

                    <s:if test="borrowings[#book.index].loaned">
                        Indisponible
                    </s:if>
                    <s:else>
                        Disponible
                    </s:else>
                </td>
            </tr>
        </s:iterator>
    </table>

    <s:if test="%{#canReserve && #session.userSession != null}">
        <p class="mt-md-3">
            Prochain retour le
            <s:date name="#minimumReturnDate.toGregorianCalendar().time" format="dd MMMM yyyy"/>
        </p>
        <p class="mt-md-3">Nombre de réservation actuel : <s:property value="countReservationsByWork"/></p>
        <p class="mt-md-3">
            <s:iterator value="reservations">
                <s:if test="#session.userSession.id == user.id">
                    <s:set var="alreadyReserved" value="%{true}"/>
                </s:if>
            </s:iterator>

            <s:if test="#alreadyLoaned">
                Vous avez déjà un emprunt en cours pour cette oeuvre
            </s:if>
            <s:elseif test="#alreadyReserved">
                Vous avez une réservation en cours pour cette oeuvre
            </s:elseif>
            <s:elseif test="countBooksByWork * 2 == countReservationsByWork">
                Liste de réservations pleine
            </s:elseif>
            <s:else>
                <a href="<s:url action="reservation/add/%{work.id}"/>">Faire une réservation</a>
            </s:else>
        </p>
    </s:if>
</div>

<%@ include file="../_include/footer.jsp" %>

</body>
</html>
