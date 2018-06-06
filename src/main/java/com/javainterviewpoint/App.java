package com.javainterviewpoint;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //Reading the Configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        
        //Get the EmployeeServiceImpl bean
        //BatchDetailsServiceImpl batchServiceImpl = (BatchDetailsServiceImpl)context.getBean("batchServiceImpl");
        
        //Create BatchDetail object
          Employee employee = new Employee();
       // employee.setAge(55);
        //employee.setDept("Blogging");
      //  employee.setName("JIP");
        
        //Save the new Employee
       // employeeServiceImpl.saveEmployee(employee);
   
        
        context.close();
    }
}
