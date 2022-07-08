package customerView;
import customerList.CustomerList;
import util.CMUtility;
import customer.Customer;
public class CustomerView {
	CustomerList customerList = new CustomerList(10);
	
	public static void main(String[] args) {
		CustomerView custView = new CustomerView();
		custView.enterMainMenu();
	}
	CustomerView() {
		customerList.addCustomer(new Customer("��ׯ",'��',20,"18878342322","2312038309@qq.com"));
	}
	// ��ʾ���˵�
	public void enterMainMenu() {
		boolean isExit = true;
		while (isExit) {
			System.out.println("-----------------�ͻ���Ϣ�������-----------------");
			System.out.println("\t\t 1 ��ӿͻ�");
			System.out.println("\t\t 2 �޸Ŀͻ�");
			System.out.println("\t\t 3 ɾ���ͻ�");
			System.out.println("\t\t 4 �ͻ��б�");
			System.out.println("\t\t 5 ��     ��");
			System.out.println();
			System.out.print("\t\t ��ѡ��(1-5) ��");
			char UserInput = CMUtility.readMenuSelection();
			switch(UserInput) {
				case '1':
					addNewCustomer();
					break;
				case '2':
					modifyCustomer();
					break;
				case '3':
					deleteCustomer();
					break;
				case '4':
					listAllCustomers();
					break;
				case '5':
					System.out.print("��ȷ���Ƿ��˳�(Y/N)��");
					char please =  CMUtility.readConfirmSelection();
					if (please != 'Y') {
						break;
					}
					isExit = false;
			}
		}
	}
	// �����ĸ���������enterMainMenuʹ��
	private void addNewCustomer() {
		System.out.println("---------------------��ӿͻ�---------------------");
		System.out.print("������");
		String name = CMUtility.readString(4);
		System.out.print("�Ա�");
		char gender = CMUtility.readChar();
		System.out.print("���䣺");
		int age = CMUtility.readInt();
		System.out.print("�绰��");
		String phone = CMUtility.readString(15);
		System.out.print("���䣺");
		String email = CMUtility.readString(15);
		customerList.addCustomer(new Customer(name,gender,age,phone,email));
	}
	
	private void modifyCustomer() {
		System.out.print("��ѡ����޸Ŀͻ����(-1�˳�)��");
		int selectDel = CMUtility.readInt();
		selectDel-=1;
		if(selectDel > customerList.getTotal() || selectDel < 0) {
			
			System.out.println("�޷��ҵ�ָ���ͻ���");
		} else {
			Customer cust  = customerList.getCustomer(selectDel);
			System.out.print("����(" + cust.getName() + ")��");
			String name = CMUtility.readString(4, cust.getName());

			System.out.print("�Ա�(" + cust.getGender() + ")��");
			char gender = CMUtility.readChar(cust.getGender());

			System.out.print("����(" + cust.getAge() + ")��");
			int age = CMUtility.readInt(cust.getAge());

			System.out.print("�绰(" + cust.getPhone() + ")��");
			String phone = CMUtility.readString(15, cust.getPhone());

			System.out.print("����(" + cust.getEmail() + ")��");
			String email = CMUtility.readString(15, cust.getEmail());
			boolean isModif = customerList.replaceCustomer(selectDel, new Customer(name,gender,age,phone,email));
			if (isModif) {
				System.out.println("�޸ĳɹ�");
			} else {
				System.out.println("�޸�ʧ��");
			}
		}
	}
	private void deleteCustomer() {
		System.out.println("---------------------ɾ���ͻ�---------------------");
		System.out.println("��ѡ���ɾ���ͻ����(-1�˳�)��");
		int isDel = CMUtility.readInt();
		System.out.print("ȷ���Ƿ�ɾ��(Y/N)");
		char notarizeDel = CMUtility.readConfirmSelection();
	if (notarizeDel != 'Y') {
		return;
	} else {
		boolean delRet = customerList.deleteCustomer(isDel);
		if(delRet) {
			System.out.println("ɾ���ɹ�");
			return;
		}
		System.out.println("ɾ��ʧ�ܣ�������Ч");
		}
	}
	
	
	private void listAllCustomers() {
		Customer allCust[] = customerList.getAllCustomers();
		System.out.println("---------------------------�ͻ��б�---------------------------");
		
		if (customerList.getTotal() < 0) {
			System.out.println("û�пͻ���¼");
		} else {
			System.out.println("���\t����\t�Ա�\t����\t�绰\t\t����");
			for(int i = 0; i < customerList.getTotal();i++) {
				Customer tmpAllCust = allCust[i];
				
				System.out.println((i+1) + "\t" + tmpAllCust.getName() + "\t" + tmpAllCust.getGender() +
						"\t" + tmpAllCust.getAge() + "\t" + tmpAllCust.getPhone() + "\t\t" + tmpAllCust.getEmail());
			}
		}
		System.out.println("---------------------------�ͻ��б����-------------------------");
		
	}
	
}
