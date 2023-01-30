package org.ecommerce.config.web.admin.exceptions;

import org.springframework.stereotype.Component;

/**
 *
 * @author sergio
 */
@Component
public class AppendToNonExistentFileException extends RuntimeException {

	private String name;

	public AppendToNonExistentFileException(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public AppendToNonExistentFileException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppendToNonExistentFileException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public AppendToNonExistentFileException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AppendToNonExistentFileException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}
}
