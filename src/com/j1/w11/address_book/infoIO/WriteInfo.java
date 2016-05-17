package infoIO;

import java.io.FileWriter;
import java.io.IOException;

import address_book.ABGroupInfo;
import address_book.ABGroupInfoDAO;
import address_book.ABMemberInfo;
import address_book.ABMemberInfoDAO;

public class WriteInfo {

	public int writeMemInfo(ABMemberInfoDAO memList){
		 FileWriter fw = null;
		  int resnum=0;
		  try{
		   fw = new FileWriter("C://group.txt");//������Ʈ ������ ������ ����� ��ü�� ������ �����Ѵ�
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
	public int writeGroupInfo(ABGroupInfoDAO groupList){
		 FileWriter fw = null;
		  int resnum=0;
		  try{
		   fw = new FileWriter("C://group.txt");//������Ʈ ������ ������ ����� ��ü�� ������ �����Ѵ�
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
