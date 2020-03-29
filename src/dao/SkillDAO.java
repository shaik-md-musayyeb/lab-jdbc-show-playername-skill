package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	final String select_skill = "select * from skill where id = ?";
	public Skill getSkillBylD(Long id) throws ClassNotFoundException, SQLException, IOException {
		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(select_skill);
		ResultSet rs = ps.executeQuery();
		Skill  skill = null;
		while (rs.next()) {
			skill = new Skill();
			skill.setSkillId(rs.getLong(1));
			skill.setSkillName(rs.getString(2));
			
		}
		return skill;
	}
}