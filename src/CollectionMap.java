import java.util.*;

public class CollectionMap {
    public static void main(String[] args) {
        // ArrayList
        System.out.println("Test ArrayList <<<<<<<<<<<<<<<<<<");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");

        System.out.println(arrayList.get(1));   // index 사용하기
        System.out.println(arrayList.size());   // 크기 가져오기
        System.out.println(String.join(" ", arrayList));
        System.out.println(arrayList.toString());

        // LinkedList
        System.out.println("Test LinkedList <<<<<<<<<<<<<<<<<<");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");

        System.out.println(linkedList.get(1));   // index 사용하기
        System.out.println(linkedList.size());   // 크기 가져오기
        System.out.println(String.join(" ", linkedList));
        System.out.println(linkedList.toString());

        // Vector
        System.out.println("Test Vector <<<<<<<<<<<<<<<<<<");
        List<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);

        System.out.println(vector.get(0));
        System.out.println(vector.get(1));
        System.out.println(vector.size());
        System.out.println(vector.contains(10));


        // Stack
        System.out.println("Test Stack <<<<<<<<<<<<<<<<<<");
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(50);

        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        // HashSet
        System.out.println("Test HashSet <<<<<<<<<<<<<<<<<<");
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(10); // 중복된 수 추가

        System.out.println(hashSet.size());
        System.out.println(hashSet.toString());

        // LinkedHashSet
        System.out.println("Test LinkedHashSet <<<<<<<<<<<<<<<<<<");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(10); // 중복된 수 추가

        System.out.println(linkedHashSet.size());
        Iterator<Integer> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // TreeSet
        System.out.println("Test TreeSet <<<<<<<<<<<<<<<<<<");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(20);
        treeSet.add(1);
        treeSet.add(100);
        treeSet.add(33);
        treeSet.add(1); // 중복 제거 됨

        System.out.println(treeSet.size());
        Iterator<Integer> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // PriorityQueue
        System.out.println("Test PriorityQueue asc <<<<<<<<<<<<<<<<<<");
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(30);
        priorityQueue.add(100);
        priorityQueue.add(1);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        System.out.println("Test PriorityQueue desc <<<<<<<<<<<<<<<<<<");
        Queue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue2.add(2);
        priorityQueue2.add(30);
        priorityQueue2.add(100);
        priorityQueue2.add(1);

        while (!priorityQueue2.isEmpty()) {
            System.out.println(priorityQueue2.poll());
        }


        // ArrayDeque
        System.out.println("Test ArrayDeque <<<<<<<<<<<<<<<<<<");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerLast(100); // 100
        deque.offerFirst(10); // 10, 100
        deque.offerFirst(20); // 20, 10, 100
        deque.offerLast(30); // 20, 10, 100, 30

        System.out.println(deque.toString());

        System.out.println(deque.pollFirst());  // 20 <- [10, 100, 30]
        System.out.println(deque.pollLast());   // [10, 100] -> 30
        System.out.println(deque.pollFirst());  // 10 <- [100]
        System.out.println(deque.pollLast());   // [] -> 100

        // HashMap
        System.out.println("Test HashMap <<<<<<<<<<<<<<<<<<");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "one");
        hashMap.put(3, "tree");
        hashMap.put(2, "two");
        hashMap.put(4, "four");
        hashMap.put(5, "five");

        Iterator<Integer> itHash = hashMap.keySet().iterator();
        while (itHash.hasNext()) {
            int key = itHash.next();
            System.out.println("key: " + key + ", value: " + hashMap.get(key));
        }

        // HashTable
        System.out.println("Test HashTable <<<<<<<<<<<<<<<<<<");
        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "one");
        hashtable.put(3, "tree");
        hashtable.put(2, "two");
        hashtable.put(4, "four");
        hashtable.put(5, "five");

        Iterator<Integer> itTable = hashtable.keySet().iterator();
        while (itTable.hasNext()) {
            int key = itTable.next();
            System.out.println("key: " + key + ", value: " + hashtable.get(key));
        }


        // LinkedHashMap
        System.out.println("Test LinkedHashMap <<<<<<<<<<<<<<<<<<");
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "one");
        map.put(3, "tree");
        map.put(2, "two");
        map.put(4, "four");
        map.put(5, "five");

        Iterator<Integer> itMap = map.keySet().iterator();
        while(itMap.hasNext()) {
            int key = itMap.next();
            System.out.println("key: " + key + ", value: " + map.get(key));
        }

        // TreeMap
        System.out.println("Test LinkedHashMap <<<<<<<<<<<<<<<<<<");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "one");
        treeMap.put(3, "tree");
        treeMap.put(2, "two");
        treeMap.put(4, "four");
        treeMap.put(5, "five");

        Iterator<Integer> itTree = treeMap.keySet().iterator();
        while (itTree.hasNext()) {
            int key = itTree.next();
            System.out.println("key: " + key + ", value: " + treeMap.get(key));
        }

    }
}
