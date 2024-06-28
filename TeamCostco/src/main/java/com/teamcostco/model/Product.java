package main.java.com.teamcostco.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Product {
   private String product_id;
   private String product_name;
   private String main_id;
   private String product_code;
   private String medium_id;
   private String small_id;
   private int purchase_price;
   private int selling_price;
   private int appropriate_inventory;
   private int current_inventory;
   
   public Product(ResultSet rs) throws SQLException {
	    this.product_id = rs.getString("product_id");
	    this.product_name = rs.getString("product_name");  // product_name을 ResultSet에서 가져옵니다.
	    this.main_id = rs.getString("main_id");  // main_id를 ResultSet에서 가져옵니다.
	    this.product_code = rs.getString("product_code"); // product_code를 ResultSet에서 가져옵니다.
	    this.medium_id = rs.getString("medium_id");  // medium_id를 ResultSet에서 가져옵니다.
	    this.small_id = rs.getString("small_id");  // small_id를 ResultSet에서 가져옵니다.
	    this.purchase_price = rs.getInt("purchase_price");  // purchase_price를 ResultSet에서 가져옵니다.
	    this.selling_price = rs.getInt("selling_price");  // selling_price를 ResultSet에서 가져옵니다.
	    this.appropriate_inventory = rs.getInt("appropriate_inventory");  // appropriate_inventory를 ResultSet에서 가져옵니다.
	    this.current_inventory = rs.getInt("current_inventory");  // current_inventory를 ResultSet에서 가져옵니다.
	}
   
   
   public String getProduct_id() {
      return product_id;
   }
   public void setProduct_id(String product_id) {
      this.product_id = product_id;
   }
   public String getProduct_name() {
      return product_name;
   }
   public void setProduct_name(String product_name) {
      this.product_name = product_name;
   }
   public String getMain_id() {
      return main_id;
   }
   public void setMain_id(String main_id) {
      this.main_id = main_id;
   }
   public String getProduct_code() {
      return product_code;
   }
   public void setProduct_code(String product_code) {
      this.product_code = product_code;
   }
   public String getMedium_id() {
      return medium_id;
   }
   public void setMedium_id(String medium_id) {
      this.medium_id = medium_id;
   }
   public String getSmall_id() {
      return small_id;
   }
   public void setSmall_id(String small_id) {
      this.small_id = small_id;
   }
   public int getPurchase_price() {
      return purchase_price;
   }
   public void setPurchase_price(int purchase_price) {
      this.purchase_price = purchase_price;
   }
   public int getSelling_price() {
      return selling_price;
   }
   public void setSelling_price(int selling_price) {
      this.selling_price = selling_price;
   }
   public int getAppropriate_inventory() {
      return appropriate_inventory;
   }
   public void setAppropriate_inventory(int appropriate_inventory) {
      this.appropriate_inventory = appropriate_inventory;
   }
   public int getCurrent_inventory() {
      return current_inventory;
   }
   public void setCurrent_inventory(int current_inventory) {
      this.current_inventory = current_inventory;
   }
}