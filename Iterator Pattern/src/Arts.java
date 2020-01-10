public class Arts implements Aggregate {
    private String[] papers;

    public Arts() {
        this.papers = new String[] {"English", "History", "Geography", "Physcology"};
    }

    @Override
    public Iterator createIterator() {
        return new ArtsIterator(papers);
    }
}
