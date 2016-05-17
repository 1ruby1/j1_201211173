package address_book;

import java.util.List;

public interface ABGroupInfoDAO {

	public boolean insertGroupInfo(ABGroupInfo groupInfo);
	public boolean updateGroupInfo(ABGroupInfo groupInfo, String newGroupName, String newGroupNote);
	public boolean deleteGroupInfo(ABGroupInfo groupInfo);
	public ABGroupInfo searchGroupCode(String groupCode);
	public ABGroupInfo searchGroupName(String groupName);
	public List<ABGroupInfo> getAbGroupInfoList();
}
