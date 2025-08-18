package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainID;
    private Integer trainNumber;
    private Map<String, Time> schedule;
    private List<List<Boolean>> seats;
    private List<String> stations;
}
