package src.hiep.algorithm;

import java.sql.SQLException;
import java.util.*;

//public class BackTracking {
//    dao d = new dao();
//    ArrayList<dto> listtemp = new ArrayList<>();
//    ArrayList<dto> list = new ArrayList<>();
//    int flag = 0;
//    HashMap<Integer, List<String>> availableUsers = new HashMap<>();
//
//    HashMap<Integer, List<String>> assignedUsers = new HashMap<>();
//
//    HashMap<String, Integer> assignedDayNums = new HashMap<>();
//
//    boolean isOk = false;
//
//    List<String> chooseUsersFromCandiates(int requiredNum, List<String> candidates) {
//        return candidates.subList(0, requiredNum);
//    }
//
//    void updateList(int currentDay, List<String> chosenUsers) {
//        for (String user : chosenUsers) {
//            if (assignedDayNums.containsKey(user) == false) {
//                assignedDayNums.put(user, 1);
//            } else {
//                int currentAssignedDays = assignedDayNums.get(user);
//
//                assignedDayNums.put(user, currentAssignedDays + 1);
//            }
//
//        }
//        // in case we backtracking, we have the list already! so we need to delete the old list
//        if (assignedUsers.containsKey(currentDay)) {
//            assignedUsers.remove(currentDay);
//        }
//
//        assignedUsers.put(currentDay, chosenUsers);
//
//    }
//
//    void update(int currentDay, List<String> chosenUsers){
////        Collection<List<String>> assignUser = assignedUsers.values();
//        Set<Integer> key = assignedUsers.keySet();
//        for(int i = 0 ; i < chosenUsers.size(); i++){
//            int num = 0;
//            for(Integer keyset : key){
//                for(int j = 0 ; j < assignedUsers.get(keyset).size() ; j++){
//                    if(chosenUsers.get(i).equals(assignedUsers.get(keyset).get(j))){
//                        if(assignedDayNums.containsKey(chosenUsers.get(i))){
//                            num = num + 1;
//                        }
//                    }
//                }
//            }
//            assignedDayNums.put(chosenUsers.get(i), num);
//        }
//
//        if (assignedUsers.containsKey(currentDay)) {
//            assignedUsers.remove(currentDay);
//        }
//
//        assignedUsers.put(currentDay, chosenUsers);
//    }
//
//    void checkConditions(){
//        Set<String> keyset = assignedDayNums.keySet();
//        for(String key : keyset) {
//            if(assignedDayNums.get(key)<5){
//                isOk = false;
//                return;
//            }
//        }
//        isOk = true;
//    }
//
//    void schedule(int currentDay) throws SQLException { // currentDay 2 -> 8
//        if (currentDay < 9) {
//            ArrayList<workingplanDTO> listAll = d.loadTour();
//            ArrayList<String> monday = new ArrayList<>();
//            ArrayList<String> tuesday = new ArrayList<>();
//            ArrayList<String> wednesday = new ArrayList<>();
//            ArrayList<String> thursday = new ArrayList<>();
//            ArrayList<String> friday = new ArrayList<>();
//            ArrayList<String> saturday = new ArrayList<>();
//            ArrayList<String> sunday = new ArrayList<>();
//            if (sunday.isEmpty()) {
//                for (int i = 0; i < listAll.size(); i++) {
//                    if (listAll.get(i).monday) {
//                        monday.add(listAll.get(i).username);
//                    }
//                    if (listAll.get(i).tuesday) {
//                        tuesday.add(listAll.get(i).username);
//                    }
//                    if (listAll.get(i).wednesday) {
//                        wednesday.add(listAll.get(i).username);
//                    }
//                    if (listAll.get(i).thursday) {
//                        thursday.add(listAll.get(i).username);
//                    }
//                    if (listAll.get(i).friday) {
//                        friday.add(listAll.get(i).username);
//                    }
//                    if (listAll.get(i).saturday) {
//                        saturday.add(listAll.get(i).username);
//                    }
//                    if (listAll.get(i).sunday) {
//                        sunday.add(listAll.get(i).username);
//                    }
//                    if (!assignedDayNums.containsKey(listAll.get(i).username)) {
//                        assignedDayNums.put(listAll.get(i).username, 0);
//                    }
//                }
//            }
//            if (availableUsers.isEmpty()) {
//                availableUsers.put(2, monday);
//                availableUsers.put(3, tuesday);
//                availableUsers.put(4, wednesday);
//                availableUsers.put(5, thursday);
//                availableUsers.put(6, friday);
//                availableUsers.put(7, saturday);
//                availableUsers.put(8, sunday);
//            }
//
//            List<String> candidates = new ArrayList<>();
//
//            for (int s = 0; s < availableUsers.get(currentDay).size(); s++) {
//                candidates.add(availableUsers.get(currentDay).get(s));
//            }
//
//            Collections.sort(candidates, (o1, o2) -> {
//
//                String user1 = (String) o1;
//
//                String user2 = (String) o2;
//
//                if (assignedDayNums.get(user1) < assignedDayNums.get(user2)) {
//                    return -1;
//                }
//
//                return 1; //To change body of generated lambdas, choose Tools | Templates.
//            });
//            if(currentDay == 2){
//                Collections.shuffle(candidates);
//            }
////            List<Integer> b = new ArrayList<Integer>(Collections.nCopies(20, 0));
////            solver(currentDay,b, candidates);
//
//            for (int userPerDay = 6; userPerDay <= candidates.size(); userPerDay++) {
//                List<String> chosenUsers = chooseUsersFromCandiates(userPerDay, candidates);
//
//                update(currentDay, chosenUsers);
//                schedule(currentDay + 1);
//
//                if (currentDay == 8) {
//                    checkConditions();
//                }
//
//                if (isOk && flag ==0) {
//                    xuat();
//                    break;
//                }
//                }
//
//        }
//    }
//
//    void solver(int currentDay , List<Integer> flag, List<String> candidates) throws SQLException {
//        List<String> chosenUsers;
//        if(currentDay <9){
//            for (int i = currentDay ; i < 9 ; i++){
//                if(flag.get(i) == 0){
//                    flag.set(i,1);
//                    for (int userPerDay = 6; userPerDay <= candidates.size(); userPerDay++) {
//                        chosenUsers = chooseUsersFromCandiates(userPerDay, candidates);
//
//                        update(currentDay, chosenUsers);
//                        schedule(currentDay + 1);
//
//                        if (currentDay == 8) {
//                            checkConditions();
//                        }
//
//                        if (isOk) {
//                            xuat();
//                            return;
//                        }
//                    }
////                    flag.set(i,0);
////                    chosenUsers = chooseUsersFromCandiates(0, candidates);
////                    updateList(currentDay, chosenUsers);
//                }
//            }
//        }else{
//            xuat();
//        }
//    }
//
//    void xuat(){
//        Set<Integer> key = assignedUsers.keySet();
//         flag =1 ;
//        for (Integer keyset : key){
//            System.out.println(keyset +" - " +assignedUsers.get(keyset));
//        }
//    }
//
//
//    void scheduleTourguides(int currentDay) throws Exception {
//        ArrayList<workingplanDTO> listAll = d.loadTour();
////        assignedUsers.put(2, Arrays.asList("user1", "user3", "user5", "user7"));
////        assignedUsers.put(3, Arrays.asList("user2", "user4", "user6", "user8"));
//
//        for(int j = 0 ; j < assignedUsers.get(currentDay).size(); j++){
//
//            dto a = new dto(assignedUsers.get(currentDay).get(j),"",0,0);
//            list.add(a);
//        }
//        for (int z = 0; z < list.size() ; z++){
//            for (int k = 0 ; k < listAll.size(); k++){
//                if(list.get(z).username.equalsIgnoreCase(listAll.get(k).username)){
//                    list.get(z).setLanguage(listAll.get(k).language);
//                    list.get(z).setNumDay(listAll.get(k).numDay);
//                    list.get(z).setNumWeek(listAll.get(k).numWeek);
//                }
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Language: ");
//        String language = sc.nextLine();
//        for(int i = 0 ; i < list.size(); i++){
//            if(language.equalsIgnoreCase(list.get(i).language)){
//                listtemp.add(list.get(i));
//            }
//        }
//
//        dto chosenStudent = listtemp.get(0);
//        for(int j=0; j<listtemp.size() ; j++){
//            dto compareStudent = listtemp.get(j);
//            if(compareStudent.numDay < chosenStudent.numDay){
//                chosenStudent = compareStudent;
//            }else if( compareStudent.numDay == chosenStudent.numDay){
//                if(compareStudent.numWeek < chosenStudent.numWeek){
//                    chosenStudent = compareStudent;
//                }
//            }
//        }
//        System.out.println(" Student is : " +chosenStudent.username);
//
//
//        for (int j = 0; j < list.size(); j++) {
//            if (chosenStudent.getUsername().equals(list.get(j).username)) {
//                for(int k = 0; k < listAll.size(); k++){
//                    if(chosenStudent.getUsername().equals(listAll.get(k).username)){
//                        int numDay = listAll.get(k).numDay + 1;
//                        int numWeek = listAll.get(k).numWeek + 1;
//
//                        workingplanDTO dto = new workingplanDTO(chosenStudent.getUsername(),numDay,numWeek);
//                        d.updateAccessory(dto);
//                    }
//                }
//            }
//        }
//        list.clear();
//        listtemp.clear();
////        for(int i = 0 ; i < assignedUsers.size(); i++){
////            for(int j = 0 ; j < assignedUsers.get(i).size(); j++){
////            }
////        }
//    }
//}

