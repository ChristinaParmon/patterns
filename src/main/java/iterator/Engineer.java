package iterator;

public class Engineer implements Collection {
    private String name;
    private String[] doneProjects;

    public Engineer(String name, String[] doneProjects) {
        this.name = name;
        this.doneProjects = doneProjects;
    }

    @Override
    public Iterator getIterator() {
        return new ProjectsIterator();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private class ProjectsIterator implements Iterator {
        int count;

        @Override
        public boolean hasNext() {
            return count < doneProjects.length;
        }

        @Override
        public Object next() {
            return doneProjects[count++];
        }
    }
}
