import java.util.*;
import java.text.*;
public class AI {
			
	
public static void main(String[] args) {

	System.out.println("Enter Size of Array");
	
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	int i=scan.nextInt();
	
	float arr[]=new float[i];

	
	
	
//System.out.println(value.get(1));
		 
	 AI obj=new AI();
	 obj.zakharov(arr);		//Calling Functions
	 obj.rastrigin(arr);
	 obj.griewank(arr);
	 obj.styblinski(arr);
	
	 System.out.println("Enter Size of List");
	 int li=scan.nextInt();
	 	List <Float> value=new ArrayList<>(li);
	 

	Fun f=new Fun();
	 f.chromosome(value,li);
	 
	 
	 	//Cross Over
	 int a1;
	 
	 System.out.println("Enter Size of Arrays");
	 System.out.println("Array 1 & 2 :");
	 a1=scan.nextInt();
	 
	 f.crossover(a1);


}	

void zakharov(float arr[]) {                     //Zakharoz Function
	DecimalFormat df=new DecimalFormat("0.0000");
	Random rd = new Random();
	 for (int j = 0; j<arr.length ; j++) {
		 if(rd.nextFloat()>=-5 && rd.nextFloat()<=10) {
         arr[j] = rd.nextFloat(); 
		 }
          }

	int g=arr.length;
	float sum=0,sum1=0,sum2=0,sum3=0;
	
	for(int jj=0;jj<g;jj++) {
		
		sum1=sum1+(arr[jj]*arr[jj]);
		sum2=sum2+(0.5f*(jj+1)*arr[jj]);
		sum3=sum3+(0.5f*(jj+1)*arr[jj]);
		}
	sum=sum1+(sum2*sum2)+(sum3*sum3*sum3*sum3);
	
System.out.println("Zakharov : "+df.format(sum));
}

 
void rastrigin(float arr[]) {                   //Rastrigin Function
	DecimalFormat df=new DecimalFormat("0.0000");
	Random rd = new Random();
	 for (int j = 0; j<arr.length ; j++) {
		 if(rd.nextFloat()>=-5.12 && rd.nextFloat()<=5.12) {
        arr[j] = rd.nextFloat(); 
		 }
         }
    
	 int g=arr.length;						
	float sum=0,sum1=0;
	
	for(int jj=0;jj<g;jj++) {
		
		float fd=(float) (2*3.14*arr[jj]);
		fd=(float) Math.toRadians(fd);
		sum1=(float) (sum1+((arr[jj]*arr[jj])-10*Math.cos(fd)));
		
		}

	sum=10*g+sum1;
	
System.out.println("Rastrigin : "+df.format(sum));
}


void griewank(float arr[]) {                          //Griewank Function
	DecimalFormat df=new DecimalFormat("0.0000");
	Random rd = new Random();
	 for (int j = 0; j<arr.length ; j++) {
		 if(rd.nextFloat()>=-600 && rd.nextFloat()<=600) {
        arr[j] = rd.nextFloat(); 
		 }
         }
    
	 int g=arr.length;						
	float sum=0,sum1=0,prod=1;
	
	for(int jj=0;jj<g;jj++) {
		
		sum1=sum1+((arr[jj]*arr[jj])/4000);
		
		float fd=(float) (arr[jj]/Math.sqrt(jj+1));
		fd=(float) Math.toRadians(fd);
		prod=(float) (prod*(Math.cos(fd)));
		
		}

	sum=sum1-prod+1;
	
System.out.println("Griewank : "+df.format(sum));
}


void styblinski(float arr[]) {         //Styblinski-Tang Function
	DecimalFormat df=new DecimalFormat("0.0000");
	Random rd = new Random();
	 for (int j = 0; j<arr.length ; j++) {
		 if(rd.nextFloat()>=-5 && rd.nextFloat()<=5) {
         arr[j] = rd.nextFloat(); 
		 }
         
	 }

	int g=arr.length;
	
	float sum=0,sum1=0,x;
	
	for(int jj=0;jj<g;jj++) {
		x=arr[jj]*arr[jj];
		sum1=sum1+((x*x)-(16*x)+(5*arr[jj]));
		}
	sum=0.5f*sum1;
	
System.out.println("Styblinski : "+df.format(sum));
}


}
