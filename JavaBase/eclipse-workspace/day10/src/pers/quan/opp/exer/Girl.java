package pers.quan.opp.exer;

public class Girl {
  private String name;
  int age;
  public void setName(String name) {
	  this.name = name;
  }
  public String getName() {
	  return name;
  }
  public void marry(Boy boy) {
	  System.out.println("��Ҳ��޸�"+boy.getName());
  }
  public void compare(Girl girl) {
	  if (this.age > girl.age) {
		  System.out.println(this.name + "��");
	  } else if (this.age < girl.age) {
		  System.out.println(this.name + "С");
	  } else {
		  System.out.println("һ����");
	  }
  }
  Girl() {
	  
  }
  Girl(String name) {
	  this.name = name;
  }
  Girl(String name,int age) {
	  this.name = name;
	  this.age = age;
  }
}
