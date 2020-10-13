package src.hiep.algorithm;
import java.sql.Time;

/**
 *
 * @author nguye
 */
public class scheduleDTO {
    String username;
    int dayofweek;
    Time start, end;

    public scheduleDTO(String username, Time start, Time end) {
        this.username = username;
        this.start = start;
        this.end = end;
    }

    public scheduleDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getDayofweek() {
        return dayofweek;
    }

    public void setDayofweek(int dayofweek) {
        this.dayofweek = dayofweek;
    }

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

}
