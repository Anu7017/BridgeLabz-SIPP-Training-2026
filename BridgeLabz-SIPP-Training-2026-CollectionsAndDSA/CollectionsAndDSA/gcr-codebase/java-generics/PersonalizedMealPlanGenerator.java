interface MealPlan {
}

class VegetarianMeal implements MealPlan {
}

class VeganMeal implements MealPlan {
}

class KetoMeal implements MealPlan {
}

class HighProteinMeal implements MealPlan {
}

class Meal<T extends MealPlan> {
    T plan;

    Meal(T p) {
        plan = p;
    }
}

public class PersonalizedMealPlanGenerator {
    static <T extends MealPlan> Meal<T> generate(T plan) {
        return new Meal<>(plan);
    }

    public static void main(String[] args) {
        Meal<VegetarianMeal> m = generate(new VegetarianMeal());
        System.out.println(m.plan.getClass().getSimpleName());
    }
}
