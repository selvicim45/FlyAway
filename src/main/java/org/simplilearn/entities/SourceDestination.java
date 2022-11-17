package org.simplilearn.entities;

public class SourceDestination {
	private int sdno;
	private String source;
	private String destination;
	
	public SourceDestination(int sdno, String source, String destination) {
		super();
		this.sdno = sdno;
		this.source = source;
		this.destination = destination;
	}
	public SourceDestination() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getSdno() {
		return sdno;
	}
	public void setSdno(int sdno) {
		this.sdno = sdno;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	

}
