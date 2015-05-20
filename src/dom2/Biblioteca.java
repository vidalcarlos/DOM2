/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dom2;

/**
 *
 * @author antonio
 */
public class Biblioteca {

    String livro;
    int codigo;
    String titulo;
    String capa;
    String autor;
    String editora;
    String versao;

    public Biblioteca(String livro, int codigo, String titulo, String capa, String autor, String editora, String versao) {
        this.livro = livro;
        this.codigo = codigo;
        this.titulo = titulo;
        this.capa = capa;
        this.autor = autor;
        this.editora = editora;
        this.versao = versao;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
    
    

}
