package projeto;

public class Ficha {
    protected int codigoPac;
    protected int altura;
    protected int peso;
    protected String descricao;
    protected String tipoSanguineo;
    protected String alergia;
    protected String medicamento;
    
     public void setCodigoPac(int cod){
        this.codigoPac = cod;
    }
    public int getCodigoPac(){
        return codigoPac;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getAltura(){
        return altura;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public int getPeso(){
        return peso;
    }
    public void setDescricao(String desc){
        this.descricao = desc;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setTipoSanguineo(String tipo){
        this.tipoSanguineo = tipo;
    }
    public String getTipoSanguineo(){
        return tipoSanguineo;
    }
     public void setAlergia(String al){
        this.alergia = al;
    }
    public String getAlergia(){
        return alergia;
    }
     public void setMedicamento(String med){
        this.medicamento = med;
    }
    public String getMedicamento(){
        return medicamento;
    }
    
    //construtores
    public Ficha(){
        System.out.println("Objeto ficha criado");
    }
    public Ficha(int cod,int alt,int pes,String desc,String tipo,String alerg,String med){
        codigoPac = cod;
        altura = alt;
        peso = pes;
        descricao = desc;
        tipoSanguineo = tipo;
        alergia = alerg;
        medicamento = med;
        
    }
    
}

