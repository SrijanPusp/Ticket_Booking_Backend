package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String userID;
    private String password;
    private String hashPassword;
    List<Ticket> tickets;
}
