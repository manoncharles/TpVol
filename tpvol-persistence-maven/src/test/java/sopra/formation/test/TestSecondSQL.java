package sopra.formation.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sopra.formation.Application;
import sopra.formation.model.Matiere;

public class TestSecondSQL {
	public static void main(String[] args) {
		prepapredStatementMatiere(1);
	}

	private static void statementMatiere(Integer dureeRecherche) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = Application.getInstance().getConnection();

			statement = connection.createStatement();

			resultSet = statement.executeQuery("SELECT id, nom, duree FROM matiere WHERE duree = " + dureeRecherche);

			while (resultSet.next()) {
				Long id = resultSet.getLong("id");
				String nom = resultSet.getString("nom");
				Integer duree = resultSet.getInt("duree");

				Matiere matiere = new Matiere(id, nom, duree);

				System.out.println(matiere);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (SQLException | NullPointerException e) {
				e.printStackTrace();
			}
		}
	}

	private static void prepapredStatementMatiere(Integer dureeRecherche) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = Application.getInstance().getConnection();

			preparedStatement = connection.prepareStatement("SELECT id, nom, duree FROM matiere WHERE duree = ?");

			preparedStatement.setInt(1, dureeRecherche);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Long id = resultSet.getLong("id");
				String nom = resultSet.getString("nom");
				Integer duree = resultSet.getInt("duree");

				Matiere matiere = new Matiere(id, nom, duree);

				System.out.println(matiere);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (SQLException | NullPointerException e) {
				e.printStackTrace();
			}
		}
	}

}
