package ticket.booking.entities;

import java.util.List;
import java.util.Map;

public class Train {
    private String trainID;
    private Integer trainNumber;
    private Map<String, String> schedule;
    private List<List<Integer>> seats;
    private List<String> stations;

    public Train(String trainID, Integer trainNumber, Map<String, String> schedule, List<List<Integer>> seats, List<String> stations) {
        this.trainID = trainID;
        this.trainNumber = trainNumber;
        this.schedule = schedule;
        this.seats = seats;
        this.stations = stations;
    }

    public Train(){}

    public String getTrainID() {
        return trainID;
    }

    public void setTrainID(String trainID) {
        this.trainID = trainID;
    }

    public Integer getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(Integer trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public String getTrainInfo(){
        return String.format("Train ID: %s, Train Number: %s", trainID, trainNumber);
    }
}
