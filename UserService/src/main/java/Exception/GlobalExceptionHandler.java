package Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import ErrorResponseHandle.UserErrorResponse;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<UserErrorResponse>HandleUserNotFound(UserNotFoundException ex,HttpServletRequest request){
		
		UserErrorResponse error = new UserErrorResponse(404,ex.getMessage(),request.getRequestURI());
		
		return ResponseEntity.status(404).body(error);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<UserErrorResponse>HandleValidationError(MethodArgumentNotValidException ex, HttpServletRequest request){
		
		UserErrorResponse error = new UserErrorResponse(400, ex.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(400).body(error);
	}
	
	
}
