package inherence;

public class Person {
	private String name;
	private String emaiid;
	private String phonenum;
	public String getName() {
	return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmailid() {
		return emaiid;
	}
	public void setEmailid(String emaiid) {
		this.emaiid=emaiid;
	}
	public String getPhonenum() {
		return phonenum;
		
	}
	public void setPhonenum(String phonenum) {
		this.phonenum=phonenum;
		
	}
	public String toString() {
		return (name+";"+phonenum+";"+emaiid);
	}
	public static void main(String[] args) {
		
	Person pdetails=new Person();
	pdetails.setName("Madhuri");
	pdetails.setEmailid("test@test.com");
	pdetails.setPhonenum("1234567");
	System.out.println(pdetails.toString());
	}
	
	
}
