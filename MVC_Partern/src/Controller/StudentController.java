/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.StudentDao;
import Model.StudentDto;
import View.StudentView;

/**
 *
 * @author User
 */
public class StudentController {
    private StudentDao dao = new StudentDao();
    private StudentView view = new StudentView();
    public void AddStudent(StudentDto st){
        if(st !=null){
            
            dao.AddStudent(st);
            System.out.println("Success");
            view.Display(dao.getStudents());
            return;
        }
       
            System.out.println("Failed");
            view.Display(dao.getStudents());
        
    }
}
