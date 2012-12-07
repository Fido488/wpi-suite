package edu.wpi.cs.wpisuitetng.exceptions;

import javax.servlet.http.HttpServletResponse;

public class UnauthorizedException extends WPISuiteException {

	/**
	 * Exception thrown when attempting an action not allowed for that user's permission
	 * level
	 */
	private static final long serialVersionUID = 9127615601542990581L;

	@Override
	public int getStatus() {
		return HttpServletResponse.SC_UNAUTHORIZED; //401
	}

}
