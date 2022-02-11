package home;

import java.util.LinkedHashMap;

public class DataStoreThreadLocal {
	
	private DataStoreThreadLocal() {};
	
		private static ThreadLocal<LinkedHashMap<String,Object>> data = 
								new ThreadLocal<LinkedHashMap<String,Object>>();
	
		public static void setValue(String key, Object value)
		{
			data.get().put(key, value);
		}
		
		public static Object getValue(String key)
		{
			return data.get().get(key);
		}
}
