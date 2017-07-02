package com.dhakre.rohit.saturday;

public class Demo {

	private int x;
	private String y;
	private float z;
	private boolean b;

	public int getX() {
		return x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Demo() {
		super();
		this.x = 0;
		this.y = null;
		this.z = 0.0f;
		this.b = false;
	}

	public Demo(int x, String y, float z, boolean b) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", b=" + b + "]";
	}

	public static void main(String[] args) {

		Object d = new Demo(12, "Twelve", 12.0f, true);
		System.out.println(d);

	}

}
