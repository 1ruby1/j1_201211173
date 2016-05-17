import java.util.Scanner;
import java.util.StringTokenizer;

import address_book.ABGroupInfo;
import address_book.ABGroupInfoDAO;
import address_book.ABGroupInfoDAOImpl;
import address_book.ABMemberInfo;
import address_book.ABMemberInfoDAO;
import address_book.ABMemberInfoDAOImpl;


public class ABTestMain {
	
	private ABMemberInfoDAO memInfoList;
	private ABGroupInfoDAO groupInfoList;
	
	public ABTestMain(){
		this.groupInfoList = new ABGroupInfoDAOImpl();
		((ABGroupInfoDAOImpl)this.groupInfoList).getConnection();
	}
	public static void main(String[] args){
		ABTestMain main_ = new ABTestMain();
		int menuNum;
		
		while(true){
			menuNum = main_.printMenu();
			if(menuNum==5)break ;
			else if(menuNum==1)main_.process1();
			else if(menuNum==2)main_.process2();
			else if(menuNum==3)main_.process3();
			else if(menuNum==4)main_.process4();
			else if(menuNum==5)main_.process5();
			else if(menuNum==6)main_.process6();
			else if(menuNum==7)main_.process7();
			else if(menuNum==8)main_.process8();
		}
		
		((ABGroupInfoDAOImpl)main_.groupInfoList).disConnection();
		((ABMemberInfoDAOImpl)main_.memInfoList).disConnection();
	}
	
	public int printMenu(){
		Scanner sc;
		System.out.println("Choose menu number : \n1.insert Member Information \n2.search Member Information \n4.update Member Infromation \n5.delete Member Information \n3.insert Group Information \n4.search Group Information \n5.Quit \n=> ");
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
		if(((ABMemberInfoDAOImpl)this.memInfoList).searchMemberPHNum(phone)!=null){
			System.out.println("phone number ("+phone+") is already inserted!!!");
			return;
		}
		System.out.println("Group Name : ");
		group = sc.next();
		code=((ABMemberInfoDAOImpl)this.memInfoList).makeMemberCode();
		if(group==null){
			this.memInfoList.insertMemberInfo(new ABMemberInfo(code, name, phone));
		}else{
			if(this.groupInfoList.searchGroupName(group)==null){
				gCode = ((ABGroupInfoDAOImpl)this.groupInfoList).makeGroupCode();
				((ABGroupInfoDAOImpl)this.groupInfoList).insertGroupInfo(gCode, group);
			}else {
				gCode = (this.groupInfoList.searchGroupName(group)).getAbGroupCode();
			}
			((ABGroupInfoDAOImpl)this.groupInfoList).makeGroupCode();
			this.memInfoList.insertMemberInfo(new ABMemberInfo(code, name, phone,gCode));
		}
	}
	
