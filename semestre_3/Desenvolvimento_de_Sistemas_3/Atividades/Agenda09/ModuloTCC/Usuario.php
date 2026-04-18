<?php
//Ciração da classe base (Usuário) que servirá como MOLDE para as demais classes
class Usuario {
    //Definição dos atributos da classe (IA recomendou "protected")
    protected $nome;
    protected $email;
    protected $senha;

    // Criação de métodos SETTERS (que setam atributos protegidos) que serão incluídos em teste.php por meio dos includes
    public function setNome($nome) {
        $this->nome = $nome;
    }

    public function setEmail($email) {
        $this->email = $email;
    }

    public function setSenha($senha) {
        $this->senha = $senha;
    }

    // Criação de métodos GETTERS (que "pegam" atributos protegidos) que serão incluídos em teste.php por meio dos includes
    public function getNome() {
        return $this->nome;
    }

    public function getEmail() {
        return $this->email;
    }

    public function getSenha() {
        return $this->senha;
    }

    // Método sugerido por IA para retornar resposta ao usuário que consegue credenciar login
    public function login() {
        return "Usuário logado com sucesso!";
    }
}
?>