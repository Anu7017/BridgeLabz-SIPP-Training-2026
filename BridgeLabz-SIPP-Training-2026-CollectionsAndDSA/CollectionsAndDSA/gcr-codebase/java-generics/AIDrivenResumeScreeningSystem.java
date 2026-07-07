import java.util.*;

abstract class JobRole {
}

class SoftwareEngineer extends JobRole {
}

class DataScientist extends JobRole {
}

class ProductManager extends JobRole {
}

class Resume<T extends JobRole> {
    T role;

    Resume(T r) {
        role = r;
    }
}

public class AIDrivenResumeScreeningSystem {
    static void screen(List<? extends JobRole> roles) {
        for (JobRole r : roles)
            System.out.println(r.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        List<SoftwareEngineer> list = new ArrayList<>();
        list.add(new SoftwareEngineer());
        screen(list);
    }
}
