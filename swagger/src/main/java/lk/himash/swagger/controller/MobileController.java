package lk.himash.swagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lk.himash.swagger.service.MobileService;
import lk.himash.swagger.util.MobileDto;

@RestController
@RequestMapping("/mobileApi")
@Api(value="Mobile Restful APIs", description="My Mobile Store")
public class MobileController {

	@Autowired
	private MobileService mobileService;
	
	@ApiOperation(value = "Request all Mobile Device Details")
	@GetMapping("/getAllMobiles")
	public ResponseEntity<?> getAllMobiles() {
		return mobileService.getAllMobiles();
	}
	
	@ApiOperation(value = "Request Per Mobile Device Details")
	@GetMapping("/getMobile/{id}")
	public ResponseEntity<?> getMobile(@PathVariable String id) {
		return mobileService.getMobile(id);
	}
	
	@ApiOperation(value = "Add Mobile Device Details")
	@PostMapping("/saveMobile")
	public ResponseEntity<?> saveMobile(@RequestBody MobileDto mobileDto) {
		return mobileService.saveMobile(mobileDto);
	}
	
	@ApiOperation(value = "Edit Mobile Device Details")
	@PutMapping("/updateMobile/{id}")
	public ResponseEntity<?> saveMobile(@RequestBody MobileDto mobileDto, @PathVariable String id) {
		return mobileService.updateMobile(mobileDto, id);
	}
	
	@ApiOperation(value = "Remove Mobile Device Details")
	@DeleteMapping("/deleteMobile/{id}")
	public ResponseEntity<?> deleteMobile(@PathVariable String id) {
		return mobileService.deleteMobile(id);
	}
	
}
