package beans;



public class Local {
	private Integer Lid;
	private String Lname;
	private Integer Lage;
	private String ssex;
	private String Ltime;
	private String Ldielocal;
	private String Laddress;
	public Integer getLid() {
		return Lid;
	}
	public void setLid(Integer lid) {
		Lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public Integer getLage() {
		return Lage;
	}
	public void setLage(Integer lage) {
		Lage = lage;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public String getLtime() {
		return Ltime;
	}
	public void setLtime(String ltime) {
		Ltime = ltime;
	}
	public String getLdielocal() {
		return Ldielocal;
	}
	public void setLdielocal(String ldielocal) {
		Ldielocal = ldielocal;
	}
	public String getLaddress() {
		return Laddress;
	}
	public void setLaddress(String laddress) {
		Laddress = laddress;
	}
	@Override
	public String toString() {
		return "Local [Lid=" + Lid + ", Lname=" + Lname + ", Lage=" + Lage + ", ssex=" + ssex + ", Ltime=" + Ltime
				+ ", Ldielocal=" + Ldielocal + ", Laddress=" + Laddress + "]";
	}
	
	
	
}
