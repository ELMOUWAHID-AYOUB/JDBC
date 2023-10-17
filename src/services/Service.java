/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author user
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import beans.DevData;
import connexion.Connexion;

public class Service{
    public boolean create() {
		String sql = "CREATE TABLE DevData (\n" +"Developpeurs VARCHAR (32),\n" +"Jour CHAR (11),\n" +"NbScripts INTEGER)";
		try {
			Statement statement = Connexion.getInstance().getConnection().createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
    public boolean insert(DevData o ) {
               String sql = "insert into DevData values ('" + o.getDeveloppeurs() + "','" + o.getJour() + "' ," + o.getNbScripts()+ " )";
	  /*     String sql1 = "INSERT INTO DevData VALUES (' ALAMI', 'Lundi', 1)";
               String sql2 = "INSERT INTO DevData VALUES ('WAFI', 'Lundi', 2)";
               String sql3 = "INSERT INTO DevData VALUES (' SLAMI', 'Mardi', 9)";*/

		try {
			Statement statement = Connexion.getInstance().getConnection().createStatement();
                        statement.executeUpdate(sql);
			/*statement.executeUpdate(sql1);
                        statement.executeUpdate(sql2);
                        statement.executeUpdate(sql3);*/
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
    public List<DevData> findMax() {
		List<DevData> data = new ArrayList<DevData>();
		 String sql = "SELECT Developpeurs, jour, max(Nb) from devdata group by jour";
		try {
			Statement statement = Connexion.getInstance().getConnection().createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
                            DevData o = new DevData();
				data.add(new DevData( rs.getString("Developpeurs"), rs.getString("Jour"),rs.getInt("Nb")));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return data;
	}

    

	
}

