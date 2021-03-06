package infoIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import address_book.ABGroupInfo;
import address_book.ABGroupInfoDAO;
import address_book.ABGroupInfoDAOImpl;
import address_book.ABMemberInfo;
import address_book.ABMemberInfoDAO;
import address_book.ABMemberInfoDAOImpl;

public class ReadInfo {

	public ABMemberInfoDAO readMemberInfo(){
		ABMemberInfoDAO memList = new ABMemberInfoDAOImpl();
		FileReader fr;
		String code,name,phone,groupCode;
		try {
			fr = new FileReader("C://mem.txt");
			BufferedReader br = new BufferedReader(fr); 
			while(true){
				code = br.readLine();
				if(code == null){break;}
				name = br.readLine();
				phone = br.readLine();
				groupCode = br.readLine();
				memList.insertMemberInfo(new ABMemberInfo(code, name, phone, groupCode));
				//System.out.println(code+" "+name+" "+phone+" "+groupCode);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return memList;
	}
	public ABGroupInfoDAO readGroupInfo(){
		ABGroupInfoDAOImpl groupList = new ABGroupInfoDAOImpl();
		FileReader fr;
		String code,name,note;
		try {
			fr = new FileReader("C://group.txt");
			BufferedReader br = new BufferedReader(fr); 
			while(true){
				code = br.readLine();
				if(code == null){break;}
				name = br.readLine();
				note = br.readLine();
				groupList.insertGroupInfo(new ABGroupInfo(code, name, note));
				//System.out.println(code+" "+name+" "+note);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return groupList;
	}
}
