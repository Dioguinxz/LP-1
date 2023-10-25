package teste;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PessoaDB {

	public void inserir(Pessoa pessoa) throws DbExcetion {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = ConexaoDB.getConexao();
			String sql = "INSERT INTO PESSOA (id, nome, sobrenome, idade) " + "VALUES (?, ?, ?, ?)";
			stmt = conn.prepareStatement(sql);

			stmt.setInt(1, pessoa.getId());
			stmt.setString(2, pessoa.getNome());
			stmt.setString(3, pessoa.getSobrenome());
			stmt.setInt(4, pessoa.getIdade());

			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

			throw new DbExcetion("Falha ao inserir registro no banco de dados");
		}
	}
}
