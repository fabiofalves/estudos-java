package application;

import db.DB;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection connection = null;
		PreparedStatement statement = null;

		try{
			//variavel connection se conecta com o banco de dados
			connection = DB.getConnection();
			//statement recebe um comando sql para inserção de dados
			statement = connection.prepareStatement(
					"INSERT INTO seller"
						+ "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
						+ "VALUES "
						+ "(?, ?, ?, ?, ?)",
					PreparedStatement.RETURN_GENERATED_KEYS);

			statement.setString(1, "Carl Purple");
			statement.setString(2, "carl@gmail.com");
			statement.setDate(3,new Date(sdf.parse("22/04/1985").getTime()));
			statement.setDouble(4, 3000.00);
			statement.setInt(5 , 4);

			int rowsAffected = statement.executeUpdate();

			if(rowsAffected > 0){
				ResultSet resultSet = statement.getGeneratedKeys();
				while(resultSet.next()){
					int id = resultSet.getInt(1);
					System.out.println("Done! id = " + id);
				}
			}
			else {
				System.out.println("No rows affected!");
			}
		}
		catch (SQLException | ParseException e){
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(statement);
			DB.closeConnection();
		}

	}

}
