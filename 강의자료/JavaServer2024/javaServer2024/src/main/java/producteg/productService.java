package producteg;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class productService {
	
	Map<String, product> products = new HashMap<>();
	
	public productService( ) {
		product p = new product("101","딥러닝","신구문화사",2000, "2024.4.29");
		products.put("101", p);
		p = new product("102","텐서플로","ai출판사",3000, "2024.4.29");
		products.put("102", p);
		p = new product("103","빅데이터","사이언스",5000, "2024.5.29");
		products.put("103", p);
	}
	
	public List<product> findAll() {
		return new ArrayList<>(products.values());

}
	public product find(String id) {
		return products.get(id);
	}
}