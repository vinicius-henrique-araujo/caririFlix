<jsp:include page="header.jsp" />
<div id="container">
    <div class="row-6">
        <form form action="/pos-web/movies" method="post">
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="nameMov">Nome do filme</label>
                    <input type="text" class="form-control" id="nameMov">
                </div>
                <div class="form-group col-md-6">
                    <label for="genero">Genero</label>
                    <input type="text" class="form-control" id="genero">
                </div>
            </div>
            <div class="form-group">
                <label for="datLanca">Data de Lançamento</label>
                <input type="date" class="form-control" id="datLanca">
            </div>
            <div class="form-group">
                <!--autor-->
                <label for="inputAddress2">Direção</label>
                <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">

            </div>
            <div class="form-group">
                <label for="sinoMovies">Sinopse</label>
                <textarea class="form-control" rows="12" id="sinoMovies"> </textarea>
            </div>
            
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="inputState">Nome do ator</label>
                    <input type="text" class="form-control" id="inputZip">
                </div>
                <div class="form-group col-md-2">
                    <label for="inputZip">idade</label>
                    <input type="number" class="form-control" id="inputZip">
                </div>
                <div class="form-group col-md-2">
                    <label for="datNaAtor">Data de Nascimento</label>
                    <input type="date" class="form-control" id="datNaAtor">
                </div>
                <div class="form-group col-md-4">
                    <label for="inputState">Nome do Personagem</label>
                    <input type="text" class="form-control" id="inputZip">
                </div>
            </div>
            <div class="form-group">
                <div class="form-group col-md-6">
                    <label for="trailer">Link Para Assistir o Trailer</label>
                    <input type="text" class="form-control" id="trailer">
                </div>
                <div class="form-group col-md-6">
                    <label for="movieLink">Link Para Assistir o Filme</label>
                    <input type="text" class="form-control" id="movieLink">
                </div>
            </div>

            <button type="submit" class="btn btn-primary">Sign in</button>
        </form>
    </div>
</div>
<jsp:include page="footer.jsp" />