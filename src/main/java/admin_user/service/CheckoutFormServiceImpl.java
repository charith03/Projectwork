package admin_user.service;

import admin_user.model.CheckoutForm;
import admin_user.repositories.CheckoutFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutFormServiceImpl implements CheckoutFormService {
    @Autowired
    private CheckoutFormRepository repository;

    @Override
    public CheckoutForm saveForm(CheckoutForm form) {
        // Implement form data validation or additional processing if needed
        // For example, you can add validation logic here

        // Save the form data to the database using the repository
        return repository.save(form);
    }
}
