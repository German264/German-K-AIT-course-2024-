package homework_37.computer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComputerAppl {
    public static void main(String[] args) {

        List<Computer> computerList = new ArrayList<>();

        computerList.add(new Computer("i7", 8, 256, "Aser", 1200));
        computerList.add(new Computer("i5", 16, 256, "HP", 1500));
        computerList.add(new Computer("AMD", 8, 512, "NoName", 2000));
        computerList.add(new Computer("Intel i5", 8, 256, "Dell", 750));
        computerList.add(new Computer("AMD Ryzen 5", 16, 512, "HP", 850));
        computerList.add(new Computer("Intel i7", 32, 1024, "Apple", 1500));

        System.out.println("--------------- Print as is ---------------");
        for (Computer computer : computerList) {
            System.out.println(computer);
        }

        System.out.println("------- Print after sorting by brand ------");
        computerList.sort(Computer::compareTo);
        for (Computer computer : computerList) {
            System.out.println(computer);
        }

        Comparator<Computer> comparatorByRam = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                return Integer.compare(o1.getRam(), o2.getRam());
            }
        };

        computerList.sort(comparatorByRam);
        System.out.println("---------Print after sorting by RAM----------");
        for (Computer computer : computerList) {
            System.out.println(computer);
        }

        Comparator<Computer> comparatorByRamAndSSd = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                int res = Integer.compare(o1.getRam(), o2.getRam()) ;
                return res !=0 ? res : Integer.compare(o1.getSsd(), o2.getSsd());
            }
        };

        computerList.sort(comparatorByRamAndSSd);
        System.out.println("-------Print after sorting by RAM and SSd------");
        for (Computer computer : computerList) {
            System.out.println(computer);
        }

        int sum = 0;
        for (Computer i : computerList ) {
            sum += i.getSsd();
        }
        System.out.println("----------SSD Volume and Average Value----------");
        System.out.println(sum);
        double avgSsd = (double) sum / computerList.size();
        System.out.println(avgSsd);
    }
}
