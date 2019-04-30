package com.SpringFWProject.FWProject;

import javax.validation.constraints.Size;

public class Shoe {
	
	//(min=1, max=13)
	private Integer num;
	private double size;
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		 this.num = num;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		 this.size = size;
	}
	
	//public String toString() {
   //     return "Shoe(Number: " + this.num + ")";
   // }
}

