import java.util.ArrayList;
import java.util.List;


public class Foo {
	
	List<Integer> foo  = new ArrayList<Integer>();	
	List<Integer> bar = new ArrayList<Integer>();
	List<Integer> delete = new ArrayList<Integer>();
	
	public void test() {
		int i = 0;
		for(Integer item : foo) {
			if(item.equals(bar.get(i))) {
				if(item > bar.get(i)) {
				//Do something
			}
				i++;
		}
	}
	}
}
