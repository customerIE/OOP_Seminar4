import java.util.ArrayList;

public class Department<T> {
    T deptName;
    String deptWorker;

    ArrayList<Persona> personaInDept = new ArrayList<>();
    // dep0, dep1, dep2
    public void setDeptName(T deptName) {
        this.deptName = deptName;
    }
}
