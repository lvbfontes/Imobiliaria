package br.com.lvbfontes.imobiliaria.Modelo;

import java.io.Serializable;

/**
 * Created by Lucas on 16/05/2017.
 */

public class Imovel implements Serializable {
    private Long id;
    private String tipo;
    private String contrato;
    private String endereco;
    private String bairro;
    private String cidade;
    private String cep;
    private int comodos;
    private float preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getComodos() {
        return comodos;
    }

    public void setComodos(int comodos) {
        this.comodos = comodos;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", contrato='" + contrato + '\'' +
                ", comodos=" + comodos +
                '}';
    }
}
