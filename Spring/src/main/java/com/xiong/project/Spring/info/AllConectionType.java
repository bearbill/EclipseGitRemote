package com.xiong.project.Spring.info;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AllConectionType {
	
	private List<String> list;
	private int[] array;
	private Set<String> set;
	private Map<String, String> map;
	private Properties properties;
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array) {
		this.array = array;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		String string = "";
		if(array !=null && array.length >0)
		{
			for(int a:array)
			{
				string+=a+",";
			}
		}
		
		// TODO Auto-generated method stub
		return "list = "+this.list+"/nSet = "+this.set+"/nMap = ,"+this.map+"/n Prop = "+this.properties+"/nArray = "+string;
	}
	
	
	

}
