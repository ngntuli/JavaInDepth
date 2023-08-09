package com.ngntuli.io;

import java.io.Serializable;

public class SerializableDemo implements Serializable {
	//private static final long serialVersionUID = 1L;
	// static final long serialVersionUID = 8882416210786165012L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private transient int id = 4;

	public int getId() {
		return id;
	}

	// private String gender;
}
