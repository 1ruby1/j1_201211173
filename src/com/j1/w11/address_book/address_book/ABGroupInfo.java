package address_book;

public class ABGroupInfo {
	
	private String abGroupCode;
	private String abGroupName;
	private String abGroupNote;
	
	public ABGroupInfo(String abGroupCode,String abGroupName) {
		this(abGroupCode,abGroupName,"no note");
	}

	public ABGroupInfo(String abGroupCode,String abGroupName, String abGroupNote) {
		this.abGroupCode = abGroupCode;
		this.abGroupName = abGroupName;
		this.abGroupNote = abGroupNote;
	}

	public String getAbGroupName() {
		return abGroupName;
	}

	public void setAbGroupName(String abGroupName) {
		this.abGroupName = abGroupName;
	}

	public String getAbGroupNote() {
		return abGroupNote;
	}

	public void setAbGroupNote(String abGroupNote) {
		this.abGroupNote = abGroupNote;
	}

	public String getAbGroupCode() {
		return abGroupCode;
	}

	public void setAbGroupCode(String abGroupCode) {
		this.abGroupCode = abGroupCode;
	}
	
}
