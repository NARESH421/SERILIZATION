package serialization;

public class Addres implements Cloneable {
	private String phyaddress;
	private String ofcaddress;
	public String getPhyaddress() {
		return phyaddress;
	}
	public void setPhyaddress(String phyaddress) {
		this.phyaddress = phyaddress;
	}
	public String getOfcaddress() {
		return ofcaddress;
	}
	public void setOfcaddress(String ofcaddress) {
		this.ofcaddress = ofcaddress;
	}
	@Override
	public String toString() {
		return "Addres [phyaddress=" + phyaddress + ", ofcaddress=" + ofcaddress + "]";
	}
	public Object clone() throws CloneNotSupportedException
	{
		try {
		return super.clone();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	

}
