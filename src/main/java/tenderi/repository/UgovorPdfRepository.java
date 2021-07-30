package tenderi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tenderi.domain.UgovorPdf;

/**
 * Spring Data SQL repository for the Ugovor entity.
 */
@SuppressWarnings("unused")
@Repository
public interface UgovorPdfRepository extends JpaRepository<UgovorPdf, Long> {
    List<UgovorPdf> findUgovorPdfByBrojUgovora(String broj_ugovora);
}
