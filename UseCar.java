package forloop3;

public class UseCar {
	public static void main(String[]args) {
		
		Car car1=new Car();
		car1.brand="rollsroyce";
		car1.price=200000;
		car1.colour="blue";
		car1.rating=8.5f;
		car1.model="AXI";
		
		Car car2=new Car();
		car2.brand="innovacar";
		car2.price=300000;
		car2.colour="silver";
		car2.rating=9.5f;
		car2.model="X20";
		
		Car car3=new Car();
		car3.brand="suzuki";
		car3.price=400000;
		car3.colour="white";
		car3.rating=8.25f;
		car3.model="baleno";
		
		Car car4=new Car();
		car4.brand="ford";
		car4.price=600000;
		car4.colour="grey";
		car4.rating=7.5f;
		car4.model="ray";
		
		Car car5=new Car();
		car5.brand="hyundai";
		car5.price=800000;
		car5.colour="blue";
		car5.rating=7.5f;
		car5.model="i20";
		
		
		Car[] cars= {car1,car2,car3,car4,car5};
		int max=cars[0].brand.length();
		String maxbrand="";
		String maxcolour="";
		String maxmodel="";
		int maxprice=cars[1].price;
		float maxrating=cars[1].rating;
		//for(int i=0;i<cars.length;i++) {
		//	if(cars[i].price>max) {
				//max=cars[i].price;
				//maxbrand=cars[i].brand;
				//maxcolour=cars[i].colour;
				//maxmodel=cars[i].model;
				//maxrating=cars[i].rating;
			//}
			
		//}
		//System.out.println(max);
		//System.out.println(maxbrand);
		//System.out.println(maxcolour);
		//System.out.println(maxmodel);
		//System.out.println(maxrating);
		
		//for(int i=0;i<cars.length;i++) {
			///if(cars[i].brand.length()>=max) {
				//max=cars[i].brand.length();
				//maxbrand=cars[i].brand;
				//maxcolour=cars[i].colour;
				//maxmodel=cars[i].model;
				//maxrating=cars[i].rating;
				//maxrating=cars[i].price;
			//}
		//}
		
		//System.out.println(maxbrand);
		//System.out.println(maxcolour);
		//System.out.println(maxmodel);
		//System.out.println(maxrating);
		//System.out.println(maxprice);
		int maxlength=cars[0].brand.length();
		Car max1=null;
		for(int i=0;i<cars.length;i++) {
			if(cars[i].brand.length()>=maxlength) {
				maxlength=cars[i].brand.length();
				max1=cars[i];
				
				
			}
		}
		System.out.println(max1.brand);
		
		
		
	}

}
