<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="style.css">
<title>Desvio Condicional Simples</title>
</head>

<body class="custom-margins w3-monospace">

    <div class="w3-container w3-text-grey">
        <h1 class="w3-border-bottom">Enviar Pedido</h1>
    </div>

    <form class="w3-container" method="post" action="desvioSimplesAction.php">

    <label class="w3-text-grey"><b>Nome do Usuário</b></label>
    <input class="w3-input w3-border w3-light-grey" name="txtNome"
    type="text">
    
    <label class="w3-text-grey"><b>Valor total da Compra</b></label>
    <input id="total-Compra" class="w3-input w3-border w3-light-grey" name="txtValorTotal"
    type="text">

    <label class="w3-text-grey"><b>Escolha a Região:</b></label>
    <select class="w3-input w3-border w3-light-grey" id="regiao" name ="cmbRegiao">
        <option value="Centro-Oeste">Centro-Oeste</option>
        <option value="Nordeste">Nordeste</option>
        <option value="Norte">Norte</option>
        <option value="Sul">Sul</option>
        <option value="Sudeste" selected>Sudeste</option>
    </select>
    

    <button class="w3-btn w3-dark-grey w3-margin-top">Enviar</button>
    </form>

    <!--
    
    <script>
        document.getElementById('total-Compra').addEventListener('input', function(e) {
            let valor = e.target.value;
        
            // Remove tudo que não for número
            valor = valor.replace(/\D/g, '');
        
            // Converte para centavos e formata
            valor = (valor / 100).toFixed(2) + '';
            valor = valor.replace('.', ',');
            valor = valor.replace(/\B(?=(\d{3})+(?!\d))/g, '.');
        
            // Adiciona o "R$" na frente
            e.target.value = 'R$ ' + valor;
        });
    </script>
    -->

</body>
</html>