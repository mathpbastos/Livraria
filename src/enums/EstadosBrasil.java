package enums;

public enum EstadosBrasil {
    AL("Alagoas", "AL"), AP("Amapá", "AP"), AM("Amazonas", "AM"), 
    BA("Bahia", "BA"), CE("Ceará", "CE"), DF("Distrito Federal", "DF"), ES("Espírito Santo", "ES"),
    GO("Goiás", "GO"), MA("Maranhão", "MA"), MT("Mato Grosso", "MT"), MS("Mato Grosso do Sul", "MS"),
    MG("Minas Gerais", "MG"), PA("Pará", "PA"), PB("Paraíba", "PB"), PR("Paraná", "PR"),
    PE("Pernambuco", "PE"), PI("Piauí", "PI"), RJ("Rio de Janeiro", "RJ"),
    RN("Rio Grande do Norte", "RN"), RO("Rondônia", "RO"), RR("Roraima", "RR"), SC("Santa Catarina", "SC"),
    SP("São Paulo", "SP"), SE("Sergipe", "SE"), TO("Tocantins", "TO");
    
    private final String nome;
    private final String sigla;
    
    EstadosBrasil(String nomeEstado, String siglaEstado){
        nome = nomeEstado;
        sigla = siglaEstado;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSigla(){
        return sigla;
    }
    
}
