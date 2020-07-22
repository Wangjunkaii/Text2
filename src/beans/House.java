package beans;
//¾ÓÃñÇ×Êô¹ÜÀí
public class House {
	private Integer Hhouseid;
	private String Hname;
	private String Haddress;
	private String Hnumber;
	private Integer Hmecd;
	private Integer Hmeid;
	private Integer Hzip;

	public Integer getHhouseid() {
		return Hhouseid;
	}
	public void setHhouseid(Integer hhouseid) {
		Hhouseid = hhouseid;
	}
	public String getHname() {
		return Hname;
	}
	public void setHname(String hname) {
		Hname = hname;
	}
	public String getHaddress() {
		return Haddress;
	}
	public void setHaddress(String haddress) {
		Haddress = haddress;
	}
	public String getHnumber() {
		return Hnumber;
	}
	public void setHnumber(String hnumber) {
		Hnumber = hnumber;
	}
	public Integer getHmecd() {
		return Hmecd;
	}
	public void setHmecd(Integer hmecd) {
		Hmecd = hmecd;
	}
	public Integer getHmeid() {
		return Hmeid;
	}
	public void setHmeid(Integer hmeid) {
		Hmeid = hmeid;
	}
	public Integer getHzip() {
		return Hzip;
	}
	public void setHzip(Integer hzip) {
		Hzip = hzip;
	}
	@Override
	public String toString() {
		return "House [Hhouseid=" + Hhouseid + ", Hname=" + Hname + ", Haddress=" + Haddress + ", Hnumber=" + Hnumber
				+ ", Hmecd=" + Hmecd + ", Hmeid=" + Hmeid + ", Hzip=" + Hzip + "]";
	}
	
	
}
