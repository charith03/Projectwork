package admin_user.repositories;

import admin_user.model.CheckoutForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutFormRepository extends JpaRepository<CheckoutForm, Long> {
}
