import java.util.*;
import java.util.Scanner;
public class Main implements Address {
    public static void main(String[] args) {
    Main run = new Main();
    //Работники
    ArrayList<Persona> noDeptPersona = new ArrayList<Persona>();
    Group depAcc = new Group("Бухгалтерия");
    Group depIT = new Group("Системотехники");
    Persona worker1 = new Persona("Novak", 32);
    noDeptPersona.add(worker1);
    Persona worker2 = new Persona("Popov", 56);
    noDeptPersona.add(worker2);
    System.out.println(noDeptPersona);
    run.print();
    run.addPersonaToDepartment(worker1, depAcc);
    run.addPersonaToDepartment(worker2, depIT);
    //run.addPersonaToDepartment(noDeptPersona.get(1), depIT);
    run.showResultAddPersonaToGroup(depAcc);
    run.showResultAddPersonaToGroup(depIT);
    run.UpdateDepint(worker1, depIT, depAcc);
    run.showResultAddPersonaToGroup(depAcc);
    run.showResultAddPersonaToGroup(depIT);
    }

    public void print(){
        System.out.println(ad);
    }
    public void setPersona(ArrayList<Persona> noDeptPersona){
        Scanner in1 = new Scanner(System.in);
        String FIO;
        int Age;
        System.out.println("-".repeat(25));
        System.out.println("Сортировка по параметру:");
        System.out.println("ФИО работника: ");
        FIO = in1.nextLine();
        System.out.println("Возраст работника: ");
        Age = in1.nextInt();
        noDeptPersona.add(new Persona(FIO, Age));
        System.out.println(noDeptPersona);
        //in1.close();
    }

    public void addPersonaToDepartment(Persona persona, Group group){
                    group.addPeople(persona);
    }
    public void removePersonaToDepartment(Persona persona, Group group){
        group.removePeople(persona);
    }   

    public void UpdateDepint(Persona worker, Group depIn, Group depOut){
        Scanner in3 = new Scanner(System.in);
        System.out.println(worker.pFIO + ", хотите перейти в другой отдел?");
        System.out.println("0 - НЕТ\n1 - ДА");
        int answer = in3.nextInt();
        if(answer==0){
            System.out.println("Сеанс окончен.");
        }
        if(answer==1){
            System.out.println("В какой отдел хотите перейти?");
            System.out.println("1-Бухгалтерия, 2-Системотехники");
        }
        int answer3 = in3.nextInt();
        in3.close();
        if(answer3==2){
            addPersonaToDepartment(worker, depIn);
            removePersonaToDepartment(worker, depOut);
        }
        else{System.out.println("Спасибо, что остались");}
    }
    public void showResultAddPersonaToGroup(Group group){
        System.out.println("Работники отдела " + group + ":");
        System.out.println(group.personaInDept);
    }
}

