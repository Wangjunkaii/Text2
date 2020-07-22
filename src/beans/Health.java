package beans;

public class Health {

	private Integer Hid;
	   private String Hname;
	   private String Hssex;
	   private String Haddress;
	   private String Hbirthday;
	   private Integer Hnumber;
	   private String  Hblood;
	   private String  HRH;
	   private String  Hjibing;
	   private String Hguomin;
	   private String Hjiwang;  
	   
	   
    public Integer getHid() {
		return Hid;
	}
	public void setHid(Integer hid) {
		Hid = hid;
	}
	public String getHname() {
		return Hname;
	}
	public void setHname(String hname) {
		Hname = hname;
	}
	public String getHssex() {
		return Hssex;
	}
	public void setHssex(String hssex) {
		Hssex = hssex;
	}
	public String getHaddress() {
		return Haddress;
	}
	public void setHaddress(String haddress) {
		Haddress = haddress;
	}
	public String getHbirthday() {
		return Hbirthday;
	}
	public void setHbirthday(String hbirthday) {
		Hbirthday = hbirthday;
	}
	public Integer getHnumber() {
		return Hnumber;
	}
	public void setHnumber(Integer hnumber) {
		Hnumber = hnumber;
	}
	public String getHblood() {
		return Hblood;
	}
	public void setHblood(String hblood) {
		Hblood = hblood;
	}
	public String getHRH() {
		return HRH;
	}
	public void setHRH(String hRH) {
		HRH = hRH;
	}
	public String getHjibing() {
		return Hjibing;
	}
	public void setHjibing(String hjibing) {
		Hjibing = hjibing;
	}
	public String getHguomin() {
		return Hguomin;
	}
	public void setHguomin(String hguomin) {
		Hguomin = hguomin;
	}
	public String getHjiwang() {
		return Hjiwang;
	}
	public void setHjiwang(String hjiwang) {
		Hjiwang = hjiwang;
	}
		
	@Override
	public String toString() {
		return "Health [Hid=" + Hid + ", Hname=" + Hname + ", Hssex=" + Hssex + ", Haddress=" + Haddress
				+ ", Hbirthday=" + Hbirthday + ", Hnumber=" + Hnumber + ", Hblood=" + Hblood + ", HRH=" + HRH
				+ ", Hjibing=" + Hjibing + ", Hguomin=" + Hguomin + ", Hjiwang=" + Hjiwang + "]";
	}
	

}
