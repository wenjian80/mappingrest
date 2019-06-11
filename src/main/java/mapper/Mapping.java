package mapper;

public class Mapping {
	 private String account;
	 private String phone;
	 
	 public Mapping(String account, String phone) {
	        this.account = account;
	        this.phone = phone;
	        	       	        
	    }
	 
	 public String getAccount() {
		return account;
	}
	 
	 
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
