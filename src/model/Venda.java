package model;

import java.util.ArrayList;
import java.util.Date;

public class Venda {
    
    private int id;
    private Cliente cliente;
    private ArrayList<Item> lista;
    private float vlTotal;
    private Date dataVenda;

    public Venda() {
        lista = new ArrayList<>();
    }

    public Venda(int id, Cliente cliente, ArrayList<Item> lista, float vlTotal, Date dataVenda) {
        this.id = id;
        this.cliente = cliente;
        this.lista = lista;
        this.vlTotal = vlTotal;
        this.dataVenda = dataVenda;
    }
    
    public void addItem(Item item){
        lista.add(item);
    }
    
    public Item buscarItem(int id){
        Item item = null;
        for(Item i : this.lista){
            if(i.getId() == id){
                item = i;
            }
        }
        return item;
    }
    
    public void removerItem(int id){
        Item item = buscarItem(id);
        for(int i=0; i<lista.size(); i++){
            if(id == lista.get(i).getId()){
                lista.remove(i);
            }
        }
    }
    
    
    public ArrayList getItens(){
        return this.lista;
    }
    
    public float calculaValorTotal(){
        float total = 0;
        for(Item i : this.lista){
            total += i.getVlTotal();
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Item> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Item> lista) {
        this.lista = lista;
    }

    public float getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(float vlTotal) {
        this.vlTotal = vlTotal;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
}
