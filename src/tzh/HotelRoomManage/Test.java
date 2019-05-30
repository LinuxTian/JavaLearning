package tzh.HotelRoomManage;

import java.util.Scanner;

/*
 *   酒店管理系统
 * */
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Hotel h = new Hotel();
        h.print();

        while(true){
            System.out.print("请输入预定或者退房");
            String order = s.next();
            if("预定".equals(order)){
                System.out.print("请输入预订房间的编号：");
                String id = s.next();
                //预订房间
                h.inOrOut(id, true);
            }else if("退房".equals(order)){
                System.out.print("请输入退房房间的编号：");
                String id = s.next();
                h.inOrOut(id, false);
            }else {
                System.out.print("请输入预定或者退房");
            }

            //打印酒店列表
            h.print();
        }
    }
}

