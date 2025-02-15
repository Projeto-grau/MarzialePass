public class ArteMarcial {
    private int id;
    private String arteMarcial;
    private String descricao;

    public ArteMarcial(int id, String arteMarcial, String descricao) {
        this.id = id;
        this.arteMarcial = arteMarcial;
        this.descricao = descricao;
    }
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getArteMarcial() {
            return arteMarcial;
        }
    
        public void setArteMarcial(String arteMarcial) {
            this.arteMarcial = arteMarcial;
        }
    
        public String getDescricao() {
            return descricao;
        }
    
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
}