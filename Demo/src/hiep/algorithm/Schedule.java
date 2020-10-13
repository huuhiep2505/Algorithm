//package hiep.algorithm;
//
//import java.sql.Array;
//import java.sql.SQLException;
//import java.util.*;
//
//public class Schedule {
//    dao d = new dao();
//    ArrayList<dto> listtemp = new ArrayList<>();
//    ArrayList<dto> list = new ArrayList<>();
//        void scheduleTourguides(int currentDay) throws SQLException {
//        ArrayList<workingplanDTO> listAll = d.loadTour();
//        BackTracking bt = new BackTracking();
//        HashMap<Integer, List<String>> assignedUsers = bt.assignedUsers;
////        assignedUsers.put(2, Arrays.asList("user1", "user3", "user5", "user7"));
////        assignedUsers.put(3, Arrays.asList("user2", "user4", "user6", "user8"));
//        HashMap<Integer, List<dto>> listUser = new HashMap<>();
//
//        Set<Integer> key = listUser.keySet();
//
//        Set<Integer> key1 = assignedUsers.keySet();
//            for(int j = 0 ; j < assignedUsers.get(currentDay).size(); j++){
//
//              dto a = new dto(assignedUsers.get(currentDay).get(j),"",0,0);
//              list.add(a);
//            }
//            for (int z = 0; z < list.size() ; z++){
//                for (int k = 0 ; k < listAll.size(); k++){
//                    if(list.get(z).username.equalsIgnoreCase(listAll.get(k).username)){
//                        list.get(z).setLanguage(listAll.get(k).language);
//                    }
//                }
//            }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Language: ");
//        String language = sc.nextLine();
//            for(int i = 0 ; i < list.size(); i++){
//                if(language.equalsIgnoreCase(list.get(i).language)){
//                    listtemp.add(list.get(i));
//                }
//            }
//
//            dto chosenStudent = listtemp.get(0);
//            for(int j=0; j<listtemp.size() ; j++){
//                dto compareStudent = listtemp.get(j);
//                if(compareStudent.numDay < chosenStudent.numDay){
//                    chosenStudent = compareStudent;
//                }else if( compareStudent.numDay == chosenStudent.numDay){
//                    if(compareStudent.numWeek < chosenStudent.numWeek){
//                        chosenStudent = compareStudent;
//                    }
//                }
//            }
//            System.out.println(" Student is : " +chosenStudent.username);
//
//            for (int j = 0; j < list.size(); j++) {
//                if (chosenStudent.getUsername().equals(list.get(j).username)) {
//                    list.get(j).numDay++;
//                    list.get(j).numWeek++;
//                }
//            }
//            list.clear();
//            listtemp.clear();
////        for(int i = 0 ; i < assignedUsers.size(); i++){
////            for(int j = 0 ; j < assignedUsers.get(i).size(); j++){
////            }
////        }
//    }
//}
