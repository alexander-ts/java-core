package com.alexander.classwork.alexander.lesson6.uml.design.amcs;

import java.util.HashSet;
import java.util.Set;

public class Employee extends Man {
	
	private String position;
	private IdCard iCard;
	
	private Set<Room> room = new HashSet<Room>();
	private Department department;
	private Set<PastPosition> pastPosition = new HashSet<PastPosition>();

	public Employee(String cName, String cSurname, String cPosition) {
		name = cName;
		surname = cSurname;
		position = cPosition;
	}

	public void setPosition(String newPosition) {
		
		//composition

		PastPosition pastPosition = new PastPosition(this.getPosition(),
				this.getDepartment());
		this.setPastPosition(pastPosition);

		position = newPosition;
	}

	public String getPosition() {
		return position;
	}

	public void setIdCard(IdCard c) {
		iCard = c;
	}

	public IdCard getIdCard() {
		return iCard;
	}

	public void setRoom(Room newRoom) {
		room.add(newRoom);
	}

	public Set<Room> getRoom() {
		return room;
	}

	public void deleteRoom(Room r) {
		room.remove(r);
	}

	public void setDepartment(Department d) {
		department = d;
	}

	public Department getDepartment() {
		return department;
	}

	public void setPastPosition(PastPosition p) {
		pastPosition.add(p);
	}

	public Set<PastPosition> getPastPosition() {
		return pastPosition;
	}

	public void deletePastPosition(PastPosition p) {
		pastPosition.remove(p);
	}
}