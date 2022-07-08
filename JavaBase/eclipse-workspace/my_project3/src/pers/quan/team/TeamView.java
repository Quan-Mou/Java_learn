package pers.quan.team;

import pers.quan.customException.TeamException;
import pers.quan.domain.Employee;
import pers.quan.domain.Programmer;
import pers.quan.service.NameListService;
import pers.quan.service.TeamService;
import pers.quan.util.TSUtility;

public class TeamView {
	
	private NameListService listSvc = new NameListService(); 
	private TeamService teamSvc = new TeamService();
	
	public static void main(String[] args) {
		TeamView view = new TeamView();
		view.enterMainMenu();
		
	}
	
	public TeamView() {
		
	}

	
	
	 public void enterMainMenu() {
		 boolean isFlag = true;
		 int input = 0;
		
		do {
			if (input != '1') {
				getAllEmployees();
			}
				System.out.println("-----------------------------------------------------------------------------------");
				System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
				input = TSUtility.readMenuSelection();
				switch(input) {
					case '1':
						listAllEmployees();
					break;
					case '2':
						addMember();
					break;
					case '3':
						deleteMember();
					break;
					case '4':
						System.out.print("确认是否退出(Y/N):");
						char isExit = TSUtility.readConfirmSelection();
						if (isExit == 'Y') {
							return;
						}
					break;
				}
		} while (isFlag);
	}
	 
	 public void getAllEmployees() {
		 Employee[] e = listSvc.getAllEmployees();
		 System.out.println("---------------------------------开发团队调度软件----------------------------------");
			System.out.println("ID"+"\t"+"姓名"+"\t"+"年龄"+"\t"+"工资"+"\t"+"职位"+"\t"+"状态"+"\t"+"奖金"+"\t"+"股票"+"\t"+"领用设备");
			for(int i = 0;i<e.length;i++) {
				System.out.println(e[i]);
			}
	 }
	 
	 public void listAllEmployees() {
		 Programmer[] all = teamSvc.getTeam();
			System.out.println("--------------------团队成员列表---------------------");
			if (all.length == 0) {
				System.out.println("没有成员");
			} else {
				System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
				for(int i = 0; i<teamSvc.getTotal();i++) {
					System.out.println(all[i].getMemberId()+"/"+all[i]);
				}
			}
			System.out.println("-----------------------------------------------------");
	 }
	 
	 public void addMember() {
		 System.out.println("---------------------添加成员---------------------");
		 System.out.print("请输入要添加的员工ID：");
		 int id =TSUtility.readInt();
		 try {
			 Employee e = listSvc.getEmployee(id);
			 teamSvc.addMember(e);
			 System.out.println("添加成功");
			 TSUtility.readReturn();
		 } catch(TeamException e) {
			 System.out.println(e.getMessage());
			 TSUtility.readReturn();
		 }
		 
		 
//		 System.out.println("添加成员");
	 }
	 public void deleteMember() {
		 System.out.print("请输入要删除员工的TID：");
		 int inputId = TSUtility.readInt();
		 try {
			 teamSvc.removeMember(inputId);
			 System.out.println("删除成功！");
		 } catch(TeamException e) {
			 System.out.println(e.getMessage());
		 }
	 }
}
