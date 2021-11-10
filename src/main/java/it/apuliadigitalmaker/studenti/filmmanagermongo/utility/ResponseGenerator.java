package it.apuliadigitalmaker.studenti.filmmanagermongo.utility;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import it.apuliadigitalmaker.studenti.filmmanagermongo.common.CommonResponseCode;
import it.apuliadigitalmaker.studenti.filmmanagermongo.responseDto.BaseResponseBody;

public class ResponseGenerator {
	
	public static <T> ResponseEntity<?> generateResponse(T payload, CommonResponseCode respCode, boolean success, HttpStatus httpStatus){
		
		return new ResponseEntity<>(
				new BaseResponseBody<>(success, respCode.getMessage(), respCode.getResponseCode(), payload),
				httpStatus
		);
		
	}

}
