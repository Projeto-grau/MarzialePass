public class Plano {
    private int id;
    private double valor;
    private int acessos;
    private String nomeDoPlano;
    private String academiaParticipantes;

    public Plano(int id, double valor, int acessos, String nomeDoPlano, String academiaParticipantes) {
        this.id = id;
        this.valor = valor;
        this.acessos = acessos;
        this.nomeDoPlano = nomeDoPlano;
        this.academiaParticipantes = academiaParticipantes;

        public int getId() {
            return id;
        }
        public void setId(int id){
            this.id = id;
        }

        public double getValor() {
            return valor;
        }
        public double setValor(double valor){
            this.valor = valor;
        }
        public int getAcessos() {
            return acessos;
        }
        public int setAcessos(int acessos){
            this.acessos = acessos;
        }
        public String getNomeDoPlano() {
            return nomeDoPlano;
        }
        public String setNomePlano(String nomeDoPlano){
            this.nomeDoPlano = nomeDoPlano;
        }
        public String getAcademiaParticipantes() {
            return academiaParticipantes;
        }
        public String setAcademiaParticipantes(String academiaParticipantes){
            this.academiaParticipantes = academiaParticipantes;
        }
    