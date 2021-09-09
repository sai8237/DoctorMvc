package appointment_mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import appointment_mvc.entity.DoctorEntity;

@Repository
public interface DoctorDao extends JpaRepository<DoctorEntity, String> {

}
