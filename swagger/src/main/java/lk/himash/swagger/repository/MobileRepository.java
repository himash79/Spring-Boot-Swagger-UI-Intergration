package lk.himash.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.himash.swagger.entity.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, String> {

}
