package com.example.Sample.SpringTest.collection;

class Attribute {
	private String attribute_name;
	private String attribute_type;
	
	public Attribute() {	};
	
	public Attribute(String attribute_name, String attribute_type) {
		
		this.attribute_name = attribute_name;
		this.attribute_type = attribute_type;	
	}
	
	public String getAttribute_name() {
	    return attribute_name;
	}

	public void setAttribute_name(String attribute_name) {
	    this.attribute_name = attribute_name;
	}

	public String getAttribute_type() {
	    return attribute_type;
	}

	public void setAttribute_type(String attribute_type) {
	    this.attribute_type = attribute_type;
	}
	
}
