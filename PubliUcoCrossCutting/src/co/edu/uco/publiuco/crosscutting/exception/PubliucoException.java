package co.edu.uco.publiuco.crosscutting.exception;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;

public class PubliucoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private ExceptionType type;
	private String UserMessage;
	
	protected PubliucoException(String techinaMessage, String userMessage, Throwable rootCase, ExceptionType type) {
		super(techinaMessage, rootCase);
		setUserMessage(userMessage);
		setType(type);
	}
	
	
	public final String getTechnicalMessage() {
		return UtilText.getUtilText().getDefaultEmpty(getMessage(), getUserMessage());
	}
	
	private final void setTechnicalMessage(final String technicalMessage) {
		
	}
	
	public final Throwable getRooCase() {
		return UtilObject.getDefault(getCause(), new Exception());
	}

	public final ExceptionType getType() {
		return type;
	}

	private final void setType(final ExceptionType type) {
		this.type = UtilObject.getDefault(type, ExceptionType.GENERAL);
	}

	public final String getUserMessage() {
		return UserMessage;
	}

	public final void setUserMessage(String userMessage) {
		UserMessage = UtilText.getUtilText().getDefault(userMessage);
	}
	
	
}
