package lk.himash.swagger.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lk.himash.swagger.entity.Mobile;
import lk.himash.swagger.repository.MobileRepository;
import lk.himash.swagger.service.MobileService;
import lk.himash.swagger.util.EntityDtoMapper;
import lk.himash.swagger.util.MobileDto;

@Service
@Transactional
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileRepository mobileRepo;
	
	@Override
	public ResponseEntity<?> getAllMobiles() {
		ResponseEntity<?> resp = null;
		List<Mobile> mobiles = new ArrayList<>();
		try {
			mobiles = mobileRepo.findAll();
			resp = new ResponseEntity<>(mobiles, HttpStatus.FOUND);
			return resp;
		}catch(Exception ex) {
			resp = new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
			return resp;	
		}
	}

	@Override
	public ResponseEntity<?> getMobile(String id) {
		ResponseEntity<?> resp = null;
		Mobile mobile = null;
		try {
			mobile = mobileRepo.findById(id).get();
			resp = new ResponseEntity<>(mobile, HttpStatus.FOUND);
			return resp;
		}catch(Exception ex) {
			resp = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return resp;	
		}
	}

	@Override
	public ResponseEntity<?> saveMobile(MobileDto mobileDto) {
		ResponseEntity<?> resp = null;
		Mobile mobile = null;
		try {
			mobile = EntityDtoMapper.dtoToEntity(mobileDto);
			mobile = mobileRepo.save(mobile);
			resp = new ResponseEntity<>(mobile, HttpStatus.CREATED);
			return resp;
		}catch(Exception ex) {
			resp = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return resp;	
		}
	}

	@Override
	public ResponseEntity<?> updateMobile(MobileDto mobileDto, String id) {
		ResponseEntity<?> resp = null;
		Mobile mobile = null;
		try {
			mobile = updateMobileWithOldMobile(mobileDto, id);
			mobile = mobileRepo.save(mobile);
			resp = new ResponseEntity<>(mobile, HttpStatus.CREATED);
			return resp;
		}catch(Exception ex) {
			resp = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return resp;	
		}
	}

	@Override
	public ResponseEntity<?> deleteMobile(String id) {
		ResponseEntity<?> resp = null;
		Mobile mobile = null;
		try {
			mobile = mobileRepo.findById(id).get();
			mobileRepo.delete(mobile);
			resp = new ResponseEntity<>("Item Removes Succesfully With " + id, HttpStatus.OK);
			return resp;
		}catch(Exception ex) {
			resp = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			return resp;	
		}
	}
	
	private Mobile updateMobileWithOldMobile(MobileDto mobileDto, String id) {
		Mobile updatedMobile = null;
		Mobile oldMobile = null;
		try {
			updatedMobile = EntityDtoMapper.dtoToEntity(mobileDto);
			oldMobile = mobileRepo.findById(id).get();
			
			if(updatedMobile.getId().equalsIgnoreCase(oldMobile.getId())) {
				oldMobile.setBrand(updatedMobile.getBrand());
				oldMobile.setModel(updatedMobile.getModel());
				oldMobile.setCost(updatedMobile.getCost());
				oldMobile.setStatus(updatedMobile.getCost());
			}
			oldMobile = mobileRepo.save(oldMobile);
			return oldMobile;
		}catch(Exception ex) {
			return oldMobile;	
		}			
		
	}

}
