import java.util.List;
import java.util.Random;

public class Fun {
	int test=-1;
	float v;
	int ar[]=new int[3];
	Random r=new Random();


	
	
	public void chromosome(List<Float> value, int li) {
		
		for(int i=0;i<li;i++) {
			value.add(r.nextFloat());
		
		}
		
		for(int y=0;y<li;y++) {
			System.out.println("Before :"+value.get(y));
		}
		
		//System.out.println(value.size());
	
		for (int j = 0; j<ar.length ; j++) {
			int k=r.nextInt(li);
			 if(k>=0 && k<value.size()) {
				 if(test!=k) {
				 ar[j] = k;
				 test=k;
				 }
				 else {
					 j=0;
				 }
			 }
	          }
		
for(int y=0;y<3;y++) {
			
			System.out.println(ar[y]);
		}
		
		
			//int kk=0;
			float cp1=0.0f;
		for(int i=0;i<li;i++) {
			
			if(i==ar[0]) {
				cp1=r.nextFloat();
				value.remove(i);
				value.add(i, cp1);
				
			}
			else if(i==ar[1]) {
				cp1=r.nextFloat();
				value.remove(i);
				value.add(i, cp1);
				
			}
			else if(i==ar[2]) {
				cp1=r.nextFloat();
				value.remove(i);
				value.add(i, cp1);
				
			}
						
}

		for(int y=0;y<li;y++) {
			
			System.out.println("After :"+value.get(y));
		}
}
	public void crossover(int a1)
	{
		
		float ary1[]=new float[a1];
		float ary2[]=new float[a1];
		float c3[]=new float[a1];
		float c4[]=new float[a1];
		
		for(int i=0;i<a1;i++) {
			ary1[i]=r.nextFloat();
			ary2[i]=r.nextFloat();
		
		}
		
				
		int z=r.nextInt(a1);
		System.out.println(z);
		
		for(int i=0;i<z;i++) {
			c3[i]=ary1[i];
		}
		
		for(int i=z;i<a1;i++) {
			c3[i]=ary2[i];
		}
		
		for(int i=0;i<z;i++) {
			c4[i]=ary2[i];
		}
		
		for(int i=z;i<a1;i++) {
			c4[i]=ary1[i];
		
		}
		
		for(int i=0;i<a1;i++) {
			System.out.println("ary 1 :"+ary1[i]);
		
		}
		for(int i=0;i<a1;i++) {
			System.out.println("ary 2 :"+ary2[i]);
		
		}
		for(int i=0;i<a1;i++) {
			System.out.println("c3 :"+c3[i]);
		
		}
		
		for(int i=0;i<a1;i++) {
			System.out.println("c4 :"+c4[i]);
		
		}
		
		
	}
	
}