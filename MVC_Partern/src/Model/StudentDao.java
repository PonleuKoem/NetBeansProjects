/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class StudentDao {
    private  List<StudentDto> list = null;

    public StudentDao() {
        list = new ArrayList<StudentDto>();
        
    }
    public List<StudentDto> getStudents(){
        return list;
    }
    public boolean AddStudent (StudentDto st){
        if (st!=null){
            list.add(st);
            return true;
        }
        return false;
    }
    
}
