package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliucoDtoException extends PubliucoException {

	private static final long serialVersionUID = 2324985716431320544L;
	
	private PubliucoDtoException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DTO);
		
	}

	public static PubliucoDtoException create(final String technicalMessage,final String userMessage, final Throwable rootCause) {
	return new PubliucoDtoException(technicalMessage, userMessage, rootCause);
	
	}
	
	public static PubliucoDtoException create(final String userMessage) {
		return new PubliucoDtoException(userMessage, userMessage, new Exception());
		
		}
	
	public static PubliucoDtoException create( final String technicalMessage, final String userMessage) {
		return new PubliucoDtoException(technicalMessage, userMessage, new Exception());
		
		}

}
