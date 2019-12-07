package com.eg.Collections;

public class Employee {
	
	private String eno;
	private String ename;
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
	}
	public Employee(String eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	public String getEname() {
		return ename;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + ((eno == null) ? 0 : eno.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (eno == null) {
			if (other.eno != null)
				return false;
		} else if (!eno.equals(other.eno))
			return false;
		return true;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	

}
