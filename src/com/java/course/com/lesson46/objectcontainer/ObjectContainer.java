package com.java.course.com.lesson46.objectcontainer;

public class ObjectContainer<T> {
    //Node
    private Node<T> pierwszyElement; //head/głowa
    private int wielkosc = 0;

    //int findElement(T element){}

    //10,2,7,8
    public int findElement(T wartosc) {
        int indeks = 0;
        if (pierwszyElement.item.equals(wartosc)) {
            return indeks;
        } else  {
            Node<T> biezacyElement = pierwszyElement;
            while ((biezacyElement != null)) {
                if (biezacyElement.item.equals(wartosc)) {
                    return indeks;
                }
                ++indeks;
                biezacyElement = biezacyElement.next;
            }
        }
        return -1;
    }


    public void addItem(T wartosc) {
        Node<T> nowyElement = new Node<>(wartosc);
        if (pierwszyElement == null) {
            pierwszyElement = nowyElement;
        } else {
            Node<T> biezacyElement = pierwszyElement;
            while ((biezacyElement.next != null)) {
                biezacyElement = biezacyElement.next;
            }
            biezacyElement.next = nowyElement;
        }
        wielkosc++;
    }

    public boolean removeItem(T wartosc) {
        if (pierwszyElement.item.equals(wartosc)) {
            pierwszyElement = pierwszyElement.next;
            wielkosc--;
            return true;
        }
        Node<T> biezacyElement = pierwszyElement;
        while (biezacyElement.next != null) {
            if (biezacyElement.next.item.equals(wartosc)) {
                biezacyElement.next = biezacyElement.next.next;
                wielkosc--;
                return true;
            }
            biezacyElement = biezacyElement.next;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ObjectContainer{" +
                "glownaLista=" + pierwszyElement +
                ", wielkosc=" + wielkosc +
                '}';
    }
    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E element) {
            this.item = element;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", next=" + next +
                    '}';
        }
    }
}



   /*
        Stworz klase ObjectContaiener<T> ktora moze przechowywac elemetny dowolnego typu
        zaimplementuj funkcje
        add()
        print()
        remove()
        find() - zwraca indeks peirwszego elementu o szukanej wartosci

        !!!! Nie mozesz skorzystac z: Array,List,Map,Set,Kolekcji, nie mozna tez zapisywac elementow w pliku

        //zastanów się/poszukaj  jak działa LinkedList w Javie
 */


    /*
    1. Zaczynamy od pierwszego Nodea, i skaczemy wywolujac node.next, node.next, node.next....

    1.Mamy Liste 10 elemenotw i chcemy 20tke dodac pod 5 indexem
    2.Skaczemy po nodach az nie zatrzymamy sie 4 index (n-1). Wyszla nam 4ka
    3. Musmy zapisac na co wskazywala 4ka np 15tka. Musimy sprawdic zeby 4ka wskazywala na nowego Node'a z 20tka,
    Musimy sprawic aby ta nowa 20tka wskazywala na wczesniej zapisanego node'a - 15kq

    .... 17 -> 4 -> 15 -> 33, a chcemy dodac 20 na piaty index (pomiedy 4 a 15)
    .... 17 -> 4 -> (20) -> 15 -> 33
     */

