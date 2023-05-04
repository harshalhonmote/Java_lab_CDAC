package oop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
//select id,name,price from products order by name,price;
import java.util.List;

import pojo.Product;

public class ProductDao implements AutoCloseable{
	Connection con;
	public PreparedStatement addProductStmt;
	public PreparedStatement searchStmt;
	public PreparedStatement  displayProductStmt;
	public PreparedStatement pendingStmt;
	public PreparedStatement sortStmt;

	public ProductDao() throws SQLException {
		con = DbUtil.getConnection();
		String addProductSql = "insert into products(name,category,price,in_stock)values(?,?,?,?)";
		addProductStmt = con.prepareStatement(addProductSql);

		String serchSql = "select id,name,category,price from products where category=?";
		searchStmt = con.prepareStatement(serchSql);

		String displayProductSql = "select c.name, o.odate,p.name from products p,orders o,customers c where p.id=o.product_id and c.id = o.customer_id order by o.odate";
		displayProductStmt = con.prepareStatement(displayProductSql);
		
		String sql = "select c.name,count(o.customer_id) count from customers c, orders o where c.id = o.customer_id group by o.customer_id;";
		pendingStmt = con.prepareStatement(sql);
//
//		String sort = "select id,name,price from products order by name,price";
//		sortStmt = con.prepareStatement(sort);
	}
    @Override
	public void close() throws SQLException {
		displayProductStmt.close();
		searchStmt.close();
		addProductStmt.close();
		con.close();
	}
    // ADD Product
	public int addProduct(Product p) {
		int cnt = 0;
		try {
			addProductStmt.setString(1, p.getName());
			addProductStmt.setString(2, p.getCategory().toString());
			addProductStmt.setDouble(3, p.getPrice());
			addProductStmt.setBoolean(4, p.getInstock());

			cnt = addProductStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	public List searchProduct(String category){
		List<Product>list = new ArrayList<>();
		Product p = new Product();
		try {
			searchStmt.setString(1, category);
			System.out.println(category);
			ResultSet rs = searchStmt.executeQuery();
			
			while(rs.next()) {
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setCategory(Category.valueOf(rs.getString(3)));
				p.setPrice(rs.getDouble(4));
				list.add(p);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public ArrayList displayProduct() {
		ArrayList<String[]>list = new ArrayList<>();
		try {
			ResultSet rs =displayProductStmt.executeQuery();
			while(rs.next()) {
				String str[] = new String[3];
				str[0]=rs.getString(1);
				str[1]=DbUtil.TimestampTodate(rs.getTimestamp(2)).toString();
				str[2]=rs.getString(3);
				list.add(str);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	public ArrayList pendingOrders() {
		ArrayList<String[]>list = new ArrayList<>();
		try {
			ResultSet rs = pendingStmt.executeQuery();
			while(rs.next()) {
				String str[] = new String[3];
				str[0]=rs.getString(1);
				str[1] =Integer.toString(rs.getInt(2));
				list.add(str);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
