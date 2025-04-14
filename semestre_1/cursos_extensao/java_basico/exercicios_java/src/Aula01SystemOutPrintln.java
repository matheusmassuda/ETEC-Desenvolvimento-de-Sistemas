/*
 Java: Escreva uma vez, rode em qualquer lugar

 SO - é um sistema que gerenciar os periféricos (HD, processaodr, memória), mas ao mesmo tempo também gerencia outras aplicações como word, browsers, apps.

 No lugar de desenvolver 3 aplicações diferentes, para rodar em diferentes sistemas operacionais (windows, linux e mac), por que não desenvolver apenas uma aplicação que com um "tradutor" rode em qualquer SO?

Com java apenas uma aplicação desenvolvida para JVM (Java Virtual Machine) é desenvolvida, e esta traduzirá para os diferentes SOs. A JVM precisa ser instalada (e são específicas para cada sistema operacional).

                COMPILAÇÃO Bytecode
Arquivo.java >     (arquivo.class)      > Roda na JVM

JDK (Java Development Kit) possui uma JVM e uma compilador, ferramentas de debug e pacotes.

JRE (Java Runtime Enveriment) para rodar java no computador

JAVA_HOME: C:\Program Files\Java\jdk-23

COMPILAÇÃO MANUAL: O processo de compilação consiste em transformar um a rquivo.java (src entendível pelo programador)> arquivo.class (bytecode) entendível pela máquina. cmd > javac NomeArquivo.java ele irá gerar um .class

Nome do arquivo: todo começo de palavra é em maiúsculo para javeiros, ex: MeuProgramaEmJava.java

O NOME DA CLASSE PÚBLICA em java precisa ser exatamente igual ao NOME DO ARQUIVO.JAVA.

Coemntários no java (devem ser evitados ao máximo):
1) Em linha //
2) Multiplas linhas /"asterisco" "asterisco"/
3) Javadoc (descreve classe método) /asterisco asterisco asterisco/

 */

public class aula01SystemOutPrintln {
    public static void main(String[] args) {
        System.out.println("Imprime o comando na tela e pula linha.");
    }
}

//"Ctrl + Alt + N" == executa terminal
