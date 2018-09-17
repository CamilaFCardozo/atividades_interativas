/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import static com.oracle.jrockit.jfr.ContentType.Bytes;

/**
 *
 * @author Cah
 */
public class BeansAlunos {

    /**
     * @return the pontos
     */
    public int getPontos() {
        return pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    private int cod_acesso;
    public byte[] imagem;
    private String nome;
    private String serie;
    private String ano_cadastro;
    private String pesquisa;
    public int pontos = 0;

    public int getCod_acesso() {
        return cod_acesso;
    }

    public void setCod_acesso(int cod_acesso) {
        this.cod_acesso = cod_acesso;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getAno_cadastro() {
        return ano_cadastro;
    }

    public void setAno_cadastro(String ano_cadastro) {
        this.ano_cadastro = ano_cadastro;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

}
