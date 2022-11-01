package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCTest {

	public static void main(String[] args) {
		String sql = "select * from cart where cart_member = ?";
				
		List<Object> param = new ArrayList<Object>();
		param.add("a001");
		
		List<Map<String,Object>> list = JDBCUtil.selectList(sql, param);
		
		System.out.println(list);
		
		sql = "insert into cart values(?, ?, ?, ?)";
		param = new ArrayList<Object>();
		param.add("a001");
		param.add("2005040100001");
		param.add("P302000004");
		param.add(10);
		
		int result = JDBCUtil.update(sql, param);
		System.out.println(result);
	}

}
