<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>

<head>
    <!-- Required meta tags -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
        integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    <title>Hello, world!</title>
</head>

<body>
    <nav class="navbar navbar-light bg-dark">
        <a class="navbar-brand">Navbar</a>
        <form class="form-inline">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </nav>
    <div id="container">
        <div class=" col-6">
            <form form action="/pos-web/movies" method="post">
                <div class="form-row">
                    <div class="form-group col-md-6">
                        <label for="nameMov">Nome do filme</label>
                        <input type="text" class="form-control" id="nameMov" name="movies.name" value="${movies.name}">
                    </div>
                    <div class="form-group col-md-6">
                        <label for="genero">Genero</label>
                        <input type="text" class="form-control" id="genero" name="movies.genre" value="${movies.genre}">
                    </div>
                </div>
                <div class="form-group">
                    <label for="datLanca">Data de Lançamento</label>
                    <input type="date" class="form-control" id="datLanca" name="movies.release_date"
                        value="${movies.release_date}">
                </div>
                <div class="form-group">
                    <!--autor-->
                    <label for="inputAddress2">Direção</label>
                    <input type="text" class="form-control" id="inputAddress2" name="movies.direction"
                        value="${movies.direction}">

                </div>
                <div class="form-group">
                    <label for="sinoMovies">Sinopse</label>
                    <textarea class="form-control" rows="5" id="sinoMovies" name="movies.synopsis"
                        value="${movies.synopsis}">

                </textarea>
                </div>

                <div class="form-row">
                    <div class="form-group col-md-4">
                        <label for="inputState">Nome do ator</label>
                        <input type="text" class="form-control" id="inputZip" name="movies.actor.name"
                            value="${movies.actor.name}">
                    </div>
                    <div class="form-group col-md-2">
                        <label for="inputZip">idade</label>
                        <input type="number" class="form-control" id="inputZip" name="movies.actor.idade"
                            value="${movies.actor.idade}">
                    </div>
                    <div class="form-group col-md-2">
                        <label for="datNaAtor">Data de Nascimento</label>
                        <input type="date" class="form-control" id="datNaAtor" name="movies.actor.birth"
                            value="${movies.actor.birth}">
                    </div>
                    <div class="form-group col-md-4">
                        <label for="inputState">Nome do Personagem</label>
                        <input type="text" class="form-control" id="inputZip" name="movies.actor.character"
                            value="${movies.actor.character}">
                    </div>
                </div>
                <div class="form-group">
                    <div class="form-group col-md-6">
                        <label for="trailer">Link Para Assistir o Trailer</label>
                        <input type="text" class="form-control" id="trailer" name="movies.trailer.trailer1"
                            value="${movies.trailer.trailer1}">
                    </div>
                    <div class="form-group col-md-6">
                        <label for="movieLink">Link Para Assistir o Filme</label>
                        <input type="text" class="form-control" id="movieLink" name="movies.watchNow.watch_now_1"
                            value="${movies.watchNow.watch_now_1}">
                    </div>
                </div>

                <button type="submit" class="btn btn-primary">Sign in</button>
            </form>
        </div>
    </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
        integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
        crossorigin="anonymous"></script>
</body>

</html>