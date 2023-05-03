package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliucoBussinesException extends PubliucoException {

	private static final long serialVersionUID = 2324985716431320544L;
	
	private PubliucoBussinesException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.BUSSINES);
		
	}

	public static PubliucoBussinesException create(final String technicalMessage,final String userMessage, final Throwable rootCause) {
	return new PubliucoBussinesException(technicalMessage, userMessage, rootCause);
	
	}
	
	public static PubliucoBussinesException create(final String userMessage) {
		return new PubliucoBussinesException(userMessage, userMessage, new Exception());
		
		}
	
	public static PubliucoBussinesException create( final String technicalMessage, final String userMessage) {
		return new PubliucoBussinesException(technicalMessage, userMessage, new Exception());
		
		}

}
