<?php 
$nomeCompleto = $_POST['nomeCompleto'];
$idadeColaborador = $_POST['idadeColaborador'];
$profissaoColaborador = $_POST['profissaoColaborador'];
$salarioPretendido = $_POST['salarioPretendido'];
$experiencias = $_POST['experiencias'];

echo "Nome do colaborador: $nomeCompleto<br>";
echo "Idade do colaborador: $idadeColaborador anos<br>";
echo "Profissão atual: $profissaoColaborador<br>";
echo "Salário Pretendido: $salarioPretendido<br>";
echo "Experiências profissionais: $experiencias<br>";
echo "<br><br><br><strong>DESAFIOS AO DESENVOLVER A ATIVIDADE:<br></strong>
    <br> 1) Escolha semântica/eficiente de tags: não lembrava exatamente o valor semântico de todas as tags e tive que revisar (label, textarea);
    <br> 2) Escolha eficiente e correta de preencher o atributo type das tags para o processamentro de dados da forma correta;
    <br> 3)  Abrir/Acessar/vizualizar o resultado (sempre me pego esquecendo de colocar o caminho na barra de navegação (localhost/Atividade02/cadastro.php), sempre me pego tentando usar pela extensão do VsCode ou de outro modo;
    <br><br>
    <br><strong>COMO ORGANIZEI OS DADOS<br></strong>
    <br> Decidi osganizar os dados de forma minimalista em um formulátio vertical e responsivo para diferentes tamanhos de tela (usando w3.css).
    <br>Ao nomear os campos com ids e names optei por um nome que fosse bem descritivo ao mesmo tempo que fosse pequeno, como por exemplo: salarioColaborador
    <br><br><strong>OBS</strong><br><br>
    Tentei ir além e inclui uma formatação de moeda corrente para o campo (salarioPretendido). Assim quando o usuário digitar o valor ele fica pré formatado com R$, facilitando a vizualização (usei GPT como auxílio para essa funcionalidade).<br>
    Usei o framework w3.css para deixar os elementos visuais mais agradáveis.
    "

?>