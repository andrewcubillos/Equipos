package Login.Beans;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.ManagedBean;

@Named(value="loginBean")
@ManagedBean

@SessionScoped
public class LoginBean implements Serializable{
    private String nombreUsuario;
    private String password;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public LoginBean(){
        
    }
    public String autenticar(){
        return "usuario/List.xhtml";
    }
} 