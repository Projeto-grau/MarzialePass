public class usuario{
    private int id;
    private String email;
    private String senha;
    private String nome;
    private boolean planoAtivo;


    public Usuario(int id, String senha, String email, boolean planoAtivo, String nome) {
        this.id = id;
        this.senha = senha;
        this.email = email;
        this.planoAtivo = planoAtivo;
        this.nome = nome;
}
public String getId(){
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getSenha(){
    return senha;
}

public void setSenha(String senha) {
    this.senha = senha;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public boolean getPlanoAtivo() {
    return planoAtivo;
}

public void setPlanoAtivo(boolean planoAtivo) {
    this.planoAtivo = planoAtivo;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public static void main(String[] args) {
    Usuario usuario = new Usuario(1, "123456", "email@example.com", true, "João Silva");
    System.out.println(usuario);
}
}
