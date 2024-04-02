package com.sci;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CustomException(String message) {
		super(message);
	}

	public static final class WrongDataInputException extends CustomException {

		private static final long serialVersionUID = 1L;

		public WrongDataInputException(String message) {
			super(message);
		}

	}

	public static final class WrongPasswordException extends CustomException {

		private static final long serialVersionUID = 1L;

		public WrongPasswordException(String message) {
			super(message);
		}

	}
}
