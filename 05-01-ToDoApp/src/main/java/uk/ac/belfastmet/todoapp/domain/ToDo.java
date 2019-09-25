package uk.ac.belfastmet.todoapp.domain;

import javax.persistence.*;

@Entity
@Table(name="task")
public class ToDo {

	private String completionDate;
	private String description;
	private String title;
	private boolean status;
	private int priority;
	private String user;
	private long id;

	
	/**
	 * ToDo Constructor that accepts the following parameters:
	 * 
	 * @param completionDate type String
	 * @param description type String
	 * @param title type String
	 * @param status type Boolean
	 * @param priority type int
	 * @param user type String
	 */
	public ToDo(String completionDate, String description, String title, boolean status, int priority,
			String user) {
		super();
		this.completionDate = completionDate;
		this.description = description;
		this.title = title;
		this.status = status;
		this.priority = priority;
		this.user = user;
	}

	/**
	 * Default ToDo Constructor
	 */
	public ToDo() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "completion_date")
	public String getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "name")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Column(name = "priority")
	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Column(name = "user")
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	/**
	 * ToDo toString
	 * @Returns the Name and Priority of a task
	 */
	@Override
	public String toString() {
		return title + " " + priority;
	}


}
