package co.edu.uco.publiuco.crosscutting.utils;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoCrossCuttingException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.UtilSqlMessages;

public final class UtilSql {
	
	private UtilSql() {
		super();
	}
	
	public static boolean connectionIsOpen(final Connection connection) {
		if(UtilObject.isNull(connection)) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION;
			throw PubliucoCrossCuttingException.create("NO ES POSIBLE VALIDAR SI UNA CONEXION ESTA ABUERTA CUANDO SE ENCUENTRA NULA...");
		}
		
		try {
			return !connection.isClosed();
		} catch (final SQLException exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION;
			
			throw PubliucoCrossCuttingException.create(technicalMessage, userMessage, exception);
			
		}
		
		catch (final Exception exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION;
			
			throw PubliucoCrossCuttingException.create(technicalMessage, userMessage, exception);
			
		}
		
	}
	
	public static void closeConnection(final Connection connection) {
		try {
			if(!connectionIsOpen(connection)) {
				connection.close();
			} 
		}catch (final SQLException exception){
				var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
				var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION;
				
				throw PubliucoCrossCuttingException.create(technicalMessage, userMessage, exception);
				
			}
			
			catch (final Exception exception) {
				var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
				var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION;
				
				throw PubliucoCrossCuttingException.create(technicalMessage, userMessage, exception);
				
			}
	}

}
