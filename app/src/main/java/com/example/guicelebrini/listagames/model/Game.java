package com.example.guicelebrini.listagames.model;

public class Game {

    private String titulo;
    private String dataLancamento;
    private String imagem;
    private String nota;

    public Game(String titulo, String dataLancamento, String nota, String imagem){
        this.setTitulo(titulo);
        this.setDataLancamento(dataLancamento);
        this.setNota(nota);
        this.setImagem(imagem);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public String getImagem() {
        return imagem;
    }

    public String getNota() {
        return nota;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
}
