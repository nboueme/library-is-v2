<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/html_head.jsp" %>
    <title>Library - <s:property value="#session.userSession.firstName"/> <s:property value="#session.userSession.lastName"/></title>
</head>
<body>

<%@ include file="../_include/header.jsp" %>

<div class="container">
    <h2 class="mt-md-3">Livres trouvés pour "<s:property value="search"/>" (<s:property value="works.size"/>)</h2>

    <s:if test="works.size > 0">
    <table class="table table-striped mt-md-3">
        <thead>
        <tr>
            <th scope="col"></th>
            <th scope="col">Titre</th>
            <th scope="col">Auteur</th>
            <th scope="col">Disponibilité</th>
            <!--th scope="col">INFORMATIONS</th-->
        </tr>
        </thead>
        <tbody>
        <s:iterator value="works" status="work">
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
                        <s:set var="countBorrowingByBook" value="%{0}"/>
                        <s:set var="alreadyLoaned" value="%{false}"/>

                        <s:iterator value="books" status="book">
                            <s:iterator value="borrowings" status="borrowing">
                                <s:if test="books[#book.index].id == bookId">
                                    <s:if test="#session.userSession.id == userId">
                                        <s:set var="alreadyLoaned" value="%{true}"/>
                                    </s:if>

                                    <s:if test="#book.index == 0">
                                        <s:set var="minimumReturnDate" value="%{returnDate}"/>
                                    </s:if>
                                    <s:elseif test="returnDate.toGregorianCalendar().before(#minimumReturnDate.toGregorianCalendar())">
                                        <s:set var="minimumReturnDate" value="%{returnDate}"/>
                                    </s:elseif>
                                    <s:set var="countBorrowingByBook" value="%{#countBorrowingByBook + 1}"/>
                                </s:if>
                            </s:iterator>
                        </s:iterator>

                        <s:if test="#countBorrowingByBook == books.size">
                            <p>Indisponible</p>
                            <s:if test="%{#session.userSession != null}">
                                <p>
                                    Prochain retour le
                                    <s:date name="#minimumReturnDate.toGregorianCalendar().time" format="dd MMMM yyyy"/>
                                </p>
                                <p>
                                    Nombre de réservation actuel :
                                    <s:property value="countReservationsByWork[#work.index]"/>
                                </p>
                                <p>
                                    <s:iterator value="reservations">
                                        <s:if test="work.id == works[#work.index].id">
                                            <s:set var="alreadyReserved" value="%{true}"/>
                                        </s:if>
                                    </s:iterator>

                                    <s:if test="#alreadyLoaned">
                                        Vous avez déjà un emprunt en cours pour cette oeuvre
                                    </s:if>
                                    <s:elseif test="#alreadyReserved">
                                        Vous avez une réservation en cours pour cette oeuvre
                                    </s:elseif>
                                    <s:elseif test="cantReserve[#work.index]">
                                        Liste de réservations pleine
                                    </s:elseif>
                                    <s:else>
                                        <a href="<s:url action="reservation/add/%{id}"/>">Faire une réservation</a>
                                    </s:else>
                                </p>
                            </s:if>
                        </s:if>
                        <s:else>
                            Disponible
                        </s:else>
                    </div>
                </td>
                <!--td>
                    <s:iterator value="borrowings" status="borrowing">
                        <s:iterator value="books" status="book">
                            <s:if test="books[#book.index].id == bookId">
                                <p>Borrowing id: <s:property value="borrowings[#borrowing.index].id"/></p>
                                <p>Book id: <s:property value="borrowings[#borrowing.index].bookId"/></p>
                                <p>User id: <s:property value="borrowings[#borrowing.index].userId"/></p>
                            </s:if>
                        </s:iterator>
                    </s:iterator>
                </td-->
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
