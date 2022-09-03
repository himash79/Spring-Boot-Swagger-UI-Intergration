package lk.himash.swagger.util;

import lk.himash.swagger.entity.Mobile;

public class EntityDtoMapper {

	public static Mobile dtoToEntity(MobileDto mobileDto) {
		Mobile mobile = new Mobile(mobileDto.getId(), mobileDto.getBrand(), mobileDto.getModel(), mobileDto.getCost(),
				mobileDto.getStatus());
		return mobile;
	}

	public static MobileDto entityToDto(Mobile mobile) {
		MobileDto mobileDto = new MobileDto(mobile.getId(), mobile.getBrand(), mobile.getModel(), mobile.getCost(),
				mobile.getStatus());
		return mobileDto;
	}

}
