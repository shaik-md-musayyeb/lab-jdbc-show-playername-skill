package controller;
import java.io.IOException;
import java.sql.SQLException;

import utility.ConnectionManager;
public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		ConnectionManager.getConnection();
	}

}
