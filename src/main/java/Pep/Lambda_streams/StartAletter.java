package Pep.Lambda_streams;


import java.util.*;
import java.util.stream.Collectors;
/**
 * Hello world!
 *
 */
public class StartAletter 
{
	interface letter
	{
		public List<String> search();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			letter l=()->{
				System.out.println("Enter the no.of strings to be entered:");
				int n=sc.nextInt();
				System.out.println("Strings to be added in List");
				List<String> a=new ArrayList<>();
				for(int i=0;i<n;i++) {
					a.add(sc.next());}
			return a.stream().filter(s->s.startsWith("a")).filter(s->s.length()==3).collect(Collectors.toList());
	};
	  System.out.println("Strings starting with a in lowercase with size 3:"+l.search());
	  sc.close();
	}
}