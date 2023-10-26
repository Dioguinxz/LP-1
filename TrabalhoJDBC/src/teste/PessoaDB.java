package teste;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDB {

	public void inserir(Pessoa pessoa) throws DbExcetion {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = ConexaoDB.getConexao();
			String sql = "INSERT INTO PESSOA (id, nome, sobrenome, telefone, email, idade) " + "VALUES (?, ?, ?, ?, ?, ?)";
			stmt = conn.prepareStatement(sql);

			stmt.setInt(1, pessoa.getId());
			stmt.setString(2, pessoa.getNome().toUpperCase());
			stmt.setString(3, pessoa.getSobrenome().toUpperCase());
			stmt.setString(4, pessoa.getTelefone());
			stmt.setString(5, pessoa.getEmail().toUpperCase());
			stmt.setInt(6, pessoa.getIdade());
			

			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

			throw new DbExcetion("Falha ao inserir registro no banco de dados");
		}
	}
	
	public static List<Pessoa> listarNome() throws DbExcetion {
        List<Pessoa> resultados = new ArrayList<>();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = ConexaoDB.getConexao();

            stmt = conn.createStatement();
            String sql = "SELECT id, nome, sobrenome, idade, email, telefone FROM Pessoa ORDER BY nome";
            rs = stmt.executeQuery(sql);

            while(rs.next()) {
                int id  = rs.getInt("id");
                int age = rs.getInt("idade");
                String first = rs.getString("nome");
                String last = rs.getString("sobrenome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");

                resultados.add(new Pessoa(id, first, last, age, email, telefone));
            }
        } catch(Exception e) {
            e.printStackTrace();
            throw  new DbExcetion("Falha ao listar Registros");
        } finally {
            try {
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(rs != null)  rs.close();
            } catch(SQLException se) {
                se.printStackTrace();
            }
        }

        return resultados;
    }
	
	public static List<Pessoa> listarSobrenome() throws DbExcetion {
        List<Pessoa> resultados = new ArrayList<>();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = ConexaoDB.getConexao();

            stmt = conn.createStatement();
            String sql = "SELECT id, nome, sobrenome, idade, email, telefone FROM Pessoa ORDER BY sobrenome";
            rs = stmt.executeQuery(sql);

            while(rs.next()) {
                int id  = rs.getInt("id");
                int age = rs.getInt("idade");
                String first = rs.getString("nome");
                String last = rs.getString("sobrenome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");

                resultados.add(new Pessoa(id, first, last, age, email, telefone));
            }
        } catch(Exception e) {
            e.printStackTrace();
            throw  new DbExcetion("Falha ao listar Registros");
        } finally {
            try {
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(rs != null)  rs.close();
            } catch(SQLException se) {
                se.printStackTrace();
            }
        }

        return resultados;
    }
	
	public static List<Pessoa> listarEmail() throws DbExcetion {
        List<Pessoa> resultados = new ArrayList<>();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = ConexaoDB.getConexao();

            stmt = conn.createStatement();
            String sql = "SELECT id, nome, sobrenome, idade, email, telefone FROM Pessoa ORDER BY email";
            rs = stmt.executeQuery(sql);

            while(rs.next()) {
                int id  = rs.getInt("id");
                int age = rs.getInt("idade");
                String first = rs.getString("nome");
                String last = rs.getString("sobrenome");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");

                resultados.add(new Pessoa(id, first, last, age, email, telefone));
            }
        } catch(Exception e) {
            e.printStackTrace();
            throw  new DbExcetion("Falha ao listar Registros");
        } finally {
            try {
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(rs != null)  rs.close();
            } catch(SQLException se) {
                se.printStackTrace();
            }
        }

        return resultados;
    }
	
	public void remover(Pessoa pessoa) throws DbExcetion {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = ConexaoDB.getConexao();
			String sql = "DELETE FROM PESSOA WHERE ID = ?";
			stmt = conn.prepareStatement(sql);

			stmt.setInt(1, pessoa.getId());
			stmt.setString(2, pessoa.getNome().toUpperCase());
			stmt.setString(3, pessoa.getSobrenome().toUpperCase());
			stmt.setString(4, pessoa.getTelefone());
			stmt.setString(5, pessoa.getEmail().toUpperCase());
			stmt.setInt(6, pessoa.getIdade());
			

			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

			throw new DbExcetion("Falha ao inserir registro no banco de dados");
		}
	}


}
