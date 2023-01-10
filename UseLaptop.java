package forloop3;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop laptop1=new Laptop();
		laptop1.brand="dell";
		laptop1.price=60000;
		laptop1.colour="grey";
		laptop1.model="edu";
		laptop1.ram=8;
		
		Laptop laptop2=new Laptop();
		laptop2.brand="hp";
		laptop2.price=40000;
		laptop2.colour="black";
		laptop2.model="AXI";
		laptop2.ram=4;
		
		Laptop laptop3=new Laptop();
		laptop3.brand="lenovo";
		laptop3.price=30000;
		laptop3.colour="white";
		laptop3.model="ray";
		laptop3.ram=8;
		
		Laptop laptop4= new Laptop();
		laptop4.brand="azus";
		laptop4.price=45000;
		laptop4.colour="silver";
		laptop4.model="h22";
		laptop4.ram=8;
		
		Laptop laptop5=new Laptop();
		laptop5.brand="apple";
		laptop5.price=100000;
		laptop5.colour="red";
		laptop5.model="xvb";
		laptop5.ram=8;
		
		Laptop[] laptops= {laptop1,laptop2,laptop3,laptop4,laptop5};
		//for(Laptop a:laptops) {
			//System.out.println(a.brand+" "+a.price+" "+a.colour+" "+a.model+" "+a.ram);
		//}
		
		//for(Laptop a:laptops) {
			//if(a.price>50000) {
				//System.out.println(a.brand+" "+a.price+" "+a.colour+" "+a.model+" "+a.ram);
			//}
		//}
		for(Laptop a:laptops) {
			if(a.brand.length()%2==0) {
				System.out.println(a.brand.toUpperCase());
				System.out.println("ggggg");
			}
		}
		
	}

}
