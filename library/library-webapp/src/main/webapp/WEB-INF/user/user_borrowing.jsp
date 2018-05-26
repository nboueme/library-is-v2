<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/html_head.jsp" %>
    <title>Library - <s:property value="#session.userSession.firstName"/> <s:property value="#session.userSession.lastName"/></title>
</head>
<body>

<%@ include file="../_include/header.jsp" %>

<div class="container">
    <h2 class="mt-md-3">Liste des emprunts de <s:property value="#session.userSession.firstName"/> <s:property value="#session.userSession.lastName"/></h2>

    <nav class="mt-md-3">
        <div class="nav nav-tabs" id="nav-tab" role="tablist">
            <a class="nav-item nav-link active" id="nav-current-tab" data-toggle="tab" href="#nav-current" role="tab" aria-controls="nav-current" aria-selected="true">En cours</a>
            <a class="nav-item nav-link" id="nav-reservation-tab" data-toggle="tab" href="#nav-reservation" role="tab" aria-controls="nav-reservation" aria-selected="false">Réservations</a>
            <a class="nav-item nav-link" id="nav-archive-tab" data-toggle="tab" href="#nav-archive" role="tab" aria-controls="nav-archive" aria-selected="false">Archives</a>
        </div>

        <div class="tab-content" id="nav-tabContent">
            <div class="tab-pane fade show active" id="nav-current" role="tabpanel" aria-labelledby="nav-current-tab">
                <table class="table table-sm table-striped mt-md-3">
                    <thead>
                    <tr>
                        <th scope="col">Titre</th>
                        <th scope="col">Date d'emprunt</th>
                        <th scope="col">Date de retour</th>
                        <th scope="col">Prolongation</th>
                        <!--th scope="col">INFORMATIONS</th-->
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
                                        <s:if test="extended && currentDate < returnDate.toGregorianCalendar().time">
                                            déjà prolongé
                                        </s:if>
                                        <s:elseif test="currentDate >= returnDate.toGregorianCalendar().time">
                                            livre à rendre
                                        </s:elseif>
                                        <s:else>
                                            <a href="<s:url action="borrowing/update/%{id}"/>">prolonger</a>
                                        </s:else>
                                    </div>
                                </td>
                                <!--td>
                                    <p>Borrowing id: <s:property value="id"/></p>
                                    <p>Book id: <s:property value="bookId"/></p>
                                    <p>User id: <s:property value="userId"/></p>
                                </td-->
                            </tr>
                        </s:if>
                    </s:iterator>
                    </tbody>
                </table>
            </div>

            <div class="tab-pane fade" id="nav-reservation" role="tabpanel" aria-labelledby="nav-reservation-tab">
                <table class="table table-sm table-striped mt-md-3">
                    <thead>
                    <tr>
                        <th scope="col">Titre</th>
                        <th scope="col">Date de retour</th>
                        <th scope="col">Position</th>
                    </tr>
                    </thead>
                    <tbody>
                    <s:iterator value="reservationsUser" status="resUser">
                        <tr>
                            <td>
                                <a class="nav-link" href="<s:url action="work/%{work.id}"/>"><s:property value="work.title"/></a>
                            </td>
                            <td>
                                <s:set var="minimumReturnDate" value="%{null}"/>
                                <div class="block-padding">
                                    <s:iterator value="borrowingsWork" status="borrowing">
                                        <s:if test="reservationsUser[#resUser.index].work.id == book.work.id">
                                            <s:if test="#minimumReturnDate == null">
                                                <s:set var="minimumReturnDate" value="%{returnDate}"/>
                                            </s:if>
                                            <s:elseif test="returnDate.toGregorianCalendar().before(#minimumReturnDate.toGregorianCalendar())">
                                                <s:set var="minimumReturnDate" value="%{returnDate}"/>
                                            </s:elseif>
                                        </s:if>
                                    </s:iterator>

                                    <s:date name="#minimumReturnDate.toGregorianCalendar().time" format="dd MMMM yyyy"/>
                                </div>
                            </td>
                            <td>
                                <s:set var="breakLoop" value="%{false}"/>
                                <s:set var="userId" value="user.id"/>
                                <s:set var="workId" value="work.id"/>

                                <s:iterator value="reservationsWork" status="resWork">
                                    <s:iterator value="reservationsWork[#resWork.index]" status="currentList">
                                        <s:if test="#userId == user.id && #workId == work.id && !#breakLoop">
                                            <s:property value="#currentList.index + 1"/>
                                            <s:set var="breakLoop" value="%{true}"/>
                                        </s:if>
                                    </s:iterator>
                                </s:iterator>
                            </td>
                        </tr>
                    </s:iterator>
                    </tbody>
                </table>
            </div>

            <div class="tab-pane fade" id="nav-archive" role="tabpanel" aria-labelledby="nav-archive-tab">
                <table class="table table-sm table-striped mt-md-3">
                    <thead>
                    <tr>
                        <th scope="col">Titre</th>
                        <th scope="col">Date d'emprunt</th>
                        <th scope="col">Date de retour</th>
                    </tr>
                    </thead>
                    <tbody>
                    <s:iterator value="archives">
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
