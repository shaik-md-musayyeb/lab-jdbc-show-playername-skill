package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import utility.ConnectionManager;

//select player.id,player.name,player.country,skill.name from player inner join skill on player.skill_id = skill.id;
public class PlayerDAO{
	static List<Player> playerList = new ArrayList<Player>();
	final String query = "select player.id,player.name,player.country,skill.name from player inner join skill on player.skill_id = skill.id";
	public List< Player > getAllPlayers() throws ClassNotFoundException, SQLException, IOException{
		
		Player player ;
		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			player = new Player();
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String country = rs.getString(3);
			String skill = rs.getString(4);
			player.setPlayerId(id);
			player.setName(name);
			player.setCountry(country);
			player.setSkill(skill);
			playerList.add(player);
			
			
		}
		return playerList;
		
	}
}