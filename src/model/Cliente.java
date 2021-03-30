package model;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String estCivil;
    private String telefone;
    private String email;
    private Endereco endereco;
    
    public Cliente(){
        this.endereco = new Endereco();
    }
    
    public Cliente(String nome, String cpf, String estCivil, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.estCivil = estCivil;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    public Cliente(int id, String nome, String cpf, String estCivil, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.estCivil = estCivil;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        return "DADOS DO CLIENTE - ID: " + this.getId() + "\n"
                + "CPF: " + this.getCpf() + "\n"
                + "Nome: " + this.getNome() + "\n"
                + "Telefone: " + this.getTelefone() + "\n"
                + "E-mail: " + this.getEmail() + "\n"
                + "Estado Civil: " + this.getEstCivil() + "\n"
                + "Endereço:\n  " + this.getEndereco().getLogradouro() + " - " + this.getEndereco().getComplemento()
                + "\n  " + this.getEndereco().getCidade() + " - " + this.getEndereco().getEstado() + "\n  "
                + "CEP: " + this.getEndereco().getCep() + "\n\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String eCivil) {
        this.estCivil = eCivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
