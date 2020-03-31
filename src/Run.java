public class Run {
        public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot robot = new Robot(new SumsungHead(4500),new ToshibaHand(3800), new SonyLeg(2500));
        Robot robo = new Robot(new ToshibaHead(3800),new SonyHand(2850), new SumsungLeg(1300));
        Robot rob = new Robot(new SonyHead(6500),new SumsungHand(4940), new ToshibaLeg(3400));
        robot.action();
        System.out.println();
        robo.action();
        System.out.println();
        rob.action();
        System.out.println("The Robot price is  " + robot.getPrice());
        System.out.println("The Robo price is  " + robo.getPrice());
        System.out.println("The Rob price is  " + rob.getPrice());
        System.out.println("The max price is  " +
                Math.max((int)rob.getPrice(),(Math.max((int)robo.getPrice(),(int)robot.getPrice()))));

        }
}
