package infoIO;

import java.io.FileWriter;
import java.io.IOException;

import address_book.ABGroupInfo;
import address_book.ABGroupInfoList;
import address_book.ABMemberInfo;
import address_book.ABMemberInfoList;

public class WriteInfo {

	public int writeMemInfo(ABMemberInfoList memList){
		 FileWriter fw = null;
		  int resnum=0;
		  try{
		   fw = new FileWriter("mem.txt");//������Ʈ ������ ������ ����� ��ü�� ������ �����Ѵ�
		   for(ABMemberInfo memInfo : memList.getAbMemberInfoList()){
			   fw.write(memInfo.getAbMemberCode()+"\n");
			   fw.write(memInfo.getAbMemberName()+"\n");
			   fw.write(memInfo.getAbMemberPHNum()+"\n");
			   fw.write(memInfo.getAbGroupCode()+"\n");
			   resnum++;
		   }
		   fw.close();

		  }
		  catch(IOException e)
		  {
		   e.printStackTrace();
		  }
		  System.out.println("�۾�����");
		  return resnum;
	}
	public int writeGroupInfo(ABGroupInfoList groupList){
		 FileWriter fw = null;
		  int resnum=0;
		  try{
		   fw = new FileWriter("group.txt");//������Ʈ ������ ������ ����� ��ü�� ������ �����Ѵ�
		   for(ABGroupInfo groupInfo : groupList.getAbGroupInfoList()){
			   fw.write(groupInfo.getAbGroupCode()+"\n");
			   fw.write(groupInfo.getAbGroupName()+"\n");
			   fw.write(groupInfo.getAbGroupNote()+"\n");
			   resnum++;
		   }
		   fw.close();

		  }
		  catch(IOException e)
		  {
		   e.printStackTrace();
		  }
		  System.out.println("�۾�����");
		  return resnum;
	}
}
