package Day1;

public class Student {
	
	int id;
	String name;
    static String university= "tekarch";
	
	
	Student(int id, String name){
		this.id=id;
		this.name=name;	
	}
	void display() {
		System.out.println(id+" "+name+"  "+university);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student s1 = new Student(101,"anu");
 Student s2 = new Student(102, "silky");
 s1.display();
 s2.display();
	}
 
 
 public String getName() {
	 return name;
	 
 }
 //public String setName() {
	//this.name = name;
	 	
	}


