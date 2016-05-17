package address_book;

import java.util.List;

public interface ABMemberInfoDAO {

	public boolean insertMemberInfo(ABMemberInfo memberInfo);
	public boolean updateMemberInfo(ABMemberInfo memberInfo, String newMemberName, String newPHNum, String newGroupCode);
	public boolean deleteMemberInfo(ABMemberInfo memberInfo);
	public ABMemberInfo searchMemberCode(String memberCode);
	public ABMemberInfoDAOImpl searchMemberName(String memberName);
	public List<ABMemberInfo> getAbMemberInfoList();
}
