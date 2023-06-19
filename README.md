# success-message-and-unique-column Validation
* Demonstrates the use of 
 * 1. RedirectAttributes for sending success message
 * after form submission without re-submission on refresh
 * The principle used to prevent form resubmission is known as Post-Redirect-Get(PRG)
 * which involves using post to save the object and redirect from the post html document
 * to a document accessed through GET method. 
 * In this case the redirect is back to the same post html document using ModelAndView
 * class.
 * 2. Use of @Column(unique=true, nullable=false, length=45) in entity class 
 * to prevent double entry of a unique column, prevent null value and specify
 * maximum length.
 * and subsequent catch of DataIntegrityConstraintViolationException
 * with a custom message to the console
 * data validation is used by writing code for a boolean method that returns the result
 * of comparing the entity object with null and StringUtils.isNotBlank(String). 

