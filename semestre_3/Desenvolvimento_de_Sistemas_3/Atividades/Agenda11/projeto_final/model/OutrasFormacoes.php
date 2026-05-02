<?php

class OutrasFormacoes {

    //Criação dos campos (privados == não podem ser acessados globalmente)
    private $id;
    private $idusuario;
    private $inicio;
    private $fim;
    private $descricao;

    //Definição dos "métodos" Getters e Setters
    public function setID($id) {
        $this->id = $id;
    }

    public function getID() {
        return $this->id;
    }

    public function setIdUsuario($idusuario) {
        $this->idusuario = $idusuario;
    }

    public function getIdUsuario() {
        return $this->idusuario;
    }

    public function setInicio($inicio) {
        $this->inicio = $inicio;
    }

    public function getInicio() {
        return $this->inicio;
    }

    public function setFim($fim) {
        $this->fim = $fim;
    }

    public function getFim() {
        return $this->fim;
    }

    public function setDescricao($descricao) {
        $this->descricao = $descricao;
    }

    public function getDescricao() {
        return $this->descricao;
    }

    // Criação de função pública 

    public function inserirBD() {

        require_once 'ConexaoBD.php';
        //Estabelecimento de conexão
        $con = new ConexaoBD();
        $conn = $con->conectar();

        //Tratativa de erro de conexão
        if ($conn->connect_error) {
            die("Connection failed: " . $conn->connect_error);
        }

        // CRUD (Create via INSERT de campos da table)
        $sql = "INSERT INTO outrasformacoes (idusuario, inicio, fim, descricao)
                VALUES ('".$this->idusuario."','".$this->inicio."','".$this->fim."','".$this->descricao."')";

        if ($conn->query($sql) === true) {
            $this->id = mysqli_insert_id($conn);
            $conn->close();
            return true;
        } else {
            $conn->close();
            return false;
        }
    }

    // Abaixo são as funções criadas a partir dos comandos SQL já aprendidos no componente TI
    //CRUD (Delete excluir dados da tabela de acordo com a seleção "id")
    public function excluirBD($id) {

        require_once 'ConexaoBD.php';
        $con = new ConexaoBD();
        $conn = $con->conectar();

        if ($conn->connect_error) {
            die("Connection failed: " . $conn->connect_error);
        }

        $sql = "DELETE FROM outrasformacoes WHERE idoutrasformacoes = '".$id."'";

        if ($conn->query($sql) === true) {
            $conn->close();
            return true;
        } else {
            $conn->close();
            return false;
        }
    }

    //CRUD (Read seleciona da table a partir do "id" do usuário)

    public function listaFormacoes($idusuario) {

        require_once 'ConexaoBD.php';
        $con = new ConexaoBD();
        $conn = $con->conectar();

        if ($conn->connect_error) {
            die("Connection failed: " . $conn->connect_error);
        }

        $sql = "SELECT * FROM outrasformacoes WHERE idusuario = '".$idusuario."'";

        $re = $conn->query($sql);
        $conn->close();

        return $re;
    }
}