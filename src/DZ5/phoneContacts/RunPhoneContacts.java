package DZ5.phoneContacts;

class RunPhoneContacts {
    public static void main(String[] args) {
        PhoneContacts phoneContacts = new PhoneContacts();
        phoneContacts.createContact("брат", "111");
        phoneContacts.createContact("con5", "666");
        phoneContacts.createContact("сестра", "555");
        phoneContacts.createContact("con4", "444");
        phoneContacts.createContact("папа", "222");
        phoneContacts.createContact("con3", "333");
        phoneContacts.printContacts();
        System.out.println(phoneContacts.findByPhone("222"));
        System.out.println(phoneContacts.findByName("папа"));
        System.out.println(phoneContacts.findByName("con4"));
        System.out.println(phoneContacts.findByPhone("666"));
    }
}
