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
public abstract class Pessoa {
    
    //atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int xp;
    
    //metodos
    protected void ganhaXp(){
        this.setXp(getXp()+100);
        imp("Ganhou XP: " + getXp());
    }
    
    //ver
    public void imp(String texto){
        System.out.println(texto);
    }
    
    public void teste(){
        imp("=== Teste Classe Abstrata ===");
    }
        
    //getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
    
    
    
}
