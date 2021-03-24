/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projvideo;

/**
 *
 * @author Rafael
 */
public class Video implements AcoesVideo {
    //logo após implementar a interface, deve declarar os métodos dela aqui (@Override)
    
    //atributos
    private String titulo;
    private int avaliacao;
    private int viewes;
    private int curtidas;
    private boolean reproduzir;
    
    
    //construtor

    public Video(String oTitulo, int oAvaliacao, int oViewes, int oCurtidas, boolean oReproduzir){
        setTitulo(oTitulo);
        setAvaliacao(oAvaliacao);
        setViewes(oViewes);
        setCurtidas(oCurtidas);
        setReproduzir(oReproduzir);
    }
    
    //mensagem
    public void imp(String texto){
        System.out.println(texto);
    }
    
    public void teste(){
        imp("=== TESTE CLASSE VIDEO ===");
        play();
        pause();
        like();
    }
    


    //implementação dos métodos da inteface controladora AcoesVideo
    @Override
    public void play() {
        this.setReproduzir(true);
        imp("Vídeo play: STATUS " + this.getReproduzir());
    }

    @Override
    public void pause() {
        this.setReproduzir(false);
        imp("Vídeo parado: STATUS " + this.getReproduzir());
    }

    @Override
    public void like() {
        this.setCurtidas(getCurtidas()+1);
        imp("Ganhou um like: " + this.getCurtidas());
    }

    
    //getters e settters
    public String getTitulo() {
        return titulo;
    }

    public final void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public final void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViewes() {
        return viewes;
    }

    public void setViewes(int viewes) {
        this.viewes = viewes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzir() {
        return reproduzir;
    }

    public void setReproduzir(boolean reproduzir) {
        this.reproduzir = reproduzir;
    }
    
    
    
    
    
    
}
