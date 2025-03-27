import java.io.*;
import java.util.*;

class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name, phone, email, address;

    public Contact(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email + ", Address: " + address;
    }
}

public class AddressBook {
    private List<Contact> contacts;
    private static final String FILE_NAME = "contacts.ser";

    public AddressBook() {
        this.contacts = loadContacts(); // Load saved contacts
    }

    // Add a contact
    public void addContact(String name, String phone, String email, String address) {
        contacts.add(new Contact(name, phone, email, address));
        saveContacts();
        System.out.println("✅ Contact added successfully!");
    }

    // Display all contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("📭 No contacts found.");
            return;
        }
        contacts.forEach(System.out::println);
    }

    // Search contact by name
    public void searchContact(String name) {
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println("🔍 Contact Found: " + c);
                return;
            }
        }
        System.out.println("❌ Contact not found.");
    }

    // Delete contact by name
    public void deleteContact(String name) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact c = iterator.next();
            if (c.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                saveContacts();
                System.out.println("🗑️ Contact deleted successfully.");
                return;
            }
        }
        System.out.println("❌ Contact not found.");
    }

    // Save contacts to a file (Serialization)
    private void saveContacts() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(contacts);
        } catch (IOException e) {
            System.out.println("⚠️ Error saving contacts: " + e.getMessage());
        }
    }

    // Load contacts from file (Deserialization)
    private List<Contact> loadContacts() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Contact>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>(); // Return empty list if no file exists
        }
    }

    // Menu-driven interface
    public static void main(String[] args) {
        AddressBook book = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n📖 Address Book Menu:");
            System.out.println("1️⃣ Add Contact");
            System.out.println("2️⃣ View Contacts");
            System.out.println("3️⃣ Search Contact");
            System.out.println("4️⃣ Delete Contact");
            System.out.println("5️⃣ Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    book.addContact(name, phone, email, address);
                    break;
                case 2:
                    book.displayContacts();
                    break;
                case 3:
                    System.out.print("Enter Name to Search: ");
                    String searchName = scanner.nextLine();
                    book.searchContact(searchName);
                    break;
                case 4:
                    System.out.print("Enter Name to Delete: ");
                    String deleteName = scanner.nextLine();
                    book.deleteContact(deleteName);
                    break;
                case 5:
                    System.out.println("👋 Exiting Address Book...");
                    scanner.close();
                    return;
                default:
                    System.out.println("⚠️ Invalid choice! Try again.");
            }
        }
    }
}
