package com.ngntuli.io;

import java.io.Serializable;

public class SerializableDemo implements Serializable {
	private static final long serialVersionUID = 1L;
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
