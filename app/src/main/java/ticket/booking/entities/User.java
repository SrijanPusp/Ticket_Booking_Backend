package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String userID;
    private String password;
    private String hashPassword;
    List<Ticket> tickets;

    public User(String name, String pasword, String hashPassword, String userID, List<Ticket> tickets){
        this.name = name;
        this.password = pasword;
        this.hashPassword = hashPassword;
        this.userID = userID;
        this.tickets = tickets;
    }

    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void printTickets(){
        for(int i=0; i<tickets.size(); i++)
        {
            System.out.print(tickets.get(i).getTicketInfo());
        }
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getHashPassword() {
        return hashPassword;
    }
}
