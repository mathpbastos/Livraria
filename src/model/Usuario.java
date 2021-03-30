package model;

import dao.UsuarioDAO;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Usuario {
    private String nome;
    private String id;
    private String tipo;
    private String senha;
    
    public Usuario(){
       
    }
    
    public Usuario(String id, String senha){
        this.setId(id);
        this.setSenha(senha);
    }

    public Usuario(String nome, String id, String tipo, String senha) {
        this.setNome(nome);
        this.setTipo(tipo);
        this.setId(id);
        this.setSenha(senha);
    }
    
    private boolean validaSenha(String senha){
       return (senha.length() > 4);
    }
    
    private boolean validaId(String id){
        return (id.length() > 5);
    }
    
    public boolean login(Usuario u){
        try {
            UsuarioDAO dao = new UsuarioDAO();
            return dao.procurarUsuario(u);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Erro no banco de dados!\n" + ex.toString(), "ERRO!", ERROR_MESSAGE);
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(validaId(id)){
            this.id = id;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {     
        
        if(validaSenha(senha)){
            this.senha = senha;
        }
        
    }  
}
