package forloop3;

public class UsePen {
	public static void main(String[]args) {
		Pen p1=new Pen();
		p1.brand="reynolds";
		p1.price=5;
		p1.colour="blue";
		
		Pen p2=new Pen();
		p2.brand="cello";
		p2.price=10;
		p2.colour="black";
		
		Pen p3=new Pen();
		p3.brand="rortio";
		p3.price=15;
		p3.colour="red";
		
		Pen p4=new Pen();
		p4.brand="parker";
		p4.price=50;
		p4.colour="blue";
		
		Pen[] pens= {p1,p2,p3,p4};
		//for(int i=0;i<pens.length;i++) {
		
		
		//System.out.println(pens[i].brand+","+pens[i].price+","+pens[i].colour);
		//}
		for(int i=0;i<pens.length;i++) {
			if(i%2==0) {
				System.out.println(pens[i].brand+","+pens[i].price+","+pens[i].colour);
			}
		}
		
		
		
	}

}
