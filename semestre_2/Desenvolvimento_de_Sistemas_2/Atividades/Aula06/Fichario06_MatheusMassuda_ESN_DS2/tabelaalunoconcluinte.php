<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Tabela Alunos Concluintes - MYSQLI</title>
</head>

<body class="w3-blue">
    <!--Encapsulamento do conteúdo para funcionar propriedades da W3 -->
    <div class="w3-padding w3-content w3-half w3-display-topmiddle w3-margin">
        <!--Titulação da tabela -->
        <h1 class="w3-center w3-teal w3-round-large w3-
        margin">Alunos Concluintes</h1>

        <!-- Encapsulamento do campo de busca (filtro: ícone de lupa, campo para digitar nome e botão filtrar e voltar) -->
        <div class="w3-margin-bottom w3-left">

            <form method="get" class="w3-bar">
                <i class="fa fa-search w3-large w3-bar-item" style="padding-top:8px;"></i>
                <input type="text" name="nome" placeholder="Digite o nome" class="w3-input w3-bar-item w3-border w3-round" style="display:inline-block; width:200px;">

                <button type="submit" class="w3-button w3-teal w3-bar-item w3-round w3-margin-right w3-margin-left">Filtrar</button>


                <!-- Lógica: pegar o 'nome' + nome for diferente de vazio  -->
                <!-- $_SERVER['PHP_SELF'] leva o usuário para o script atual (como se fosse um reset para a tabela original) -->
                <?php if(isset($_GET['nome']) && $_GET['nome'] != ''): ?>
                    <a href="<?php echo $_SERVER['PHP_SELF']; ?>" class="w3-button w3-button w3-teal w3-bar-item w3-round">Voltar</a>
                <?php endif; ?>
            </form>

        </div>


        <table class="w3-table-all w3-centered w3-text-grey">

            <!--Define a linha/colunas do cabeçalho da tabela -->
            <thead>
                <tr class="w3-center w3-teal">
                    <th>Código</th>
                    <th>Nome</th>
                    <th>Nota 1</th>
                    <th>Nota 2</th>
                    <th>Nota 3</th>
                    <th>Nota 4</th>
                    <th>Média</th>
                </tr>
            <thead>

            <?php
            //criação variáveis para conexão ao BD (alterai usuário e senha para facilitar neste projeto)
            $servername = "localhost";
            $username = "pwii_user";
            $password = "senha123";
            $dbname = "pwii";
            //conectar ao BD (optei por usar o Workbanch)
            $conexao = new mysqli($servername, $username, $password, $dbname);

            //checar conexão ao BD
            if ($conexao->connect_error) {
                die("Connection failed: " . $conexao->connect_error);
            } 

            //Verifica se houve filtro pelo nome
            //Inicializa a variável como um string vazia
            $nomeFiltro = '';
            //lógica: foi enviado algo para o parâmtro 'nome' e além disso (E LÓGICO), é diferente de valor vazio ' '
            if(isset($_GET['nome']) && $_GET['nome'] != '') {
                //método real_scape_string do Mysqli para escapar caracteres especiais
                $nomeFiltro = $conexao->real_escape_string($_GET['nome']);
                // Comando sql para montar a query (consulta) selecione tudo da tabale alunoconcluinte onde o nome contém a string $nomefiltro
                // % funciona como coringa para casos onde o valor digitado esteja no meio (por exemplo um sobrenome ou nome composto)
                $sql = "SELECT * FROM alunoconcluinte WHERE nome LIKE '%$nomeFiltro%'";
            // caso não seja encontrado o filtro com o valor passado pela URL usará a "exceção" else que é exibir a tabela inteira
            } else {
                $sql = "SELECT * FROM alunoconcluinte";
            }

            $resultado = $conexao->query($sql);

            if($resultado != null) {
                foreach($resultado as $linha) {
                    
                    //calcular médias (nova coluna)
                    $media = ($linha['nota1'] + $linha['nota2'] + $linha['nota3'] + $linha['nota4']) / 4;

                    //monta/ imprime a tabela com as colunas <td> para id, nome, nota 1 até 4 e média (que foi calculada na linha acima)
                    echo '<tr>';
                    echo '<td>'.$linha['idalunoconcluinte'].'</td>';
                    echo '<td><strong>'.$linha['nome'].'</strong></td>';
                    echo '<td>'.$linha['nota1'].'</td>';
                    echo '<td>'.$linha['nota2'].'</td>';
                    echo '<td>'.$linha['nota3'].'</td>';
                    echo '<td>'.$linha['nota4'].'</td>';
                    echo '<td><strong>'.number_format($media,2).'</strong></td>';
                    echo '</tr>';
                }
            }
            
            $conexao->close();
            
            ?>
        </table>

    </div>
</body>
</html>