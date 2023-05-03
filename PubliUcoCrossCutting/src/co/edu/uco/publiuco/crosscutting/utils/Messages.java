package co.edu.uco.publiuco.crosscutting.utils;

public final class Messages {
	
	public static final class UtilSqlMessages{
		public static final String CONNECTION_IS_OPEN_MESSAGE = "Se ha presentado un problema tratando de  validar si una conexion con la fuente de informacion estaba o no abierta";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION = "NO ES POSIBLE VALIDAR SI UNA CONEXION ESTA ABUERTA CUANDO SE ENCUENTRA NULA...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION = "Se ha presentado una excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
	}

}
