package debugging;

public class debuggings {
	public static void main1(String[] args) {
		System.out.println("inside main1");
		System.out.println(args[0]);
		System.out.println("after main1");
		System.out.println("after1 main1");
	}
public static void main(String[] args) {
	System.out.println("inside main");
	String technologieString[] = {"java","sql"};
	String technologieString1[] = null;
	technologieString1 = new String[2];
	technologieString1[0] = "mongodb";
	technologieString1[1]= "js";
    System.out.println(technologieString1[1]);
    System.out.println(technologieString1[2]);
	//main is the calling or caller function
	//main1 is the called function
	main1(technologieString);
	System.out.println("completed main");
	System.out.println("placeholder");
	System.out.println("placeholder");
	System.out.println("placeholder");
	main1(technologieString);
	System.out.println("completed main");
}

//public static void main2(String[] args) {
//	System.out.println("inside main2");
//	System.out.println(args[0]);
//	System.out.println("after main2");
//}
}
