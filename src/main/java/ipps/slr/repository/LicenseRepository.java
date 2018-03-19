package ipps.slr.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import  ipps.slr.models.LicenseEntity;

import javax.swing.text.html.parser.Entity;
import java.util.List;

/**
 * Created by Gramovich_V on 15.03.2018.
 */
public interface  LicenseRepository extends CrudRepository<LicenseEntity, Long> {
    LicenseEntity findByUnpegr(Long unpegr);

    Page<LicenseEntity> findAll(Pageable pageable);

}
