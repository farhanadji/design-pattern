public class Main {
    public Main() {
        System.out.println("*** Iterator Pattern ***\n");
        Aggregate artSubjects = new Arts();
        Iterator iteratorForArts = artSubjects.createIterator();

        System.out.println("Arts subjects are as follows : ");
        while (iteratorForArts.hasNext()){
            System.out.println(iteratorForArts.next());
        }
        iteratorForArts.first();

        System.out.println("Currently pointing back to : " + iteratorForArts.currentItem());
    }

    public static void main(String[] args) {
        new Main();
    }
}
