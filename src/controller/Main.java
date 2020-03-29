package controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.PlayerDAO;
import model.Player;
import utility.ConnectionManager;
public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		PlayerDAO pDAO = new PlayerDAO();
		List<Player> playerList = new ArrayList<Player>();
		playerList=pDAO.getAllPlayers();
		System.out.println("id\tname\tcountry\tskill");
		for(Player p : playerList) {
			System.out.println(p.getPlayerId()+"\t"+p.getName()+"\t"+p.getCountry()+"\t"+p.getSkill());
		}
	}

}
