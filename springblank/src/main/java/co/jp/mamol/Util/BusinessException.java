package co.jp.mamol.Util;

public class BusinessException extends Exception {

	public BusinessException(String message){
		super(message);
	}
	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
