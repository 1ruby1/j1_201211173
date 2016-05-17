package address_book;

import infoIO.ReadInfo;
import infoIO.WriteInfo;

import java.util.ArrayList;
import java.util.List;

public class ABGroupInfoDAOImpl implements ABGroupInfoDAO,ABDAOConnection{

	private List<ABGroupInfo> abGroupInfoList;	
	
	public ABGroupInfoDAOImpl() {
		this(new ArrayList<ABGroupInfo>());
	}
	public ABGroupInfoDAOImpl(List<ABGroupInfo> abGroupInfoList) {
		this.abGroupInfoList = abGroupInfoList;
	}

	//insert group
	public boolean insertGroupInfo(String groupCode,String groupName){
		return this.abGroupInfoList.add(new ABGroupInfo(groupCode,groupName));
	}
	public boolean insertGroupInfo(String groupCode,String groupName, String groupNote){
		return this.abGroupInfoList.add(new ABGroupInfo(groupCode,groupName, groupNote));
	}
	public boolean insertGroupInfo(ABGroupInfo groupInfo){
		return this.abGroupInfoList.add(groupInfo);
	}
	
	//modify group
	public boolean updateGroupInfo(ABGroupInfo groupInfo, String newGroupName, String newGroupNote){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.equals(groupInfo)){
				groupInf.setAbGroupName(newGroupName);
				groupInf.setAbGroupNote(newGroupNote);
				return true;
			}
		}
		return false;
	}
	public boolean updateGroupName(ABGroupInfo groupInfo, String newGroupName){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.equals(groupInfo)){
				groupInf.setAbGroupName(newGroupName);
				return true;
			}
		}
		return false;
	}
	public boolean updateGroupNote(ABGroupInfo groupInfo,String newGroupNote){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.equals(groupInfo)){
				groupInf.setAbGroupNote(newGroupNote);
				return true;
			}
		}
		return false;
	}
	public boolean updateGroupInfo(String groupName, String newGroupName, String newGroupNote){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.getAbGroupName().equals(groupName)){
				groupInf.setAbGroupName(newGroupName);
				groupInf.setAbGroupNote(newGroupNote);
				return true;
			}
		}
		return false;
	}
	public boolean updateGroupName(String groupName, String newGroupName){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.getAbGroupName().equals(groupName)){
				groupInf.setAbGroupName(newGroupName);
				return true;
			}
		}
		return false;
	}
	public boolean updateGroupNote(String groupName,String newGroupNote){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.getAbGroupName().equals(groupName)){
				groupInf.setAbGroupNote(newGroupNote);
				return true;
			}
		}
		return false;
	}
	public boolean updateGroupInfo_(String groupCode, String newGroupName, String newGroupNote){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.getAbGroupCode().equals(groupCode)){
				groupInf.setAbGroupName(newGroupName);
				groupInf.setAbGroupNote(newGroupNote);
				return true;
			}
		}
		return false;
	}
	public boolean updateGroupName_(String groupCode, String newGroupName){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.getAbGroupCode().equals(groupCode)){
				groupInf.setAbGroupName(newGroupName);
				return true;
			}
		}
		return false;
	}
	public boolean updateGroupNote_(String groupCode,String newGroupNote){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.getAbGroupCode().equals(groupCode)){
				groupInf.setAbGroupNote(newGroupNote);
				return true;
			}
		}
		return false;
	}
	
	//delete group
	public boolean deleteGroupInfo(ABGroupInfo groupInfo){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.equals(groupInfo)){
				this.abGroupInfoList.remove(groupInf);
				return true;
			}
		}
		return false;
	}
	public boolean updateGroupInfo(String groupName){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.getAbGroupName().equals(groupName)){
				this.abGroupInfoList.remove(groupInf);
				return true;
			}
		}
		return false;
	}
	public boolean updateGroupInfo_(String groupCode){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.getAbGroupCode().equals(groupCode)){
				this.abGroupInfoList.remove(groupInf);
				return true;
			}
		}
		return false;
	}
	
	//search group
	public ABGroupInfo searchGroupCode(String groupCode){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.getAbGroupCode().equals(groupCode)){
				return groupInf;
			}
		}
		return null;
	}
	public ABGroupInfo searchGroupName(String groupName){
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.getAbGroupName().equals(groupName)){
				return groupInf;
			}
		}
		return null;
	}
	public ABGroupInfoDAOImpl searchGroupNameAll(String groupName){
		ABGroupInfoDAOImpl returnList = new ABGroupInfoDAOImpl();
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.getAbGroupName().contains(groupName)){
				returnList.insertGroupInfo(groupInf);
			}
		}
		return returnList;
	}
	public ABGroupInfoDAOImpl searchGroupNoteAll(String groupNote){
		ABGroupInfoDAOImpl returnList = new ABGroupInfoDAOImpl();
		for(ABGroupInfo groupInf:this.abGroupInfoList){
			if(groupInf.getAbGroupNote().contains(groupNote)){
				returnList.insertGroupInfo(groupInf);
			}
		}
		return returnList;
	}
	public List<ABGroupInfo> getAbGroupInfoList() {
		return abGroupInfoList;
	}
	public String makeGroupCode(){
		return "group_"+this.abGroupInfoList.size();
	}
	@Override
	public void getConnection() {
		// TODO Auto-generated method stub
		ReadInfo read = new ReadInfo();
		this.abGroupInfoList=read.readGroupInfo().getAbGroupInfoList();
	}
	@Override
	public void disConnection() {
		// TODO Auto-generated method stub
		WriteInfo write = new WriteInfo();
		write.writeGroupInfo(this);
	}
}
