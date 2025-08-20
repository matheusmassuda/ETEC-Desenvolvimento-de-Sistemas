<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/5/w3.css">
    <title>Dependentes</title>
</head>

<body class="w3-monospace custom-margin ">

    <div class="">
        <h1 class="w3-border-bottom w3-text-dark-grey w3-margin-bottom">Dependentes</h1>
    </div>

    <form class="w3-text-dark-grey w3-margin-top" action="dependentesAction.php" method="post">
        <label class="" for="">Nome</label>
        <input class="w3-input" id="form-dep-nome" name="form-dep-nome" type="text">

        <label class="" for="">Salário</label>
        <input class="w3-input" id="form-dep-salario" name="form-dep-salario" type="text">

        <label class="" for="">Quantidade Dependentes</label>
        <input class="w3-input" id="form-dep-qntdependentes" name="form-dep-qntdependentes" type="text">

        <button class="w3-btn w3-dark-grey w3-margin-top">Enviar</button>
    </form>

</body>

</html>