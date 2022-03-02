import java.util.ArrayList;
import java.util.List;

public class ListCheck {
		public static void main(String[] args) {
			List<Student> list = new ArrayList();
			List<Student> list1 = new ArrayList();
			
			list.add(new Student("Vijay",21));
			list.add(new Student("Lingu",26));
			list.add(new Student("Sati",23));
			
			list1.add(new Student("Vijay",21));
			list1.add(new Student("Lingu",265));
			list1.add(new Student("Satii",24));
			List<Integer> index = new ArrayList();
			
			for(Student list11:list) 
			{
				for(Student list21:list1) 
				{
					if(list11.name.equals(list21.name))
					{
						index.add(list.indexOf(list11));
					}
				}
			}
//			for(Student ii:list) {
//				list.remove(ii);
//			}
			
			for(Integer i:index) {
				list.remove((int)i);
			}
			for(Student list11:list) 
			{
				System.out.println(list11);
			}
		}
}
