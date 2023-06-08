package model;

public class Pizza{
    private String sabor;
    private double valor;
    private char tamanho;

    

    public Pizza(String sabor, double valor, char tamanho) {
        this.sabor = sabor;
        this.valor = valor;
        this.tamanho = tamanho;
    }

    public String pedidoIfood(){
        return String.format("sabor: %s, valor %.2f, tamanho %s", getSabor(), getValor(),getTamanho());
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public String getSabor(){
        return this.sabor;
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public void setTamanho(char tamanho){
        this.tamanho = tamanho;
    }

    public  char getTamanho(){
        return tamanho;
    }
}