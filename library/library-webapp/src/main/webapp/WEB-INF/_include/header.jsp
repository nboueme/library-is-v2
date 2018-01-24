<nav class="navbar sticky-top navbar-expand-lg navbar-dark bg-dark">

    <div class="container">

        <a class="navbar-brand" href="<s:url value="/"/>">Library</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-toggler" aria-controls="navbar-toggler" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbar-toggler">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="<s:url value="/"/>">Accueil</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="" id="navbar-dropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Découvrir
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbar-dropdown">
                        <a class="dropdown-item" href="<s:url action="work"/>">Œuvres</a>
                        <a class="dropdown-item" href="<s:url action="author"/>">Auteurs</a>
                        <a class="dropdown-item" href="<s:url value="/"/>">Éditeurs</a>
                        <a class="dropdown-item" href="<s:url action="type"/>">Genres</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<s:url action="login"/>">Mes emprunts</a>
                </li>
            </ul>

            <s:form class="form-inline my-2 my-lg-0">
                <s:textfield class="form-control mr-sm-2" name="search" label="Search" placeholder="Search"/>
                <s:submit class="btn btn-outline-primary my-2 my-sm-0" value="Search"/>
            </s:form>
        </div>

    </div>

</nav>