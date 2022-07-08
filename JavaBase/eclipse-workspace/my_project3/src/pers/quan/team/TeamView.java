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
				System.out.print("1-�Ŷ��б�  2-�����Ŷӳ�Ա  3-ɾ���Ŷӳ�Ա 4-�˳�   ��ѡ��(1-4)��");
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
						System.out.print("ȷ���Ƿ��˳�(Y/N):");
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
		 System.out.println("---------------------------------�����Ŷӵ�������----------------------------------");
			System.out.println("ID"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"ְλ"+"\t"+"״̬"+"\t"+"����"+"\t"+"��Ʊ"+"\t"+"�����豸");
			for(int i = 0;i<e.length;i++) {
				System.out.println(e[i]);
			}
	 }
	 
	 public void listAllEmployees() {
		 Programmer[] all = teamSvc.getTeam();
			System.out.println("--------------------�Ŷӳ�Ա�б�---------------------");
			if (all.length == 0) {
				System.out.println("û�г�Ա");
			} else {
				System.out.println("TID/ID\t����\t����\t����\tְλ\t����\t��Ʊ");
				for(int i = 0; i<teamSvc.getTotal();i++) {
					System.out.println(all[i].getMemberId()+"/"+all[i]);
				}
			}
			System.out.println("-----------------------------------------------------");
	 }
	 
	 public void addMember() {
		 System.out.println("---------------------���ӳ�Ա---------------------");
		 System.out.print("������Ҫ���ӵ�Ա��ID��");
		 int id =TSUtility.readInt();
		 try {
			 Employee e = listSvc.getEmployee(id);
			 teamSvc.addMember(e);
			 System.out.println("���ӳɹ�");
			 TSUtility.readReturn();
		 } catch(TeamException e) {
			 System.out.println(e.getMessage());
			 TSUtility.readReturn();
		 }
		 
		 
//		 System.out.println("���ӳ�Ա");
	 }
	 public void deleteMember() {
		 System.out.print("������Ҫɾ��Ա����TID��");
		 int inputId = TSUtility.readInt();
		 try {
			 teamSvc.removeMember(inputId);
			 System.out.println("ɾ���ɹ���");
		 } catch(TeamException e) {
			 System.out.println(e.getMessage());
		 }
	 }
}