package seedu.duke;

public class Idea {
    private Food food;
    private Activity activity;

    public Idea(Food food, Activity activity) {
        this.food = food;
        this.activity = activity;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return "You can do " + activity + " and have a nice meal at " + food;
    }
}
