<?php

require_once 'Model/OutrasFormacoes.php';

$obj = new OutrasFormacoes();

// Teste de inserção de dados na table OutrasFormacoes para conferir depois no phpmyadmin
$obj->setIdUsuario(1); 
$obj->setInicio("2026-04-05");
$obj->setFim("2026-05-05");
$obj->setDescricao("Curso Completo de TI3 da ETEC");

//Mensagem de confirmação ou erro que deverá aparecer no navegador via XAMPP (Apache + MySQL)
if ($obj->inserirBD()) {
    echo "Ok! Registro inserido com sucesso.";
} else {
    echo "Erro ao inserir.";
}