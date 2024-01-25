/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressBook;

/**
 *
 * @author eoin0
 */
public class Business extends Contact {
    protected String company;

    public Business() {
    }

    public Business(String company, String firstname, String lastname, String phone, String email, String address) {
        super(firstname, lastname, phone, email, address);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    
    @Override
    public String toString() {
        return "Contact{" + "firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", company=" + company + '}';
    }
    
}
