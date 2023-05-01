package com.example.DMS.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author MARAM DEEPAK REDDY S548918
 */

@Entity
public class Trainer {
	
	@Id
	private int trainerID;
	private String trainerName;
	private String trainerAddress;
	
	
	public int getTrainerID() {
		return trainerID;
	}
	public void setTrainerID(int trainerID) {
		this.trainerID = trainerID;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerAddress() {
		return trainerAddress;
	}
	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
	
	@Override
	public String toString() {
		return "Trainer [trainerID=" + trainerID + ", trainerName=" + trainerName + ", trainerAddress=" + trainerAddress
				+ "]";
	}
	
	
}
