<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="style.css">
<title>Desvio Condicional Composto</title>
</head>

    <body class="custom-margins w3-monospace">

        <div class="w3-containe">
            <h1 class="w3-text-grey">Cálculo de Aproveitamento Escolar</h1>
        </div>

        <form class="w3container" method="post" action="desvioCompostoAction.php">
            <label class="w3-text-grey"><b>Nome do Aluno</b></label>
            <input class="w3-input w3-border w3-lightgrey" name="txtNome" type="text">

            <label class="w3-text-grey"><b>Nota 1</b></label>
            <input class="w3-input w3-border w3-lightgrey" name="txtN1" type="number">
            
            <label class="w3-text-grey"><b>Nota 2</b></label>
            <input class="w3-input w3-border w3-lightgrey" name="txtN2" type="number">
            
            <label class="w3-text-grey"><b>Nota 3</b></label>
            <input class="w3-input w3-border w3-lightgrey" name="txtN3" type="number">
            
            <button class="w3-btn w3-grey w3-margin-top w3-text-white">Calcular Média</button>
        </form>

    </body>

</html>