import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BackTracking {

    dao d = new dao();
    ArrayList<dto> listtemp = new ArrayList<>();
    ArrayList<dto> list = new ArrayList<>();
    int flag = 0;
    HashMap<Integer, List<String>> availableUsers = new HashMap<>();

    HashMap<Integer, List<String>> assignedUsers = new HashMap<>();

    HashMap<Integer, HashMap<Integer, List<String>>> finalUsers = new HashMap<Integer, HashMap<Integer, List<String>>>();

    HashMap<String, Integer> assignedDayNums = new HashMap<>();

    boolean isOk = false;

    List<String> chooseUsersFromCandiates(int requiredNum, List<String> candidates) {
        return candidates.subList(0, requiredNum);
    }

    void updateList(int currentDay, List<String> chosenUsers) {
        for (String user : chosenUsers) {
            if (assignedDayNums.containsKey(user) == false) {
                assignedDayNums.put(user, 1);
            } else {
                int currentAssignedDays = assignedDayNums.get(user);

                assignedDayNums.put(user, currentAssignedDays + 1);
            }

        }
        // in case we backtracking, we have the list already! so we need to delete the old list
        if (assignedUsers.containsKey(currentDay)) {
            assignedUsers.remove(currentDay);
        }

        assignedUsers.put(currentDay, chosenUsers);

    }

    void update(int currentDay, List<String> chosenUsers) {
//        Collection<List<String>> assignUser = assignedUsers.values();
        if (assignedUsers.containsKey(currentDay)) {
            for(int z = 0 ; z < assignedUsers.get(currentDay).size(); z++){
                 for(String key : assignedDayNums.keySet()){
                     if(key.equals(assignedUsers.get(currentDay).get(z))){
                   int a =assignedDayNums.get(key);
                   a = a-1;
                   assignedDayNums.put(key,a);
                     }
                 }
            }
            assignedUsers.remove(currentDay);
            assignedUsers.put(currentDay, chosenUsers);
        }
        Set<Integer> key = assignedUsers.keySet();
        for (int i = 0; i < chosenUsers.size(); i++) {
            int num = 0;
            if(key.size() < availableUsers.keySet().size()){
                 num =1;
            }else {
                num = 0;
            }
            for (Integer keyset : key) {
                for (int j = 0; j < assignedUsers.get(keyset).size(); j++) {
                    if (chosenUsers.get(i).equals(assignedUsers.get(keyset).get(j))) {
                        if (assignedDayNums.containsKey(chosenUsers.get(i))) {
                            num = num + 1;
                        }
                    }
                }
            }
            assignedDayNums.put(chosenUsers.get(i), num);
        }

        assignedUsers.put(currentDay, chosenUsers);
    }

    void checkConditions() {
        Set<String> keyset = assignedDayNums.keySet();
        for (String key : keyset) {
            if (assignedDayNums.get(key) < 5) {
                isOk = false;
                return;
            }
        }
        isOk = true;
    }

    void schedule(int currentDay) throws SQLException { // currentDay 2 -> 8
        if (currentDay < 9) {
            ArrayList<workingplanDTO> listAll = d.loadTour();
            ArrayList<String> monday = new ArrayList<>();
            ArrayList<String> tuesday = new ArrayList<>();
            ArrayList<String> wednesday = new ArrayList<>();
            ArrayList<String> thursday = new ArrayList<>();
            ArrayList<String> friday = new ArrayList<>();
            ArrayList<String> saturday = new ArrayList<>();
            ArrayList<String> sunday = new ArrayList<>();
            if (sunday.isEmpty()) {
                for (int i = 0; i < listAll.size(); i++) {
                    if (listAll.get(i).monday) {
                        monday.add(listAll.get(i).username);
                    }
                    if (listAll.get(i).tuesday) {
                        tuesday.add(listAll.get(i).username);
                    }
                    if (listAll.get(i).wednesday) {
                        wednesday.add(listAll.get(i).username);
                    }
                    if (listAll.get(i).thursday) {
                        thursday.add(listAll.get(i).username);
                    }
                    if (listAll.get(i).friday) {
                        friday.add(listAll.get(i).username);
                    }
                    if (listAll.get(i).saturday) {
                        saturday.add(listAll.get(i).username);
                    }
                    if (listAll.get(i).sunday) {
                        sunday.add(listAll.get(i).username);
                    }
                    if (!assignedDayNums.containsKey(listAll.get(i).username)) {
                        assignedDayNums.put(listAll.get(i).username, 0);
                    }
                }
            }
            if (availableUsers.isEmpty()) {
                availableUsers.put(2, monday);
                availableUsers.put(3, tuesday);
                availableUsers.put(4, wednesday);
                availableUsers.put(5, thursday);
                availableUsers.put(6, friday);
                availableUsers.put(7, saturday);
                availableUsers.put(8, sunday);
            }

            List<String> candidates = new ArrayList<>();

            for (int s = 0; s < availableUsers.get(currentDay).size(); s++) {
                candidates.add(availableUsers.get(currentDay).get(s));
            }

            Collections.sort(candidates, (o1, o2) -> {

                String user1 = (String) o1;

                String user2 = (String) o2;

                if (assignedDayNums.get(user1) < assignedDayNums.get(user2)) {
                    return -1;
                }

                return 1; //To change body of generated lambdas, choose Tools | Templates.
            });
            if (currentDay == 2) {
                Collections.shuffle(candidates);
            }
//            List<Integer> b = new ArrayList<Integer>(Collections.nCopies(20, 0));
//            solver(currentDay,b, candidates);

            for (int userPerDay = 6; userPerDay <= candidates.size(); userPerDay++) {
                List<String> chosenUsers = chooseUsersFromCandiates(userPerDay, candidates);

                update(currentDay, chosenUsers);
                schedule(currentDay + 1);

                if (currentDay == 8) {
                    checkConditions();
                }

                if (isOk && flag == 0) {
                    finalResult();
                    break;
                }
            }

        }
    }

    void solver(int currentDay, List<Integer> flag, List<String> candidates) throws SQLException {
        List<String> chosenUsers;
        if (currentDay < 9) {
            for (int i = currentDay; i < 9; i++) {
                if (flag.get(i) == 0) {
                    flag.set(i, 1);
                    for (int userPerDay = 6; userPerDay <= candidates.size(); userPerDay++) {
                        chosenUsers = chooseUsersFromCandiates(userPerDay, candidates);

                        update(currentDay, chosenUsers);
                        schedule(currentDay + 1);

                        if (currentDay == 8) {
                            checkConditions();
                        }

                        if (isOk) {
                            xuat();
                            return;
                        }
                    }
//                    flag.set(i,0);
//                    chosenUsers = chooseUsersFromCandiates(0, candidates);
//                    updateList(currentDay, chosenUsers);
                }
            }
        } else {
            xuat();
        }
    }

    void xuat() {
        Set<Integer> key = assignedUsers.keySet();
        flag = 1;
        for (Integer keyset : key) {
            System.out.println(keyset + " - " + assignedUsers.get(keyset));
        }
    }

    void finalResult() {
        LocalTime t1 = LocalTime.of(7, 30);
        LocalTime t2 = LocalTime.of(9, 00);

        flag = 1;

        for (int j = 2; j < 9; j++) {
            List<String> listca1 = new ArrayList<String>();
            List<String> listca2 = new ArrayList<String>();
            HashMap<Integer, List<String>> ca = new HashMap<>();
            Collections.shuffle(assignedUsers.get(j));
            for (int s = 0; s < assignedUsers.get(j).size(); s++) {
                int sum = Math.round(assignedUsers.get(j).size() / 2);

                if (s <= sum - 1) {
                    listca1.add(assignedUsers.get(j).get(s));
                    if (s == sum - 1) {
                        ca.put(1, listca1);
                        finalUsers.put(j, ca);
                    }
                } else {
                    listca2.add(assignedUsers.get(j).get(s));
                    if (s == assignedUsers.get(j).size() - 1) {
                        ca.put(2, listca2);
                        finalUsers.put(j, ca);
                        ca = new HashMap<>();
                    }

                }
            }
        }
        Set<Integer> key = finalUsers.keySet();
        for (Integer keyset : key) {
            System.out.println(keyset + " - " + finalUsers.get(keyset));
        }
    }

    void scheduleTourguides(int currentDay) throws Exception {
        ArrayList<workingplanDTO> listAll = d.loadTour();
        ArrayList<scheduleDTO> listSchedule = d.loadSchedule(currentDay);
//        assignedUsers.put(2, Arrays.asList("user1", "user3", "user5", "user7"));
//        assignedUsers.put(3, Arrays.asList("user2", "user4", "user6", "user8"));
        if(!finalUsers.isEmpty()){
            LocalTime t1 = LocalTime.of(7, 30);
            LocalTime t2 = LocalTime.of(9, 00);
            for (int j = 1; j <= finalUsers.get(currentDay).size(); j++) {

                for (int t = 0; t < finalUsers.get(currentDay).get(j).size(); t++) {
                    if (j == 1) {
                        dto a = new dto(finalUsers.get(currentDay).get(j).get(t), "", 0, 0, t1, t1.plusHours(9));
                        list.add(a);
                    } else {
                        dto a = new dto(finalUsers.get(currentDay).get(j).get(t), "", 0, 0, t2, t2.plusHours(9));
                        list.add(a);
                    }
                }
            }
            for (int z = 0; z < list.size(); z++) {
                for (int k = 0; k < listAll.size(); k++) {
                    if (list.get(z).username.equalsIgnoreCase(listAll.get(k).username)) {
                        list.get(z).setLanguage(listAll.get(k).language);
                        list.get(z).setNumDay(listAll.get(k).numDay);
                        list.get(z).setNumWeek(listAll.get(k).numWeek);
                    }
                }
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Language: ");
            String language = sc.nextLine();
            System.out.println("Time: ");
            String time = sc.nextLine();
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            Date time1 = format.parse(time);
            int hour = time1.getHours();
            int minute = time1.getMinutes();
            LocalTime findTime = LocalTime.of(hour, minute);
            for (int i = 0; i < list.size(); i++) {
                if (language.equalsIgnoreCase(list.get(i).language) && findTime.isBefore(list.get(i).timeFrom) && findTime.isAfter(list.get(i).timeTo) && findTime.plusHours(3).isBefore(list.get(i).timeFrom)) {
                    listtemp.add(list.get(i));
                }
            }
            for(int h = 0 ; h < listSchedule.size(); h++){
                for(int k = 0 ; k < listtemp.size(); k++){
                    if(listSchedule.get(h).getUsername().equals(listtemp.get(k).getUsername())){
                        if((findTime.isBefore(listSchedule.get(h).end.toLocalTime()) && findTime.isAfter(listSchedule.get(h).start.toLocalTime()))|| findTime.equals(listSchedule.get(h).start.toLocalTime()) ||
                                (findTime.plusHours(3).isBefore(listSchedule.get(h).end.toLocalTime()) && findTime.plusHours(3).isAfter(listSchedule.get(h).start.toLocalTime()))){
                            listtemp.remove(k);
                        }
                    }
                }
            }
            if(!listtemp.isEmpty()){
                dto chosenStudent = listtemp.get(0);
                for (int j = 0; j < listtemp.size(); j++) {
                    dto compareStudent = listtemp.get(j);
                    if (compareStudent.numDay < chosenStudent.numDay) {
                        chosenStudent = compareStudent;
                    } else if (compareStudent.numDay == chosenStudent.numDay) {
                        if (compareStudent.numWeek < chosenStudent.numWeek) {
                            chosenStudent = compareStudent;
                        }
                    }
                }
                System.out.println(" Student is : " + chosenStudent.username);

                Time start = Time.valueOf(findTime);
                Time end = Time.valueOf(findTime.plusHours(3));

                d.insert(chosenStudent.username, start, end, currentDay);

                for (int j = 0; j < list.size(); j++) {
                    if (chosenStudent.getUsername().equals(list.get(j).username)) {
                        for (int k = 0; k < listAll.size(); k++) {
                            if (chosenStudent.getUsername().equals(listAll.get(k).username)) {
                                int numDay = listAll.get(k).numDay + 1;
                                int numWeek = listAll.get(k).numWeek + 1;

                                workingplanDTO dto = new workingplanDTO(chosenStudent.getUsername(), numDay, numWeek);
                                d.updateWorkingplan(dto);
                            }
                        }
                    }
                }
                list.clear();
                listtemp.clear();
            }else{
                System.out.println("Không có hướng dẫn viên phù hợp");
            }
        }else{
            System.out.println("Chưa có lịch làm việc");
        }
    }
}

