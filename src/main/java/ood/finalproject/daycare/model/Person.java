
package ood.finalproject.daycare.model;

import java.util.Date;
/**
 *
 * @author karthik
 */
public class Person {
    public String firstName;
	public String lastName;
	public Date registerTime;
        
        
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
    
}
