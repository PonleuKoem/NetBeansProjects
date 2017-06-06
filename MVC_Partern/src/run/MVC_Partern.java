/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import Controller.StudentController;
import Model.StudentDto;

/**
 *
 * @author User
 */
public class MVC_Partern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentController st = new StudentController();
        st.AddStudent(new StudentDto("001", "Bopha", "f"));
    }
    
}
