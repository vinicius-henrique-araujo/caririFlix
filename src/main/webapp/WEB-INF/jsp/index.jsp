<jsp:include page="../../header.jsp" />
<div id="container">
    <div class=" col-6">
        <form form action="/pos-web/movies" method="post">
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="nameMov">Nome do filme</label>
                    <input type="text" class="form-control" id="nameMov"name="movies.name" value="${movies.name}">
                </div>
                <div class="form-group col-md-6">
                    <label for="genero">Genero</label>
                    <input type="text" class="form-control" id="genero" name="movies.genre" value="${movies.genre}">
                </div>
            </div>
            <div class="form-group">
                <label for="datLanca">Data de Lançamento</label>
                <input type="date" class="form-control" id="datLanca" name="movies.release_date" value="${movies.release_date}">
            </div>
            <div class="form-group">
                <!--autor-->
                <label for="inputAddress2">Direção</label>
                <input type="text" class="form-control" id="inputAddress2"name="movies.direction" value="${movies.direction}">

            </div>
            <div class="form-group">
                <label for="sinoMovies">Sinopse</label>
                <textarea class="form-control" rows="5" id="sinoMovies" name="movies.synopsis" value="${movies.synopsis}"> 

                </textarea>
            </div>
            
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="inputState">Nome do ator</label>
                    <input type="text" class="form-control" id="inputZip" name="movies.actor.name" value="${movies.actor.name}">
                </div>
                <div class="form-group col-md-2">
                    <label for="inputZip">idade</label>
                    <input type="number" class="form-control" id="inputZip" name="movies.actor.idade" value="${movies.actor.idade}">
                </div>
                <div class="form-group col-md-2">
                    <label for="datNaAtor">Data de Nascimento</label>
                    <input type="date" class="form-control" id="datNaAtor" name="movies.actor.birth" value="${movies.actor.birth}">
                </div>
                <div class="form-group col-md-4">
                    <label for="inputState">Nome do Personagem</label>
                    <input type="text" class="form-control" id="inputZip" name="movies.actor.character" value="${movies.actor.character}">
                </div>
            </div>
            <div class="form-group">
                <div class="form-group col-md-6">
                    <label for="trailer">Link Para Assistir o Trailer</label>
                    <input type="text" class="form-control" id="trailer" name="movies.trailer.trailer1" value="${movies.trailer.trailer1}" >
                </div>
                <div class="form-group col-md-6">
                    <label for="movieLink">Link Para Assistir o Filme</label>
                    <input type="text" class="form-control" id="movieLink" name="movies.watchNow.watch_now_1" value="${movies.watchNow.watch_now_1}">
                </div>
            </div>

            <button type="submit" class="btn btn-primary">Sign in</button>
        </form>
    </div>
</div>
<jsp:include page="../../footer.jsp" />