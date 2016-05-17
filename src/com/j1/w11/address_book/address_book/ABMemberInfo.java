package address_book;

public class ABMemberInfo{
	
	private String abMemberCode;
	private String abMemberName;
	private String abMemberPHNum;
	private String abGroupCode;
	
	public ABMemberInfo(String abMemberCode,String abMemberName, String abMemberPHNum) {
		this(abMemberCode,abMemberName,abMemberPHNum,"group_0");
	}
	public ABMemberInfo(String abMemberCode,String abMemberName, String abMemberPHNum, String abGroupCode) {
		this.abMemberCode = abMemberCode;
		this.abMemberName = abMemberName;
		this.abMemberPHNum = abMemberPHNum;
		this.abGroupCode = abGroupCode;
	}
	public String getAbMemberName() {
		return abMemberName;
	}
	public void setAbMemberName(String abMemberName) {
		this.abMemberName = abMemberName;
	}
	public String getAbMemberPHNum() {
		return abMemberPHNum;
	}
	public void setAbMemberPHNum(String abMemberPHNum) {
		this.abMemberPHNum = abMemberPHNum;
	}
	public String getAbMemberCode() {
		return abMemberCode;
	}
	public void setAbMemberCode(String abMemberCode) {
		this.abMemberCode = abMemberCode;
	}
	public String getAbGroupCode() {
		return abGroupCode;
	}
	public void setAbGroupCode(String abGroupCode) {
		this.abGroupCode = abGroupCode;
	}
	
}
