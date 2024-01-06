package javaRash.tasks.json.task3313;


import com.fasterxml.jackson.annotation.JsonFormat;


import java.util.Date;

class Event {
    public String name;
    @JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    public Date eventDate;

    public Event(String name) {
        this.name = name;
        eventDate = new Date();
    }
}
