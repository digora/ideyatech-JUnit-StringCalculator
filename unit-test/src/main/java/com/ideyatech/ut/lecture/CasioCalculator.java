package com.ideyatech.ut.lecture;

public class CasioCalculator implements Calculator {
	
	private String model;

	public long add(long a, long b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public long subtract(long a, long b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public long multiply(long a, long b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	public double sqr(double a) {
		// TODO Auto-generated method stub
		return a*a;
	}

	public double pow(long a, long pow) {
		// TODO Auto-generated method stub
		return Math.pow(a, pow);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		CasioCalculator other = (CasioCalculator) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

}
