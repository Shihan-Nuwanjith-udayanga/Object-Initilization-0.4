class Test{
	int a=100;
	
	{
		b=200; 
		System.out.println("Instance Block..");
	}
	Test(){
		c=1000;
	}
	int b=500;
	Test(int i){
		
	}
	Test(int i, int j){
		a=i;
		b=j;
	}
	int c=400;
}	
class Example{
	public static void main(String args[]){
		Test t1=new Test();
		System.out.println("a of t1  : "+t1.a); 
		System.out.println("b of t1  : "+t1.b); 
		System.out.println("c of t1  : "+t1.c); 
		
		Test t2=new Test(1);
		System.out.println("a of t2  : "+t2.a); 
		System.out.println("b of t2  : "+t2.b); 
		System.out.println("c of t2  : "+t2.c); 
		
		Test t3=new Test(10,20);
		System.out.println("a of t3  : "+t3.a); 
		System.out.println("b of t3  : "+t3.b); 
		System.out.println("c of t3  : "+t3.c); 
	}
}
