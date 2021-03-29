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
public class Visualizacao {
    
    private UsoPessoa espectador; //A subclasse
    private Video filme;
    
      
    //toString
    @Override
    public String toString() {
        return "=== Visualizacao{" + "\nespectador=" + espectador + "\nfilme=" + filme + '}';
    }
    
    
    //construtor    

    public Visualizacao(UsoPessoa espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssis(this.espectador.getTotAssis()+1);
        this.filme.setViewes(this.filme.getViewes()+1);
    }
    
    //metodos
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){ //o tipo do parametro precisa ser diferente 
        int tot = 0;
        if (porc <= 30){
            tot = 4;
        }else if (porc <= 50){
            tot = 6;
        }else
            tot = 10;
    }
    
    
    
    
    //getter setter

    public Pessoa getEspectador() {
        return espectador;
    }

    public void setEspectador(UsoPessoa espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    
    
        
}
