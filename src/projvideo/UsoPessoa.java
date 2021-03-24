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
public class UsoPessoa extends Pessoa{
    
    /*Abstrata:
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int xp;
    protected void ganhaXp(){}*/
    
    //atributos
    private String login;
    private int totAssis;
    
    //construtor

    //public UsoPessoa(String login, int totAssis) {
    public UsoPessoa(String login, int totAssis, String nome, 
                        String sexo, int xp) {
        //sub
        this.login = login;
        this.totAssis = totAssis;
        //super abstrata
        this.nome = nome;
        this.sexo = sexo;
        this.xp = xp;
        imp("=== CONSTRUTOR 'UsoPessoa'");
        ver();
    }
    
    //teste
    public void testeSub(){
        imp("=== Teste Subclasse ===");
    }
    
    //ver
    public void ver(){
        imp("=== Ver: === \nLogin: " + getLogin() 
                + "\nTotal Assistido: " + getTotAssis()
                + "\nNome: " + getNome()
                + "\nSexo: " + getSexo()
                + "\nXp: " + getXp()
        );
    }
    
    
    //metodos
    public void viuMaisUm(){
        this.setTotAssis(getTotAssis()+1);
        imp("Assistiu vídeo: " + getTotAssis());
    };
    
    //getter setter

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssis() {
        return totAssis;
    }

    public void setTotAssis(int totAssis) {
        this.totAssis = totAssis;
    }
    
    
    
    
    
    
    
    
}
