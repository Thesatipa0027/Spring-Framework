
public class MyFirstClass {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println();

		int m=1;
		while(m<=7) {
			int j=1;
			while(j<=m) {
				System.out.print(m);
				j++;
			}
			m++;
			System.out.println();
		}

		System.out.println();
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}

		System.out.println();
		
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=8;j++) {
				if(j%2==0)
					System.out.print("B"+" ");
				else
					System.out.print("W"+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		int [] nums=new int[1000];
		for(int i=1;i<=1000;i++) {
			nums[i-1]=i;
			System.out.print(nums[i-1]+"\t");
			if(i%10==0)
				System.out.println();
		}
		
		System.out.println();
		int [] nums1=new int[10];
		for(int i=1;i<=10;i++) {
			nums1[i-1]=i;
			System.out.print(nums1[i-1]*19);
				System.out.println();
		}
		
		System.out.println();
		int a=0;
		int b=1;
		int c=1;
		for(int i=0;i<10;i++) {
			System.out.print(a+" ");
			
			a=b;
			b=c;
			c=b+a;
		}
		
		System.out.println();
		String [] [] arr= {
				{"1","Monday"},
				{"2","Tuesday"},
				{"3","Wednesday"},
				{"4","Thursday"},
				{"5","Friday"},
				{"6","Saturday"},
				{"7","Sunday"}
		};
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
