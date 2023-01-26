import java.util.Scanner;

public class Persona {
    public String pFIO;
    public int pAge;

    public Persona(String p_FIO, int p_Age){
        this.pFIO = p_FIO;
        this.pAge = p_Age;
    }

    public String getpFIO() {
        return pFIO;
    }
        public int getpAge() {
        return pAge;
    }

    public boolean checkAddGroup(Group group){
        System.out.println("Добавить в группу " + group.deptName + "?");
        Scanner in2 = new Scanner(System.in);
        System.out.println("0 - НЕТ\n1 - ДА");
        int choice = in2.nextInt();
        in2.close();
        return choice != 0;
    }
    @Override
    public String toString() { 
        return String.format("%s %s", pFIO, pAge);
    }
}