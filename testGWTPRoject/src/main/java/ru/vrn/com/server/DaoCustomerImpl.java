package ru.vrn.com.server;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import javax.sql.DataSource;

//import sun.jdbc.odbc.ee.DataSource;

public class DaoCustomerImpl implements DaoCustomer{
	
	
	private JdbcTemplate jdbcTemplate;

	   public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
	        this.jdbcTemplate = jdbcTemplate;
	}
	
	DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		System.out.println("DaoCustomerImpl.setDataSource() !!!" + dataSource);
		this.dataSource = dataSource;
	}


	public DaoCustomerImpl(DataSource dataSource) {
		System.out.println("dataSource  " + dataSource.getClass());
		this.dataSource = dataSource;
	}
	
	public DaoCustomerImpl() {
	}
	
	
	@Override
	public Cards findCardByInt(int id) {
//		dataSource.getConnection();
		
		Cards cards2 = null; 
		Connection conn;
		try {
			System.out.println("before connect");
			conn = dataSource.getConnection();
			System.out.println("after connect  " + conn.getClientInfo());
			
			String cards = "SELECT a.ID, a.NAME_CARD, a.COLOR, a.CARD_SCORE, a.PRIORITY FROM CARDS a where a.ID =13";
			
			Statement stmt = conn.createStatement();
			stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(cards);

			StringBuilder path = new StringBuilder();
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
		
			
			
//			Card card = new Card(name_card, color,
//					Short.valueOf(card_score), Short.valueOf(priority));
//			card.setPath(path.toString());
//			CardDto cardDto = createCardDto(card);
//			list.add(cardDto);
//		}
		
		return cards2;
	}

}
