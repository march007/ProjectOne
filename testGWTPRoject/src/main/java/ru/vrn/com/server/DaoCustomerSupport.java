package ru.vrn.com.server;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


public class DaoCustomerSupport  implements DaoCustomer{
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	   public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		   System.out.println("*************************************");
	        this.jdbcTemplate = jdbcTemplate;
	        System.out.println("qwerty  = " + this.jdbcTemplate.getDataSource());
	        System.out.println("*************************************");
	        
	       try {
			Connection conn = this.jdbcTemplate.getDataSource().getConnection();
			
			System.out.println("//////////////////////////////////////////////");
			System.out.println("//////////"+conn+"/////////");
			
			String cards = "SELECT a.ID, a.NAME_CARD, a.COLOR, a.CARD_SCORE, a.PRIORITY FROM CARDS a where a.ID =13";
			Cards cards2 = null;
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
			
			
			System.out.println("//////////////////////////////////////////////");
			
		} catch (SQLException e) {
			System.out.println("SQLException  " + e.getMessage());
		}
	   }
	
	/*public void setDataSource(DataSource dataSource) {
		System.out.println("DaoCustomerSupport.setDataSource()  111 " + dataSource); 
		
		System.out.println(" Wow   " + dataSource);
		
		System.out.println(" Wow1   " + dataSource.getClass());
		
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        
        System.out.println( "example  -  " + getJdbcTemplate().getDataSource());
		System.out.println( "example1  -  " + getJdbcTemplate().getDataSource().getClass());
		
		try {
			Connection conn = this.jdbcTemplate.getDataSource().getConnection();
			System.out.println("after connect  " + conn.getClientInfo());
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
    }*/
	
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		System.out.println("DaoCustomerSupport.setJdbcTemplate()");
//		this.jdbcTemplate = jdbcTemplate;
//	}

	public DaoCustomerSupport() {		
	}

	/*public DaoCustomerSupport(int i) {
		System.out.println( "DaoCustomerSupport1  -  " + this.getJdbcTemplate().getDataSource());
		System.out.println( "DaoCustomerSupport 2 -  " + this.getJdbcTemplate().getDataSource().getClass());
	}*/

	@Override
	public Cards findCardByInt(int id) {
		Connection conn;
		Cards cards2 = null; 
		try {
			
			System.out.println("before connection");
			conn =  this.jdbcTemplate.getDataSource().getConnection();
			System.out.println("after connection");
			
//			System.out.println( "example  -  " + this.jdbcTemplate.getDataSource());
//			System.out.println( "example1  -  " + getJdbcTemplate().getDataSource().getClass());
			
//			System.out.println(" Wow_new  " + this.jdbcTemplate.getDataSource());			
//			System.out.println(" Wow_new1   " + this.jdbcTemplate.getDataSource().getClass());
//			System.out.println("before connect");
//			conn = this.jdbcTemplate.getDataSource().getConnection();
//			System.out.println("after connect  " + conn.getClientInfo());
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
		
			
			
//			Card card = new Card(name_card, color,
//					Short.valueOf(card_score), Short.valueOf(priority));
//			card.setPath(path.toString());
//			CardDto cardDto = createCardDto(card);
//			list.add(cardDto);
//		}
		
		return cards2;
	}
	

}
