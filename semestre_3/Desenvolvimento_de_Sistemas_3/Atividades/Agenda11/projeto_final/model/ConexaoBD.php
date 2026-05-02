<?php

class ConexaoBD {

    private $serverName = "localhost";
    private $userName = "root";
    private $password = "";
    private $dbName = "projeto_final";

    public function conectar() {
        $conn = new mysqli("127.0.0.1", "root", "", "projeto_final", 3307);
        return $conn;
    }
}