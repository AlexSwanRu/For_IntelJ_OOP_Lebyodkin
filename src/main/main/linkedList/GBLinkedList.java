package main.linkedList;

import java.util.*;

public class GBLinkedList {

    public static class LinkedListImpl<E> {

        // количество переменных класса
        private LinkedList<E> linkedList;

        // Конструкторы класса

        // Конструктор по умолчанию
        public LinkedListImpl()
        {
            linkedList = new LinkedList<E>();
        }

        // Параметризованный конструктор
        public LinkedListImpl(Collection<? extends E> c)
        {
            linkedList = new LinkedList<E>(c);
        }

        // Метод 1
        // Добавляет указанный элемент в конец этого списка
        public boolean add(E e)
        {

            // Возвращает последний элемент из списка
            return linkedList.add(e);
        }

        // Метод 2
        // вставить указанный элемент в
        //указанную позицию в этом списке
        public void add(int index, E element)
        {
            linkedList.add(index, element);
        }

        // Метод 3
        // Добавить все элементы в этот список
        public boolean addAll(Collection<? extends E> c)
        {
            return linkedList.addAll(c);
        }

        // Метод 4
        //Добавить все элементы в этот список
        public boolean addAll(int index,
                              Collection<? extends E> c)
        {
            return linkedList.addAll(index, c);
        }

        // Метод 5
        // для вставки указанного элемента в начало этого
        ///списка
        public void addFirst(E e) { linkedList.addFirst(e); }

        // Метод 6
        // добавляет указанный элемент в конец этого списка
        public void addLast(E e) { linkedList.addLast(e); }

        // Metod 7
        // Удаляет все элементы из этого списка.
        public void clear() { linkedList.clear(); }

        // Method 8
        // Returns a shallow copy of this ArrayList instance.
        public Object clone() { return linkedList.clone(); }

        // Метод 9
        // Returns true if this list contains the specified
        // element.
        public boolean contains(Object o)
        {
            return linkedList.contains(o);
        }

        // Method 10
        // Возвращает итератор по элементам в этом
        //списке (в обратном порядке)
        public Iterator<E> descendingIterator()
        {
            return linkedList.descendingIterator();
        }

        // Метод 11
        // Извлекает, но не удаляет заголовок (первый
        //элемент) этого списка.
        public E element() { return linkedList.element(); }

        // Метод 12
        // Возвращает элемент в указанной позиции в этом
        //списке.
        public E get(int index)
        {
            return linkedList.get(index);
        }

        // Метод 13
        // Возвращает первый элемент в этом списке.
        public E getFirst() { return linkedList.getFirst(); }

        // Метод 14
        // возвращает последний элемент в этом списке.
        public E getLast() { return linkedList.getLast(); }

        // Метод 15
        // Возвращает индекс первого вхождения
        //указанного элемента
        public int indexOf(Object o)
        {

            return linkedList.indexOf(o);
        }

        // Метод 16
        // Возвращает значение true, если этот список не содержит элементов.
        public boolean isEmpty()
        {
            return linkedList.isEmpty();
        }

        // Метод 17
        // Возвращает итератор по элементам
        //в этом списке в правильной последовательности.
        public Iterator<E> iterator()
        {
            return linkedList.iterator();
        }

        // Метод 18
        public int lastIndexOf(Object o)
        {
            return linkedList.lastIndexOf(o);
        }

        // Метод 19
        public ListIterator<E> listIterator()
        {
            return linkedList.listIterator();
        }

        // Метод 20
        public ListIterator<E> listIterator(int index)
        {
            return linkedList.listIterator(index);
        }

        // Метод 21
        // Добавляет указанный элемент в качестве последнего элемента
        // этого списка.
        public boolean offer(E e)
        {
            return linkedList.offer(e);
        }

        // Metol 22
        // Вставляет указанный элемент в начало этого списка

        public boolean offerFirst(E e)
        {
            return linkedList.offerFirst(e);
        }

        // Метод 23
        // Вставляет указанный элемент в конец этого
        // списка.
        public boolean offerLast(E e)
        {
            return linkedList.offerLast(e);
        }

        // Метод 24
        // Извлекает, но не удаляет первый
        // этого списка.
        public E peek() { return linkedList.peek(); }

        // Метод  25
        public E peekFirst() { return linkedList.peekFirst(); }

        // Метод 26
        // Извлекает, но не удаляет последний элемент
        //этого списка

        public E peekLast() { return linkedList.peekLast(); }

        // Метод 27
        //Извлекает и удаляет первый элемент из
        //этого списка.
        public E poll() { return linkedList.poll(); }

        // Метод 28
        // Извлекает и удаляет первый элемент из этого списка
        //или возвращает значение null
        public E pollFirst() { return linkedList.pollFirst(); }

        // Метод 29
        // Извлекает и удаляет последний элемент из этого списка
        //или возвращает значение null
        public E pollLast() { return linkedList.peekLast(); }

        // Метод 30
        // Извлекает элемент из стека, представленного этим
        //списком.
        public E pop() { return linkedList.pop(); }

        // Метод 31
        // Помещает элемент в стек, представленный этим
        //списком.
        public void push(E e) { linkedList.push(e); }

