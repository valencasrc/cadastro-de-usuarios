import DAO.UsuarioDAO;
import entity.Usuario;

public class App {

    public static void main(String[] args) {

        Usuario u = new Usuario();
        u.setNome("Lucas");
        u.setLogin("valencinha");
        u.setSenha("4321");

        Usuario u1 = new Usuario();
        u.setNome("Louyse");
        u.setLogin("louy123");
        u.setSenha("5536");

        Usuario u2 = new Usuario();
        u.setNome("Marley");
        u.setLogin("marlinho2000");
        u.setSenha("1234");

        new UsuarioDAO().cadastrarUsuario(u);

    }
}
