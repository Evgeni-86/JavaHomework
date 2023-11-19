package DZ5.phoneContacts;

import java.util.*;

public class PhoneContacts {
    private final Map<String, String> contacts = new TreeMap<>(new Comp());
    private Set<String> names = new HashSet<>(Arrays.asList(
            "папа", "мама", "жена", "муж", "брат", "сестра", "краш"
    ));

    public PhoneContacts() {
    }

    public PhoneContacts(Set<String> names) {
        if (names != null)
            this.names = names;
    }

    public void createContact(String name, String phone) {
        if (name != null && phone != null)
            contacts.put(name, phone);
    }

    public void printContacts() {
        for (var cur : contacts.entrySet())
            System.out.printf("[%s] : [%s]\n", cur.getKey(), cur.getValue());
    }

    public String findByPhone(String phone) {
        for (var current : contacts.entrySet()) {
            if (current.getValue().equals(phone))
                return current.getKey();
        }
        return null;
    }

    public String findByName(String name) {
        return contacts.get(name);
    }

    //TODO Сначала должны выводиться контакты с важными именами в любом порядке,
    // только затем все остальные в лексикографическом порядке.
    private class Comp implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            boolean o1_isContains = names.contains(o1);
            boolean o2_isContains = names.contains(o2);

            if (o1.equals(o2)) return 0;
            if (o1_isContains && o2_isContains) return 1;
            else if (o1_isContains) return -1;
            else if (o2_isContains) return 1;
            else return o1.compareTo(o2);
        }
    }
}

