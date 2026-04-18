<?php
require_once 'Usuario.php';

class Cliente extends Usuario {
    private $tipoResidencia;
    private $numeroMoradores;

    // Criação de métodos SETTERS (que setam atributos privados) que serão incluídos em teste.php e serão acessados apenas por determinadas partes no sistema
    public function setTipoResidencia($tipo) {
        $this->tipoResidencia = $tipo;
    }

    public function setNumeroMoradores($num) {
        $this->numeroMoradores = $num;
    }

    // Criação de métodos GETTERS (que setam atributos privados) que serão incluídos em teste.php e serão acessados apenas por determinadas partes no sistema
    public function getTipoResidencia() {
        return $this->tipoResidencia;
    }

    public function getNumeroMoradores() {
        return $this->numeroMoradores;
    }

    // Método suhgerido por IA para exibição de gráficos Dashboard
    public function visualizarDashboard() {
        return "Exibindo dashboard de consumo de água...";
    }
}
?>