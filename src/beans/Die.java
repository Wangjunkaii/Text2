package beans;


public class Die {
	private Integer Did;
	private String Dname;
	private Integer Dage;
	private String ssex;
	private String Daddress;
	
	public Integer getDid() {
		return Did;
	}
	public void setDid(Integer did) {
		Did = did;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public Integer getDage() {
		return Dage;
	}
	public void setDage(Integer dage) {
		Dage = dage;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	
	public String getDaddress() {
		return Daddress;
	}
	public void setDaddress(String daddress) {
		Daddress = daddress;
	}
	@Override
	public String toString() {
		return "Die [Did=" + Did + ", Dname=" + Dname + ", Dage=" + Dage + ", ssex=" + ssex + ", Daddress=" + Daddress
				+ "]";
	}
	
	
	
	
	
}
