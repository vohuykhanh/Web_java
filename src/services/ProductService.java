package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import models.Product;

public class ProductService {

		public List<Product> getProductFeatured1(Connection conn) {
			List<Product> list = new ArrayList<Product>();
			try {
				String sql = "SELECT * FROM products WHERE  hot_deal  = true and cover=false";
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("title");
					String description = rs.getString("description");
					double price = rs.getDouble("price");
					double price_net = rs.getDouble("price_net");
					int available = rs.getInt("available");
					int sold = rs.getInt("sold");
					int discount = rs.getInt("discount");
					Timestamp deal_timer = rs.getTimestamp("deal_timer");
					String image = rs.getString("image");
					Product product = new Product(id, title, description, price, price_net, available, sold, deal_timer,
							discount, image);
					list.add(product);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return list;
		}
		public List<Product> getProductOnSale(Connection conn) {
			List<Product> list = new ArrayList<Product>();
			try {
				String sql = "SELECT * FROM products WHERE  hot_deal  = true and cover=false";
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("title");
					String description = rs.getString("description");
					double price = rs.getDouble("price");
					double price_net = rs.getDouble("price_net");
					int available = rs.getInt("available");
					int sold = rs.getInt("sold");
					int discount = rs.getInt("discount");
					Timestamp deal_timer = rs.getTimestamp("deal_timer");
					String image = rs.getString("image");
					Product product = new Product(id, title, description, price, price_net, available, sold, deal_timer,
							discount, image);
					list.add(product);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return list;
		}
		public List<Product> getProductBestRate(Connection conn) {
			List<Product> list = new ArrayList<Product>();
			try {
				String sql = "SELECT * FROM products WHERE  hot_deal  = true and cover=false";
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("title");
					String description = rs.getString("description");
					double price = rs.getDouble("price");
					double price_net = rs.getDouble("price_net");
					int available = rs.getInt("available");
					int sold = rs.getInt("sold");
					int discount = rs.getInt("discount");
					Timestamp deal_timer = rs.getTimestamp("deal_timer");
					String image = rs.getString("image");
					Product product = new Product(id, title, description, price, price_net, available, sold, deal_timer,
							discount, image);
					list.add(product);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return list;
		}
		public List<Product> getProductDealOfWeek(Connection conn) {
			List<Product> list = new ArrayList<Product>();
			try {
				String sql = "SELECT * FROM products WHERE  hot_deal  = true and cover=true";
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("title");
					String description = rs.getString("description");
					double price = rs.getDouble("price");
					double price_net = rs.getDouble("price_net");
					int available = rs.getInt("available");
					int sold = rs.getInt("sold");
					Timestamp deal_timer = rs.getTimestamp("deal_timer");
					String image = rs.getString("image");
					int discount = rs.getInt("discount");
					Product product = new Product(id, title, description, price, price_net, available, sold, deal_timer,
							discount, image);
					list.add(product);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return list;
		}
		public List<Product> getProductHotNew(Connection conn) {
			List<Product> list = new ArrayList<Product>();
			try {
				String sql = "SELECT * FROM products WHERE  hot_new  = true and cover=false";
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("title");
					String description = rs.getString("description");
					double price = rs.getDouble("price");
					double price_net = rs.getDouble("price_net");
					int available = rs.getInt("available");
					int sold = rs.getInt("sold");
					Timestamp deal_timer = rs.getTimestamp("deal_timer");
					String image = rs.getString("image");
					int discount = rs.getInt("discount");
					Product product = new Product(id, title, description, price, price_net, available, sold, deal_timer,
							discount, image);
					list.add(product);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return list;
		}
		public Product getProductHotNewCover(Connection conn) {
			Product product = null;
			try {
				String sql = "SELECT * FROM products WHERE  hot_new  = true and cover=true";
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();
				rs.next();
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String description = rs.getString("description");
				double price = rs.getDouble("price");
				double price_net = rs.getDouble("price_net");
				int available = rs.getInt("available");
				int sold = rs.getInt("sold");
				Timestamp deal_timer = rs.getTimestamp("deal_timer");
				String image = rs.getString("image");
				int discount = rs.getInt("discount");
				product = new Product(id, title, description, price, price_net, available, sold, deal_timer, discount,
						image);

			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return product;
		}
		public List<Product> getProductAudioAndVideo(Connection conn) {
			List<Product> list = new ArrayList<Product>();
			try {
				String sql = "SELECT * FROM products WHERE  hot_new  = true and cover=false";
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("title");
					String description = rs.getString("description");
					double price = rs.getDouble("price");
					double price_net = rs.getDouble("price_net");
					int available = rs.getInt("available");
					int sold = rs.getInt("sold");
					Timestamp deal_timer = rs.getTimestamp("deal_timer");
					String image = rs.getString("image");
					int discount = rs.getInt("discount");
					Product product = new Product(id, title, description, price, price_net, available, sold, deal_timer,
							discount, image);
					list.add(product);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return list;
		}
		public List<Product> getProductLapAndCom(Connection conn) {
			List<Product> list = new ArrayList<Product>();
			try {
				String sql = "SELECT * FROM products WHERE  hot_new  = true and cover=false";
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("title");
					String description = rs.getString("description");
					double price = rs.getDouble("price");
					double price_net = rs.getDouble("price_net");
					int available = rs.getInt("available");
					int sold = rs.getInt("sold");
					Timestamp deal_timer = rs.getTimestamp("deal_timer");
					String image = rs.getString("image");
					int discount = rs.getInt("discount");
					Product product = new Product(id, title, description, price, price_net, available, sold, deal_timer,
							discount, image);
					list.add(product);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return list;
		}
		public  Product getProduct(Connection conn, int id)  {
			Product product= null;
			 try {
				 String sql = "SELECT * FROM products WHERE  id  = ?";
				 PreparedStatement pstm = conn.prepareStatement(sql);			 			 			 
				 pstm.setInt(1, id);
				 ResultSet rs = pstm.executeQuery();
				 rs.next();			 
		         String title = rs.getString("title");
		         String description = rs.getString("description");            
		         double price = rs.getDouble("price");
		         double price_net = rs.getDouble("price_net");	            
		         int available= rs.getInt("available");
		         int sold = rs.getInt("sold");
		         Timestamp  deal_timer = rs.getTimestamp("deal_timer");
		         String image = rs.getString("image");
		         int discount = rs.getInt("discount");	            	            
		         product = new Product(id, title, description, price,price_net,available,sold,deal_timer,discount,image);
		            	        
			 } catch (SQLException ex) {
				 ex.printStackTrace();      
			 }
			 return product;
		} 
		public List<Product> getProductHotBestSellers(Connection conn) {
			List<Product> list = new ArrayList<Product>();
			try {
				String sql = "SELECT * FROM products WHERE  hot_new  = true and cover=false";
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("title");
					String description = rs.getString("description");
					double price = rs.getDouble("price");
					double price_net = rs.getDouble("price_net");
					int available = rs.getInt("available");
					int sold = rs.getInt("sold");
					Timestamp deal_timer = rs.getTimestamp("deal_timer");
					String image = rs.getString("image");
					int discount = rs.getInt("discount");
					Product product = new Product(id, title, description, price, price_net, available, sold, deal_timer,
							discount, image);
					list.add(product);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return list;
		}	
		public List<Product> getProductAuAndVi(Connection conn) {
			List<Product> list = new ArrayList<Product>();
			try {
				String sql = "SELECT * FROM products WHERE  hot_new  = true and cover=false";
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("title");
					String description = rs.getString("description");
					double price = rs.getDouble("price");
					double price_net = rs.getDouble("price_net");
					int available = rs.getInt("available");
					int sold = rs.getInt("sold");
					Timestamp deal_timer = rs.getTimestamp("deal_timer");
					String image = rs.getString("image");
					int discount = rs.getInt("discount");
					Product product = new Product(id, title, description, price, price_net, available, sold, deal_timer,
							discount, image);
					list.add(product);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return list;
		}	
		public List<Product> getProductLapACom(Connection conn) {
			List<Product> list = new ArrayList<Product>();
			try {
				String sql = "SELECT * FROM products WHERE  hot_new  = true and cover=false";
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("title");
					String description = rs.getString("description");
					double price = rs.getDouble("price");
					double price_net = rs.getDouble("price_net");
					int available = rs.getInt("available");
					int sold = rs.getInt("sold");
					Timestamp deal_timer = rs.getTimestamp("deal_timer");
					String image = rs.getString("image");
					int discount = rs.getInt("discount");
					Product product = new Product(id, title, description, price, price_net, available, sold, deal_timer,
							discount, image);
					list.add(product);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return list;
		}	
		public List<Product> getProductTrends(Connection conn) {
			List<Product> list = new ArrayList<Product>();
			try {
				String sql = "SELECT * FROM products WHERE  hot_new  = true and cover=false";
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("title");
					String description = rs.getString("description");
					double price = rs.getDouble("price");
					double price_net = rs.getDouble("price_net");
					int available = rs.getInt("available");
					int sold = rs.getInt("sold");
					Timestamp deal_timer = rs.getTimestamp("deal_timer");
					String image = rs.getString("image");
					int discount = rs.getInt("discount");
					Product product = new Product(id, title, description, price, price_net, available, sold, deal_timer,
							discount, image);
					list.add(product);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return list;
		}	
		public List<Product> getProductViewed(Connection conn) {
			List<Product> list = new ArrayList<Product>();
			try {
				String sql = "SELECT * FROM products WHERE  hot_new  = true and cover=false";
				PreparedStatement pstm = conn.prepareStatement(sql);
				ResultSet rs = pstm.executeQuery();

				while (rs.next()) {
					int id = rs.getInt("id");
					String title = rs.getString("title");
					String description = rs.getString("description");
					double price = rs.getDouble("price");
					double price_net = rs.getDouble("price_net");
					int available = rs.getInt("available");
					int sold = rs.getInt("sold");
					Timestamp deal_timer = rs.getTimestamp("deal_timer");
					String image = rs.getString("image");
					int discount = rs.getInt("discount");
					Product product = new Product(id, title, description, price, price_net, available, sold, deal_timer,
							discount, image);
					list.add(product);
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			return list;
		}	
}
	
	
	