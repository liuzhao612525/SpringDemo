package cn.itcast.property;

import java.awt.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private String pname;
	
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void test1() {
//		System.out.println("name..........." + pname);
		System.out.println("arrs..........." + arrs);
		System.out.println("list..........." + list);
		System.out.println("map..........." + map);
		System.out.println("properties..........." + properties);
	}
	
	private String[] arrs;
	private List list;
	private Map<String,String> map;
	private Properties properties;
	
	
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	public void setList(List list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	

}
