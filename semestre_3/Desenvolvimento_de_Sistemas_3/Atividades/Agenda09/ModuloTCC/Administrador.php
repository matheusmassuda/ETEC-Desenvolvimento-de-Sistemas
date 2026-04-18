<?php
require_once 'Usuario.php';

class Administrador extends Usuario {
    private $nivelAcesso;

    // Criação de métodos SETTERS (que setam atributos privados) que serão incluídos em teste.php e serão acessados apenas por determinadas partes no sistema
    public function setNivelAcesso($nivel) {
        $this->nivelAcesso = $nivel;
    }

    // Criação de métodos GETTERS (que setam atributos privados) que serão incluídos em teste.php e serão acessados apenas por determinadas partes no sistema
    public function getNivelAcesso() {
        return $this->nivelAcesso;
    }

    // Método recomendado por IA para aviso ao usuário
    public function gerenciarUsuarios() {
        return "Gerenciando usuários do sistema...";
    }
}
?>