public class checkin{
    private int id;
    private String usuario;
    private String data;
    private String academia;
    private String hara;

public CheckIn(int id, String usuario, String data, String academia, String hara) {
        this.id = id;
        this.usuario = usuario;
        this.data = data;
        this.academia = academia;
        this.hara = hara;

public String getId(){
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getUsuario(){
    return usuario;
}
public String setUsuario(String usuario){
    this.usuario = usuario;
}
public String getData(){
    return data;
}
public String setData(String data){
    this.data = data;
}
public String getAcademia(){
    return academia;
}
public String setAcademia(String academia){
    this.academia = academia;
}
public String getHora(){
    return hora;
}
public String setHora(String hora){
    this.hara = hara;
}