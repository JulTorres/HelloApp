<%--
    hello-form.jsp
    by julTorres
    for the WildCodeSchool
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link>
    <title>hello-form</title>
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">
    <link rel="stylesheet" href="../ressources/css/style.css" />


</head>
<body>

    <div class="container" class="z-depth-1">

        <header class = "cyan darken-4 z-depth-3">
            <h1>Hello-form</h1>
            <h2>By JulTorres - Wild Code School</h2>
        </header>

        <section>
            <form action="/hello-message.jsp" method="post">
                <label>Prénom:</label>
                <br>
                <input type="text" name="PRENOM" placeholder="Mickey">
                <br>
                <label>Nom:</label>
                <br>
                <input type="text" name="NOM" placeholder="Mouse">
                <label>Heure :</label>
                <br />
                <input type="text" name="HEURE">
                <br><br>
                <button class="btn waves-effect waves-light cyan darken-4" type="submit" name="action">Envoyer
                    <i class="material-icons right">send</i>
                </button>
            </form>
        </section>
    </div>


    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>

</body>
</html>
