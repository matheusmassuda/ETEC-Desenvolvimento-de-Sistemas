package aula06;
public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Métodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    private boolean isLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private boolean isTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("---------------MENU----------------");
        System.out.println("Está ligado? "+this.isLigado());
        System.out.println("Está tocando? "+this.isTocando());
        System.out.println("Volume: "+this.getVolume());
        for (int i =0; i <= this.getVolume(); i += 10) {
            System.out.print("|");
        }
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }
    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() + 1);
        }
    }
    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() - 1);
        }
    }
    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())){
            this.isTocando();
        }
    }
    @Override
    public void pause() {
        if (this.isLigado() && (this.isTocando())) {
            this.isTocando();
        }
    }
}
