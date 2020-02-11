package program5;

public class Employee {
	private long eId;
	private String eName;
	private Date date;
	public Employee(long eId, String eName,int d,int m,int y) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.date = new Date(d, m, y);
	}
	public long geteId() {
		return eId;
	}
	public void seteId(long eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDate() {
		return date.getDd()+"/"+date.getMm()+"/"+date.getYyyy();
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
