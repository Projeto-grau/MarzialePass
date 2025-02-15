public class Academia {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String tiposDeArtesMarciais;
    private String horarios;

    public Academia(int id, String nome, String endereco, String telefone, String[] tiposDeArtesMarciais, String horarios) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tiposDeArtesMarciais = tiposDeArtesMarciais;
        this.horarios = horarios;
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
    
        public String getEndereco() {
            return endereco;
        }
    
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
    
        public String getTelefone() {
            return telefone;
        }
    
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
    
        public String[] getTiposDeArtesMarciais() {
            return tiposDeArtesMarciais;
        }
    
        public void setTiposDeArtesMarciais(String tiposDeArtesMarciais) {
            this.tiposDeArtesMarciais = tiposDeArtesMarciais;
        }
    
        public String getHorarios() {
            return horarios;
        }
    
        public void setHorarios(String horarios) {
            this.horarios = horarios;
        }
}        