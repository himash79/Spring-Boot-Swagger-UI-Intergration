package lk.himash.swagger.service;

import org.springframework.http.ResponseEntity;

import lk.himash.swagger.util.MobileDto;

public interface MobileService {

	public ResponseEntity<?> getAllMobiles();
	public ResponseEntity<?> getMobile(String id);
	public ResponseEntity<?> saveMobile(MobileDto mobileDto);
	public ResponseEntity<?> updateMobile(MobileDto mobileDto, String id);
	public ResponseEntity<?> deleteMobile(String id);
	
}
