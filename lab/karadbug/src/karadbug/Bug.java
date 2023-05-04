package karadbug;

import java.time.LocalDate;
import java.util.Date;

public class Bug {
	 private int id;         
	 private String title;                    
	 private String description;              
	 private String status;                   
	 private int assignedTo;              
	 private LocalDate created;                  
	 private LocalDate modified; 
	 
	 public Bug() {
		// TODO Auto-generated constructor stub
	}

	public Bug(int id, String title, String description, String status, int assignedTo, LocalDate created, LocalDate modified) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
		this.assignedTo = assignedTo;
		this.created = created;
		this.modified = modified;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(int assignedTo) {
		this.assignedTo = assignedTo;
	}

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	public LocalDate getModified() {
		return modified;
	}

	public void setModified(LocalDate modified) {
		this.modified = modified;
	}

	@Override
	public String toString() {
		return "Bug [id=" + id + ", title=" + title + ", description=" + description + ", status=" + status
				+ ", assigned_to=" + assignedTo + ", created=" + created + ", modified=" + modified + "]";
	}
}
