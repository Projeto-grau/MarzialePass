public class usuario{
    private int id;
    private String especialidade;
    private String academiaAssociada;
    private String nome;

public Usuario(int id, String especialidade, String academiaAssociada, String nome) {
        this.id = id;
        this.especialidade = especialidade;
        this.academiaAssociada = academiaAssociada;
        this.nome = nome;
}
public String getId(){
     return id;
 }
        
public void setId(int id) {
    this.id = id;
}
        
public String getEspecialidade(){
    return especialidade;
}
        
public String setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
}
        
public String getAcademiaAssociada() {
    return academiaAssociada;
}
        
public String setAcademiaAssociada(String academiaAssociada) {
    this.academiaAssociada = academiaAssociada;
 }
        
public String getNome() {
    return nome;
}
        
public String setNome(String nome) {
    this.nome = nome;
}
}