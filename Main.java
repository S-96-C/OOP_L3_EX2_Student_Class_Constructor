public class Main{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.name = "Kamal";
		s1.dit = "IT2233";
		s1.address = "Colombo";
		
		Student s2 = new Student();
		s2.name = "Nimal";
		s2.dit = "IT4455";
		s2.address = "Negambo";
		
		Student s3 = new Student("Sunil", "IT8899", "Badulla");
    Student s4 = new Student("Amal", "IT1092", "Kandy");
		
		System.out.println("Name      : " + s1.name + "\nDIT Number: " + s1.dit + "\nAddress   : " + s1.address + "\n");
		System.out.println("Name      : " + s2.name + "\nDIT Number: " + s2.dit + "\nAddress   : " + s2.address + "\n");
		System.out.println("Name      : " + s3.name + "\nDIT Number: " + s3.dit + "\nAddress   : " + s3.address + "\n");
    System.out.println("Name      : " + s4.name + "\nDIT Number: " + s4.dit + "\nAddress   : " + s4.address + "\n");
	}

}
