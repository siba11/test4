package oOOpExample;

public class CheckIn {
	private String Passangername;
	private String Passanerdob;
	private int Passangerpassportnum;
	CheckIn(String Passangername,String Passanerdob,int Passangerpassportnum){
		this.Passangername=Passangername;
		this.Passanerdob=Passanerdob;
		this.Passangerpassportnum=Passangerpassportnum;
		
	}
	public String getPassangername() {
		return Passangername;
	}
	public void setPassangername(String passangername) {
		Passangername = passangername;
		this.Passangername=passangername;
		
	}
	public String getPassanerdob() {
		return Passanerdob;
	}
	public void setPassanerdob(String passanerdob) {
		Passanerdob = passanerdob;
	}
	public int getPassangerpassportnum() {
		return Passangerpassportnum;
	}
	public void setPassangerpassportnum(int passangerpassportnum) {
		Passangerpassportnum = passangerpassportnum;
	}
	


}
