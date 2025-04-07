package DSOLID.Exemplo1;

import DSOLID.Exemplo1.MySQLConnection;

public class UsuarioDAO {
    private MySQLConnection mySQLConnection;

    public UsuarioDAO() {
        this.mySQLConnection = new MySQLConnection(); // Dependência direta
    }

    public void salvarUsuario(String nome) {
        mySQLConnection.connect();
        System.out.println("Salvando usuário: " + nome);
    }
}
