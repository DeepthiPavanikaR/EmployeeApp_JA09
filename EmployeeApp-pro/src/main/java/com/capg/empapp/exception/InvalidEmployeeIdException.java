package com.capg.empapp.exception;

public class InvalidEmployeeIdException extends Exception{
	
	public String toString() {
		return "InvalidEmployeeIdException:- Entered Employee ID is Not a Valid ID ";
	}
}
