 1. BaseClass: API base class contains common TestNG configuration
          annotations which is required for TestScript.
       
    @Before Suite: this annotation is used to configure the base URI of the API.
     
 2. End Points: this is an interface in the framework which contains all necessary
   EndPoints of different APIs are stored and fetched as required.   
   
 3.POJO class: POJO class is a java design pattern which is contains all
    the Employees data  helps to handle complex requests,
    POJO class it is used for serialization and de-Serialization. 
  
  4.JSON Utility: This class contains the JSON path, which is required 
  for complex response validation.  
  
  5.Java Utility: It contains java specific methods which can be used
   for all the test scripts like get-Random-number.
   
  6.Data: This Class contains  Id of the Response For To Validate the Response
  
  7.EmployeeResponse: this class contains message,data and status For Validation