public class Hausaufgaben2 {

    public static void main(String[] args) {

        start();
        zusammenarbeit();
        finish();

    } // end of main

    public static void start(){
        System.out.println("Посадил дед репку.");
        System.out.println("Выросла репка большая пребольшая...");
        System.out.println("Стал дед репку из земли вытаскивать.");
        System.out.println("Тянет-потянет, вытащить не может.");
    }

    public static void finish(){
        System.out.println("Вытащили репку! Чуть не надорвались:)");
    }

    public static void zusammenarbeit(){
        oma();
        enkelin();
        Haustiere();
    }

    public static void oma(){
        System.out.println("Позвал дед бабку.");
        System.out.println("Дедка за репку, бабка за дедку..");
        System.out.println("Тянут-потянут, вытащить не могут.");
    }

    public static void enkelin(){
        System.out.println("Позвали они внучку.");
        System.out.println("Дедка за репку, бабка за дедку, внучка за бабку..");
        System.out.println("Тянут-потянут, вытащить не могут.");
    }

    public static void Haustiere(){
        System.out.println("Позвали они разных домашних животных - собаку, кошку, мышку (мне лень для них всех отдельные методы делать).");
        System.out.println("Дедка за репку, бабка за дедку, внучка за бабку и так далее.");
        System.out.println("Тянут-потянут...");
    }

} // end of class