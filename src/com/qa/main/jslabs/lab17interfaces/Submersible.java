package com.qa.main.jslabs.lab17interfaces;

public interface Submersible {
	public int getDepth();

	public void setDepth(int depth);

	public void dive(int howDeep);
	
	public void surface();
}
