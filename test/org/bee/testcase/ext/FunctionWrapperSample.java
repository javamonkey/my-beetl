package org.bee.testcase.ext;

import org.bee.tl.core.Context;

public class FunctionWrapperSample {
	public String getName(int a){
		return a+"";
	}
	
	public String getName(String name){
		return name;
	}
	public String getName(int a,String name){
		return "hello";
	}
	
	public String getName(String name ,String comment,Context ctx){
		return "hello ctx";
	}
	
	public String datacache(String name,String value){
		return name+value;
	}
	
	
}
