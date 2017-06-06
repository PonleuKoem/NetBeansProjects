/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.StudentDto;
import java.util.List;

/**
 *
 * @author User
 */
public class StudentView {
    public void Display(List<StudentDto> list){
        for(StudentDto st:list){
            System.out.println("No: "+st.getNo());
            System.out.println("No: "+st.getName());
            System.out.println("No: "+st.getGender());
            System.out.println("======================");
        }
    }
}
