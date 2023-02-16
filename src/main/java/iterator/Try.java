package iterator;

public class Try {
    public static void main(String[] args) {
        String[] projects = {"Lala", "Lulu", "Lili", "Lele"};

        Engineer engineer = new Engineer("Christina", projects);
        Iterator iterator = engineer.getIterator();

        System.out.println("Engineer: " + engineer.getName() );
        System.out.println("Projects: ");

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }

}
