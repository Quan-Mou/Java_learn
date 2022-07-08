package pers.quan.service;

import java.util.Arrays;

//import com.atguigu.team.service.Status;

import pers.quan.customException.TeamException;
import pers.quan.domain.Architect;
import pers.quan.domain.Designer;
import pers.quan.domain.Employee;
import pers.quan.domain.Programmer;
import pers.quan.util.Data;
import pers.quan.util.TSUtility;
import pers.quan.service.*;

public class TeamService {
	private  int counter = 1; // �����Ŷ�ΨһID
	final int MAX_MEMBER = 5; // �����Ŷ�����Ա��
	Programmer[] team = new Programmer[ MAX_MEMBER]; //��ǰ�Ŷ��еĸ���Ա����
	private int total = 0; // ��¼�Ŷӳ�Ա��ʵ������
	
	
	// ���ص�ǰ�����Ŷӵ����ж���
	public Programmer[] getTeam() {
		Programmer[] team = new Programmer[total];
		for(int i = 0;i<total;i++) {
			team[i] = this.team[i] ; 
		}
		return team;
	}
	
	// ���ӳɆT
	public void addMember(Employee e) throws TeamException{
		
		if (total>=MAX_MEMBER) {
			throw new TeamException("��Ա�������޷�����");
		}
		if (!(e instanceof Programmer)) {
			throw new TeamException("�ó�Ա���ǿ�����Ա���޷�����");
		}
		
		// ���뵽����˵������Ա��û����ͬʱҲ�ǿ�����Ա
		
		Programmer p = (Programmer)e;
		
		Programmer[] all = getTeam();
		
		
//		�ǿ����Ŷ��б�ʵ�����������������ݱȽ�
		for(int i = 0;i<total;i++) {
			
			if ( team[i].getId() == p.getId()) {
				throw new TeamException("��Ա�����ڱ��Ŷ���");
			}
		}
		
		if("VOCATION".equals(p.getStatus())) {
			throw new TeamException("�ó�Ա�����ݼ٣��޷�����");
		}

		int jgs = 0,sjs = 0,cxy = 0;
		for(int i =0;i<total;i++) {
			if(team[i] instanceof Architect) {
				System.out.println("���ӵ��Ǽܹ�ʦ");
				jgs++;
			}
			else if (team[i] instanceof Designer) {
				System.out.println("���ӵ������ʦ");
				sjs++;
			}
			else if (team[i] instanceof Programmer){
				System.out.println("���ӵ��ǳ���Ա");
				cxy++;
			}
		}
		
		if (p instanceof Architect) {
			if (jgs >= 1) {
				throw new TeamException("�Ŷ�������ֻ����һ���ܹ�ʦ");
			}
		} else if (p instanceof Designer) {
			if (sjs >= 2) {
				throw new TeamException("�Ŷ�������ֻ�����������ʦ");
			}
		} else if (p  instanceof Programmer) {
			if (cxy >= 3) {
				throw new TeamException("�Ŷ�������ֻ������������Ա");		
			}
		}
		
		p.setStatus(Status.BUSY); // ״̬��Ϊ���뿪���Ŷ�
		p.setMemberId(counter++);
		System.out.println(p);
		this.team[total] = p;
		total++;
	}
	
	// ɾ����Ա
	public void removeMember(int memberId) throws TeamException{

		
		for(int i = 0;i<total;i++) {
			// �ҵ����޸�״̬
			if (team[i].getMemberId() == memberId) {
				team[i].setStatus(Status.FREE);
				break;	
			}
		}
		
		for(int i = 0;i<total;i++) {
			
		
			team[i] = team[i+1];
			total--;
			team[total] = null;
			return;
		}
		throw new TeamException("�Ҳ���ָ��memberId��Ա����ɾ��ʧ��");
		
		
//		��������ȷ�Ĵ��룺
//		  int n = 0;
//	        //�ҵ�ָ��memberId��Ա������ɾ��
//	        for (; n < total; n++) {
//	            if (team[n].getMemberId() == memberId) {
//	                team[n].setStatus(Status.FREE);
//	                break;
//	            }
//	        }
//	        //�������һ�飬���Ҳ��������쳣
//	        if (n == total)
//	            throw new TeamException("�Ҳ����ó�Ա���޷�ɾ��");
//	        //�����Ԫ�ظ���ǰ���Ԫ��
//	        for (int i = n + 1; i < total; i++) {
//	            team[i - 1] = team[i];
//	        }
//	        team[--total] = null;
		
	}

	public  int getCounter() {
		return counter;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}