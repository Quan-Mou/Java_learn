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
	  System.out.println("我也想嫁给"+boy.getName());
  }
  public void compare(Girl girl) {
	  if (this.age > girl.age) {
		  System.out.println(this.name + "大");
	  } else if (this.age < girl.age) {
		  System.out.println(this.name + "小");
	  } else {
		  System.out.println("一样大");
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
