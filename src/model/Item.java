package model;


public class Item {
    private int id;
    private Produto produto;
    private float vlTotal;
    private int quantidade;
    
    public Item(){
        
    }
    
    public Item(Produto produto){
        this.produto = produto;
    }
    
    public Item(Produto produto, float vlTotal, int quantidade) {
        this.produto = produto;
        this.vlTotal = vlTotal;
        this.quantidade = quantidade;
    }

    public Item(int id, Produto produto, float vlTotal, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.vlTotal = vlTotal;
        this.quantidade = quantidade;
    }
    
    public float calculaValorTotal(Produto produto){
        return produto.getVlUnitario()*this.quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(float vlTotal) {
        this.vlTotal = vlTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
}
