package enums;

public enum CidadesES {
    AFONSO_CLAUDIO("Afonso Cláudio"), AGUA_DOCE_DO_NORTE("Água Doce do Norte"), AGUIA_BRANCA("Águia Branca"), 
    ALEGRE("Alegre"), ALFREDO_CHAVES("Alfredo Chaves"),
    ALTO_RIO_NOVO("Alto Rio Novo"), ANCHIETA("Anchieta"), APIACA("Apiacá"), ARACRUZ("Aracruz"), 
    ATILIO_VIVACQUA("Atílio Vivácqua"), BAIXO_GUANDU("Baixo Guandú"),
    BARRA_DE_SAO_FRANCISCO("Barra de São Francisco"), BOA_ESPERANCA("Boa Esperança"), 
    BOM_JESUS_DO_NORTE("Bom Jesus do Norte"), BREJETUBA("Brejetuba"),
    CACHOEIRO_DE_ITAPEMIRIM("Cachoeiro de Itapemirim"), CARIACICA("Cariacica"), CASTELO("Castelo"), 
    COLATINA("Colatina"), CONCEICAO_DA_BARRA("Conceição da Barra"),
    CONCEICAO_DO_CASTELO("Conceição do Castelo"), DIVINO_DE_SAO_LOURENCO("Divino de São Lourenço"), 
    DOMINGOS_MARTINS("Domingos Martins"), DORES_DO_RIO_PRETO("Dores do Rio Preto"),
    ECOPORANGA("Ecoporanga"), FUNDAO("Fundão"), GOVERNADOR_LINDENBERG("Governador Lindenberg"), 
    GUACUI("Guaçuí"), GUARAPARI("Guarapari"), IBATIBA("Ibatiba"), IBIRACU("Ibiraçu"),
    IBITIRAMA("Ibitirama"), ICONHA("Iconha"), IRUPI("Irupi"), ITAGUACU("Itaguaçú"), 
    ITAPEMIRIM("Itapemirim"), ITARANA("Itarana"), IUNA("Iúna"), JAGUARE("Jaguaré"),
    JERONIMO_MONTEIRO("Jerônimo Monteiro"), JOAO_NEIVA("João Neiva"), LARANJA_DA_TERRA("Laranja da Terra"), 
    LINHARES("Linhares"), MANTENOPOLIS("Mantenópolis"),
    MARATAIZES("Marataízes"), MARECHAL_FLORIANO("Marechal Floriano"), MARILANDIA("Marilândia"), 
    MIMOSO_DO_SUL("Mimoso do Sul"), MONTANHA("Montanha"),
    MUCURICI("Mucurici"), MUNIZ_FREIRE("Muniz Freire"), MUQUI("Muqui"), NOVA_VENECIA("Nova Venécia"), 
    PANCAS("Pancas"), PEDRO_CANARIO("Pedro Canário"),
    PIUMA("Piúma"), PONTO_BELO("Ponto Belo"), PRESIDENTE_KENNEDY("Presidente Kennedy"), 
    RIO_BANANAL("Rio Bananal"), RIO_NOVO_DO_SUL("Rio Novo do Sul"),
    SANTA_LEOPOLDINA("Santa Leopoldina"), SANTA_MARIA_DE_JETIBA("Santa Maria de Jetibá"), 
    SANTA_TERESA("Santa Teresa"), SAO_DOMINGOS_DO_NORTE("São Domingos do Norte"),
    SAO_GABRIEL_DA_PALHA("São Gabriel da Palha"), SAO_JOSE_DO_CALCADO("São José do Calçado"), 
    SAO_MATEUS("São Mateus"), SAO_ROQUE_DO_CANAA("São Roque do Canaã"),
    SERRA("Serra"), SOORETAMA("Sooretama"), VARGEM_ALTA("Vargem Alta"), 
    VENDA_NOVA_DO_IMIGRANTE("Venda Nova do Imigrante"), VIANA("Viana"), VILA_PAVAO("Vila Pavão"),
    VILA_VALERIO("Vila Valério"), VILA_VELHA("Vila Velha"), VITORIA("Vitória");
    
    private final String nome;
    
    CidadesES(String nomeCidade){
        nome = nomeCidade;
    }  
    
    public String getNome(){
        return nome;
    }
}
