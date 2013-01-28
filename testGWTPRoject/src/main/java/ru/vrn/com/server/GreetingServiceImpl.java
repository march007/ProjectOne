package ru.vrn.com.server;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import ru.vrn.com.client.GreetingService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;


@Service("productService")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {
	
	@Autowired
	public JdbcTemplate jdbcTemplate;

	public String greetServer(String input){
		
		JdbcTemplate jdbcTemplate_for = jdbcTemplate;
		
		Connection conn;
		Cards cards2 = null; 
		try {
			
			System.out.println("before connection");
			conn =  jdbcTemplate_for.getDataSource().getConnection();
			System.out.println("after connection");
			String cards = "SELECT a.ID, a.NAME_CARD, a.COLOR, a.CARD_SCORE, a.PRIORITY FROM CARDS a where a.ID =13";
			
			Statement stmt = conn.createStatement();
			stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(cards);

			StringBuilder path = new StringBuilder();
			System.out.println("afterafter connection");
			while (result.next()) {
				String name_card = result.getString("name_card");
				String color = result.getString("color");
				String card_score = result.getString("card_score");
				String priority = result.getString("priority");

				path.append(name_card);
				path.append(color);

				cards2 = new Cards(name_card, color,Short.valueOf(card_score), Short.valueOf(priority));
				System.out.println(" cards :  " + cards2.getCard_score() + cards2.getName_card() + "   " + cards2.getColor());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		Cards cards = cards2;
		return "Hello, !<br><br>I am running    " + input  + "  color " + cards.getColor() + " name " + cards.getName_card(); 
	}

	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}

	@Override
	public void setStr(String str) {
	}
	
}