	public void process2(){
		//search member
		int num;
		String name,code,phone,group,gCode;
		ABMemberInfoDAOImpl resList = new ABMemberInfoDAOImpl();
		ABMemberInfo res = null;
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
			res = ((ABMemberInfoDAOImpl)this.memInfoList).searchMemberPHNum(phone);
			if(res!=null)resList.insertMemberInfo(res);				
		}else if(num==3){
			System.out.println("group name => ");
			group=sc.next();
			gCode = this.groupInfoList.searchGroupName(group).getAbGroupCode();
			resList=((ABMemberInfoDAOImpl)this.memInfoList).searchMemberGCode(gCode);
		}
		if(!resList.getAbMemberInfoList().isEmpty()){
			for(ABMemberInfo mem : resList.getAbMemberInfoList()){
				System.out.println("name : "+mem.getAbMemberName()+"\n phone number : "+mem.getAbMemberPHNum()+"\n group name : "+this.groupInfoList.searchGroupCode(mem.getAbGroupCode()).getAbGroupName());
				System.out.println("==============================================================");
			}
		}
	}
	public void process3(){
		//search member
		int num;
		String name,code,phone,group,gCode;
		ABMemberInfoDAOImpl resList = new ABMemberInfoDAOImpl();
		ABMemberInfo res = null;
		StringTokenizer token;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("search\n1.name\n2.phone number\n=>");
		num = Integer.parseInt(sc.next());
		if(num==1){
			System.out.println("member name => ");
			name=sc.next();
			resList=this.memInfoList.searchMemberName(name);
			if(!resList.getAbMemberInfoList().isEmpty()){
				for(ABMemberInfo mem : resList.getAbMemberInfoList()){
					token = new StringTokenizer(mem.getAbMemberCode(), "_");
					System.out.println("number : "+token.nextToken()+"\n phone number : "+mem.getAbMemberPHNum()+"\n group name : "+this.groupInfoList.searchGroupCode(mem.getAbGroupCode()).getAbGroupName());
					System.out.println("==============================================================");
				}
				System.out.println("choose number => ");
				num = Integer.parseInt(sc.next());
				res = this.memInfoList.searchMemberCode("member_"+num);
				if(res!=null){
					System.out.println("name : "+res.getAbMemberName()+"\n phone number : "+res.getAbMemberPHNum()+"\n group name : "+this.groupInfoList.searchGroupCode(res.getAbGroupCode()).getAbGroupName());
					System.out.println("write member info (name phoneNumber (group)) : ");
					name=sc.next();
					phone=sc.next();
					group=sc.next();
					if(group==null)gCode = "group_0";
					else gCode = this.groupInfoList.searchGroupName(group).getAbGroupCode();
					this.memInfoList.updateMemberInfo(res, name, phone, gCode);
				}
			}
		}else if(num==2){
			System.out.println("member phone number => ");
			phone=sc.next();
			res = ((ABMemberInfoDAOImpl)this.memInfoList).searchMemberPHNum(phone);
			if(res!=null){
				System.out.println("name : "+res.getAbMemberName()+"\n phone number : "+res.getAbMemberPHNum()+"\n group name : "+this.groupInfoList.searchGroupCode(res.getAbGroupCode()).getAbGroupName()+" is deleted!");
				System.out.println("write member info (name phoneNumber (group)) : ");
				name=sc.next();
				phone=sc.next();
				group=sc.next();
				if(group==null)gCode = "group_0";
				else gCode = this.groupInfoList.searchGroupName(group).getAbGroupCode();
				this.memInfoList.updateMemberInfo(res, name, phone, gCode);
			}		
		}
	}
	public void process4(){
		int num;
		String name,code,phone,group,gCode;
		ABMemberInfoDAOImpl resList = new ABMemberInfoDAOImpl();
		ABMemberInfo res = null;
		StringTokenizer token;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("search\n1.name\n2.phone number\n3.group name\n=>");
		num = Integer.parseInt(sc.next());
		if(num==1){
			System.out.println("member name => ");
			name=sc.next();
			resList=this.memInfoList.searchMemberName(name);
			if(!resList.getAbMemberInfoList().isEmpty()){
				for(ABMemberInfo mem : resList.getAbMemberInfoList()){
					token = new StringTokenizer(mem.getAbMemberCode(), "_");
					System.out.println("number : "+token.nextToken()+"\n phone number : "+mem.getAbMemberPHNum()+"\n group name : "+this.groupInfoList.searchGroupCode(mem.getAbGroupCode()).getAbGroupName());
					System.out.println("==============================================================");
				}
				System.out.println("choose number => ");
				num = Integer.parseInt(sc.next());
				res = this.memInfoList.searchMemberCode("member_"+num);
				if(res!=null){
					System.out.println("name : "+res.getAbMemberName()+"\n phone number : "+res.getAbMemberPHNum()+"\n group name : "+this.groupInfoList.searchGroupCode(res.getAbGroupCode()).getAbGroupName()+" is deleted!");
					this.memInfoList.deleteMemberInfo(res);
				}
			}
		}else if(num==2){
			System.out.println("member phone number => ");
			phone=sc.next();
			res = ((ABMemberInfoDAOImpl)this.memInfoList).searchMemberPHNum(phone);
			if(res!=null){
				System.out.println("name : "+res.getAbMemberName()+"\n phone number : "+res.getAbMemberPHNum()+"\n group name : "+this.groupInfoList.searchGroupCode(res.getAbGroupCode()).getAbGroupName()+" is deleted!");
				this.memInfoList.deleteMemberInfo(res);
			}			
		}else if(num==3){
			System.out.println("group name => ");
			group=sc.next();
			gCode = this.groupInfoList.searchGroupName(group).getAbGroupCode();
			resList=((ABMemberInfoDAOImpl)this.memInfoList).searchMemberGCode(gCode);
			if(!resList.getAbMemberInfoList().isEmpty()){
				for(ABMemberInfo mem : resList.getAbMemberInfoList()){
					System.out.println("name : "+mem.getAbMemberName()+"\n phone number : "+mem.getAbMemberPHNum()+"\n group name : "+this.groupInfoList.searchGroupCode(mem.getAbGroupCode()).getAbGroupName());
					System.out.println("==============================================================\n delete");
					this.memInfoList.deleteMemberInfo(mem);
				}
			}
		}
	}
	
	public void process5(){
		String name,code,note;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("group Name : ");
		name = sc.next();
		if(this.groupInfoList.searchGroupName(name)!=null){
			System.out.println("group ("+name+") is already inserted!!!");
			return;
		}
		System.out.println("group note : ");
		note = sc.next();
		code=((ABMemberInfoDAOImpl)this.memInfoList).makeMemberCode();
		if(note==null){
			((ABGroupInfoDAOImpl)this.groupInfoList).insertGroupInfo(code, name);
		}else{
			((ABGroupInfoDAOImpl)this.groupInfoList).insertGroupInfo(code, name, note);
		}
	}
	
	public void process6(){
		//search group
		int num;
		String name,note;
		ABGroupInfoDAO resList = new ABGroupInfoDAOImpl();
		ABGroupInfo res = null;
		ABMemberInfoDAOImpl tmpList=new ABMemberInfoDAOImpl();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("search\n1.name\n2.note\n=>");
		num = Integer.parseInt(sc.next());
		if(num==1){
			System.out.println("member name => ");
			name=sc.next();
			res = this.groupInfoList.searchGroupName(name);
			if(res!=null)resList.insertGroupInfo(res);
		}else if(num==2){
			System.out.println("member phone number => ");
			note=sc.next();
			resList=((ABGroupInfoDAOImpl)this.groupInfoList).searchGroupNoteAll(note);				
		}
		if(!resList.getAbGroupInfoList().isEmpty()){
			for(ABGroupInfo gp : resList.getAbGroupInfoList()){
				System.out.println("name : "+gp.getAbGroupName()+"\n not : "+gp.getAbGroupNote());
				System.out.println("group member name : ");
				tmpList = ((ABMemberInfoDAOImpl)this.memInfoList).searchMemberGCode(gp.getAbGroupCode());
				if(!tmpList.getAbMemberInfoList().isEmpty()){
					for(ABMemberInfo memIn : tmpList.getAbMemberInfoList()){
						System.out.println("     "+memIn.getAbMemberName()+" , ");
					}
				}
				
				System.out.println("==============================================================");
			}
		}
	}
	public void process7(){
		//search member
		int num;
		String name,code,note,group;
		ABGroupInfoDAOImpl resList = new ABGroupInfoDAOImpl();
		ABGroupInfo res = null;
		StringTokenizer token;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("group name => ");
		name=sc.next();
		res=this.groupInfoList.searchGroupName(name);
		if(res!=null){
			System.out.println("name : "+res.getAbGroupName()+"\n not : "+res.getAbGroupNote());
			System.out.println("write member info (name phoneNumber (group)) : ");
			name=sc.next();
			if(this.groupInfoList.searchGroupName(name)!=null){
				System.out.println("group ("+name+") is already inserted!!!");
				return;
			}
			note=sc.next();
			if(note==null)note = "no note";
			this.groupInfoList.updateGroupInfo(res, name, note); 
		}
	}
	public void process8(){
		int num;
		String name,code,phone,group,gCode;
		ABGroupInfoDAOImpl resList = new ABGroupInfoDAOImpl();
		ABGroupInfo res = null;
		StringTokenizer token;
		ABMemberInfoDAOImpl tmpList=new ABMemberInfoDAOImpl();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("group name => ");
		name=sc.next();
		res=this.groupInfoList.searchGroupName(name);
		if(res!=null){
			System.out.println("name : "+res.getAbGroupName()+"\n not : "+res.getAbGroupNote());
			System.out.println("write member info (name phoneNumber (group)) : ");
			name=sc.next();
			tmpList = ((ABMemberInfoDAOImpl)this.memInfoList).searchMemberGCode(res.getAbGroupCode());
			if(!tmpList.getAbMemberInfoList().isEmpty()){
				for(ABMemberInfo memIn : tmpList.getAbMemberInfoList()){
					System.out.println("     "+memIn.getAbMemberName()+" , ");
					this.memInfoList.updateMemberInfo(memIn, memIn.getAbMemberName(), memIn.getAbMemberPHNum(), "group_0");
				}
			}
			System.out.println("=============================================================="); 
		}
	}
}
