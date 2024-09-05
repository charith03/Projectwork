package admin_user.controller;

import admin_user.model.CheckoutForm;
import admin_user.service.CheckoutFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckoutFormController {
    @Autowired
    private CheckoutFormService service;

    @PostMapping("/saveCheckoutForm")
    public ResponseEntity<?> saveCheckoutForm(@RequestBody CheckoutForm form) {
        try {
            // Perform any validation or additional processing here if needed
            CheckoutForm savedForm = service.saveForm(form);

            // Return a success response with the saved form
            return new ResponseEntity<>(savedForm, HttpStatus.OK);
        } catch (Exception e) {
            // Handle exceptions and return a more informative error response
            String errorMessage = "Form submission failed: " + e.getMessage();
            return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
