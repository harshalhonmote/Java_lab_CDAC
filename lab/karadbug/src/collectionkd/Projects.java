package collectionkd;

import java.util.Date;
import java.util.Objects;

public class Projects {
	private int id;
	private String title;
	private int teamSize;
	private Date date;
	private String tech;

	public Projects() {
		// TODO Auto-generated constructor stub
	}

	public Projects(int id, String title, int teamSize, Date date, String tech) {
		this.id = id;
		this.title = title;
		this.teamSize = teamSize;
		this.date = date;
		this.tech = tech;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projects other = (Projects) obj;
		return id == other.id;
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

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", title=" + title + ", teamSize=" + teamSize + ", date=" + date + ", tech="
				+ tech + "]";
	}

	
}
