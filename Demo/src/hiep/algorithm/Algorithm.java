//package hiep.algorithm;
//
//import java.sql.SQLException;
//import java.util.*;
//
//public class Algorithm {
//    dao d = new dao();
//    List<Integer> listDay =new  ArrayList<Integer>(Collections.nCopies(7,0));
//    HashMap<String, Integer> mapNum = new HashMap<>();
//
//        ArrayList<workingplanDTO> listAll;
//
//    {
//        try {
//            listAll = d.loadTour();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void xuly() throws SQLException {
//        HashMap<String, ArrayList> listSchedule = new HashMap<String, ArrayList>();
//        ArrayList<String> monday = new ArrayList<>();
//        ArrayList<String> tuesday = new ArrayList<>();
//        ArrayList<String> wednesday = new ArrayList<>();
//        ArrayList<String> thursday = new ArrayList<>();
//        ArrayList<String> friday = new ArrayList<>();
//        ArrayList<String> saturday = new ArrayList<>();
//        ArrayList<String> sunday = new ArrayList<>();
//        for(int i= 0 ; i < listAll.size();i++){
//            if(listAll.get(i).monday){
//                monday.add(listAll.get(i).username);
//            }if(listAll.get(i).tuesday){
//                tuesday.add(listAll.get(i).username);
//            }if(listAll.get(i).wednesday){
//                wednesday.add(listAll.get(i).username);
//            }if(listAll.get(i).thursday){
//                thursday.add(listAll.get(i).username);
//            }if(listAll.get(i).friday){
//                friday.add(listAll.get(i).username);
//            }if(listAll.get(i).saturday){
//                saturday.add(listAll.get(i).username);
//            }if(listAll.get(i).sunday){
//                sunday.add(listAll.get(i).username);
//            }
//            mapNum.put(listAll.get(i).username,0 );
//        }
//        listSchedule.put("monday",monday);
//        listSchedule.put("tuesday",tuesday);
//        listSchedule.put("wednesday",wednesday);
//        listSchedule.put("thursday",thursday);
//        listSchedule.put("friday",friday);
//        listSchedule.put("saturday",saturday);
//        listSchedule.put("sunday",sunday);
//
//        Random rd = new Random();
////        System.out.println(listSchedule);
//        Set<Map.Entry<String,ArrayList>> keyset = listSchedule.entrySet();
//        List<Map.Entry<String, ArrayList>> listMain = new ArrayList<>(keyset);
//        System.out.println(listMain.size());
//        List<Integer> b = new ArrayList<Integer>(Collections.nCopies(20, 0));
//        backtrack(1, b, listMain);
////        ArrayList listMonday = new ArrayList();
////        for(String key : keyset){
//////            System.out.println(key + " - " + listSchedule.get(key));
////                Collections.shuffle(listSchedule.get(key));
////            for(int j = 0 ; j < 6; j++){
//////                int random = rd.nextInt(listSchedule.get(key).size());
////                listMonday.add(listSchedule.get(key).get(j));
//////                System.out.println(listSchedule.get(key).get(j));
////            }
////            System.out.println(listMonday);
////            break;
////        }
////        for(int j = 0 ; j < listSchedule.size() ; j++){
////            System.out.println( listSchedule.values());
////        }
//    }
//
//
//    public void backtrack(int k, List<Integer> flag, List<Map.Entry<String, ArrayList>> listSchedule){
//        List<Integer> b = new ArrayList<Integer>(Collections.nCopies(20, 0));
//        ArrayList listtemp = new ArrayList();
//        for(int i = 0 ; i < listSchedule.size(); i++) {
//            if (flag.get(i) == 0) {
//                flag.set(i, 1);
////                listSchedule.get(i).getValue().get(0);
//                for(int z = 0 ; z < listAll.size() ; z++){
//                Collections.shuffle(listSchedule.get(0).getValue());
//                for (int j = 0; j < listSchedule.get(i).getValue().size(); j++) {
////                    System.out.println(listSchedule.get(i).getValue().get(j));
//                    if( listAll.get(z).username.equals(listSchedule.get(i).getValue().get(j)) && listtemp.size() < 7) {
//                        listtemp.add(listSchedule.get(i).getValue().get(j).toString());
//
//                        Set<String> keySet = mapNum.keySet();
////                        for(String key : keySet){
////                            if(key.equals(listSchedule.get(i).getValue().get(j))){
////                              int test =   mapNum.get(key);
////                              test++;
////                              mapNum.put(key,test);
////                            }
////                        }
//                        for(int a = 0 ; a < listAll.size() ; a++){
//                            if(listAll.get(a).username.equals(listSchedule.get(i).getValue().get(j))){
//                                listAll.get(a).numm++;
//                            }
//                        }
////                        mapNum.put(listSchedule.get(i).getValue().get(j),b.set(j,));
//                    }
//                }
//                }
//                listSchedule.get(i).getValue().clear();
//                listSchedule.get(i).setValue(listtemp);
//                listtemp.clear();
//                Collections.sort(listAll, new Comparator<workingplanDTO>() {
//                            @Override
//                            public int compare(workingplanDTO s1, workingplanDTO s2) {
//                                if (s1.numm > s2.numm) {
//                                    return 1;
//                                } else {
//                                    if (s1.numm == s2.numm) {
//                                        return 0;
//                                    } else {
//                                        return -1;
//                                    }
//                                }
//                            }
//                        });
////                Collections.shuffle(listtemp);
//
//
//            }
////        Set<String> keyset = listSchedule.keySet();
////            for(String key : keyset){
////                if(flag.get())
////            }
////        for(int i = 0 ; i < keyset.size() ; i++){
////            if(flag.get(i) == 0){
////                flag.set(i,1);
////                for(int j = 0 ; j < keyset.)
////            }
////        }
//        listSchedule.get(1).getValue();
//        }
//    }
//
//
////    public void solver(int day){
////        if(listDay.get(day) == 0){
////        for(int i = 0 ; i < listAll.size(); i++){
////            if()
////        }
////        }
////    }
//}
