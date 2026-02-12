class LinkListInBuild {
    public static void main(String[] args) {

        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();
        list.add(12);
        list.addLast(10);
        list.addLast(15);
        System.out.println(list);
        System.out.println(list.reversed());
        list.remove();
        System.out.println(list);

    }
}