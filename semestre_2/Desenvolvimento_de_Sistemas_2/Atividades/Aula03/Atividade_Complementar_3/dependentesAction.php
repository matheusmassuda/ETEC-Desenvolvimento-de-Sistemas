<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aumento por Dependente</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/5/w3.css">
</head>

<body>

    <div>
        <h1>
            <?php
                $salario = $_POST['form-dep-salario'];  
                $qntDependentes = $_POST['form-dep-qntdependentes']; 
                $porcentagem;
            
            if ($salario <= 500 && $qntDependentes <= 5) {
                $porcentagem = 15;
            } elseif ($salario <=500 && $qntDependentes >5) {
                $porcentagem = 20;
            } elseif ($salario <=1000 && $qntDependentes <=5) {
                $porcentagem = 10;
            } elseif ($salario <=1000 && $qntDependentes >5) {
                $porcentagem = 15;
            } elseif ($salario <=2000 && $qntDependentes <=5) {
                $porcentagem = 10;
            } elseif ($salario <=2000 && $qntDependentes >5) {
                $porcentagem = 12;
            } elseif ($qntDependentes <=5) {
                $porcentagem = 8;
            } else
            {
                $porcentagem = 10;
            }
            
            echo "".$_POST['form-dep-nome']."! <br>";
            echo "Você terá ".$porcentagem."% de aumento, resultando no valor de R$ ".(($porcentagem*$salario)/100). "<br>";
            echo "Seu novo salário: R$ ".($salario+($porcentagem*$salario)/100)."<br>";


            
            ?>

        </h1>
    </div>

</body>

</html>