package beans;

public class Public {
	 
	private Integer Pid;
	   private String Pname;
	   private String Pssex;
	   private Integer Pheight;
	   private Integer Pweight;
	   private String Pbloodpressure;
	   private String Psee;
	   private String Pvital;
	   private Integer Phouseid;
		
	
	public Integer getPhouseid() {
		return Phouseid;
	}
	public void setPhouseid(Integer phouseid) {
		Phouseid = phouseid;
	}
	public Integer getPid() {
		return Pid;
	}
	public void setPid(Integer pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPssex() {
		return Pssex;
	}
	public void setPssex(String pssex) {
		Pssex = pssex;
	}
	public Integer getPheight() {
		return Pheight;
	}
	public void setPheight(Integer pheight) {
		Pheight = pheight;
	}
	public Integer getPweight() {
		return Pweight;
	}
	public void setPweight(Integer pweight) {
		Pweight = pweight;
	}
	public String getPbloodpressure() {
		return Pbloodpressure;
	}
	public void setPbloodpressure(String pbloodpressure) {
		Pbloodpressure = pbloodpressure;
	}
	public String getPsee() {
		return Psee;
	}
	public void setPsee(String psee) {
		Psee = psee;
	}
	public String getPvital() {
		return Pvital;
	}
	public void setPvital(String pvital) {
		Pvital = pvital;
	}
	  @Override
		public String toString() {
			return "Public [Pid=" + Pid + ", Pname=" + Pname + ", Pssex=" + Pssex + ", Pheight=" + Pheight + ", Pweight="
					+ Pweight + ", Pbloodpressure=" + Pbloodpressure + ", Psee=" + Psee + ", Pvital=" + Pvital
					+ ", Hhouseid=" + Phouseid + "]";
		}
	
	   
	   
}
