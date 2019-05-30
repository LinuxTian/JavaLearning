package tzh.HotelRoomManage;

public class Hotel {
    Room[][] rooms;

    //初始化房间相关信息（编号，类型
    public Hotel() {
        rooms = new Room[5][10];
        //1,2标准间
        //3,4双人间
        //5豪华间
        for(int i = 0;i < rooms.length; i++) {
            for(int j = 0;j < rooms[i].length; j ++) {
                String type = "";
                if(i == 0 || i == 1) {
                    type = "标准间";
                }
                if(i == 2 || i == 3) {
                    type = "双人间";
                }
                if(i == 4) {
                    type = "豪华间";
                }
                rooms[i][j] = new Room((i+1)*100 + j + 1 + "", type, false);
            }
        }
    }

    public void inOrOut(String id, boolean isIn) {
        try{
            //将传入的字符串类型的id转换为int类型
            int idInt = Integer.parseInt(id);

            //获取楼层
            int floor = idInt / 100;

            //具体的房间号
            int roomId = idInt % 100;

            rooms[--floor][--roomId].setUse(isIn);
        } catch (NumberFormatException e) {
            //当用户输入一个非正确数字时会捕获这个异常
            System.out.println(id + "不是一个数字，请输入正确的数字!");
        } catch (ArrayIndexOutOfBoundsException e) {
            //当用户输入的房间编号信息有误时，捕获这个异常
            System.out.println("您输入的房间号码" + id + "有误，请输入正确的房间编号");
        }
//        for(int i=0;i<rooms.length;i++){
//            for(int j=0;j<rooms[i].length;j++){
//                //根据传入的房间编号去数组中查找与之对应的房间
//                if(rooms[i][j].getId().equals(id)){
//                    //将该房间的状态改成占用
//                    rooms[i][j].setUse(isIn);
//                    //此时后面就没有必要再继续循环了，所以直接return
//                    return;
//                }
//            }
//        }
    }

    //预订房间
    public void order(String id) {
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[i].length;j++){
                //根据传入的房间编号去数组中查找与之对应的房间
                if(rooms[i][j].getId().equals(id)){
                    //将该房间的状态改成占用
                    rooms[i][j].setUse(true);
                    //此时后面就没有必要再继续循环了，所以直接return
                    return;
                }
            }
        }
    }

    //退房
    public void checkOut(String id) {
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[i].length;j++){
                //根据传入的房间编号去数组中查找与之对应的房间
                if(rooms[i][j].getId().equals(id)){
                    //将该房间的状态改成占用
                    rooms[i][j].setUse(false);
                    //此时后面就没有必要再继续循环了，所以直接return
                    return;
                }
            }
        }
    }

    //查看房间
    public void print() {
        for(int i = 0;i < rooms.length; i++) {
            for(int j = 0;j < rooms[i].length; j ++) {
                System.out.print(rooms[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
