# success-message-and-unique-column Demonstrates the use of 
 * 1. RedirectAttributes for sending success message
 * after form submission without re-submission on refresh
 * 2. Use of @Column(unique=true) in entity class to prevent double entry of a unique column
 * and subsequent catch of DataIntegrityConstraintViolationException
 * with a custom message to the console
