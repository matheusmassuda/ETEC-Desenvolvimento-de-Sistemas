<body>
<?php
include_once 'Cliente.php';
include_once 'Administrador.php';

// TESTE da "geração" daclasse filha 1 - Clientes
$cliente = new Cliente();
$cliente->setNome("Matheus");
$cliente->setEmail("mat.massuda@gmail.com");
$cliente->setTipoResidencia("Casa");
$cliente->setNumeroMoradores(3);

// Exibição no navegador por meio do comando echo das informações (atributos) da classe filha 1
echo "<b>CLASSE FILHA 1 - CLIENTE</b><br>";
echo "<b>Nome:</b> " . $cliente->getNome() . "<br>";
echo "<b>Email:</b> " . $cliente->getEmail() . "<br>";
echo "<b>Tipo:</b> " . $cliente->getTipoResidencia() . "<br>";
echo "<b>Moradores:</b> " . $cliente->getNumeroMoradores() . "<br>";
echo $cliente->visualizarDashboard();
echo "<br><br>";

// TESTE da "geração" daclasse filha 2 - Administradores
$admin = new Administrador();
$admin->setNome("Administrador");
$admin->setEmail("email.administrador@gmail.com");
$admin->setNivelAcesso("Alto");

// Exibição no navegador por meio do comando echo das informações (atributos) da classe filha 2
echo "<b>CLASSE FILHA 2 - ADMINISTRADOR</b><br>";
echo "<b>Nome:</b> " . $admin->getNome() . "<br>";
echo "<b>Email:</b> " . $admin->getEmail() . "<br>";
echo "<b>Nível:</b> " . $admin->getNivelAcesso() . "<br>";
echo $admin->gerenciarUsuarios();
?>
</body>