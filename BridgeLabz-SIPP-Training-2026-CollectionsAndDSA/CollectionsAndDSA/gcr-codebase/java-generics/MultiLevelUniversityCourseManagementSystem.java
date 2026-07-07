import java.util.*;

abstract class CourseType {
}

class ExamCourse extends CourseType {
}

class AssignmentCourse extends CourseType {
}

class ResearchCourse extends CourseType {
}

class Course<T extends CourseType> {
    T type;

    Course(T t) {
        type = t;
    }
}

public class MultiLevelUniversityCourseManagementSystem {
    static void show(List<? extends CourseType> list) {
        for (CourseType c : list)
            System.out.println(c.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        List<ExamCourse> list = new ArrayList<>();
        list.add(new ExamCourse());
        show(list);
    }
}
