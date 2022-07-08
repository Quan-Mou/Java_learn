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
		customerList.addCustomer(new Customer("卫庄",'男',20,"18878342322","2312038309@qq.com"));
	}
	// 显示主菜单
	public void enterMainMenu() {
		boolean isExit = true;
		while (isExit) {
			System.out.println("-----------------客户信息管理软件-----------------");
			System.out.println("\t\t 1 添加客户");
			System.out.println("\t\t 2 修改客户");
			System.out.println("\t\t 3 删除客户");
			System.out.println("\t\t 4 客户列表");
			System.out.println("\t\t 5 退     出");
			System.out.println();
			System.out.print("\t\t 请选择(1-5) ：");
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
					System.out.print("请确认是否退出(Y/N)：");
					char please =  CMUtility.readConfirmSelection();
					if (please != 'Y') {
						break;
					}
					isExit = false;
			}
		}
	}
	// 下面四个方法仅供enterMainMenu使用
	private void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");
		System.out.print("姓名：");
		String name = CMUtility.readString(4);
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		System.out.print("电话：");
		String phone = CMUtility.readString(15);
		System.out.print("邮箱：");
		String email = CMUtility.readString(15);
		customerList.addCustomer(new Customer(name,gender,age,phone,email));
	}
	
	private void modifyCustomer() {
		System.out.print("请选择待修改客户编号(-1退出)：");
		int selectDel = CMUtility.readInt();
		selectDel-=1;
		if(selectDel > customerList.getTotal() || selectDel < 0) {
			
			System.out.println("无法找到指定客户！");
		} else {
			Customer cust  = customerList.getCustomer(selectDel);
			System.out.print("姓名(" + cust.getName() + ")：");
			String name = CMUtility.readString(4, cust.getName());

			System.out.print("性别(" + cust.getGender() + ")：");
			char gender = CMUtility.readChar(cust.getGender());

			System.out.print("年龄(" + cust.getAge() + ")：");
			int age = CMUtility.readInt(cust.getAge());

			System.out.print("电话(" + cust.getPhone() + ")：");
			String phone = CMUtility.readString(15, cust.getPhone());

			System.out.print("邮箱(" + cust.getEmail() + ")：");
			String email = CMUtility.readString(15, cust.getEmail());
			boolean isModif = customerList.replaceCustomer(selectDel, new Customer(name,gender,age,phone,email));
			if (isModif) {
				System.out.println("修改成功");
			} else {
				System.out.println("修改失败");
			}
		}
	}
	private void deleteCustomer() {
		System.out.println("---------------------删除客户---------------------");
		System.out.println("请选择待删除客户编号(-1退出)：");
		int isDel = CMUtility.readInt();
		System.out.print("确认是否删除(Y/N)");
		char notarizeDel = CMUtility.readConfirmSelection();
	if (notarizeDel != 'Y') {
		return;
	} else {
		boolean delRet = customerList.deleteCustomer(isDel);
		if(delRet) {
			System.out.println("删除成功");
			return;
		}
		System.out.println("删除失败，索引无效");
		}
	}
	
	
	private void listAllCustomers() {
		Customer allCust[] = customerList.getAllCustomers();
		System.out.println("---------------------------客户列表---------------------------");
		
		if (customerList.getTotal() < 0) {
			System.out.println("没有客户记录");
		} else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			for(int i = 0; i < customerList.getTotal();i++) {
				Customer tmpAllCust = allCust[i];
				
				System.out.println((i+1) + "\t" + tmpAllCust.getName() + "\t" + tmpAllCust.getGender() +
						"\t" + tmpAllCust.getAge() + "\t" + tmpAllCust.getPhone() + "\t\t" + tmpAllCust.getEmail());
			}
		}
		System.out.println("---------------------------客户列表完成-------------------------");
		
	}
	
}
