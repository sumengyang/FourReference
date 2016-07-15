package Container;

import java.util.*;

public class AbsComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		int v1 = Math.abs(((Integer) o1).intValue());
		int v2 = Math.abs(((Integer) o2).intValue());
		return v1 > v2 ? 1 : (v1 == v2 ? 0 : -1);
	}
}