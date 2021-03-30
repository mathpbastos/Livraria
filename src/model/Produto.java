package model;

import java.util.Date;

public class Produto {
    public String codigo;
    public String nome;
    public String fornecedor;
    public int estoque;
    public float vlUnitario;
    public Date dataFabricacao;
    public String descricao;

    public Produto() {
    }

    public Produto(String codigo, String nome, String fornecedor, int estoque, float vlUnitario, Date dataFabricacao, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.estoque = estoque;
        this.vlUnitario = vlUnitario;
        this.dataFabricacao = dataFabricacao;
        this.descricao = descricao;
    }
    
    public Produto(String nome, String fornecedor, int estoque, float vlUnitario, Date dataFabricacao, String descricao) {
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.estoque = estoque;
        this.vlUnitario = vlUnitario;
        this.dataFabricacao = dataFabricacao;
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
        return "A implementar...";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getVlUnitario() {
        return vlUnitario;
    }

    public void setVlUnitario(float vlUnitario) {
        this.vlUnitario = vlUnitario;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }    
}
