package Collections;
import Collections.ToStringarrayList;
public class ToStringarrayList {


	private int rollno;
	private String name;
	private String college;
	private String branch;

	public ToStringarrayList(int rollno, String name, String college, String branch) {
		// TODO Auto-generated constructor stub
		super();
		this.rollno=rollno;
		this.name=name;
		this.college=college;
		this.branch=branch;
	}
	@Override
	public String toString() {
		return "Student [roll no=" + rollno+","
	+"Name= "+name+"," 
				+" Branch= "+branch+"," 
	+" College=" +college+"]" ; 
	}


}
