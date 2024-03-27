import java.util.Scanner;
// Define the NameBuilder interface
interface NameBuilder {
    String buildName();
}

// Implement the NameBuilder interface for a specific type of name
class FirstNameBuilder implements NameBuilder {
    @Override
    public String buildName() {
        // Add your logic to build the first name here
        return "John";
    }
}

class LastNameBuilder implements NameBuilder {
    @Override
    public String buildName() {
        // Add your logic to build the last name here
        return "Doe";
    }
}

// Create a factory class to create the appropriate NameBuilder based on the type
class NameBuilderFactory {
    public static NameBuilder getNameBuilder(String type) {
        if (type.equalsIgnoreCase("first")) {
            return new FirstNameBuilder();
        } else if (type.equalsIgnoreCase("last")) {
            return new LastNameBuilder();
        } else {
            throw new IllegalArgumentException("Invalid name type");
        }
    }
}

// Usage example
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the first name builder from the factory
        NameBuilder firstNameBuilder = NameBuilderFactory.getNameBuilder("first");
        String firstName = firstNameBuilder.buildName();
        System.out.println("First Name: " + firstName);

        // Get the last name builder from the factory
        NameBuilder lastNameBuilder = NameBuilderFactory.getNameBuilder("last");
        String lastName = lastNameBuilder.buildName();
        System.out.println("Last Name: " + lastName);
    }
}