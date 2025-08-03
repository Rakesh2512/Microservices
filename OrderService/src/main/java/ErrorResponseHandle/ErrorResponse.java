package ErrorResponseHandle;

import java.time.LocalDateTime;

public class ErrorResponse {
	private String message;
	private String errorCode;
	private LocalDateTime timestamp;
	
	
	
	public ErrorResponse(String message, String errorCode) {
		super();
		this.message = message;
		this.errorCode = errorCode;
	}
	
	public String getMessage() {
		return message;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

}
