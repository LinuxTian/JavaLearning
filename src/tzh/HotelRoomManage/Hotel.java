package tzh.HotelRoomManage;

public class Hotel {
    Room[][] room;

    //初始化房间相关信息（编号，类型
    public Hotel() {
        room = new Room[5][10];
        //1,2标准间
        //3,4双人间
        //5豪华间
        for(int i = 0;i < room.length; i++) {
            for(int j = 0;j < room[i].length; j ++) {
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
                room[i][j] = new Room((i+1)*100 + j + 1 + "", type, false);
            }
        }
    }

    //预订房间
    public void order(String id) {

    }

    //退房
    public void checkOut(String id) {

    }

    //查看房间
    public void print() {
        for(int i = 0;i < room.length; i++) {
            for(int j = 0;j < room[i].length; j ++) {
                System.out.print(room[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
