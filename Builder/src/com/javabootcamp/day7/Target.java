package com.javabootcamp.day7;

public class Target {

	private  String a;
	private  int b;
	private  int c;
	private  String d;
	private  String e;

	public String getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public String getD() {
		return d;
	}
	public String getE() {
		return e;
	}
	private Target(Builder b) {	
		
			this.a = b.a;
			this.b = b.b;
			this.c = b.c;
			this.d = b.d;
			this.e = b.e;
		
	}

	public static class Builder{
		

		private  String a;
		private  int b;
		private  int c;
		private  String d;
		private  String e;
		
		public Builder(){
			
		}
		public static Builder builder(){
			return new Builder();
		}
		public Builder setA(String a) {
			this.a = a;
			return this;
		}
		public Builder setB(int b) {
			this.b = b;
			return this;
		}
		public Builder setC(int c) {
			this.c = c;
			return this;
		}
		public Builder setD(String d) {
			this.d = d;
			return this;
		}
		public Builder setE(String e) {
			this.e = e;
			return this;
		}
		public Target build(){
			if(isValid())
				return new Target(this);
			else
				return null;
		}
		public boolean isValid(){
			if(this.a!=null && this.b>this.c)
				return true;
			else{			
				try {
					throw new RuleViolationException("INVALID");
				} catch (RuleViolationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
			}
			return false;

		}

	}



}
