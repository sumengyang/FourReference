package TestCollection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author smy
 *
 */
/**
 * @author smy
 * 下午12:02:54
 * Test
 */
/**
 * @author smy
 * 下午12:10:17
 * Test
 */
public class sortTest {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user1 = new User();
		user1.setName("a");
		user1.setOrder(1);
		User user2 = new User();
		user2.setName("b");
		user2.setOrder(2);
		List<User> list = new ArrayList<User>();
		// 此处add user2再add user1
		list.add(user2);
		list.add(user1);
		Collections.sort(list);
		for (User u : list) {
			System.out.println(u.getName());
		}
		boolean b = true;
	}
}

class User implements Comparable<User> {
	private String name;
	private Integer order;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public int compareTo(User arg0) {
		return this.getOrder().compareTo(arg0.getOrder());

	}
}