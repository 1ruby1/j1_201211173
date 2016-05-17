import infoIO.ReadInfo;
import infoIO.WriteInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import address_book.ABGroupInfo;
import address_book.ABGroupInfoList;
import address_book.ABMemberInfo;
import address_book.ABMemberInfoList;


public class ABTestMain {
	
	private ABMemberInfoList memInfoList;
	private ABGroupInfoList groupInfoList;
	
	public static void main(String[] args){
		ABTestMain main_ = new ABTestMain();
		int menuNum;
		
		ReadInfo read = new ReadInfo();
		main_.memInfoList = read.readMemberInfo();
		main_.groupInfoList = read.readGroupInfo();
		
		while(true){
			menuNum = main_.printMenu();
			if(menuNum==5)break ;
			else if(menuNum==1)main_.process1();
			else if(menuNum==2)main_.process2();
			else if(menuNum==3)main_.process3();
			else if(menuNum==4)main_.process4();
		}
		
		WriteInfo write = new WriteInfo();
		write.writeMemInfo(main_.memInfoList);
		write.writeGroupInfo(main_.groupInfoList);
	}
	
	public int printMenu(){
		Scanner sc;
		System.out.println("Choose menu number : \n1.insert Member Information \n2.search Member Information \n3.insert Group Information \n4.search Group Information \n5.Quit \n=> ");
		sc=new Scanner(System.in);
		return sc.nextInt();
	}
	
	public void process1(){
		String name,code,phone,group,gCode;
		Scanner sc=new Scanner(System.in);
		System.out.println("Member Name : ");
		name = sc.next();
		System.out.println("Member Phone Number : ");
		phone = sc.next();
		if(this.memInfoList.searchMemberPHNum(phone)==null){
			System.out.println("phone number ("+phone+") is already inserted!!!");
			return;
		}
		System.out.println("Group Name : ");
		group = sc.next();
		code=this.memInfoList.makeMemberCode();
		if(group==null){
			this.memInfoList.insertMemberInfo(new ABMemberInfo(code, name, phone));
		}else{
			if(this.groupInfoList.searchGroupName(group)==null){
				gCode = this.groupInfoList.makeGroupCode();
				this.groupInfoList.insertGroupInfo(gCode, group);
			}else {
				gCode = (this.groupInfoList.searchGroupName(group)).getAbGroupCode();
			}
			this.groupInfoList.makeGroupCode();
			this.memInfoList.insertMemberInfo(new ABMemberInfo(code, name, phone,gCode));
		}
	}
	
	public void process2(){
		//search member
		int num;
		String name,code,phone,group,gCode;
		ABMemberInfoList resList = new ABMemberInfoList();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("search\n1.name\n2.phone number\n3.group name\n=>");
		num = Integer.parseInt(sc.next());
		if(num==1){
			System.out.println("member name => ");
			name=sc.next();
			resList=this.memInfoList.searchMemberName(name);
		}else if(num==2){
			System.out.println("member phone number => ");
			phone=sc.next();
			resList.insertMemberInfo(this.memInfoList.searchMemberPHNum(phone));				
		}else if(num==3){
			System.out.println("group name => ");
			group=sc.next();
			gCode = this.groupInfoList.searchGroupName(group).getAbGroupCode();
			resList=this.memInfoList.searchMemberGCode(gCode);
		}
		if(!resList.getAbMemberInfoList().isEmpty()){
			for(ABMemberInfo mem : resList.getAbMemberInfoList()){
				System.out.println("name : "+mem.getAbMemberName()+"\n phone number : "+mem.getAbMemberPHNum()+"\n group name : "+this.groupInfoList.searchGroupCode(mem.getAbGroupCode()).getAbGroupName());
				System.out.println("==============================================================");
			}
		}
	}
	public void process3(){
		String name,code,note;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("group Name : ");
		name = sc.next();
		if(this.groupInfoList.searchGroupName(name)==null){
			System.out.println("group ("+name+") is already inserted!!!");
			return;
		}
		System.out.println("group note : ");
		note = sc.next();
		code=this.memInfoList.makeMemberCode();
		if(note==null){
			this.groupInfoList.insertGroupInfo(code, name);
		}else{
			this.groupInfoList.insertGroupInfo(code, name, note);
		}
	}
	
	public void process4(){
		//search group
		int num;
		String name,note;
		ABGroupInfoList resList = new ABGroupInfoList();
		ABMemberInfoList tmpList=new ABMemberInfoList();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("search\n1.name\n2.note\n=>");
		num = Integer.parseInt(sc.next());
		if(num==1){
			System.out.println("member name => ");
			name=sc.next();
			resList.insertGroupInfo(this.groupInfoList.searchGroupName(name));
		}else if(num==2){
			System.out.println("member phone number => ");
			note=sc.next();
			resList=this.groupInfoList.searchGroupNoteAll(note);				
		}
		if(!resList.getAbGroupInfoList().isEmpty()){
			for(ABGroupInfo gp : resList.getAbGroupInfoList()){
				System.out.println("name : "+gp.getAbGroupName()+"\n not : "+gp.getAbGroupNote());
				System.out.println("group member name : ");
				tmpList = this.memInfoList.searchMemberGCode(gp.getAbGroupCode());
				if(!tmpList.getAbMemberInfoList().isEmpty()){
					for(ABMemberInfo memIn : tmpList.getAbMemberInfoList()){
						System.out.println("     "+memIn.getAbMemberName()+" , ");
					}
				}
				
				System.out.println("==============================================================");
			}
		}
	}
}
