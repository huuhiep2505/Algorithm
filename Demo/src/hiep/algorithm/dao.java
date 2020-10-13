package src.hiep.algorithm;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

public class dao implements Serializable {
    Connection conn;
    PreparedStatement preStm;
    ResultSet rs;

    public void closeConnection() throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (preStm != null) {
            preStm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

    public ArrayList<workingplanDTO> loadTour() throws SQLException {
        ArrayList<workingplanDTO> list = new ArrayList<>();
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "Select * From workingplan";
                preStm = conn.prepareStatement(sql);
                rs = preStm.executeQuery();
                while (rs.next()) {
                    String username = rs.getString("username");
                    boolean monday = rs.getBoolean("monday");
                    boolean tuesday = rs.getBoolean("tuesday");
                    boolean wednesday = rs.getBoolean("wednesday");
                    boolean thursday = rs.getBoolean("thursday");
                    boolean friday = rs.getBoolean("friday");
                    boolean saturday = rs.getBoolean("saturday");
                    boolean sunday = rs.getBoolean("sunday");
                    String language = rs.getString("language");
                    int numDay = rs.getInt("numDay");
                    int numWeek = rs.getInt("numWeek");
                    workingplanDTO dto = new workingplanDTO(username, language, monday, tuesday, wednesday, thursday, friday, saturday, sunday, numDay,numWeek);
                    list.add(dto);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            closeConnection();
        }
        return list;
    }

    public boolean updateWorkingplan(workingplanDTO dto)throws Exception{
        boolean check = false;
        try {
            String sql="Update workingplan Set numDay = ?, numWeek = ? Where username = ?";
            conn=MyConnection.makeConnection();
            preStm=conn.prepareStatement(sql);
            preStm.setInt(1, dto.getNumDay());
            preStm.setInt(2, dto.getNumWeek());
            preStm.setString(3, dto.getUsername());

            check = preStm.executeUpdate()>0;
        }finally{
            closeConnection();
        }
        return check;
    }

    public boolean insert(String username, Time start, Time end, int dayofweek)throws Exception{
        boolean result = false;
        try {
            String sql = "Insert into schedule (username,start,end,dayofweek) Values(?,?,?,?)";
            conn=MyConnection.makeConnection();
            preStm=conn.prepareStatement(sql);
            preStm.setString(1, username);
            preStm.setTime(2, start);
            preStm.setTime(3, end);
            preStm.setInt(4, dayofweek);
            result=preStm.executeUpdate()>0;
        } finally{
            closeConnection();
        }
        return result;
    }


    public ArrayList<scheduleDTO> loadSchedule(int dayofweek) throws SQLException {
        ArrayList<scheduleDTO> list = new ArrayList<>();
        try {
            conn = MyConnection.makeConnection();
            if (conn != null) {
                String sql = "Select username, start, end From schedule where dayofweek = ?";
                preStm = conn.prepareStatement(sql);
                preStm.setInt(1, dayofweek);
                rs = preStm.executeQuery();
                while (rs.next()) {
                    String username = rs.getString("username");
                    Time start = rs.getTime("start");
                    Time end = rs.getTime("end");
                    scheduleDTO dto = new scheduleDTO(username, start, end);
                    list.add(dto);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            closeConnection();
        }
        return list;
    }

}
