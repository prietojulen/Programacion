
package UML;


public class Usuario extends Empleados{
    
    private String nickname;
    private String pwd;

    public Usuario() {
    }

    public Usuario(String nickname, String pwd) {
        this.nickname = nickname;
        this.pwd = pwd;
    }

    public Usuario(String nickname, String pwd, String nombreApellido, String dni, Usuario u) {
        super(nombreApellido, dni, u);
        this.nickname = nickname;
        this.pwd = pwd;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    
    
}
