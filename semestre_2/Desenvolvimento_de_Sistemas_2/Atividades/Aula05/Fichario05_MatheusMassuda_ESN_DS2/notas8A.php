<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Atividade05</title>
</head>

<body>
    <div class="w3-container w3-padding w3-animate-top">

    <?php
        // Array bidimensional com alunos e suas notas dos 4 bimestres
        $alunos = array(
            array("nome" => "Matheus", "notas" => [9.0, 8.0, 8.0, 7.0]),
            array("nome" => "Luiz", "notas" => [5.0, 4.5, 7.0, 5.5]),
            array("nome" => "Giulia", "notas" => [9.0, 5.5, 5.5, 8]),
            array("nome" => "Ana", "notas" => [6.0, 5.0, 6.5, 6.0]),
            array("nome" => "Rosana", "notas" => [3.5, 4.0, 5.0, 4.5]),
            array("nome" => "Rebeca", "notas" => [6, 7.0, 5.0,5])
        );
    ?>

    <h2 class="w3-center w3-blue">8° Ano A</h2>

    <table class="w3-table-all w3-hoverable w3-centered">
        <tr class="w3-blue">
            <th>Nome</th>
            <th>1º Semestre</th>
            <th>2º Semestre</th>
        </tr>

        <?php
            //Função que formata casas decimais e cor da média, para ser usada mais de uma vez
            function formatarMedia($media) {
                $formatada = number_format($media, 1, ",", ".");
                $cor = ($media >= 6.0) ? "w3-text-green" : "w3-text-red";
                return [$formatada, $cor];
            }
            
            foreach ($alunos as $aluno) {
                // Média 1º semestre (notas nos índices 0 e 1)
                $media1 = ($aluno["notas"][0] + $aluno["notas"][1]) / 2;
                

                // Média 2º semestre (notas nos índices e 3)
                $media2 = ($aluno["notas"][2] + $aluno["notas"][3]) / 2;
                
                list($media1Formatada, $cor1) = formatarMedia($media1);
                list($media2Formatada, $cor2) = formatarMedia($media2);

                echo "<tr>";
                echo "<td>{$aluno['nome']}</td>";
                echo "<td class='{$cor1}'><b>{$media1Formatada}</b></td>";
                echo "<td class='{$cor2}'><b>{$media2Formatada}</b></td>";
                echo "</tr>";
            }
        ?>
        <!-- Conforme meu entendimento, a estrutura de repetição "foreach" é uma ocorrência específica do laço de repetição e é usada para arrays. Ele percorre o arrey "$alunos" e armazena o valor numa variável temporária $aluno, assim ele soma as notas nos íncides "0" e "1" primeiro e segundo valor do arrey e divide por dois para obter a média, com os comandos echo imprime a tabela (linhas e colunas)
         -->
    </table>
    
    </div>
</body>
</html>



