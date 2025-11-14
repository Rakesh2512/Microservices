package ErrorResponseHandle;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class UserErrorResponse {
	
	private int status;
	private String message;
	private String path;
	private LocalTime timestamp;
	
	public UserErrorResponse(int status, String message, String path) {
		super();
		this.status = status;
		this.message = message;
		this.path = path;
		this.timestamp = timestamp.now();
	}
	
	public int getStatus() {
		return status;
	}
	public String getMessage() {
		return message;
	}
	public String getPath() {
		return path;
	}
	public LocalTime getTimestamp() {
		return timestamp;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public void setTimestamp(LocalTime timestamp) {
		this.timestamp = timestamp;
	}
	

}
