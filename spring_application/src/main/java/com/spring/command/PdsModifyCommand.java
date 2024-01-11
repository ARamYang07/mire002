package com.spring.command;

public class PdsModifyCommand extends PdsRegistCommand{
	
	
	private int pno;
	private int[] deleteFile;
	
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int[] getDeleteFile() {
		return deleteFile;
	}
	public void setDeleteFile(int[] deleteFile) {
		this.deleteFile = deleteFile;
	}
	
	
}
