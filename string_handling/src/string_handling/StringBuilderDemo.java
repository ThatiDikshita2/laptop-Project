package string_handling;
    // StringBuilder is mutable and Not thread safe object
public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder("Java");
		System.out.println(sb);
		sb.append("23");
		System.out.println(sb);	
	}

}
