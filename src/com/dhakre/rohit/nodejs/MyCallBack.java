package com.dhakre.rohit.nodejs;

public class MyCallBack {

	String object_or_array;
	boolean empty;
	int parse_time_nanoseconds;
	boolean validate;
	int size;

	public MyCallBack() {
		super();
	}

	public MyCallBack(String object_or_array, boolean empty, int parse_time_nanoseconds, boolean validate, int size) {
		super();
		this.object_or_array = object_or_array;
		this.empty = empty;
		this.parse_time_nanoseconds = parse_time_nanoseconds;
		this.validate = validate;
		this.size = size;
	}

	public String getObject_or_array() {
		return object_or_array;
	}

	public void setObject_or_array(String object_or_array) {
		this.object_or_array = object_or_array;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public int getParse_time_nanoseconds() {
		return parse_time_nanoseconds;
	}

	public void setParse_time_nanoseconds(int parse_time_nanoseconds) {
		this.parse_time_nanoseconds = parse_time_nanoseconds;
	}

	public boolean isValidate() {
		return validate;
	}

	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
