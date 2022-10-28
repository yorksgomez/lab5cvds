<html>
<head>
    <meta charset="UTF-8">
    <style>
        * {
            padding: 0;
            margin: 0;
            box-sizing: border-box;
            font-family: sans-serif;
        }

        #wrap {
            background-color: rgb(186, 228, 229);
            width: 100vw;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        #error {
            opacity: 0;
            position:absolute;
            top: 80px;
            width: fit-content;
            left: 0;
            right: 0;
            padding: 15px 50px;
            background-color: #fe7968;
            color: #fff;
            margin: auto;
            border: 2px solid #d24d57;
            transition: all .6s;
        }

        #container {
            background-color: rgba(255, 255, 255, 0.6);
            border-radius: 25px;
            box-shadow: 1px 1px 1px 0px rgba(0,0,0,0.3);
            padding: 50px;
        }

        #title {
            color: #7d2624;
            text-align: center;
            margin-bottom: 40px;
        }

        #form {
            display: flex;
            flex-direction: column;
        }

        #id {
            margin-bottom: 15px;
            padding: 8px 10px;
            border-radius: 25px;
            border: 1px solid #7d2624;
            outline: 0;
        }

        #enviar {
            background-color: #7d2624;
            padding: 8px 10px;
            color: #FFF;
            border: 0;
        }


    </style>
</head>
<body>
    <main id="wrap">
        <div id="error">
            La entrada tiene que ser un numero!
        </div>
        <div id="container">
            <h2 id="title">Bienvenido al sistema Todo</h2>
            <form method="post" action="/apiServlet" id="form">
                <input type="text" name="id" id="id" placeholder="Ingrese la id del todo">
                <input type="submit" value="Buscar todo" id="enviar">
            </form>
        </div>
    </main>
    <script>

        let enviar = document.getElementById("enviar");
        let error = document.getElementById("error");

        enviar.addEventListener("click", function(ev) {
            let id = document.getElementById("id").value;

            if(isNaN(id) || id == "" || id < 0) {
                error.style.opacity = "1";
                ev.preventDefault();

                setTimeout(function() {
                    error.style.opacity = "0";
                }, 2500);

            }

        });

    </script>
</body>
</html>
