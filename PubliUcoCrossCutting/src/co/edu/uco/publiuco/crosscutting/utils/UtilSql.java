package co.edu.uco.publiuco.crosscutting.utils;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoCrossCuttingException;

public final class UtilSql {
	
	private UtilSql() {
		super();
	}
	
	public static boolean connectionIsOpen(final Connection connection) {
		if(UtilObject.isNull(connection)) {
			var userMessage = "Se ha presentado un problema tratando de  validar si una conexion con la fuente de informacion estaba o no abierta";
			var technicalMessage = "Se ha presentado una excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
			throw PubliucoCrossCuttingException.create("NO ES POSIBLE VALIDAR SI UNA CONEXION ESTA ABUERTA CUANDO SE ENCUENTRA NULA...");
		}
		
		try {
			return !connection.isClosed();
		} catch (final Exception exception) {
			var userMessage = "Se ha presentado un problema tratando de  validar si una conexion con la fuente de informacion estaba o no abierta";
			var technicalMessage = "Se ha presentado una excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
			
			throw PubliucoCrossCuttingException.create(technicalMessage, userMessage, exception);
			
		}
		
		catch (final Exception exception) {
			var userMessage = "Se ha presentado un problema tratando de  validar si una conexion con la fuente de informacion estaba o no abierta";
			var technicalMessage = "Se ha presentado una excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
			
			throw PubliucoCrossCuttingException.create(technicalMessage, userMessage, exception);
			
		}
		
	}
	
	public static void closeConnection(final Connection connection) {
		if(!connectionIsOpen(connection)) {
			try {
				connection.close();
			} catch (SQLException exception) {
				e.printStackTrace();
			}
		}
	}

}
