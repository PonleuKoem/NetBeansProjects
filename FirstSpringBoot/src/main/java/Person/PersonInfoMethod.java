/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author User
 */
@Component
public class PersonInfoMethod {
    private Person person;
    @Autowired
    @Qualifier("info")
    public void setPeron(Person person){
        this.person=person;
    }
    public void drawPerson(){
        this.person.personinfo();
    }
}
