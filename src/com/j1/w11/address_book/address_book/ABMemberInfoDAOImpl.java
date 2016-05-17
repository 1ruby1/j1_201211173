package address_book;

import infoIO.ReadInfo;
import infoIO.WriteInfo;

import java.util.ArrayList;
import java.util.List;

public class ABMemberInfoDAOImpl implements ABMemberInfoDAO,ABDAOConnection{
	
	private List<ABMemberInfo> abMemberInfoList;	
	
	public ABMemberInfoDAOImpl() {
		this(new ArrayList<ABMemberInfo>());
	}
	public ABMemberInfoDAOImpl(List<ABMemberInfo> abMemberInfoList) {
		this.abMemberInfoList = abMemberInfoList;
	}

	//insert member
	public boolean insertMemberInfo(ABMemberInfo memberInfo){
		return this.abMemberInfoList.add(memberInfo);
	}
	public boolean insertMemberInfo(String memberCode,String memberName, String memberPH, String groupCode){
		return this.abMemberInfoList.add(new ABMemberInfo(memberCode, memberName, memberPH, groupCode));
	}
	public boolean insertMemberInfo(String memberCode,String memberName, String memberPH){
		return this.abMemberInfoList.add(new ABMemberInfo(memberCode, memberName, memberPH));
	}
	
	//modify member
	public boolean updateMemberInfo(ABMemberInfo memberInfo, String newMemberName, String newPHNum, String newGroupCode){
		for(ABMemberInfo memInfo : this.abMemberInfoList){
			if(memInfo.equals(memberInfo)){
				memInfo.setAbMemberName(newMemberName);
				memInfo.setAbMemberPHNum(newPHNum);
				memInfo.setAbGroupCode(newGroupCode);
				return true;
			}
		}
		return false;
	}
	public boolean updateMemberInfo_(String memberCode, String newMemberName, String newPHNum, String newGroupCode){
		for(ABMemberInfo memInfo : this.abMemberInfoList){
			if(memInfo.getAbMemberCode().equals(memberCode)){
				memInfo.setAbMemberName(newMemberName);
				memInfo.setAbMemberPHNum(newPHNum);
				memInfo.setAbGroupCode(newGroupCode);
				return true;
			}
		}
		return false;
	}
	public boolean updateMemberInfo(String memberName, String newMemberName, String newPHNum, String newGroupCode){
		for(ABMemberInfo memInfo : this.abMemberInfoList){
			if(memInfo.getAbMemberName().equals(memberName)){
				memInfo.setAbMemberName(newMemberName);
				memInfo.setAbMemberPHNum(newPHNum);
				memInfo.setAbGroupCode(newGroupCode);
				return true;
			}
		}
		return false;
	}
	
	
	//delete member
	public boolean deleteMemberInfo(ABMemberInfo memberInfo){
		for(ABMemberInfo memInfo : this.abMemberInfoList){
			if(memInfo.equals(memberInfo)){
				this.abMemberInfoList.remove(memInfo);
				return true;
			}
		}
		return false;
	}
	public boolean deleteMemberInfoName(String memberName){
		for(ABMemberInfo memInfo : this.abMemberInfoList){
			if(memInfo.getAbMemberName().equals(memberName)){
				this.abMemberInfoList.remove(memInfo);
				return true;
			}
		}
		return false;
	}
	public boolean deleteMemberInfoCode(String memberCode){
		for(ABMemberInfo memInfo : this.abMemberInfoList){
			if(memInfo.getAbMemberCode().equals(memberCode)){
				this.abMemberInfoList.remove(memInfo);
				return true;
			}
		}
		return false;
	}
	public int deleteMemberInfoGroup(String groupCode){
		int res=0;
		for(ABMemberInfo memInfo : this.abMemberInfoList){
			if(memInfo.getAbGroupCode().equals(groupCode)){
				this.abMemberInfoList.remove(memInfo);
				res++;
			}
		}
		return res;
	}
	
	
	//search member
	public ABMemberInfo searchMemberCode(String memberCode){
		for(ABMemberInfo memInfo : this.abMemberInfoList){
			if(memInfo.getAbMemberCode().equals(memberCode)){
				return memInfo;
			}
		}
		return null;
	}
	public ABMemberInfoDAOImpl searchMemberName(String memberName){
		ABMemberInfoDAOImpl resList = new ABMemberInfoDAOImpl();
		for(ABMemberInfo memInfo : this.abMemberInfoList){
			if(memInfo.getAbMemberName().equals(memberName)){
				resList.insertMemberInfo(memInfo);
			}
		}
		return resList;
	}
	public ABMemberInfo searchMemberPHNum(String memberPHNum){
		for(ABMemberInfo memInfo : this.abMemberInfoList){
			if(memInfo.getAbMemberPHNum().contains(memberPHNum)){
				return memInfo;
			}
		}
		return null;
	}
	public ABMemberInfoDAOImpl searchMemberGCode(String groupCode){
		ABMemberInfoDAOImpl resList = new ABMemberInfoDAOImpl();
		for(ABMemberInfo memInfo : this.abMemberInfoList){
			if(memInfo.getAbGroupCode().equals(groupCode)){
				resList.insertMemberInfo(memInfo);
			}
		}
		return resList;
	}
	public List<ABMemberInfo> getAbMemberInfoList() {
		return abMemberInfoList;
	}
	public String makeMemberCode(){
		return "member_"+this.abMemberInfoList.size();
	}
	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		ReadInfo read = new ReadInfo();
		this.abMemberInfoList=read.readMemberInfo().getAbMemberInfoList();
	}
	@Override
	public void disConnection() {
		// TODO Auto-generated method stub
		WriteInfo write = new WriteInfo();
		write.writeMemInfo(this);
	}
	
}
