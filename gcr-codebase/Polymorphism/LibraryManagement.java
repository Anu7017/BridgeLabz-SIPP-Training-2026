package ScenarioBasedOOPs.Polymorphism;

class LibraryMember {
    String memberName, memberId;

    LibraryMember(String n, String id) {
        memberName = n;
        memberId = id;
    }

    double calculateFine(int days) {
        return 0;
    }

    void printDetails() {
        System.out.println(memberName + " " + memberId);
    }
}

class StudentMember extends LibraryMember {
    StudentMember(String n, String id) {
        super(n, id);
    }

    double calculateFine(int d) {
        return d * 2;
    }
}

class FacultyMember extends LibraryMember {
    FacultyMember(String n, String id) {
        super(n, id);
    }

    double calculateFine(int d) {
        return d * 1;
    }
}

class GuestMember extends LibraryMember {
    GuestMember(String n, String id) {
        super(n, id);
    }

    double calculateFine(int d) {
        return d * 5;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        LibraryMember[] members = {
                new StudentMember("Aman", "S101"),
                new FacultyMember("Raj", "F201"),
                new GuestMember("Priya", "G301")
        };
        String searchId = "F201";
        for (LibraryMember m : members) {
            m.printDetails();
            System.out.println("Fine=" + m.calculateFine(5));
            if (m.memberId.equals(searchId))
                System.out.println("Found Member: " + m.memberName);
        }
    }
}