        // Метод 32
        // Удаляет элемент в указанной позиции в этом
        //списке.
        public E remove(int index)
        {

            return linkedList.remove(index);
        }

        // Метод 33
        // Удаляет первое вхождение указанного элемента
        //из этого списка (если присутствует)
        public boolean remove(Object o)
        {
            return linkedList.remove(o);
        }

        // Мутод 34
        public boolean removeAll(Collection<?> c)
        {

            return linkedList.removeAll(c);
        }

        // Метод  35
        // Удаляет и возвращает первый элемент из этого списка.
        public E removeFirst()
        {

            return linkedList.removeFirst();
        }

        // Метод 36
        //далить первые вхождения в этом списке
        public boolean removeFirstOccurrence(Object o)
        {

            return linkedList.removeFirstOccurrence(o);
        }

        // Метод 37
        // Удаляет и возвращает последний элемент из этого списка.
        public E removeLast()
        {

            return linkedList.removeLast();
        }

        // Метод 38
        // Удаляет последнее вхождение указанного элемента
        //в этом списке
        public boolean removeLastOccurrence(Object o)
        {

            return linkedList.removeLastOccurrence(o);
        }

        // Метод 39
        // Сохраняет только элементы в этом списке
        //, стоящие в определенной позиции
        public boolean retainAll(Collection<?> c)
        {

            return linkedList.removeAll(c);
        }

        // Метод 40
        // Заменяет элемент в указанной позиции
        public E set(int index, E element)
        {
            return linkedList.set(index, element);
        }

        // Метод 41
        // Возвращает количество элементов в этом списке.
        public int size() { return linkedList.size(); }

        // Метод 42
        // Возвращает представление части этого списка
        public List<E> subList(int fromIndex, int toIndex)
        {

            return linkedList.subList(fromIndex, toIndex);
        }

        // Метод 43
        // Возвращает массив, содержащий все элементы
        //в этом списке (по возрастанию)
        public Object[] toArray()
        {

            return linkedList.toArray();
        }

        // Метод 44
        // Возвращает массив, содержащий все элементы из
        //этого списка
        public <T> T[] toArray(T[] a)
        {
            return linkedList.toArray(a);
        }

        // Метод 45
        // Main метод
        public static void main(String... arg)
        {

            // Создание объекта вышеуказанного класса
            // Определяемого пользователем
            LinkedListImpl<Integer> linkedList
                    = new LinkedListImpl<>();


            linkedList.add(100);
            linkedList.add(20);
            linkedList.addFirst(101);
            linkedList.addLast(200);

            Set<Integer> set = new HashSet<Integer>();


            set.add(101);
            set.add(30);
            set.add(32);
            linkedList.addAll(4, set);

            if (linkedList.contains(300))
                System.out.println(
                        "связанный список содержит 300");
            else
                System.out.println(
                        "связанный список не содержит 300");

            System.out.println(
                    "элементы в порядке убывания");
            Iterator<Integer> descendingitr
                    = linkedList.descendingIterator();
            while (descendingitr.hasNext()) {
                System.out.print(descendingitr.next() + "\t");
            }
            System.out.println();

            System.out.println("началом этого списка является "
                    + linkedList.element());

            System.out.println("элемент с индексом 2 равен "
                    + linkedList.get(2));

            System.out.println("элемент в первой позиции "
                    + linkedList.getFirst());

            System.out.println("элемент в последней позиции"
                    + linkedList.getLast());

            System.out.println("индекс элемента равен 200 "
                    + linkedList.indexOf(200));
            System.out.println(
                    "последний индекс элемента равен 101 "
                            + linkedList.lastIndexOf(101));

            System.out.println("элементами списка являются");
            Iterator<Integer> itr = linkedList.iterator();

            while (itr.hasNext()) {
                System.out.print(itr.next() + "\t");
            }
            System.out.println();

            linkedList.offer(45);
            linkedList.offerFirst(32);
            linkedList.offerLast(19);

            System.out.println("началом списка является"
                    + linkedList.peek());

            System.out.println(
                    "первым элементом списка является "
                            + linkedList.peekFirst());

            System.out.println(
                    "последним элементом списка является"
                            + linkedList.peekLast());

            System.out.println("элементами списка являются:");
            itr = linkedList.iterator();

            while (itr.hasNext()) {
                System.out.print(itr.next() + "\t");
            }
            System.out.println();

            System.out.println(
                    "первым элементом является (poll) "
                            + linkedList.poll());

            System.out.println("первый опрошенный элемент "
                    + linkedList.pollFirst());

            System.out.println("последний опрошенный элемент "
                    + linkedList.pollLast());

            linkedList.push(36);

            System.out.println(
                    "элемент, извлечен из связанного списка"
                            + linkedList.pop());

            System.out.println(
                    "элемент index 3 удален из списка "
                            + linkedList.remove(3));

            System.out.println(
                    "удалено последнее вхождение из 101 "
                            + linkedList.removeLastOccurrence(101));

            linkedList.clear();

            if (linkedList.isEmpty())
                System.out.println("связанный список пуст");
            else
                System.out.println(
                        "связанный список не является пустым");
        }
    }

}
