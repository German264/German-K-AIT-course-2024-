//Реализовать метод, определяющий, делится ли одно целое число на другое нацело или нет.


public class Division {
    public static void main(String[] args) {
    int a=45;
    int b=9;
    boolean res=isDivided(a,b);
        System.out.println("a= "+a+", b= " +b+ " is dividet: "+res);

    }

    public static boolean isDivided(int a, int b){
        return a%b==0;
    }
}
