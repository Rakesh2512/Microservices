package CustomeException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;

import ErrorResponseHandle.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptinHandler {
	
	
	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<ErrorResponse>OrderNorFoundExceptionById(OrderNotFoundException ex,HttpServletRequest request){
		ErrorResponse error = new ErrorResponse(ex.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(404).body(error);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse>AllExceptionHandle(HttpServerErrorException ex ,HttpServletRequest request){
		ErrorResponse error = new ErrorResponse(ex.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(404).body(error);
	}

}
